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
 * This class is a wrapper for {@link Volunteer}.
 * </p>
 *
 * @author Joan.Kim
 * @see Volunteer
 * @generated
 */
@ProviderType
public class VolunteerWrapper implements Volunteer, ModelWrapper<Volunteer> {
	public VolunteerWrapper(Volunteer volunteer) {
		_volunteer = volunteer;
	}

	@Override
	public Class<?> getModelClass() {
		return Volunteer.class;
	}

	@Override
	public String getModelClassName() {
		return Volunteer.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("volunteerId", getVolunteerId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("address", getAddress());
		attributes.put("coordX", getCoordX());
		attributes.put("coordY", getCoordY());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long volunteerId = (Long)attributes.get("volunteerId");

		if (volunteerId != null) {
			setVolunteerId(volunteerId);
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

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		Long coordX = (Long)attributes.get("coordX");

		if (coordX != null) {
			setCoordX(coordX);
		}

		Long coordY = (Long)attributes.get("coordY");

		if (coordY != null) {
			setCoordY(coordY);
		}
	}

	@Override
	public java.lang.Object clone() {
		return new VolunteerWrapper((Volunteer)_volunteer.clone());
	}

	@Override
	public int compareTo(com.liferay.evp.admin.model.Volunteer volunteer) {
		return _volunteer.compareTo(volunteer);
	}

	/**
	* Returns the address of this volunteer.
	*
	* @return the address of this volunteer
	*/
	@Override
	public java.lang.String getAddress() {
		return _volunteer.getAddress();
	}

	/**
	* Returns the company ID of this volunteer.
	*
	* @return the company ID of this volunteer
	*/
	@Override
	public long getCompanyId() {
		return _volunteer.getCompanyId();
	}

	/**
	* Returns the coord x of this volunteer.
	*
	* @return the coord x of this volunteer
	*/
	@Override
	public long getCoordX() {
		return _volunteer.getCoordX();
	}

	/**
	* Returns the coord y of this volunteer.
	*
	* @return the coord y of this volunteer
	*/
	@Override
	public long getCoordY() {
		return _volunteer.getCoordY();
	}

	/**
	* Returns the create date of this volunteer.
	*
	* @return the create date of this volunteer
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _volunteer.getCreateDate();
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _volunteer.getExpandoBridge();
	}

	/**
	* Returns the first name of this volunteer.
	*
	* @return the first name of this volunteer
	*/
	@Override
	public java.lang.String getFirstName() {
		return _volunteer.getFirstName();
	}

	/**
	* Returns the last name of this volunteer.
	*
	* @return the last name of this volunteer
	*/
	@Override
	public java.lang.String getLastName() {
		return _volunteer.getLastName();
	}

	/**
	* Returns the modified date of this volunteer.
	*
	* @return the modified date of this volunteer
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _volunteer.getModifiedDate();
	}

	/**
	* Returns the primary key of this volunteer.
	*
	* @return the primary key of this volunteer
	*/
	@Override
	public long getPrimaryKey() {
		return _volunteer.getPrimaryKey();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _volunteer.getPrimaryKeyObj();
	}

	/**
	* Returns the user ID of this volunteer.
	*
	* @return the user ID of this volunteer
	*/
	@Override
	public long getUserId() {
		return _volunteer.getUserId();
	}

	/**
	* Returns the user name of this volunteer.
	*
	* @return the user name of this volunteer
	*/
	@Override
	public java.lang.String getUserName() {
		return _volunteer.getUserName();
	}

	/**
	* Returns the user uuid of this volunteer.
	*
	* @return the user uuid of this volunteer
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _volunteer.getUserUuid();
	}

	/**
	* Returns the volunteer ID of this volunteer.
	*
	* @return the volunteer ID of this volunteer
	*/
	@Override
	public long getVolunteerId() {
		return _volunteer.getVolunteerId();
	}

	@Override
	public int hashCode() {
		return _volunteer.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _volunteer.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _volunteer.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _volunteer.isNew();
	}

	@Override
	public void persist() {
		_volunteer.persist();
	}

	/**
	* Sets the address of this volunteer.
	*
	* @param address the address of this volunteer
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_volunteer.setAddress(address);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_volunteer.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this volunteer.
	*
	* @param companyId the company ID of this volunteer
	*/
	@Override
	public void setCompanyId(long companyId) {
		_volunteer.setCompanyId(companyId);
	}

	/**
	* Sets the coord x of this volunteer.
	*
	* @param coordX the coord x of this volunteer
	*/
	@Override
	public void setCoordX(long coordX) {
		_volunteer.setCoordX(coordX);
	}

	/**
	* Sets the coord y of this volunteer.
	*
	* @param coordY the coord y of this volunteer
	*/
	@Override
	public void setCoordY(long coordY) {
		_volunteer.setCoordY(coordY);
	}

	/**
	* Sets the create date of this volunteer.
	*
	* @param createDate the create date of this volunteer
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_volunteer.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_volunteer.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_volunteer.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_volunteer.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the first name of this volunteer.
	*
	* @param firstName the first name of this volunteer
	*/
	@Override
	public void setFirstName(java.lang.String firstName) {
		_volunteer.setFirstName(firstName);
	}

	/**
	* Sets the last name of this volunteer.
	*
	* @param lastName the last name of this volunteer
	*/
	@Override
	public void setLastName(java.lang.String lastName) {
		_volunteer.setLastName(lastName);
	}

	/**
	* Sets the modified date of this volunteer.
	*
	* @param modifiedDate the modified date of this volunteer
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_volunteer.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_volunteer.setNew(n);
	}

	/**
	* Sets the primary key of this volunteer.
	*
	* @param primaryKey the primary key of this volunteer
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_volunteer.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_volunteer.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this volunteer.
	*
	* @param userId the user ID of this volunteer
	*/
	@Override
	public void setUserId(long userId) {
		_volunteer.setUserId(userId);
	}

	/**
	* Sets the user name of this volunteer.
	*
	* @param userName the user name of this volunteer
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_volunteer.setUserName(userName);
	}

	/**
	* Sets the user uuid of this volunteer.
	*
	* @param userUuid the user uuid of this volunteer
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_volunteer.setUserUuid(userUuid);
	}

	/**
	* Sets the volunteer ID of this volunteer.
	*
	* @param volunteerId the volunteer ID of this volunteer
	*/
	@Override
	public void setVolunteerId(long volunteerId) {
		_volunteer.setVolunteerId(volunteerId);
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.evp.admin.model.Volunteer> toCacheModel() {
		return _volunteer.toCacheModel();
	}

	@Override
	public com.liferay.evp.admin.model.Volunteer toEscapedModel() {
		return new VolunteerWrapper(_volunteer.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _volunteer.toString();
	}

	@Override
	public com.liferay.evp.admin.model.Volunteer toUnescapedModel() {
		return new VolunteerWrapper(_volunteer.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _volunteer.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VolunteerWrapper)) {
			return false;
		}

		VolunteerWrapper volunteerWrapper = (VolunteerWrapper)obj;

		if (Validator.equals(_volunteer, volunteerWrapper._volunteer)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	@Deprecated
	public Volunteer getWrappedVolunteer() {
		return _volunteer;
	}

	@Override
	public Volunteer getWrappedModel() {
		return _volunteer;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _volunteer.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _volunteer.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_volunteer.resetOriginalValues();
	}

	private final Volunteer _volunteer;
}