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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Fund}.
 * </p>
 *
 * @author Joan.Kim
 * @see Fund
 * @generated
 */
@ProviderType
public class FundWrapper implements Fund, ModelWrapper<Fund> {
	public FundWrapper(Fund fund) {
		_fund = fund;
	}

	@Override
	public Class<?> getModelClass() {
		return Fund.class;
	}

	@Override
	public String getModelClassName() {
		return Fund.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("fundId", getFundId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("projectId", getProjectId());
		attributes.put("amount", getAmount());
		attributes.put("volunteerId", getVolunteerId());
		attributes.put("receiveDate", getReceiveDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long fundId = (Long)attributes.get("fundId");

		if (fundId != null) {
			setFundId(fundId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long projectId = (Long)attributes.get("projectId");

		if (projectId != null) {
			setProjectId(projectId);
		}

		Double amount = (Double)attributes.get("amount");

		if (amount != null) {
			setAmount(amount);
		}

		Long volunteerId = (Long)attributes.get("volunteerId");

		if (volunteerId != null) {
			setVolunteerId(volunteerId);
		}

		Date receiveDate = (Date)attributes.get("receiveDate");

		if (receiveDate != null) {
			setReceiveDate(receiveDate);
		}
	}

	@Override
	public java.lang.Object clone() {
		return new FundWrapper((Fund)_fund.clone());
	}

	@Override
	public int compareTo(com.liferay.evp.admin.model.Fund fund) {
		return _fund.compareTo(fund);
	}

	/**
	* Returns the amount of this fund.
	*
	* @return the amount of this fund
	*/
	@Override
	public double getAmount() {
		return _fund.getAmount();
	}

	/**
	* Returns the company ID of this fund.
	*
	* @return the company ID of this fund
	*/
	@Override
	public long getCompanyId() {
		return _fund.getCompanyId();
	}

	/**
	* Returns the create date of this fund.
	*
	* @return the create date of this fund
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _fund.getCreateDate();
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _fund.getExpandoBridge();
	}

	/**
	* Returns the fund ID of this fund.
	*
	* @return the fund ID of this fund
	*/
	@Override
	public long getFundId() {
		return _fund.getFundId();
	}

	/**
	* Returns the group ID of this fund.
	*
	* @return the group ID of this fund
	*/
	@Override
	public long getGroupId() {
		return _fund.getGroupId();
	}

	/**
	* Returns the modified date of this fund.
	*
	* @return the modified date of this fund
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _fund.getModifiedDate();
	}

	/**
	* Returns the primary key of this fund.
	*
	* @return the primary key of this fund
	*/
	@Override
	public long getPrimaryKey() {
		return _fund.getPrimaryKey();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _fund.getPrimaryKeyObj();
	}

	/**
	* Returns the project ID of this fund.
	*
	* @return the project ID of this fund
	*/
	@Override
	public long getProjectId() {
		return _fund.getProjectId();
	}

	/**
	* Returns the receive date of this fund.
	*
	* @return the receive date of this fund
	*/
	@Override
	public java.util.Date getReceiveDate() {
		return _fund.getReceiveDate();
	}

	/**
	* Returns the user ID of this fund.
	*
	* @return the user ID of this fund
	*/
	@Override
	public long getUserId() {
		return _fund.getUserId();
	}

	/**
	* Returns the user name of this fund.
	*
	* @return the user name of this fund
	*/
	@Override
	public java.lang.String getUserName() {
		return _fund.getUserName();
	}

	/**
	* Returns the user uuid of this fund.
	*
	* @return the user uuid of this fund
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _fund.getUserUuid();
	}

	/**
	* Returns the volunteer ID of this fund.
	*
	* @return the volunteer ID of this fund
	*/
	@Override
	public long getVolunteerId() {
		return _fund.getVolunteerId();
	}

	@Override
	public int hashCode() {
		return _fund.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _fund.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _fund.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _fund.isNew();
	}

	@Override
	public void persist() {
		_fund.persist();
	}

	/**
	* Sets the amount of this fund.
	*
	* @param amount the amount of this fund
	*/
	@Override
	public void setAmount(double amount) {
		_fund.setAmount(amount);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_fund.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this fund.
	*
	* @param companyId the company ID of this fund
	*/
	@Override
	public void setCompanyId(long companyId) {
		_fund.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this fund.
	*
	* @param createDate the create date of this fund
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_fund.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_fund.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_fund.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_fund.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the fund ID of this fund.
	*
	* @param fundId the fund ID of this fund
	*/
	@Override
	public void setFundId(long fundId) {
		_fund.setFundId(fundId);
	}

	/**
	* Sets the group ID of this fund.
	*
	* @param groupId the group ID of this fund
	*/
	@Override
	public void setGroupId(long groupId) {
		_fund.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this fund.
	*
	* @param modifiedDate the modified date of this fund
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_fund.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_fund.setNew(n);
	}

	/**
	* Sets the primary key of this fund.
	*
	* @param primaryKey the primary key of this fund
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_fund.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_fund.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the project ID of this fund.
	*
	* @param projectId the project ID of this fund
	*/
	@Override
	public void setProjectId(long projectId) {
		_fund.setProjectId(projectId);
	}

	/**
	* Sets the receive date of this fund.
	*
	* @param receiveDate the receive date of this fund
	*/
	@Override
	public void setReceiveDate(java.util.Date receiveDate) {
		_fund.setReceiveDate(receiveDate);
	}

	/**
	* Sets the user ID of this fund.
	*
	* @param userId the user ID of this fund
	*/
	@Override
	public void setUserId(long userId) {
		_fund.setUserId(userId);
	}

	/**
	* Sets the user name of this fund.
	*
	* @param userName the user name of this fund
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_fund.setUserName(userName);
	}

	/**
	* Sets the user uuid of this fund.
	*
	* @param userUuid the user uuid of this fund
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_fund.setUserUuid(userUuid);
	}

	/**
	* Sets the volunteer ID of this fund.
	*
	* @param volunteerId the volunteer ID of this fund
	*/
	@Override
	public void setVolunteerId(long volunteerId) {
		_fund.setVolunteerId(volunteerId);
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.evp.admin.model.Fund> toCacheModel() {
		return _fund.toCacheModel();
	}

	@Override
	public com.liferay.evp.admin.model.Fund toEscapedModel() {
		return new FundWrapper(_fund.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _fund.toString();
	}

	@Override
	public com.liferay.evp.admin.model.Fund toUnescapedModel() {
		return new FundWrapper(_fund.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _fund.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FundWrapper)) {
			return false;
		}

		FundWrapper fundWrapper = (FundWrapper)obj;

		if (Validator.equals(_fund, fundWrapper._fund)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	@Deprecated
	public Fund getWrappedFund() {
		return _fund;
	}

	@Override
	public Fund getWrappedModel() {
		return _fund;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _fund.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _fund.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_fund.resetOriginalValues();
	}

	private final Fund _fund;
}