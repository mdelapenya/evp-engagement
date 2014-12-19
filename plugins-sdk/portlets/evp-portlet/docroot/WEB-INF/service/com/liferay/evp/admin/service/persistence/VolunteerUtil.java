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

import com.liferay.evp.admin.model.Volunteer;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the volunteer service. This utility wraps {@link VolunteerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Joan.Kim
 * @see VolunteerPersistence
 * @see VolunteerPersistenceImpl
 * @generated
 */
@ProviderType
public class VolunteerUtil {
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
	public static void clearCache(Volunteer volunteer) {
		getPersistence().clearCache(volunteer);
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
	public static List<Volunteer> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Volunteer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Volunteer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Volunteer> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Volunteer update(Volunteer volunteer) {
		return getPersistence().update(volunteer);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Volunteer update(Volunteer volunteer,
		ServiceContext serviceContext) {
		return getPersistence().update(volunteer, serviceContext);
	}

	/**
	* Returns all the volunteers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching volunteers
	*/
	public static java.util.List<com.liferay.evp.admin.model.Volunteer> findByGroupId(
		long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the volunteers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.model.impl.VolunteerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of volunteers
	* @param end the upper bound of the range of volunteers (not inclusive)
	* @return the range of matching volunteers
	*/
	public static java.util.List<com.liferay.evp.admin.model.Volunteer> findByGroupId(
		long groupId, int start, int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the volunteers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.model.impl.VolunteerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of volunteers
	* @param end the upper bound of the range of volunteers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching volunteers
	*/
	public static java.util.List<com.liferay.evp.admin.model.Volunteer> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Volunteer> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first volunteer in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching volunteer
	* @throws com.liferay.evp.admin.NoSuchVolunteerException if a matching volunteer could not be found
	*/
	public static com.liferay.evp.admin.model.Volunteer findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Volunteer> orderByComparator)
		throws com.liferay.evp.admin.NoSuchVolunteerException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first volunteer in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching volunteer, or <code>null</code> if a matching volunteer could not be found
	*/
	public static com.liferay.evp.admin.model.Volunteer fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Volunteer> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last volunteer in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching volunteer
	* @throws com.liferay.evp.admin.NoSuchVolunteerException if a matching volunteer could not be found
	*/
	public static com.liferay.evp.admin.model.Volunteer findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Volunteer> orderByComparator)
		throws com.liferay.evp.admin.NoSuchVolunteerException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last volunteer in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching volunteer, or <code>null</code> if a matching volunteer could not be found
	*/
	public static com.liferay.evp.admin.model.Volunteer fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Volunteer> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the volunteers before and after the current volunteer in the ordered set where groupId = &#63;.
	*
	* @param volunteerId the primary key of the current volunteer
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next volunteer
	* @throws com.liferay.evp.admin.NoSuchVolunteerException if a volunteer with the primary key could not be found
	*/
	public static com.liferay.evp.admin.model.Volunteer[] findByGroupId_PrevAndNext(
		long volunteerId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Volunteer> orderByComparator)
		throws com.liferay.evp.admin.NoSuchVolunteerException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(volunteerId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the volunteers where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of volunteers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching volunteers
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Caches the volunteer in the entity cache if it is enabled.
	*
	* @param volunteer the volunteer
	*/
	public static void cacheResult(
		com.liferay.evp.admin.model.Volunteer volunteer) {
		getPersistence().cacheResult(volunteer);
	}

	/**
	* Caches the volunteers in the entity cache if it is enabled.
	*
	* @param volunteers the volunteers
	*/
	public static void cacheResult(
		java.util.List<com.liferay.evp.admin.model.Volunteer> volunteers) {
		getPersistence().cacheResult(volunteers);
	}

	/**
	* Creates a new volunteer with the primary key. Does not add the volunteer to the database.
	*
	* @param volunteerId the primary key for the new volunteer
	* @return the new volunteer
	*/
	public static com.liferay.evp.admin.model.Volunteer create(long volunteerId) {
		return getPersistence().create(volunteerId);
	}

	/**
	* Removes the volunteer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param volunteerId the primary key of the volunteer
	* @return the volunteer that was removed
	* @throws com.liferay.evp.admin.NoSuchVolunteerException if a volunteer with the primary key could not be found
	*/
	public static com.liferay.evp.admin.model.Volunteer remove(long volunteerId)
		throws com.liferay.evp.admin.NoSuchVolunteerException {
		return getPersistence().remove(volunteerId);
	}

	public static com.liferay.evp.admin.model.Volunteer updateImpl(
		com.liferay.evp.admin.model.Volunteer volunteer) {
		return getPersistence().updateImpl(volunteer);
	}

	/**
	* Returns the volunteer with the primary key or throws a {@link com.liferay.evp.admin.NoSuchVolunteerException} if it could not be found.
	*
	* @param volunteerId the primary key of the volunteer
	* @return the volunteer
	* @throws com.liferay.evp.admin.NoSuchVolunteerException if a volunteer with the primary key could not be found
	*/
	public static com.liferay.evp.admin.model.Volunteer findByPrimaryKey(
		long volunteerId) throws com.liferay.evp.admin.NoSuchVolunteerException {
		return getPersistence().findByPrimaryKey(volunteerId);
	}

	/**
	* Returns the volunteer with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param volunteerId the primary key of the volunteer
	* @return the volunteer, or <code>null</code> if a volunteer with the primary key could not be found
	*/
	public static com.liferay.evp.admin.model.Volunteer fetchByPrimaryKey(
		long volunteerId) {
		return getPersistence().fetchByPrimaryKey(volunteerId);
	}

	public static java.util.Map<java.io.Serializable, com.liferay.evp.admin.model.Volunteer> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the volunteers.
	*
	* @return the volunteers
	*/
	public static java.util.List<com.liferay.evp.admin.model.Volunteer> findAll() {
		return getPersistence().findAll();
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
	public static java.util.List<com.liferay.evp.admin.model.Volunteer> findAll(
		int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<com.liferay.evp.admin.model.Volunteer> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Volunteer> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the volunteers from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of volunteers.
	*
	* @return the number of volunteers
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VolunteerPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VolunteerPersistence)PortletBeanLocatorUtil.locate(com.liferay.evp.admin.service.ClpSerializer.getServletContextName(),
					VolunteerPersistence.class.getName());

			ReferenceRegistry.registerReference(VolunteerUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	@Deprecated
	public void setPersistence(VolunteerPersistence persistence) {
	}

	private static VolunteerPersistence _persistence;
}