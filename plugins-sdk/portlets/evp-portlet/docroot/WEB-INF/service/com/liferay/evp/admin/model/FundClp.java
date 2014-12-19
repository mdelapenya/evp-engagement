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

import com.liferay.evp.admin.service.ClpSerializer;
import com.liferay.evp.admin.service.FundLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.User;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.UserLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Joan.Kim
 */
@ProviderType
public class FundClp extends BaseModelImpl<Fund> implements Fund {
	public FundClp() {
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
	public long getPrimaryKey() {
		return _fundId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFundId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _fundId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public long getFundId() {
		return _fundId;
	}

	@Override
	public void setFundId(long fundId) {
		_fundId = fundId;

		if (_fundRemoteModel != null) {
			try {
				Class<?> clazz = _fundRemoteModel.getClass();

				Method method = clazz.getMethod("setFundId", long.class);

				method.invoke(_fundRemoteModel, fundId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_fundRemoteModel != null) {
			try {
				Class<?> clazz = _fundRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_fundRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_fundRemoteModel != null) {
			try {
				Class<?> clazz = _fundRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_fundRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_fundRemoteModel != null) {
			try {
				Class<?> clazz = _fundRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_fundRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_fundRemoteModel != null) {
			try {
				Class<?> clazz = _fundRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_fundRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_fundRemoteModel != null) {
			try {
				Class<?> clazz = _fundRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_fundRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_fundRemoteModel != null) {
			try {
				Class<?> clazz = _fundRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_fundRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getProjectId() {
		return _projectId;
	}

	@Override
	public void setProjectId(long projectId) {
		_projectId = projectId;

		if (_fundRemoteModel != null) {
			try {
				Class<?> clazz = _fundRemoteModel.getClass();

				Method method = clazz.getMethod("setProjectId", long.class);

				method.invoke(_fundRemoteModel, projectId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getAmount() {
		return _amount;
	}

	@Override
	public void setAmount(double amount) {
		_amount = amount;

		if (_fundRemoteModel != null) {
			try {
				Class<?> clazz = _fundRemoteModel.getClass();

				Method method = clazz.getMethod("setAmount", double.class);

				method.invoke(_fundRemoteModel, amount);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getVolunteerId() {
		return _volunteerId;
	}

	@Override
	public void setVolunteerId(long volunteerId) {
		_volunteerId = volunteerId;

		if (_fundRemoteModel != null) {
			try {
				Class<?> clazz = _fundRemoteModel.getClass();

				Method method = clazz.getMethod("setVolunteerId", long.class);

				method.invoke(_fundRemoteModel, volunteerId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getReceiveDate() {
		return _receiveDate;
	}

	@Override
	public void setReceiveDate(Date receiveDate) {
		_receiveDate = receiveDate;

		if (_fundRemoteModel != null) {
			try {
				Class<?> clazz = _fundRemoteModel.getClass();

				Method method = clazz.getMethod("setReceiveDate", Date.class);

				method.invoke(_fundRemoteModel, receiveDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getFundRemoteModel() {
		return _fundRemoteModel;
	}

	public void setFundRemoteModel(BaseModel<?> fundRemoteModel) {
		_fundRemoteModel = fundRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _fundRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_fundRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			FundLocalServiceUtil.addFund(this);
		}
		else {
			FundLocalServiceUtil.updateFund(this);
		}
	}

	@Override
	public Fund toEscapedModel() {
		return (Fund)ProxyUtil.newProxyInstance(Fund.class.getClassLoader(),
			new Class[] { Fund.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		FundClp clone = new FundClp();

		clone.setFundId(getFundId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setProjectId(getProjectId());
		clone.setAmount(getAmount());
		clone.setVolunteerId(getVolunteerId());
		clone.setReceiveDate(getReceiveDate());

		return clone;
	}

	@Override
	public int compareTo(Fund fund) {
		int value = 0;

		value = DateUtil.compareTo(getReceiveDate(), fund.getReceiveDate());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FundClp)) {
			return false;
		}

		FundClp fund = (FundClp)obj;

		long primaryKey = fund.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entityCacheEnabled;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _finderCacheEnabled;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{fundId=");
		sb.append(getFundId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", projectId=");
		sb.append(getProjectId());
		sb.append(", amount=");
		sb.append(getAmount());
		sb.append(", volunteerId=");
		sb.append(getVolunteerId());
		sb.append(", receiveDate=");
		sb.append(getReceiveDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.liferay.evp.admin.model.Fund");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>fundId</column-name><column-value><![CDATA[");
		sb.append(getFundId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>projectId</column-name><column-value><![CDATA[");
		sb.append(getProjectId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>amount</column-name><column-value><![CDATA[");
		sb.append(getAmount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>volunteerId</column-name><column-value><![CDATA[");
		sb.append(getVolunteerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receiveDate</column-name><column-value><![CDATA[");
		sb.append(getReceiveDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _fundRemoteModel;
	private Class<?> _clpSerializerClass = com.liferay.evp.admin.service.ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}