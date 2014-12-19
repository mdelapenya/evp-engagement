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

package com.liferay.evp.admin.service.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.evp.admin.service.model.Volunteer;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Volunteer in entity cache.
 *
 * @author Joan.Kim
 * @see Volunteer
 * @generated
 */
@ProviderType
public class VolunteerCacheModel implements CacheModel<Volunteer>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{volunteerId=");
		sb.append(volunteerId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", address=");
		sb.append(address);
		sb.append(", coordX=");
		sb.append(coordX);
		sb.append(", coordY=");
		sb.append(coordY);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Volunteer toEntityModel() {
		VolunteerImpl volunteerImpl = new VolunteerImpl();

		volunteerImpl.setVolunteerId(volunteerId);
		volunteerImpl.setGroupId(groupId);
		volunteerImpl.setCompanyId(companyId);
		volunteerImpl.setUserId(userId);

		if (userName == null) {
			volunteerImpl.setUserName(StringPool.BLANK);
		}
		else {
			volunteerImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			volunteerImpl.setCreateDate(null);
		}
		else {
			volunteerImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			volunteerImpl.setModifiedDate(null);
		}
		else {
			volunteerImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (firstName == null) {
			volunteerImpl.setFirstName(StringPool.BLANK);
		}
		else {
			volunteerImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			volunteerImpl.setLastName(StringPool.BLANK);
		}
		else {
			volunteerImpl.setLastName(lastName);
		}

		if (address == null) {
			volunteerImpl.setAddress(StringPool.BLANK);
		}
		else {
			volunteerImpl.setAddress(address);
		}

		volunteerImpl.setCoordX(coordX);
		volunteerImpl.setCoordY(coordY);

		volunteerImpl.resetOriginalValues();

		return volunteerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		volunteerId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		firstName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		address = objectInput.readUTF();
		coordX = objectInput.readLong();
		coordY = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(volunteerId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (firstName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (lastName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}

		objectOutput.writeLong(coordX);
		objectOutput.writeLong(coordY);
	}

	public long volunteerId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String firstName;
	public String lastName;
	public String address;
	public long coordX;
	public long coordY;
}