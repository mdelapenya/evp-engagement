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

package com.liferay.evp.admin.service.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.evp.admin.service.service.http.VolunteerServiceSoap}.
 *
 * @author Joan.Kim
 * @see com.liferay.evp.admin.service.service.http.VolunteerServiceSoap
 * @generated
 */
@ProviderType
public class VolunteerSoap implements Serializable {
	public static VolunteerSoap toSoapModel(Volunteer model) {
		VolunteerSoap soapModel = new VolunteerSoap();

		soapModel.setVolunteerId(model.getVolunteerId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setFirstName(model.getFirstName());
		soapModel.setLastName(model.getLastName());
		soapModel.setAddress(model.getAddress());
		soapModel.setCoordX(model.getCoordX());
		soapModel.setCoordY(model.getCoordY());

		return soapModel;
	}

	public static VolunteerSoap[] toSoapModels(Volunteer[] models) {
		VolunteerSoap[] soapModels = new VolunteerSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VolunteerSoap[][] toSoapModels(Volunteer[][] models) {
		VolunteerSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VolunteerSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VolunteerSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VolunteerSoap[] toSoapModels(List<Volunteer> models) {
		List<VolunteerSoap> soapModels = new ArrayList<VolunteerSoap>(models.size());

		for (Volunteer model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VolunteerSoap[soapModels.size()]);
	}

	public VolunteerSoap() {
	}

	public long getPrimaryKey() {
		return _volunteerId;
	}

	public void setPrimaryKey(long pk) {
		setVolunteerId(pk);
	}

	public long getVolunteerId() {
		return _volunteerId;
	}

	public void setVolunteerId(long volunteerId) {
		_volunteerId = volunteerId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public long getCoordX() {
		return _coordX;
	}

	public void setCoordX(long coordX) {
		_coordX = coordX;
	}

	public long getCoordY() {
		return _coordY;
	}

	public void setCoordY(long coordY) {
		_coordY = coordY;
	}

	private long _volunteerId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _firstName;
	private String _lastName;
	private String _address;
	private long _coordX;
	private long _coordY;
}