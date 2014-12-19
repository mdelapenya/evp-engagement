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
 * Provides a wrapper for {@link VolunteerService}.
 *
 * @author Joan.Kim
 * @see VolunteerService
 * @generated
 */
@ProviderType
public class VolunteerServiceWrapper implements VolunteerService,
	ServiceWrapper<VolunteerService> {
	public VolunteerServiceWrapper(VolunteerService volunteerService) {
		_volunteerService = volunteerService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _volunteerService.getBeanIdentifier();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _volunteerService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_volunteerService.setBeanIdentifier(beanIdentifier);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	@Deprecated
	public VolunteerService getWrappedVolunteerService() {
		return _volunteerService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	@Deprecated
	public void setWrappedVolunteerService(VolunteerService volunteerService) {
		_volunteerService = volunteerService;
	}

	@Override
	public VolunteerService getWrappedService() {
		return _volunteerService;
	}

	@Override
	public void setWrappedService(VolunteerService volunteerService) {
		_volunteerService = volunteerService;
	}

	private VolunteerService _volunteerService;
}