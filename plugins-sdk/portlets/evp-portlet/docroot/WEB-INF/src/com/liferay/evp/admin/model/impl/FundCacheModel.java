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

package com.liferay.evp.admin.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.evp.admin.model.Fund;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Fund in entity cache.
 *
 * @author Joan.Kim
 * @see Fund
 * @generated
 */
@ProviderType
public class FundCacheModel implements CacheModel<Fund>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{fundId=");
		sb.append(fundId);
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
		sb.append(", projectId=");
		sb.append(projectId);
		sb.append(", amount=");
		sb.append(amount);
		sb.append(", volunteerId=");
		sb.append(volunteerId);
		sb.append(", receiveDate=");
		sb.append(receiveDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Fund toEntityModel() {
		FundImpl fundImpl = new FundImpl();

		fundImpl.setFundId(fundId);
		fundImpl.setGroupId(groupId);
		fundImpl.setCompanyId(companyId);
		fundImpl.setUserId(userId);

		if (userName == null) {
			fundImpl.setUserName(StringPool.BLANK);
		}
		else {
			fundImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			fundImpl.setCreateDate(null);
		}
		else {
			fundImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			fundImpl.setModifiedDate(null);
		}
		else {
			fundImpl.setModifiedDate(new Date(modifiedDate));
		}

		fundImpl.setProjectId(projectId);
		fundImpl.setAmount(amount);
		fundImpl.setVolunteerId(volunteerId);

		if (receiveDate == Long.MIN_VALUE) {
			fundImpl.setReceiveDate(null);
		}
		else {
			fundImpl.setReceiveDate(new Date(receiveDate));
		}

		fundImpl.resetOriginalValues();

		return fundImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fundId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		projectId = objectInput.readLong();
		amount = objectInput.readDouble();
		volunteerId = objectInput.readLong();
		receiveDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(fundId);
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
		objectOutput.writeLong(projectId);
		objectOutput.writeDouble(amount);
		objectOutput.writeLong(volunteerId);
		objectOutput.writeLong(receiveDate);
	}

	public long fundId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long projectId;
	public double amount;
	public long volunteerId;
	public long receiveDate;
}