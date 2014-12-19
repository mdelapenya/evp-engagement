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

import com.liferay.evp.admin.NoSuchVolunteerException;
import com.liferay.evp.admin.model.Volunteer;
import com.liferay.evp.admin.model.impl.VolunteerImpl;
import com.liferay.evp.admin.model.impl.VolunteerModelImpl;
import com.liferay.evp.admin.service.persistence.VolunteerPersistence;

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
 * The persistence implementation for the volunteer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Joan.Kim
 * @see VolunteerPersistence
 * @see VolunteerUtil
 * @generated
 */
@ProviderType
public class VolunteerPersistenceImpl extends BasePersistenceImpl<Volunteer>
	implements VolunteerPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VolunteerUtil} to access the volunteer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VolunteerImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VolunteerModelImpl.ENTITY_CACHE_ENABLED,
			VolunteerModelImpl.FINDER_CACHE_ENABLED, VolunteerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VolunteerModelImpl.ENTITY_CACHE_ENABLED,
			VolunteerModelImpl.FINDER_CACHE_ENABLED, VolunteerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VolunteerModelImpl.ENTITY_CACHE_ENABLED,
			VolunteerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(VolunteerModelImpl.ENTITY_CACHE_ENABLED,
			VolunteerModelImpl.FINDER_CACHE_ENABLED, VolunteerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(VolunteerModelImpl.ENTITY_CACHE_ENABLED,
			VolunteerModelImpl.FINDER_CACHE_ENABLED, VolunteerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			VolunteerModelImpl.COMPANYID_COLUMN_BITMASK |
			VolunteerModelImpl.LASTNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(VolunteerModelImpl.ENTITY_CACHE_ENABLED,
			VolunteerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the volunteers where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching volunteers
	 */
	@Override
	public List<Volunteer> findByCompanyId(long companyId) {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the volunteers where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.model.impl.VolunteerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of volunteers
	 * @param end the upper bound of the range of volunteers (not inclusive)
	 * @return the range of matching volunteers
	 */
	@Override
	public List<Volunteer> findByCompanyId(long companyId, int start, int end) {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the volunteers where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.model.impl.VolunteerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of volunteers
	 * @param end the upper bound of the range of volunteers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching volunteers
	 */
	@Override
	public List<Volunteer> findByCompanyId(long companyId, int start, int end,
		OrderByComparator<Volunteer> orderByComparator) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID;
			finderArgs = new Object[] { companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID;
			finderArgs = new Object[] { companyId, start, end, orderByComparator };
		}

		List<Volunteer> list = (List<Volunteer>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Volunteer volunteer : list) {
				if ((companyId != volunteer.getCompanyId())) {
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

			query.append(_SQL_SELECT_VOLUNTEER_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VolunteerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<Volunteer>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Volunteer>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first volunteer in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching volunteer
	 * @throws com.liferay.evp.admin.NoSuchVolunteerException if a matching volunteer could not be found
	 */
	@Override
	public Volunteer findByCompanyId_First(long companyId,
		OrderByComparator<Volunteer> orderByComparator)
		throws NoSuchVolunteerException {
		Volunteer volunteer = fetchByCompanyId_First(companyId,
				orderByComparator);

		if (volunteer != null) {
			return volunteer;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVolunteerException(msg.toString());
	}

	/**
	 * Returns the first volunteer in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching volunteer, or <code>null</code> if a matching volunteer could not be found
	 */
	@Override
	public Volunteer fetchByCompanyId_First(long companyId,
		OrderByComparator<Volunteer> orderByComparator) {
		List<Volunteer> list = findByCompanyId(companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last volunteer in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching volunteer
	 * @throws com.liferay.evp.admin.NoSuchVolunteerException if a matching volunteer could not be found
	 */
	@Override
	public Volunteer findByCompanyId_Last(long companyId,
		OrderByComparator<Volunteer> orderByComparator)
		throws NoSuchVolunteerException {
		Volunteer volunteer = fetchByCompanyId_Last(companyId, orderByComparator);

		if (volunteer != null) {
			return volunteer;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVolunteerException(msg.toString());
	}

	/**
	 * Returns the last volunteer in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching volunteer, or <code>null</code> if a matching volunteer could not be found
	 */
	@Override
	public Volunteer fetchByCompanyId_Last(long companyId,
		OrderByComparator<Volunteer> orderByComparator) {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<Volunteer> list = findByCompanyId(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the volunteers before and after the current volunteer in the ordered set where companyId = &#63;.
	 *
	 * @param volunteerId the primary key of the current volunteer
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next volunteer
	 * @throws com.liferay.evp.admin.NoSuchVolunteerException if a volunteer with the primary key could not be found
	 */
	@Override
	public Volunteer[] findByCompanyId_PrevAndNext(long volunteerId,
		long companyId, OrderByComparator<Volunteer> orderByComparator)
		throws NoSuchVolunteerException {
		Volunteer volunteer = findByPrimaryKey(volunteerId);

		Session session = null;

		try {
			session = openSession();

			Volunteer[] array = new VolunteerImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, volunteer,
					companyId, orderByComparator, true);

			array[1] = volunteer;

			array[2] = getByCompanyId_PrevAndNext(session, volunteer,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Volunteer getByCompanyId_PrevAndNext(Session session,
		Volunteer volunteer, long companyId,
		OrderByComparator<Volunteer> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VOLUNTEER_WHERE);

		query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

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
			query.append(VolunteerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(volunteer);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Volunteer> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the volunteers where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	@Override
	public void removeByCompanyId(long companyId) {
		for (Volunteer volunteer : findByCompanyId(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(volunteer);
		}
	}

	/**
	 * Returns the number of volunteers where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching volunteers
	 */
	@Override
	public int countByCompanyId(long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPANYID;

		Object[] finderArgs = new Object[] { companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VOLUNTEER_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

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

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "volunteer.companyId = ?";

	public VolunteerPersistenceImpl() {
		setModelClass(Volunteer.class);
	}

	/**
	 * Caches the volunteer in the entity cache if it is enabled.
	 *
	 * @param volunteer the volunteer
	 */
	@Override
	public void cacheResult(Volunteer volunteer) {
		EntityCacheUtil.putResult(VolunteerModelImpl.ENTITY_CACHE_ENABLED,
			VolunteerImpl.class, volunteer.getPrimaryKey(), volunteer);

		volunteer.resetOriginalValues();
	}

	/**
	 * Caches the volunteers in the entity cache if it is enabled.
	 *
	 * @param volunteers the volunteers
	 */
	@Override
	public void cacheResult(List<Volunteer> volunteers) {
		for (Volunteer volunteer : volunteers) {
			if (EntityCacheUtil.getResult(
						VolunteerModelImpl.ENTITY_CACHE_ENABLED,
						VolunteerImpl.class, volunteer.getPrimaryKey()) == null) {
				cacheResult(volunteer);
			}
			else {
				volunteer.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all volunteers.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(VolunteerImpl.class.getName());
		}

		EntityCacheUtil.clearCache(VolunteerImpl.class);

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the volunteer.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Volunteer volunteer) {
		EntityCacheUtil.removeResult(VolunteerModelImpl.ENTITY_CACHE_ENABLED,
			VolunteerImpl.class, volunteer.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Volunteer> volunteers) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Volunteer volunteer : volunteers) {
			EntityCacheUtil.removeResult(VolunteerModelImpl.ENTITY_CACHE_ENABLED,
				VolunteerImpl.class, volunteer.getPrimaryKey());
		}
	}

	/**
	 * Creates a new volunteer with the primary key. Does not add the volunteer to the database.
	 *
	 * @param volunteerId the primary key for the new volunteer
	 * @return the new volunteer
	 */
	@Override
	public Volunteer create(long volunteerId) {
		Volunteer volunteer = new VolunteerImpl();

		volunteer.setNew(true);
		volunteer.setPrimaryKey(volunteerId);

		return volunteer;
	}

	/**
	 * Removes the volunteer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param volunteerId the primary key of the volunteer
	 * @return the volunteer that was removed
	 * @throws com.liferay.evp.admin.NoSuchVolunteerException if a volunteer with the primary key could not be found
	 */
	@Override
	public Volunteer remove(long volunteerId) throws NoSuchVolunteerException {
		return remove((Serializable)volunteerId);
	}

	/**
	 * Removes the volunteer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the volunteer
	 * @return the volunteer that was removed
	 * @throws com.liferay.evp.admin.NoSuchVolunteerException if a volunteer with the primary key could not be found
	 */
	@Override
	public Volunteer remove(Serializable primaryKey)
		throws NoSuchVolunteerException {
		Session session = null;

		try {
			session = openSession();

			Volunteer volunteer = (Volunteer)session.get(VolunteerImpl.class,
					primaryKey);

			if (volunteer == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVolunteerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(volunteer);
		}
		catch (NoSuchVolunteerException nsee) {
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
	protected Volunteer removeImpl(Volunteer volunteer) {
		volunteer = toUnwrappedModel(volunteer);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(volunteer)) {
				volunteer = (Volunteer)session.get(VolunteerImpl.class,
						volunteer.getPrimaryKeyObj());
			}

			if (volunteer != null) {
				session.delete(volunteer);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (volunteer != null) {
			clearCache(volunteer);
		}

		return volunteer;
	}

	@Override
	public Volunteer updateImpl(com.liferay.evp.admin.model.Volunteer volunteer) {
		volunteer = toUnwrappedModel(volunteer);

		boolean isNew = volunteer.isNew();

		VolunteerModelImpl volunteerModelImpl = (VolunteerModelImpl)volunteer;

		Session session = null;

		try {
			session = openSession();

			if (volunteer.isNew()) {
				session.save(volunteer);

				volunteer.setNew(false);
			}
			else {
				session.merge(volunteer);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VolunteerModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((volunteerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						volunteerModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { volunteerModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}
		}

		EntityCacheUtil.putResult(VolunteerModelImpl.ENTITY_CACHE_ENABLED,
			VolunteerImpl.class, volunteer.getPrimaryKey(), volunteer, false);

		volunteer.resetOriginalValues();

		return volunteer;
	}

	protected Volunteer toUnwrappedModel(Volunteer volunteer) {
		if (volunteer instanceof VolunteerImpl) {
			return volunteer;
		}

		VolunteerImpl volunteerImpl = new VolunteerImpl();

		volunteerImpl.setNew(volunteer.isNew());
		volunteerImpl.setPrimaryKey(volunteer.getPrimaryKey());

		volunteerImpl.setVolunteerId(volunteer.getVolunteerId());
		volunteerImpl.setCompanyId(volunteer.getCompanyId());
		volunteerImpl.setUserId(volunteer.getUserId());
		volunteerImpl.setUserName(volunteer.getUserName());
		volunteerImpl.setCreateDate(volunteer.getCreateDate());
		volunteerImpl.setModifiedDate(volunteer.getModifiedDate());
		volunteerImpl.setFirstName(volunteer.getFirstName());
		volunteerImpl.setLastName(volunteer.getLastName());
		volunteerImpl.setAddress(volunteer.getAddress());
		volunteerImpl.setCoordX(volunteer.getCoordX());
		volunteerImpl.setCoordY(volunteer.getCoordY());

		return volunteerImpl;
	}

	/**
	 * Returns the volunteer with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the volunteer
	 * @return the volunteer
	 * @throws com.liferay.evp.admin.NoSuchVolunteerException if a volunteer with the primary key could not be found
	 */
	@Override
	public Volunteer findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVolunteerException {
		Volunteer volunteer = fetchByPrimaryKey(primaryKey);

		if (volunteer == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVolunteerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return volunteer;
	}

	/**
	 * Returns the volunteer with the primary key or throws a {@link com.liferay.evp.admin.NoSuchVolunteerException} if it could not be found.
	 *
	 * @param volunteerId the primary key of the volunteer
	 * @return the volunteer
	 * @throws com.liferay.evp.admin.NoSuchVolunteerException if a volunteer with the primary key could not be found
	 */
	@Override
	public Volunteer findByPrimaryKey(long volunteerId)
		throws NoSuchVolunteerException {
		return findByPrimaryKey((Serializable)volunteerId);
	}

	/**
	 * Returns the volunteer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the volunteer
	 * @return the volunteer, or <code>null</code> if a volunteer with the primary key could not be found
	 */
	@Override
	public Volunteer fetchByPrimaryKey(Serializable primaryKey) {
		Volunteer volunteer = (Volunteer)EntityCacheUtil.getResult(VolunteerModelImpl.ENTITY_CACHE_ENABLED,
				VolunteerImpl.class, primaryKey);

		if (volunteer == _nullVolunteer) {
			return null;
		}

		if (volunteer == null) {
			Session session = null;

			try {
				session = openSession();

				volunteer = (Volunteer)session.get(VolunteerImpl.class,
						primaryKey);

				if (volunteer != null) {
					cacheResult(volunteer);
				}
				else {
					EntityCacheUtil.putResult(VolunteerModelImpl.ENTITY_CACHE_ENABLED,
						VolunteerImpl.class, primaryKey, _nullVolunteer);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(VolunteerModelImpl.ENTITY_CACHE_ENABLED,
					VolunteerImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return volunteer;
	}

	/**
	 * Returns the volunteer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param volunteerId the primary key of the volunteer
	 * @return the volunteer, or <code>null</code> if a volunteer with the primary key could not be found
	 */
	@Override
	public Volunteer fetchByPrimaryKey(long volunteerId) {
		return fetchByPrimaryKey((Serializable)volunteerId);
	}

	@Override
	public Map<Serializable, Volunteer> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Volunteer> map = new HashMap<Serializable, Volunteer>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Volunteer volunteer = fetchByPrimaryKey(primaryKey);

			if (volunteer != null) {
				map.put(primaryKey, volunteer);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Volunteer volunteer = (Volunteer)EntityCacheUtil.getResult(VolunteerModelImpl.ENTITY_CACHE_ENABLED,
					VolunteerImpl.class, primaryKey);

			if (volunteer == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, volunteer);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VOLUNTEER_WHERE_PKS_IN);

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

			for (Volunteer volunteer : (List<Volunteer>)q.list()) {
				map.put(volunteer.getPrimaryKeyObj(), volunteer);

				cacheResult(volunteer);

				uncachedPrimaryKeys.remove(volunteer.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				EntityCacheUtil.putResult(VolunteerModelImpl.ENTITY_CACHE_ENABLED,
					VolunteerImpl.class, primaryKey, _nullVolunteer);
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
	 * Returns all the volunteers.
	 *
	 * @return the volunteers
	 */
	@Override
	public List<Volunteer> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the volunteers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.model.impl.VolunteerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of volunteers
	 * @param end the upper bound of the range of volunteers (not inclusive)
	 * @return the range of volunteers
	 */
	@Override
	public List<Volunteer> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the volunteers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.model.impl.VolunteerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of volunteers
	 * @param end the upper bound of the range of volunteers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of volunteers
	 */
	@Override
	public List<Volunteer> findAll(int start, int end,
		OrderByComparator<Volunteer> orderByComparator) {
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

		List<Volunteer> list = (List<Volunteer>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VOLUNTEER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VOLUNTEER;

				if (pagination) {
					sql = sql.concat(VolunteerModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Volunteer>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Volunteer>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the volunteers from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Volunteer volunteer : findAll()) {
			remove(volunteer);
		}
	}

	/**
	 * Returns the number of volunteers.
	 *
	 * @return the number of volunteers
	 */
	@Override
	public int countAll() {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VOLUNTEER);

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
	 * Initializes the volunteer persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		EntityCacheUtil.removeCache(VolunteerImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_VOLUNTEER = "SELECT volunteer FROM Volunteer volunteer";
	private static final String _SQL_SELECT_VOLUNTEER_WHERE_PKS_IN = "SELECT volunteer FROM Volunteer volunteer WHERE volunteerId IN (";
	private static final String _SQL_SELECT_VOLUNTEER_WHERE = "SELECT volunteer FROM Volunteer volunteer WHERE ";
	private static final String _SQL_COUNT_VOLUNTEER = "SELECT COUNT(volunteer) FROM Volunteer volunteer";
	private static final String _SQL_COUNT_VOLUNTEER_WHERE = "SELECT COUNT(volunteer) FROM Volunteer volunteer WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "volunteer.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Volunteer exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Volunteer exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static final Log _log = LogFactoryUtil.getLog(VolunteerPersistenceImpl.class);
	private static final Volunteer _nullVolunteer = new VolunteerImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Volunteer> toCacheModel() {
				return _nullVolunteerCacheModel;
			}
		};

	private static final CacheModel<Volunteer> _nullVolunteerCacheModel = new CacheModel<Volunteer>() {
			@Override
			public Volunteer toEntityModel() {
				return _nullVolunteer;
			}
		};
}