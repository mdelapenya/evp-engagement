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

package com.liferay.evp.admin.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.evp.admin.service.http.FundServiceSoap}.
 *
 * @author Joan.Kim
 * @see com.liferay.evp.admin.service.http.FundServiceSoap
 * @generated
 */
@ProviderType
public class FundSoap implements Serializable {
	public static FundSoap toSoapModel(Fund model) {
		FundSoap soapModel = new FundSoap();

		soapModel.setFundId(model.getFundId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setProjectId(model.getProjectId());
		soapModel.setAmount(model.getAmount());
		soapModel.setVolunteerId(model.getVolunteerId());
		soapModel.setReceiveDate(model.getReceiveDate());

		return soapModel;
	}

	public static FundSoap[] toSoapModels(Fund[] models) {
		FundSoap[] soapModels = new FundSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FundSoap[][] toSoapModels(Fund[][] models) {
		FundSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FundSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FundSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FundSoap[] toSoapModels(List<Fund> models) {
		List<FundSoap> soapModels = new ArrayList<FundSoap>(models.size());

		for (Fund model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FundSoap[soapModels.size()]);
	}

	public FundSoap() {
	}

	public long getPrimaryKey() {
		return _fundId;
	}

	public void setPrimaryKey(long pk) {
		setFundId(pk);
	}

	public long getFundId() {
		return _fundId;
	}

	public void setFundId(long fundId) {
		_fundId = fundId;
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

	public long getProjectId() {
		return _projectId;
	}

	public void setProjectId(long projectId) {
		_projectId = projectId;
	}

	public double getAmount() {
		return _amount;
	}

	public void setAmount(double amount) {
		_amount = amount;
	}

	public long getVolunteerId() {
		return _volunteerId;
	}

	public void setVolunteerId(long volunteerId) {
		_volunteerId = volunteerId;
	}

	public Date getReceiveDate() {
		return _receiveDate;
	}

	public void setReceiveDate(Date receiveDate) {
		_receiveDate = receiveDate;
	}

	private long _fundId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _projectId;
	private double _amount;
	private long _volunteerId;
	private Date _receiveDate;
}