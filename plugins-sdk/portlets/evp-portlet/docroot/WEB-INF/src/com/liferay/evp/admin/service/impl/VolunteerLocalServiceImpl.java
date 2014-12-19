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

package com.liferay.evp.admin.service.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.evp.admin.VolunteerAddressException;
import com.liferay.evp.admin.VolunteerFirstNameException;
import com.liferay.evp.admin.VolunteerLastNameException;
import com.liferay.evp.admin.model.Volunteer;
import com.liferay.evp.admin.pojos.LiferayAuditPOJO;
import com.liferay.evp.admin.service.base.VolunteerLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;

import java.util.Date;
import java.util.List;

/**
 * @author Joan Kim
 */
@ProviderType
public class VolunteerLocalServiceImpl extends VolunteerLocalServiceBaseImpl {

	public Volunteer addVolunteer(
			long userId, LiferayAuditPOJO liferayAudit, String firstName,
			String lastName, String address, long coordX, long coordY)
		throws PortalException {

		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();

		validate(firstName, lastName, address);

		long volunteerId = counterLocalService.increment();

		Volunteer volunteer = volunteerPersistence.create(volunteerId);

		volunteer.setCompanyId(liferayAudit.getCompanyId());
		volunteer.setUserId(liferayAudit.getUserId());
		volunteer.setUserName(liferayAudit.getUserName());
		volunteer.setCreateDate(liferayAudit.getCreateDate());
		volunteer.setModifiedDate(liferayAudit.getModifiedDate());

		volunteer.setFirstName(firstName);
		volunteer.setLastName(lastName);
		volunteer.setAddress(address);
		volunteer.setCoordX(coordX);
		volunteer.setCoordY(coordY);

		volunteerPersistence.update(volunteer, false);

		return volunteer;
	}

	public List<Volunteer> getVolunteers(long companyId, int start, int end) {
		return volunteerPersistence.findByCompanyId(companyId, start, end);
	}

	public int getVolunteersCount(long companyId) {
		return volunteerPersistence.countByCompanyId(companyId);
	}

	public Volunteer updateVolunteer(
			long userId, long volunteerId, String firstName, String lastName,
			String address, long coordX, long coordY)
		throws PortalException {

		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();

		Volunteer volunteer = volunteerPersistence.findByPrimaryKey(
			volunteerId);

		validate(firstName, lastName, address);

		volunteer.setModifiedDate(now);
		volunteer.setFirstName(firstName);
		volunteer.setLastName(lastName);
		volunteer.setAddress(address);
		volunteer.setCoordX(coordX);

		volunteerPersistence.update(volunteer, false);

		return volunteer;
	}

	protected void validate(String firstName, String lastName, String address)
		throws PortalException {

		if (Validator.isNull(firstName)) {
			throw new VolunteerFirstNameException();
		}

		if (Validator.isNull(lastName)) {
			throw new VolunteerLastNameException();
		}

		if (Validator.isNull(address)) {
			throw new VolunteerAddressException();
		}
	}

}