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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the volunteer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Joan.Kim
 * @see VolunteerPersistenceImpl
 * @see VolunteerUtil
 * @generated
 */
@ProviderType
public interface VolunteerPersistence extends BasePersistence<Volunteer> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VolunteerUtil} to access the volunteer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the volunteers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching volunteers
	*/
	public java.util.List<com.liferay.evp.admin.model.Volunteer> findByGroupId(
		long groupId);

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
	public java.util.List<com.liferay.evp.admin.model.Volunteer> findByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<com.liferay.evp.admin.model.Volunteer> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Volunteer> orderByComparator);

	/**
	* Returns the first volunteer in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching volunteer
	* @throws com.liferay.evp.admin.NoSuchVolunteerException if a matching volunteer could not be found
	*/
	public com.liferay.evp.admin.model.Volunteer findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Volunteer> orderByComparator)
		throws com.liferay.evp.admin.NoSuchVolunteerException;

	/**
	* Returns the first volunteer in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching volunteer, or <code>null</code> if a matching volunteer could not be found
	*/
	public com.liferay.evp.admin.model.Volunteer fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Volunteer> orderByComparator);

	/**
	* Returns the last volunteer in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching volunteer
	* @throws com.liferay.evp.admin.NoSuchVolunteerException if a matching volunteer could not be found
	*/
	public com.liferay.evp.admin.model.Volunteer findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Volunteer> orderByComparator)
		throws com.liferay.evp.admin.NoSuchVolunteerException;

	/**
	* Returns the last volunteer in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching volunteer, or <code>null</code> if a matching volunteer could not be found
	*/
	public com.liferay.evp.admin.model.Volunteer fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Volunteer> orderByComparator);

	/**
	* Returns the volunteers before and after the current volunteer in the ordered set where groupId = &#63;.
	*
	* @param volunteerId the primary key of the current volunteer
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next volunteer
	* @throws com.liferay.evp.admin.NoSuchVolunteerException if a volunteer with the primary key could not be found
	*/
	public com.liferay.evp.admin.model.Volunteer[] findByGroupId_PrevAndNext(
		long volunteerId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Volunteer> orderByComparator)
		throws com.liferay.evp.admin.NoSuchVolunteerException;

	/**
	* Removes all the volunteers where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of volunteers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching volunteers
	*/
	public int countByGroupId(long groupId);

	/**
	* Caches the volunteer in the entity cache if it is enabled.
	*
	* @param volunteer the volunteer
	*/
	public void cacheResult(com.liferay.evp.admin.model.Volunteer volunteer);

	/**
	* Caches the volunteers in the entity cache if it is enabled.
	*
	* @param volunteers the volunteers
	*/
	public void cacheResult(
		java.util.List<com.liferay.evp.admin.model.Volunteer> volunteers);

	/**
	* Creates a new volunteer with the primary key. Does not add the volunteer to the database.
	*
	* @param volunteerId the primary key for the new volunteer
	* @return the new volunteer
	*/
	public com.liferay.evp.admin.model.Volunteer create(long volunteerId);

	/**
	* Removes the volunteer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param volunteerId the primary key of the volunteer
	* @return the volunteer that was removed
	* @throws com.liferay.evp.admin.NoSuchVolunteerException if a volunteer with the primary key could not be found
	*/
	public com.liferay.evp.admin.model.Volunteer remove(long volunteerId)
		throws com.liferay.evp.admin.NoSuchVolunteerException;

	public com.liferay.evp.admin.model.Volunteer updateImpl(
		com.liferay.evp.admin.model.Volunteer volunteer);

	/**
	* Returns the volunteer with the primary key or throws a {@link com.liferay.evp.admin.NoSuchVolunteerException} if it could not be found.
	*
	* @param volunteerId the primary key of the volunteer
	* @return the volunteer
	* @throws com.liferay.evp.admin.NoSuchVolunteerException if a volunteer with the primary key could not be found
	*/
	public com.liferay.evp.admin.model.Volunteer findByPrimaryKey(
		long volunteerId) throws com.liferay.evp.admin.NoSuchVolunteerException;

	/**
	* Returns the volunteer with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param volunteerId the primary key of the volunteer
	* @return the volunteer, or <code>null</code> if a volunteer with the primary key could not be found
	*/
	public com.liferay.evp.admin.model.Volunteer fetchByPrimaryKey(
		long volunteerId);

	@Override
	public java.util.Map<java.io.Serializable, com.liferay.evp.admin.model.Volunteer> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the volunteers.
	*
	* @return the volunteers
	*/
	public java.util.List<com.liferay.evp.admin.model.Volunteer> findAll();

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
	public java.util.List<com.liferay.evp.admin.model.Volunteer> findAll(
		int start, int end);

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
	public java.util.List<com.liferay.evp.admin.model.Volunteer> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.model.Volunteer> orderByComparator);

	/**
	* Removes all the volunteers from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of volunteers.
	*
	* @return the number of volunteers
	*/
	public int countAll();
}