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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the fund service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Joan.Kim
 * @see FundPersistenceImpl
 * @see FundUtil
 * @generated
 */
@ProviderType
public interface FundPersistence extends BasePersistence<Fund> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FundUtil} to access the fund persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the funds where projectId = &#63;.
	*
	* @param projectId the project ID
	* @return the matching funds
	*/
	public java.util.List<com.liferay.evp.admin.model.Fund> findByProject(
		long projectId);

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
	public java.util.List<com.liferay.evp.admin.model.Fund> findByProject(
		long projectId, int start, int end);

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
	public java.util.List<com.liferay.evp.admin.model.Fund> findByProject(
		long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Fund> orderByComparator);

	/**
	* Returns the first fund in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fund
	* @throws com.liferay.evp.admin.NoSuchFundException if a matching fund could not be found
	*/
	public com.liferay.evp.admin.model.Fund findByProject_First(
		long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Fund> orderByComparator)
		throws com.liferay.evp.admin.NoSuchFundException;

	/**
	* Returns the first fund in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fund, or <code>null</code> if a matching fund could not be found
	*/
	public com.liferay.evp.admin.model.Fund fetchByProject_First(
		long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Fund> orderByComparator);

	/**
	* Returns the last fund in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fund
	* @throws com.liferay.evp.admin.NoSuchFundException if a matching fund could not be found
	*/
	public com.liferay.evp.admin.model.Fund findByProject_Last(long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Fund> orderByComparator)
		throws com.liferay.evp.admin.NoSuchFundException;

	/**
	* Returns the last fund in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fund, or <code>null</code> if a matching fund could not be found
	*/
	public com.liferay.evp.admin.model.Fund fetchByProject_Last(
		long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Fund> orderByComparator);

	/**
	* Returns the funds before and after the current fund in the ordered set where projectId = &#63;.
	*
	* @param fundId the primary key of the current fund
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next fund
	* @throws com.liferay.evp.admin.NoSuchFundException if a fund with the primary key could not be found
	*/
	public com.liferay.evp.admin.model.Fund[] findByProject_PrevAndNext(
		long fundId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Fund> orderByComparator)
		throws com.liferay.evp.admin.NoSuchFundException;

	/**
	* Removes all the funds where projectId = &#63; from the database.
	*
	* @param projectId the project ID
	*/
	public void removeByProject(long projectId);

	/**
	* Returns the number of funds where projectId = &#63;.
	*
	* @param projectId the project ID
	* @return the number of matching funds
	*/
	public int countByProject(long projectId);

	/**
	* Caches the fund in the entity cache if it is enabled.
	*
	* @param fund the fund
	*/
	public void cacheResult(com.liferay.evp.admin.model.Fund fund);

	/**
	* Caches the funds in the entity cache if it is enabled.
	*
	* @param funds the funds
	*/
	public void cacheResult(
		java.util.List<com.liferay.evp.admin.model.Fund> funds);

	/**
	* Creates a new fund with the primary key. Does not add the fund to the database.
	*
	* @param fundId the primary key for the new fund
	* @return the new fund
	*/
	public com.liferay.evp.admin.model.Fund create(long fundId);

	/**
	* Removes the fund with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fundId the primary key of the fund
	* @return the fund that was removed
	* @throws com.liferay.evp.admin.NoSuchFundException if a fund with the primary key could not be found
	*/
	public com.liferay.evp.admin.model.Fund remove(long fundId)
		throws com.liferay.evp.admin.NoSuchFundException;

	public com.liferay.evp.admin.model.Fund updateImpl(
		com.liferay.evp.admin.model.Fund fund);

	/**
	* Returns the fund with the primary key or throws a {@link com.liferay.evp.admin.NoSuchFundException} if it could not be found.
	*
	* @param fundId the primary key of the fund
	* @return the fund
	* @throws com.liferay.evp.admin.NoSuchFundException if a fund with the primary key could not be found
	*/
	public com.liferay.evp.admin.model.Fund findByPrimaryKey(long fundId)
		throws com.liferay.evp.admin.NoSuchFundException;

	/**
	* Returns the fund with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fundId the primary key of the fund
	* @return the fund, or <code>null</code> if a fund with the primary key could not be found
	*/
	public com.liferay.evp.admin.model.Fund fetchByPrimaryKey(long fundId);

	@Override
	public java.util.Map<java.io.Serializable, com.liferay.evp.admin.model.Fund> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the funds.
	*
	* @return the funds
	*/
	public java.util.List<com.liferay.evp.admin.model.Fund> findAll();

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
	public java.util.List<com.liferay.evp.admin.model.Fund> findAll(int start,
		int end);

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
	public java.util.List<com.liferay.evp.admin.model.Fund> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Fund> orderByComparator);

	/**
	* Removes all the funds from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of funds.
	*
	* @return the number of funds
	*/
	public int countAll();
}