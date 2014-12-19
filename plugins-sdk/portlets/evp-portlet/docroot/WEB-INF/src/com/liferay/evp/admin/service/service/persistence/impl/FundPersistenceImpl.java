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

package com.liferay.evp.admin.service.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.evp.admin.service.NoSuchFundException;
import com.liferay.evp.admin.service.model.Fund;
import com.liferay.evp.admin.service.model.impl.FundImpl;
import com.liferay.evp.admin.service.model.impl.FundModelImpl;
import com.liferay.evp.admin.service.service.persistence.FundPersistence;

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
 * The persistence implementation for the fund service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Joan.Kim
 * @see FundPersistence
 * @see FundUtil
 * @generated
 */
@ProviderType
public class FundPersistenceImpl extends BasePersistenceImpl<Fund>
	implements FundPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FundUtil} to access the fund persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FundImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FundModelImpl.ENTITY_CACHE_ENABLED,
			FundModelImpl.FINDER_CACHE_ENABLED, FundImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FundModelImpl.ENTITY_CACHE_ENABLED,
			FundModelImpl.FINDER_CACHE_ENABLED, FundImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FundModelImpl.ENTITY_CACHE_ENABLED,
			FundModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PROJECT = new FinderPath(FundModelImpl.ENTITY_CACHE_ENABLED,
			FundModelImpl.FINDER_CACHE_ENABLED, FundImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByProject",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROJECT =
		new FinderPath(FundModelImpl.ENTITY_CACHE_ENABLED,
			FundModelImpl.FINDER_CACHE_ENABLED, FundImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByProject",
			new String[] { Long.class.getName() },
			FundModelImpl.PROJECTID_COLUMN_BITMASK |
			FundModelImpl.RECEIVEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PROJECT = new FinderPath(FundModelImpl.ENTITY_CACHE_ENABLED,
			FundModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByProject",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the funds where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the matching funds
	 */
	@Override
	public List<Fund> findByProject(long projectId) {
		return findByProject(projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the funds where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.service.model.impl.FundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of funds
	 * @param end the upper bound of the range of funds (not inclusive)
	 * @return the range of matching funds
	 */
	@Override
	public List<Fund> findByProject(long projectId, int start, int end) {
		return findByProject(projectId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the funds where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.service.model.impl.FundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of funds
	 * @param end the upper bound of the range of funds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching funds
	 */
	@Override
	public List<Fund> findByProject(long projectId, int start, int end,
		OrderByComparator<Fund> orderByComparator) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROJECT;
			finderArgs = new Object[] { projectId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PROJECT;
			finderArgs = new Object[] { projectId, start, end, orderByComparator };
		}

		List<Fund> list = (List<Fund>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Fund fund : list) {
				if ((projectId != fund.getProjectId())) {
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

			query.append(_SQL_SELECT_FUND_WHERE);

			query.append(_FINDER_COLUMN_PROJECT_PROJECTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FundModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(projectId);

				if (!pagination) {
					list = (List<Fund>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Fund>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first fund in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fund
	 * @throws com.liferay.evp.admin.service.NoSuchFundException if a matching fund could not be found
	 */
	@Override
	public Fund findByProject_First(long projectId,
		OrderByComparator<Fund> orderByComparator) throws NoSuchFundException {
		Fund fund = fetchByProject_First(projectId, orderByComparator);

		if (fund != null) {
			return fund;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("projectId=");
		msg.append(projectId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFundException(msg.toString());
	}

	/**
	 * Returns the first fund in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fund, or <code>null</code> if a matching fund could not be found
	 */
	@Override
	public Fund fetchByProject_First(long projectId,
		OrderByComparator<Fund> orderByComparator) {
		List<Fund> list = findByProject(projectId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fund in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fund
	 * @throws com.liferay.evp.admin.service.NoSuchFundException if a matching fund could not be found
	 */
	@Override
	public Fund findByProject_Last(long projectId,
		OrderByComparator<Fund> orderByComparator) throws NoSuchFundException {
		Fund fund = fetchByProject_Last(projectId, orderByComparator);

		if (fund != null) {
			return fund;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("projectId=");
		msg.append(projectId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFundException(msg.toString());
	}

	/**
	 * Returns the last fund in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fund, or <code>null</code> if a matching fund could not be found
	 */
	@Override
	public Fund fetchByProject_Last(long projectId,
		OrderByComparator<Fund> orderByComparator) {
		int count = countByProject(projectId);

		if (count == 0) {
			return null;
		}

		List<Fund> list = findByProject(projectId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the funds before and after the current fund in the ordered set where projectId = &#63;.
	 *
	 * @param fundId the primary key of the current fund
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fund
	 * @throws com.liferay.evp.admin.service.NoSuchFundException if a fund with the primary key could not be found
	 */
	@Override
	public Fund[] findByProject_PrevAndNext(long fundId, long projectId,
		OrderByComparator<Fund> orderByComparator) throws NoSuchFundException {
		Fund fund = findByPrimaryKey(fundId);

		Session session = null;

		try {
			session = openSession();

			Fund[] array = new FundImpl[3];

			array[0] = getByProject_PrevAndNext(session, fund, projectId,
					orderByComparator, true);

			array[1] = fund;

			array[2] = getByProject_PrevAndNext(session, fund, projectId,
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

	protected Fund getByProject_PrevAndNext(Session session, Fund fund,
		long projectId, OrderByComparator<Fund> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FUND_WHERE);

		query.append(_FINDER_COLUMN_PROJECT_PROJECTID_2);

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
			query.append(FundModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(projectId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(fund);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Fund> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the funds where projectId = &#63; from the database.
	 *
	 * @param projectId the project ID
	 */
	@Override
	public void removeByProject(long projectId) {
		for (Fund fund : findByProject(projectId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(fund);
		}
	}

	/**
	 * Returns the number of funds where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the number of matching funds
	 */
	@Override
	public int countByProject(long projectId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PROJECT;

		Object[] finderArgs = new Object[] { projectId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FUND_WHERE);

			query.append(_FINDER_COLUMN_PROJECT_PROJECTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(projectId);

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

	private static final String _FINDER_COLUMN_PROJECT_PROJECTID_2 = "fund.projectId = ?";

	public FundPersistenceImpl() {
		setModelClass(Fund.class);
	}

	/**
	 * Caches the fund in the entity cache if it is enabled.
	 *
	 * @param fund the fund
	 */
	@Override
	public void cacheResult(Fund fund) {
		EntityCacheUtil.putResult(FundModelImpl.ENTITY_CACHE_ENABLED,
			FundImpl.class, fund.getPrimaryKey(), fund);

		fund.resetOriginalValues();
	}

	/**
	 * Caches the funds in the entity cache if it is enabled.
	 *
	 * @param funds the funds
	 */
	@Override
	public void cacheResult(List<Fund> funds) {
		for (Fund fund : funds) {
			if (EntityCacheUtil.getResult(FundModelImpl.ENTITY_CACHE_ENABLED,
						FundImpl.class, fund.getPrimaryKey()) == null) {
				cacheResult(fund);
			}
			else {
				fund.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all funds.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FundImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FundImpl.class);

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the fund.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Fund fund) {
		EntityCacheUtil.removeResult(FundModelImpl.ENTITY_CACHE_ENABLED,
			FundImpl.class, fund.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Fund> funds) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Fund fund : funds) {
			EntityCacheUtil.removeResult(FundModelImpl.ENTITY_CACHE_ENABLED,
				FundImpl.class, fund.getPrimaryKey());
		}
	}

	/**
	 * Creates a new fund with the primary key. Does not add the fund to the database.
	 *
	 * @param fundId the primary key for the new fund
	 * @return the new fund
	 */
	@Override
	public Fund create(long fundId) {
		Fund fund = new FundImpl();

		fund.setNew(true);
		fund.setPrimaryKey(fundId);

		return fund;
	}

	/**
	 * Removes the fund with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fundId the primary key of the fund
	 * @return the fund that was removed
	 * @throws com.liferay.evp.admin.service.NoSuchFundException if a fund with the primary key could not be found
	 */
	@Override
	public Fund remove(long fundId) throws NoSuchFundException {
		return remove((Serializable)fundId);
	}

	/**
	 * Removes the fund with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fund
	 * @return the fund that was removed
	 * @throws com.liferay.evp.admin.service.NoSuchFundException if a fund with the primary key could not be found
	 */
	@Override
	public Fund remove(Serializable primaryKey) throws NoSuchFundException {
		Session session = null;

		try {
			session = openSession();

			Fund fund = (Fund)session.get(FundImpl.class, primaryKey);

			if (fund == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFundException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(fund);
		}
		catch (NoSuchFundException nsee) {
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
	protected Fund removeImpl(Fund fund) {
		fund = toUnwrappedModel(fund);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fund)) {
				fund = (Fund)session.get(FundImpl.class, fund.getPrimaryKeyObj());
			}

			if (fund != null) {
				session.delete(fund);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (fund != null) {
			clearCache(fund);
		}

		return fund;
	}

	@Override
	public Fund updateImpl(com.liferay.evp.admin.service.model.Fund fund) {
		fund = toUnwrappedModel(fund);

		boolean isNew = fund.isNew();

		FundModelImpl fundModelImpl = (FundModelImpl)fund;

		Session session = null;

		try {
			session = openSession();

			if (fund.isNew()) {
				session.save(fund);

				fund.setNew(false);
			}
			else {
				session.merge(fund);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FundModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((fundModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROJECT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						fundModelImpl.getOriginalProjectId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PROJECT, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROJECT,
					args);

				args = new Object[] { fundModelImpl.getProjectId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PROJECT, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROJECT,
					args);
			}
		}

		EntityCacheUtil.putResult(FundModelImpl.ENTITY_CACHE_ENABLED,
			FundImpl.class, fund.getPrimaryKey(), fund, false);

		fund.resetOriginalValues();

		return fund;
	}

	protected Fund toUnwrappedModel(Fund fund) {
		if (fund instanceof FundImpl) {
			return fund;
		}

		FundImpl fundImpl = new FundImpl();

		fundImpl.setNew(fund.isNew());
		fundImpl.setPrimaryKey(fund.getPrimaryKey());

		fundImpl.setFundId(fund.getFundId());
		fundImpl.setGroupId(fund.getGroupId());
		fundImpl.setCompanyId(fund.getCompanyId());
		fundImpl.setUserId(fund.getUserId());
		fundImpl.setUserName(fund.getUserName());
		fundImpl.setCreateDate(fund.getCreateDate());
		fundImpl.setModifiedDate(fund.getModifiedDate());
		fundImpl.setProjectId(fund.getProjectId());
		fundImpl.setAmount(fund.getAmount());
		fundImpl.setVolunteerId(fund.getVolunteerId());
		fundImpl.setReceiveDate(fund.getReceiveDate());

		return fundImpl;
	}

	/**
	 * Returns the fund with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the fund
	 * @return the fund
	 * @throws com.liferay.evp.admin.service.NoSuchFundException if a fund with the primary key could not be found
	 */
	@Override
	public Fund findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFundException {
		Fund fund = fetchByPrimaryKey(primaryKey);

		if (fund == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFundException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return fund;
	}

	/**
	 * Returns the fund with the primary key or throws a {@link com.liferay.evp.admin.service.NoSuchFundException} if it could not be found.
	 *
	 * @param fundId the primary key of the fund
	 * @return the fund
	 * @throws com.liferay.evp.admin.service.NoSuchFundException if a fund with the primary key could not be found
	 */
	@Override
	public Fund findByPrimaryKey(long fundId) throws NoSuchFundException {
		return findByPrimaryKey((Serializable)fundId);
	}

	/**
	 * Returns the fund with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fund
	 * @return the fund, or <code>null</code> if a fund with the primary key could not be found
	 */
	@Override
	public Fund fetchByPrimaryKey(Serializable primaryKey) {
		Fund fund = (Fund)EntityCacheUtil.getResult(FundModelImpl.ENTITY_CACHE_ENABLED,
				FundImpl.class, primaryKey);

		if (fund == _nullFund) {
			return null;
		}

		if (fund == null) {
			Session session = null;

			try {
				session = openSession();

				fund = (Fund)session.get(FundImpl.class, primaryKey);

				if (fund != null) {
					cacheResult(fund);
				}
				else {
					EntityCacheUtil.putResult(FundModelImpl.ENTITY_CACHE_ENABLED,
						FundImpl.class, primaryKey, _nullFund);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(FundModelImpl.ENTITY_CACHE_ENABLED,
					FundImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return fund;
	}

	/**
	 * Returns the fund with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fundId the primary key of the fund
	 * @return the fund, or <code>null</code> if a fund with the primary key could not be found
	 */
	@Override
	public Fund fetchByPrimaryKey(long fundId) {
		return fetchByPrimaryKey((Serializable)fundId);
	}

	@Override
	public Map<Serializable, Fund> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Fund> map = new HashMap<Serializable, Fund>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Fund fund = fetchByPrimaryKey(primaryKey);

			if (fund != null) {
				map.put(primaryKey, fund);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Fund fund = (Fund)EntityCacheUtil.getResult(FundModelImpl.ENTITY_CACHE_ENABLED,
					FundImpl.class, primaryKey);

			if (fund == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, fund);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_FUND_WHERE_PKS_IN);

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

			for (Fund fund : (List<Fund>)q.list()) {
				map.put(fund.getPrimaryKeyObj(), fund);

				cacheResult(fund);

				uncachedPrimaryKeys.remove(fund.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				EntityCacheUtil.putResult(FundModelImpl.ENTITY_CACHE_ENABLED,
					FundImpl.class, primaryKey, _nullFund);
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
	 * Returns all the funds.
	 *
	 * @return the funds
	 */
	@Override
	public List<Fund> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the funds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.service.model.impl.FundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of funds
	 * @param end the upper bound of the range of funds (not inclusive)
	 * @return the range of funds
	 */
	@Override
	public List<Fund> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the funds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.service.model.impl.FundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of funds
	 * @param end the upper bound of the range of funds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of funds
	 */
	@Override
	public List<Fund> findAll(int start, int end,
		OrderByComparator<Fund> orderByComparator) {
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

		List<Fund> list = (List<Fund>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FUND);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FUND;

				if (pagination) {
					sql = sql.concat(FundModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Fund>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Fund>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the funds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Fund fund : findAll()) {
			remove(fund);
		}
	}

	/**
	 * Returns the number of funds.
	 *
	 * @return the number of funds
	 */
	@Override
	public int countAll() {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FUND);

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
	 * Initializes the fund persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		EntityCacheUtil.removeCache(FundImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_FUND = "SELECT fund FROM Fund fund";
	private static final String _SQL_SELECT_FUND_WHERE_PKS_IN = "SELECT fund FROM Fund fund WHERE fundId IN (";
	private static final String _SQL_SELECT_FUND_WHERE = "SELECT fund FROM Fund fund WHERE ";
	private static final String _SQL_COUNT_FUND = "SELECT COUNT(fund) FROM Fund fund";
	private static final String _SQL_COUNT_FUND_WHERE = "SELECT COUNT(fund) FROM Fund fund WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "fund.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Fund exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Fund exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static final Log _log = LogFactoryUtil.getLog(FundPersistenceImpl.class);
	private static final Fund _nullFund = new FundImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Fund> toCacheModel() {
				return _nullFundCacheModel;
			}
		};

	private static final CacheModel<Fund> _nullFundCacheModel = new CacheModel<Fund>() {
			@Override
			public Fund toEntityModel() {
				return _nullFund;
			}
		};
}