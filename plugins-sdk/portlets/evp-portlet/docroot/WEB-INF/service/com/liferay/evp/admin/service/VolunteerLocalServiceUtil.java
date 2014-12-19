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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Volunteer. This utility wraps
 * {@link com.liferay.evp.admin.service.impl.VolunteerLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Joan.Kim
 * @see VolunteerLocalService
 * @see com.liferay.evp.admin.service.base.VolunteerLocalServiceBaseImpl
 * @see com.liferay.evp.admin.service.impl.VolunteerLocalServiceImpl
 * @generated
 */
@ProviderType
public class VolunteerLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.evp.admin.service.impl.VolunteerLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.evp.admin.model.Volunteer addVolunteer(
		long userId, com.liferay.evp.admin.pojos.LiferayAuditPOJO liferayAudit,
		java.lang.String firstName, java.lang.String lastName,
		java.lang.String address, long coordX, long coordY)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .addVolunteer(userId, liferayAudit, firstName, lastName,
			address, coordX, coordY);
	}

	/**
	* Adds the volunteer to the database. Also notifies the appropriate model listeners.
	*
	* @param volunteer the volunteer
	* @return the volunteer that was added
	*/
	public static com.liferay.evp.admin.model.Volunteer addVolunteer(
		com.liferay.evp.admin.model.Volunteer volunteer) {
		return getService().addVolunteer(volunteer);
	}

	/**
	* Creates a new volunteer with the primary key. Does not add the volunteer to the database.
	*
	* @param volunteerId the primary key for the new volunteer
	* @return the new volunteer
	*/
	public static com.liferay.evp.admin.model.Volunteer createVolunteer(
		long volunteerId) {
		return getService().createVolunteer(volunteerId);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.model.PersistedModel deletePersistedModel(
		com.liferay.portal.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the volunteer from the database. Also notifies the appropriate model listeners.
	*
	* @param volunteer the volunteer
	* @return the volunteer that was removed
	*/
	public static com.liferay.evp.admin.model.Volunteer deleteVolunteer(
		com.liferay.evp.admin.model.Volunteer volunteer) {
		return getService().deleteVolunteer(volunteer);
	}

	/**
	* Deletes the volunteer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param volunteerId the primary key of the volunteer
	* @return the volunteer that was removed
	* @throws PortalException if a volunteer with the primary key could not be found
	*/
	public static com.liferay.evp.admin.model.Volunteer deleteVolunteer(
		long volunteerId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVolunteer(volunteerId);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.evp.admin.model.Volunteer fetchVolunteer(
		long volunteerId) {
		return getService().fetchVolunteer(volunteerId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the volunteer with the primary key.
	*
	* @param volunteerId the primary key of the volunteer
	* @return the volunteer
	* @throws PortalException if a volunteer with the primary key could not be found
	*/
	public static com.liferay.evp.admin.model.Volunteer getVolunteer(
		long volunteerId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVolunteer(volunteerId);
	}

	public static java.util.List<com.liferay.evp.admin.model.Volunteer> getVolunteers(
		long companyId, int start, int end) {
		return getService().getVolunteers(companyId, start, end);
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
	public static java.util.List<com.liferay.evp.admin.model.Volunteer> getVolunteers(
		int start, int end) {
		return getService().getVolunteers(start, end);
	}

	/**
	* Returns the number of volunteers.
	*
	* @return the number of volunteers
	*/
	public static int getVolunteersCount() {
		return getService().getVolunteersCount();
	}

	public static int getVolunteersCount(long companyId) {
		return getService().getVolunteersCount(companyId);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static com.liferay.evp.admin.model.Volunteer updateVolunteer(
		long userId, long volunteerId, java.lang.String firstName,
		java.lang.String lastName, java.lang.String address, long coordX,
		long coordY) throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateVolunteer(userId, volunteerId, firstName, lastName,
			address, coordX, coordY);
	}

	/**
	* Updates the volunteer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param volunteer the volunteer
	* @return the volunteer that was updated
	*/
	public static com.liferay.evp.admin.model.Volunteer updateVolunteer(
		com.liferay.evp.admin.model.Volunteer volunteer) {
		return getService().updateVolunteer(volunteer);
	}

	public static void clearService() {
		_service = null;
	}

	public static VolunteerLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					VolunteerLocalService.class.getName());

			if (invokableLocalService instanceof VolunteerLocalService) {
				_service = (VolunteerLocalService)invokableLocalService;
			}
			else {
				_service = new VolunteerLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(VolunteerLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	@Deprecated
	public void setService(VolunteerLocalService service) {
	}

	private static VolunteerLocalService _service;
}