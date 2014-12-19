/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.evp.admin.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.evp.admin.NoSuchProjectException;
import com.liferay.evp.admin.model.Project;
import com.liferay.evp.admin.model.impl.ProjectImpl;
import com.liferay.evp.admin.model.impl.ProjectModelImpl;
import com.liferay.evp.admin.service.persistence.ProjectPersistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the project service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Joan.Kim
 * @see ProjectPersistence
 * @see ProjectUtil
 * @generated
 */
@ProviderType
public class ProjectPersistenceImpl extends BasePersistenceImpl<Project>
	implements ProjectPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ProjectUtil} to access the project persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ProjectImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ProjectModelImpl.ENTITY_CACHE_ENABLED,
			ProjectModelImpl.FINDER_CACHE_ENABLED, ProjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ProjectModelImpl.ENTITY_CACHE_ENABLED,
			ProjectModelImpl.FINDER_CACHE_ENABLED, ProjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ProjectModelImpl.ENTITY_CACHE_ENABLED,
			ProjectModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANY = new FinderPath(ProjectModelImpl.ENTITY_CACHE_ENABLED,
			ProjectModelImpl.FINDER_CACHE_ENABLED, ProjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompany",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANY =
		new FinderPath(ProjectModelImpl.ENTITY_CACHE_ENABLED,
			ProjectModelImpl.FINDER_CACHE_ENABLED, ProjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompany",
			new String[] { Long.class.getName() },
			ProjectModelImpl.COMPANYID_COLUMN_BITMASK |
			ProjectModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANY = new FinderPath(ProjectModelImpl.ENTITY_CACHE_ENABLED,
			ProjectModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompany",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the projects where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching projects
	 */
	@Override
	public List<Project> findByCompany(long companyId) {
		return findByCompany(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the projects where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.model.impl.ProjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of projects
	 * @param end the upper bound of the range of projects (not inclusive)
	 * @return the range of matching projects
	 */
	@Override
	public List<Project> findByCompany(long companyId, int start, int end) {
		return findByCompany(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the projects where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.model.impl.ProjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of projects
	 * @param end the upper bound of the range of projects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching projects
	 */
	@Override
	public List<Project> findByCompany(long companyId, int start, int end,
		OrderByComparator<Project> orderByComparator) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANY;
			finderArgs = new Object[] { companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANY;
			finderArgs = new Object[] { companyId, start, end, orderByComparator };
		}

		List<Project> list = (List<Project>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Project project : list) {
				if ((companyId != project.getCompanyId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_PROJECT_WHERE);

			query.append(_FINDER_COLUMN_COMPANY_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ProjectModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<Project>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Project>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first project in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching project
	 * @throws com.liferay.evp.admin.NoSuchProjectException if a matching project could not be found
	 */
	@Override
	public Project findByCompany_First(long companyId,
		OrderByComparator<Project> orderByComparator)
		throws NoSuchProjectException {
		Project project = fetchByCompany_First(companyId, orderByComparator);

		if (project != null) {
			return project;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProjectException(msg.toString());
	}

	/**
	 * Returns the first project in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching project, or <code>null</code> if a matching project could not be found
	 */
	@Override
	public Project fetchByCompany_First(long companyId,
		OrderByComparator<Project> orderByComparator) {
		List<Project> list = findByCompany(companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last project in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching project
	 * @throws com.liferay.evp.admin.NoSuchProjectException if a matching project could not be found
	 */
	@Override
	public Project findByCompany_Last(long companyId,
		OrderByComparator<Project> orderByComparator)
		throws NoSuchProjectException {
		Project project = fetchByCompany_Last(companyId, orderByComparator);

		if (project != null) {
			return project;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProjectException(msg.toString());
	}

	/**
	 * Returns the last project in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching project, or <code>null</code> if a matching project could not be found
	 */
	@Override
	public Project fetchByCompany_Last(long companyId,
		OrderByComparator<Project> orderByComparator) {
		int count = countByCompany(companyId);

		if (count == 0) {
			return null;
		}

		List<Project> list = findByCompany(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the projects before and after the current project in the ordered set where companyId = &#63;.
	 *
	 * @param projectId the primary key of the current project
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next project
	 * @throws com.liferay.evp.admin.NoSuchProjectException if a project with the primary key could not be found
	 */
	@Override
	public Project[] findByCompany_PrevAndNext(long projectId, long companyId,
		OrderByComparator<Project> orderByComparator)
		throws NoSuchProjectException {
		Project project = findByPrimaryKey(projectId);

		Session session = null;

		try {
			session = openSession();

			Project[] array = new ProjectImpl[3];

			array[0] = getByCompany_PrevAndNext(session, project, companyId,
					orderByComparator, true);

			array[1] = project;

			array[2] = getByCompany_PrevAndNext(session, project, companyId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Project getByCompany_PrevAndNext(Session session,
		Project project, long companyId,
		OrderByComparator<Project> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PROJECT_WHERE);

		query.append(_FINDER_COLUMN_COMPANY_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ProjectModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(project);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Project> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the projects where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	@Override
	public void removeByCompany(long companyId) {
		for (Project project : findByCompany(companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(project);
		}
	}

	/**
	 * Returns the number of projects where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching projects
	 */
	@Override
	public int countByCompany(long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPANY;

		Object[] finderArgs = new Object[] { companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PROJECT_WHERE);

			query.append(_FINDER_COLUMN_COMPANY_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_COMPANY_COMPANYID_2 = "project.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MANAGERNAME =
		new FinderPath(ProjectModelImpl.ENTITY_CACHE_ENABLED,
			ProjectModelImpl.FINDER_CACHE_ENABLED, ProjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByManagerName",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MANAGERNAME =
		new FinderPath(ProjectModelImpl.ENTITY_CACHE_ENABLED,
			ProjectModelImpl.FINDER_CACHE_ENABLED, ProjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByManagerName",
			new String[] { String.class.getName() },
			ProjectModelImpl.MANAGERNAME_COLUMN_BITMASK |
			ProjectModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MANAGERNAME = new FinderPath(ProjectModelImpl.ENTITY_CACHE_ENABLED,
			ProjectModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByManagerName",
			new String[] { String.class.getName() });

	/**
	 * Returns all the projects where managerName = &#63;.
	 *
	 * @param managerName the manager name
	 * @return the matching projects
	 */
	@Override
	public List<Project> findByManagerName(String managerName) {
		return findByManagerName(managerName, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the projects where managerName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.model.impl.ProjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param managerName the manager name
	 * @param start the lower bound of the range of projects
	 * @param end the upper bound of the range of projects (not inclusive)
	 * @return the range of matching projects
	 */
	@Override
	public List<Project> findByManagerName(String managerName, int start,
		int end) {
		return findByManagerName(managerName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the projects where managerName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.model.impl.ProjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param managerName the manager name
	 * @param start the lower bound of the range of projects
	 * @param end the upper bound of the range of projects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching projects
	 */
	@Override
	public List<Project> findByManagerName(String managerName, int start,
		int end, OrderByComparator<Project> orderByComparator) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MANAGERNAME;
			finderArgs = new Object[] { managerName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MANAGERNAME;
			finderArgs = new Object[] { managerName, start, end, orderByComparator };
		}

		List<Project> list = (List<Project>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Project project : list) {
				if (!Validator.equals(managerName, project.getManagerName())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_PROJECT_WHERE);

			boolean bindManagerName = false;

			if (managerName == null) {
				query.append(_FINDER_COLUMN_MANAGERNAME_MANAGERNAME_1);
			}
			else if (managerName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MANAGERNAME_MANAGERNAME_3);
			}
			else {
				bindManagerName = true;

				query.append(_FINDER_COLUMN_MANAGERNAME_MANAGERNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ProjectModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindManagerName) {
					qPos.add(managerName);
				}

				if (!pagination) {
					list = (List<Project>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Project>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first project in the ordered set where managerName = &#63;.
	 *
	 * @param managerName the manager name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching project
	 * @throws com.liferay.evp.admin.NoSuchProjectException if a matching project could not be found
	 */
	@Override
	public Project findByManagerName_First(String managerName,
		OrderByComparator<Project> orderByComparator)
		throws NoSuchProjectException {
		Project project = fetchByManagerName_First(managerName,
				orderByComparator);

		if (project != null) {
			return project;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("managerName=");
		msg.append(managerName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProjectException(msg.toString());
	}

	/**
	 * Returns the first project in the ordered set where managerName = &#63;.
	 *
	 * @param managerName the manager name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching project, or <code>null</code> if a matching project could not be found
	 */
	@Override
	public Project fetchByManagerName_First(String managerName,
		OrderByComparator<Project> orderByComparator) {
		List<Project> list = findByManagerName(managerName, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last project in the ordered set where managerName = &#63;.
	 *
	 * @param managerName the manager name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching project
	 * @throws com.liferay.evp.admin.NoSuchProjectException if a matching project could not be found
	 */
	@Override
	public Project findByManagerName_Last(String managerName,
		OrderByComparator<Project> orderByComparator)
		throws NoSuchProjectException {
		Project project = fetchByManagerName_Last(managerName, orderByComparator);

		if (project != null) {
			return project;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("managerName=");
		msg.append(managerName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProjectException(msg.toString());
	}

	/**
	 * Returns the last project in the ordered set where managerName = &#63;.
	 *
	 * @param managerName the manager name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching project, or <code>null</code> if a matching project could not be found
	 */
	@Override
	public Project fetchByManagerName_Last(String managerName,
		OrderByComparator<Project> orderByComparator) {
		int count = countByManagerName(managerName);

		if (count == 0) {
			return null;
		}

		List<Project> list = findByManagerName(managerName, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the projects before and after the current project in the ordered set where managerName = &#63;.
	 *
	 * @param projectId the primary key of the current project
	 * @param managerName the manager name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next project
	 * @throws com.liferay.evp.admin.NoSuchProjectException if a project with the primary key could not be found
	 */
	@Override
	public Project[] findByManagerName_PrevAndNext(long projectId,
		String managerName, OrderByComparator<Project> orderByComparator)
		throws NoSuchProjectException {
		Project project = findByPrimaryKey(projectId);

		Session session = null;

		try {
			session = openSession();

			Project[] array = new ProjectImpl[3];

			array[0] = getByManagerName_PrevAndNext(session, project,
					managerName, orderByComparator, true);

			array[1] = project;

			array[2] = getByManagerName_PrevAndNext(session, project,
					managerName, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Project getByManagerName_PrevAndNext(Session session,
		Project project, String managerName,
		OrderByComparator<Project> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PROJECT_WHERE);

		boolean bindManagerName = false;

		if (managerName == null) {
			query.append(_FINDER_COLUMN_MANAGERNAME_MANAGERNAME_1);
		}
		else if (managerName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_MANAGERNAME_MANAGERNAME_3);
		}
		else {
			bindManagerName = true;

			query.append(_FINDER_COLUMN_MANAGERNAME_MANAGERNAME_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ProjectModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindManagerName) {
			qPos.add(managerName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(project);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Project> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the projects where managerName = &#63; from the database.
	 *
	 * @param managerName the manager name
	 */
	@Override
	public void removeByManagerName(String managerName) {
		for (Project project : findByManagerName(managerName,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(project);
		}
	}

	/**
	 * Returns the number of projects where managerName = &#63;.
	 *
	 * @param managerName the manager name
	 * @return the number of matching projects
	 */
	@Override
	public int countByManagerName(String managerName) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MANAGERNAME;

		Object[] finderArgs = new Object[] { managerName };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PROJECT_WHERE);

			boolean bindManagerName = false;

			if (managerName == null) {
				query.append(_FINDER_COLUMN_MANAGERNAME_MANAGERNAME_1);
			}
			else if (managerName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MANAGERNAME_MANAGERNAME_3);
			}
			else {
				bindManagerName = true;

				query.append(_FINDER_COLUMN_MANAGERNAME_MANAGERNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindManagerName) {
					qPos.add(managerName);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_MANAGERNAME_MANAGERNAME_1 = "project.managerName IS NULL";
	private static final String _FINDER_COLUMN_MANAGERNAME_MANAGERNAME_2 = "project.managerName = ?";
	private static final String _FINDER_COLUMN_MANAGERNAME_MANAGERNAME_3 = "(project.managerName IS NULL OR project.managerName = '')";

	public ProjectPersistenceImpl() {
		setModelClass(Project.class);
	}

	/**
	 * Caches the project in the entity cache if it is enabled.
	 *
	 * @param project the project
	 */
	@Override
	public void cacheResult(Project project) {
		EntityCacheUtil.putResult(ProjectModelImpl.ENTITY_CACHE_ENABLED,
			ProjectImpl.class, project.getPrimaryKey(), project);

		project.resetOriginalValues();
	}

	/**
	 * Caches the projects in the entity cache if it is enabled.
	 *
	 * @param projects the projects
	 */
	@Override
	public void cacheResult(List<Project> projects) {
		for (Project project : projects) {
			if (EntityCacheUtil.getResult(
						ProjectModelImpl.ENTITY_CACHE_ENABLED,
						ProjectImpl.class, project.getPrimaryKey()) == null) {
				cacheResult(project);
			}
			else {
				project.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all projects.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ProjectImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ProjectImpl.class);

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the project.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Project project) {
		EntityCacheUtil.removeResult(ProjectModelImpl.ENTITY_CACHE_ENABLED,
			ProjectImpl.class, project.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Project> projects) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Project project : projects) {
			EntityCacheUtil.removeResult(ProjectModelImpl.ENTITY_CACHE_ENABLED,
				ProjectImpl.class, project.getPrimaryKey());
		}
	}

	/**
	 * Creates a new project with the primary key. Does not add the project to the database.
	 *
	 * @param projectId the primary key for the new project
	 * @return the new project
	 */
	@Override
	public Project create(long projectId) {
		Project project = new ProjectImpl();

		project.setNew(true);
		project.setPrimaryKey(projectId);

		return project;
	}

	/**
	 * Removes the project with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param projectId the primary key of the project
	 * @return the project that was removed
	 * @throws com.liferay.evp.admin.NoSuchProjectException if a project with the primary key could not be found
	 */
	@Override
	public Project remove(long projectId) throws NoSuchProjectException {
		return remove((Serializable)projectId);
	}

	/**
	 * Removes the project with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the project
	 * @return the project that was removed
	 * @throws com.liferay.evp.admin.NoSuchProjectException if a project with the primary key could not be found
	 */
	@Override
	public Project remove(Serializable primaryKey)
		throws NoSuchProjectException {
		Session session = null;

		try {
			session = openSession();

			Project project = (Project)session.get(ProjectImpl.class, primaryKey);

			if (project == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchProjectException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(project);
		}
		catch (NoSuchProjectException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Project removeImpl(Project project) {
		project = toUnwrappedModel(project);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(project)) {
				project = (Project)session.get(ProjectImpl.class,
						project.getPrimaryKeyObj());
			}

			if (project != null) {
				session.delete(project);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (project != null) {
			clearCache(project);
		}

		return project;
	}

	@Override
	public Project updateImpl(com.liferay.evp.admin.model.Project project) {
		project = toUnwrappedModel(project);

		boolean isNew = project.isNew();

		ProjectModelImpl projectModelImpl = (ProjectModelImpl)project;

		Session session = null;

		try {
			session = openSession();

			if (project.isNew()) {
				session.save(project);

				project.setNew(false);
			}
			else {
				session.merge(project);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ProjectModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((projectModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						projectModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANY, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANY,
					args);

				args = new Object[] { projectModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANY, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANY,
					args);
			}

			if ((projectModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MANAGERNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						projectModelImpl.getOriginalManagerName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MANAGERNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MANAGERNAME,
					args);

				args = new Object[] { projectModelImpl.getManagerName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MANAGERNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MANAGERNAME,
					args);
			}
		}

		EntityCacheUtil.putResult(ProjectModelImpl.ENTITY_CACHE_ENABLED,
			ProjectImpl.class, project.getPrimaryKey(), project, false);

		project.resetOriginalValues();

		return project;
	}

	protected Project toUnwrappedModel(Project project) {
		if (project instanceof ProjectImpl) {
			return project;
		}

		ProjectImpl projectImpl = new ProjectImpl();

		projectImpl.setNew(project.isNew());
		projectImpl.setPrimaryKey(project.getPrimaryKey());

		projectImpl.setProjectId(project.getProjectId());
		projectImpl.setGroupId(project.getGroupId());
		projectImpl.setCompanyId(project.getCompanyId());
		projectImpl.setUserId(project.getUserId());
		projectImpl.setUserName(project.getUserName());
		projectImpl.setCreateDate(project.getCreateDate());
		projectImpl.setModifiedDate(project.getModifiedDate());
		projectImpl.setName(project.getName());
		projectImpl.setDescription(project.getDescription());
		projectImpl.setLocation(project.getLocation());
		projectImpl.setCoordX(project.getCoordX());
		projectImpl.setCoordY(project.getCoordY());
		projectImpl.setCoverImageId(project.getCoverImageId());
		projectImpl.setRequiredFunds(project.getRequiredFunds());
		projectImpl.setActualFunds(project.getActualFunds());
		projectImpl.setStartDate(project.getStartDate());
		projectImpl.setEndDate(project.getEndDate());
		projectImpl.setApprovalDate(project.getApprovalDate());
		projectImpl.setManagerName(project.getManagerName());

		return projectImpl;
	}

	/**
	 * Returns the project with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the project
	 * @return the project
	 * @throws com.liferay.evp.admin.NoSuchProjectException if a project with the primary key could not be found
	 */
	@Override
	public Project findByPrimaryKey(Serializable primaryKey)
		throws NoSuchProjectException {
		Project project = fetchByPrimaryKey(primaryKey);

		if (project == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchProjectException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return project;
	}

	/**
	 * Returns the project with the primary key or throws a {@link com.liferay.evp.admin.NoSuchProjectException} if it could not be found.
	 *
	 * @param projectId the primary key of the project
	 * @return the project
	 * @throws com.liferay.evp.admin.NoSuchProjectException if a project with the primary key could not be found
	 */
	@Override
	public Project findByPrimaryKey(long projectId)
		throws NoSuchProjectException {
		return findByPrimaryKey((Serializable)projectId);
	}

	/**
	 * Returns the project with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the project
	 * @return the project, or <code>null</code> if a project with the primary key could not be found
	 */
	@Override
	public Project fetchByPrimaryKey(Serializable primaryKey) {
		Project project = (Project)EntityCacheUtil.getResult(ProjectModelImpl.ENTITY_CACHE_ENABLED,
				ProjectImpl.class, primaryKey);

		if (project == _nullProject) {
			return null;
		}

		if (project == null) {
			Session session = null;

			try {
				session = openSession();

				project = (Project)session.get(ProjectImpl.class, primaryKey);

				if (project != null) {
					cacheResult(project);
				}
				else {
					EntityCacheUtil.putResult(ProjectModelImpl.ENTITY_CACHE_ENABLED,
						ProjectImpl.class, primaryKey, _nullProject);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ProjectModelImpl.ENTITY_CACHE_ENABLED,
					ProjectImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return project;
	}

	/**
	 * Returns the project with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param projectId the primary key of the project
	 * @return the project, or <code>null</code> if a project with the primary key could not be found
	 */
	@Override
	public Project fetchByPrimaryKey(long projectId) {
		return fetchByPrimaryKey((Serializable)projectId);
	}

	@Override
	public Map<Serializable, Project> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Project> map = new HashMap<Serializable, Project>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Project project = fetchByPrimaryKey(primaryKey);

			if (project != null) {
				map.put(primaryKey, project);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Project project = (Project)EntityCacheUtil.getResult(ProjectModelImpl.ENTITY_CACHE_ENABLED,
					ProjectImpl.class, primaryKey);

			if (project == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, project);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PROJECT_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (Project project : (List<Project>)q.list()) {
				map.put(project.getPrimaryKeyObj(), project);

				cacheResult(project);

				uncachedPrimaryKeys.remove(project.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				EntityCacheUtil.putResult(ProjectModelImpl.ENTITY_CACHE_ENABLED,
					ProjectImpl.class, primaryKey, _nullProject);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the projects.
	 *
	 * @return the projects
	 */
	@Override
	public List<Project> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the projects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.model.impl.ProjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of projects
	 * @param end the upper bound of the range of projects (not inclusive)
	 * @return the range of projects
	 */
	@Override
	public List<Project> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the projects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.model.impl.ProjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of projects
	 * @param end the upper bound of the range of projects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of projects
	 */
	@Override
	public List<Project> findAll(int start, int end,
		OrderByComparator<Project> orderByComparator) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Project> list = (List<Project>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PROJECT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PROJECT;

				if (pagination) {
					sql = sql.concat(ProjectModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Project>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Project>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the projects from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Project project : findAll()) {
			remove(project);
		}
	}

	/**
	 * Returns the number of projects.
	 *
	 * @return the number of projects
	 */
	@Override
	public int countAll() {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PROJECT);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the project persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		EntityCacheUtil.removeCache(ProjectImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PROJECT = "SELECT project FROM Project project";
	private static final String _SQL_SELECT_PROJECT_WHERE_PKS_IN = "SELECT project FROM Project project WHERE projectId IN (";
	private static final String _SQL_SELECT_PROJECT_WHERE = "SELECT project FROM Project project WHERE ";
	private static final String _SQL_COUNT_PROJECT = "SELECT COUNT(project) FROM Project project";
	private static final String _SQL_COUNT_PROJECT_WHERE = "SELECT COUNT(project) FROM Project project WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "project.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Project exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Project exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static final Log _log = LogFactoryUtil.getLog(ProjectPersistenceImpl.class);
	private static final Project _nullProject = new ProjectImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Project> toCacheModel() {
				return _nullProjectCacheModel;
			}
		};

	private static final CacheModel<Project> _nullProjectCacheModel = new CacheModel<Project>() {
			@Override
			public Project toEntityModel() {
				return _nullProject;
			}
		};
}