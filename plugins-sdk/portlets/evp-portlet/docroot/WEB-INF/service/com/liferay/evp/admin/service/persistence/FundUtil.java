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

package com.liferay.evp.admin.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.evp.admin.model.Fund;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the fund service. This utility wraps {@link FundPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Joan.Kim
 * @see FundPersistence
 * @see FundPersistenceImpl
 * @generated
 */
@ProviderType
public class FundUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Fund fund) {
		getPersistence().clearCache(fund);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Fund> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Fund> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Fund> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Fund> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Fund update(Fund fund) {
		return getPersistence().update(fund);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Fund update(Fund fund, ServiceContext serviceContext) {
		return getPersistence().update(fund, serviceContext);
	}

	/**
	* Returns all the funds where projectId = &#63;.
	*
	* @param projectId the project ID
	* @return the matching funds
	*/
	public static java.util.List<com.liferay.evp.admin.model.Fund> findByProject(
		long projectId) {
		return getPersistence().findByProject(projectId);
	}

	/**
	* Returns a range of all the funds where projectId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.model.impl.FundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param projectId the project ID
	* @param start the lower bound of the range of funds
	* @param end the upper bound of the range of funds (not inclusive)
	* @return the range of matching funds
	*/
	public static java.util.List<com.liferay.evp.admin.model.Fund> findByProject(
		long projectId, int start, int end) {
		return getPersistence().findByProject(projectId, start, end);
	}

	/**
	* Returns an ordered range of all the funds where projectId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.model.impl.FundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param projectId the project ID
	* @param start the lower bound of the range of funds
	* @param end the upper bound of the range of funds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching funds
	*/
	public static java.util.List<com.liferay.evp.admin.model.Fund> findByProject(
		long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Fund> orderByComparator) {
		return getPersistence()
				   .findByProject(projectId, start, end, orderByComparator);
	}

	/**
	* Returns the first fund in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fund
	* @throws com.liferay.evp.admin.NoSuchFundException if a matching fund could not be found
	*/
	public static com.liferay.evp.admin.model.Fund findByProject_First(
		long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Fund> orderByComparator)
		throws com.liferay.evp.admin.NoSuchFundException {
		return getPersistence().findByProject_First(projectId, orderByComparator);
	}

	/**
	* Returns the first fund in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fund, or <code>null</code> if a matching fund could not be found
	*/
	public static com.liferay.evp.admin.model.Fund fetchByProject_First(
		long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Fund> orderByComparator) {
		return getPersistence()
				   .fetchByProject_First(projectId, orderByComparator);
	}

	/**
	* Returns the last fund in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fund
	* @throws com.liferay.evp.admin.NoSuchFundException if a matching fund could not be found
	*/
	public static com.liferay.evp.admin.model.Fund findByProject_Last(
		long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Fund> orderByComparator)
		throws com.liferay.evp.admin.NoSuchFundException {
		return getPersistence().findByProject_Last(projectId, orderByComparator);
	}

	/**
	* Returns the last fund in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fund, or <code>null</code> if a matching fund could not be found
	*/
	public static com.liferay.evp.admin.model.Fund fetchByProject_Last(
		long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Fund> orderByComparator) {
		return getPersistence().fetchByProject_Last(projectId, orderByComparator);
	}

	/**
	* Returns the funds before and after the current fund in the ordered set where projectId = &#63;.
	*
	* @param fundId the primary key of the current fund
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next fund
	* @throws com.liferay.evp.admin.NoSuchFundException if a fund with the primary key could not be found
	*/
	public static com.liferay.evp.admin.model.Fund[] findByProject_PrevAndNext(
		long fundId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Fund> orderByComparator)
		throws com.liferay.evp.admin.NoSuchFundException {
		return getPersistence()
				   .findByProject_PrevAndNext(fundId, projectId,
			orderByComparator);
	}

	/**
	* Removes all the funds where projectId = &#63; from the database.
	*
	* @param projectId the project ID
	*/
	public static void removeByProject(long projectId) {
		getPersistence().removeByProject(projectId);
	}

	/**
	* Returns the number of funds where projectId = &#63;.
	*
	* @param projectId the project ID
	* @return the number of matching funds
	*/
	public static int countByProject(long projectId) {
		return getPersistence().countByProject(projectId);
	}

	/**
	* Caches the fund in the entity cache if it is enabled.
	*
	* @param fund the fund
	*/
	public static void cacheResult(com.liferay.evp.admin.model.Fund fund) {
		getPersistence().cacheResult(fund);
	}

	/**
	* Caches the funds in the entity cache if it is enabled.
	*
	* @param funds the funds
	*/
	public static void cacheResult(
		java.util.List<com.liferay.evp.admin.model.Fund> funds) {
		getPersistence().cacheResult(funds);
	}

	/**
	* Creates a new fund with the primary key. Does not add the fund to the database.
	*
	* @param fundId the primary key for the new fund
	* @return the new fund
	*/
	public static com.liferay.evp.admin.model.Fund create(long fundId) {
		return getPersistence().create(fundId);
	}

	/**
	* Removes the fund with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fundId the primary key of the fund
	* @return the fund that was removed
	* @throws com.liferay.evp.admin.NoSuchFundException if a fund with the primary key could not be found
	*/
	public static com.liferay.evp.admin.model.Fund remove(long fundId)
		throws com.liferay.evp.admin.NoSuchFundException {
		return getPersistence().remove(fundId);
	}

	public static com.liferay.evp.admin.model.Fund updateImpl(
		com.liferay.evp.admin.model.Fund fund) {
		return getPersistence().updateImpl(fund);
	}

	/**
	* Returns the fund with the primary key or throws a {@link com.liferay.evp.admin.NoSuchFundException} if it could not be found.
	*
	* @param fundId the primary key of the fund
	* @return the fund
	* @throws com.liferay.evp.admin.NoSuchFundException if a fund with the primary key could not be found
	*/
	public static com.liferay.evp.admin.model.Fund findByPrimaryKey(long fundId)
		throws com.liferay.evp.admin.NoSuchFundException {
		return getPersistence().findByPrimaryKey(fundId);
	}

	/**
	* Returns the fund with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fundId the primary key of the fund
	* @return the fund, or <code>null</code> if a fund with the primary key could not be found
	*/
	public static com.liferay.evp.admin.model.Fund fetchByPrimaryKey(
		long fundId) {
		return getPersistence().fetchByPrimaryKey(fundId);
	}

	public static java.util.Map<java.io.Serializable, com.liferay.evp.admin.model.Fund> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the funds.
	*
	* @return the funds
	*/
	public static java.util.List<com.liferay.evp.admin.model.Fund> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the funds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.model.impl.FundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of funds
	* @param end the upper bound of the range of funds (not inclusive)
	* @return the range of funds
	*/
	public static java.util.List<com.liferay.evp.admin.model.Fund> findAll(
		int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the funds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.model.impl.FundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of funds
	* @param end the upper bound of the range of funds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of funds
	*/
	public static java.util.List<com.liferay.evp.admin.model.Fund> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Fund> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the funds from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of funds.
	*
	* @return the number of funds
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FundPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FundPersistence)PortletBeanLocatorUtil.locate(com.liferay.evp.admin.service.ClpSerializer.getServletContextName(),
					FundPersistence.class.getName());

			ReferenceRegistry.registerReference(FundUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	@Deprecated
	public void setPersistence(FundPersistence persistence) {
	}

	private static FundPersistence _persistence;
}