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

package com.liferay.evp.admin.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VolunteerLocalService}.
 *
 * @author Joan.Kim
 * @see VolunteerLocalService
 * @generated
 */
@ProviderType
public class VolunteerLocalServiceWrapper implements VolunteerLocalService,
	ServiceWrapper<VolunteerLocalService> {
	public VolunteerLocalServiceWrapper(
		VolunteerLocalService volunteerLocalService) {
		_volunteerLocalService = volunteerLocalService;
	}

	/**
	* Adds the volunteer to the database. Also notifies the appropriate model listeners.
	*
	* @param volunteer the volunteer
	* @return the volunteer that was added
	*/
	@Override
	public com.liferay.evp.admin.model.Volunteer addVolunteer(
		com.liferay.evp.admin.model.Volunteer volunteer) {
		return _volunteerLocalService.addVolunteer(volunteer);
	}

	/**
	* Creates a new volunteer with the primary key. Does not add the volunteer to the database.
	*
	* @param volunteerId the primary key for the new volunteer
	* @return the new volunteer
	*/
	@Override
	public com.liferay.evp.admin.model.Volunteer createVolunteer(
		long volunteerId) {
		return _volunteerLocalService.createVolunteer(volunteerId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.model.PersistedModel deletePersistedModel(
		com.liferay.portal.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _volunteerLocalService.deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the volunteer from the database. Also notifies the appropriate model listeners.
	*
	* @param volunteer the volunteer
	* @return the volunteer that was removed
	*/
	@Override
	public com.liferay.evp.admin.model.Volunteer deleteVolunteer(
		com.liferay.evp.admin.model.Volunteer volunteer) {
		return _volunteerLocalService.deleteVolunteer(volunteer);
	}

	/**
	* Deletes the volunteer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param volunteerId the primary key of the volunteer
	* @return the volunteer that was removed
	* @throws PortalException if a volunteer with the primary key could not be found
	*/
	@Override
	public com.liferay.evp.admin.model.Volunteer deleteVolunteer(
		long volunteerId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _volunteerLocalService.deleteVolunteer(volunteerId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _volunteerLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _volunteerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.model.impl.VolunteerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _volunteerLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.model.impl.VolunteerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _volunteerLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _volunteerLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _volunteerLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.evp.admin.model.Volunteer fetchVolunteer(
		long volunteerId) {
		return _volunteerLocalService.fetchVolunteer(volunteerId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _volunteerLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _volunteerLocalService.getBeanIdentifier();
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _volunteerLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the volunteer with the primary key.
	*
	* @param volunteerId the primary key of the volunteer
	* @return the volunteer
	* @throws PortalException if a volunteer with the primary key could not be found
	*/
	@Override
	public com.liferay.evp.admin.model.Volunteer getVolunteer(long volunteerId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _volunteerLocalService.getVolunteer(volunteerId);
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
	public java.util.List<com.liferay.evp.admin.model.Volunteer> getVolunteers(
		int start, int end) {
		return _volunteerLocalService.getVolunteers(start, end);
	}

	/**
	* Returns the number of volunteers.
	*
	* @return the number of volunteers
	*/
	@Override
	public int getVolunteersCount() {
		return _volunteerLocalService.getVolunteersCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _volunteerLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_volunteerLocalService.setBeanIdentifier(beanIdentifier);
	}

	/**
	* Updates the volunteer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param volunteer the volunteer
	* @return the volunteer that was updated
	*/
	@Override
	public com.liferay.evp.admin.model.Volunteer updateVolunteer(
		com.liferay.evp.admin.model.Volunteer volunteer) {
		return _volunteerLocalService.updateVolunteer(volunteer);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	@Deprecated
	public VolunteerLocalService getWrappedVolunteerLocalService() {
		return _volunteerLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	@Deprecated
	public void setWrappedVolunteerLocalService(
		VolunteerLocalService volunteerLocalService) {
		_volunteerLocalService = volunteerLocalService;
	}

	@Override
	public VolunteerLocalService getWrappedService() {
		return _volunteerLocalService;
	}

	@Override
	public void setWrappedService(VolunteerLocalService volunteerLocalService) {
		_volunteerLocalService = volunteerLocalService;
	}

	private VolunteerLocalService _volunteerLocalService;
}