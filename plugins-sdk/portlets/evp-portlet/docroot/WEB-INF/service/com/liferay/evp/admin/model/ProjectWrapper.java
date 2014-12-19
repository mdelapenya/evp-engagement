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
 * This class is a wrapper for {@link Project}.
 * </p>
 *
 * @author Joan.Kim
 * @see Project
 * @generated
 */
@ProviderType
public class ProjectWrapper implements Project, ModelWrapper<Project> {
	public ProjectWrapper(Project project) {
		_project = project;
	}

	@Override
	public Class<?> getModelClass() {
		return Project.class;
	}

	@Override
	public String getModelClassName() {
		return Project.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("projectId", getProjectId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("location", getLocation());
		attributes.put("coordX", getCoordX());
		attributes.put("coordY", getCoordY());
		attributes.put("coverImageId", getCoverImageId());
		attributes.put("requiredFunds", getRequiredFunds());
		attributes.put("actualFunds", getActualFunds());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());
		attributes.put("approvalDate", getApprovalDate());
		attributes.put("managerName", getManagerName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long projectId = (Long)attributes.get("projectId");

		if (projectId != null) {
			setProjectId(projectId);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		Long coordX = (Long)attributes.get("coordX");

		if (coordX != null) {
			setCoordX(coordX);
		}

		Long coordY = (Long)attributes.get("coordY");

		if (coordY != null) {
			setCoordY(coordY);
		}

		Long coverImageId = (Long)attributes.get("coverImageId");

		if (coverImageId != null) {
			setCoverImageId(coverImageId);
		}

		Double requiredFunds = (Double)attributes.get("requiredFunds");

		if (requiredFunds != null) {
			setRequiredFunds(requiredFunds);
		}

		Double actualFunds = (Double)attributes.get("actualFunds");

		if (actualFunds != null) {
			setActualFunds(actualFunds);
		}

		Date startDate = (Date)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		Date endDate = (Date)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}

		Date approvalDate = (Date)attributes.get("approvalDate");

		if (approvalDate != null) {
			setApprovalDate(approvalDate);
		}

		String managerName = (String)attributes.get("managerName");

		if (managerName != null) {
			setManagerName(managerName);
		}
	}

	@Override
	public java.lang.Object clone() {
		return new ProjectWrapper((Project)_project.clone());
	}

	@Override
	public int compareTo(com.liferay.evp.admin.model.Project project) {
		return _project.compareTo(project);
	}

	/**
	* Returns the actual funds of this project.
	*
	* @return the actual funds of this project
	*/
	@Override
	public double getActualFunds() {
		return _project.getActualFunds();
	}

	/**
	* Returns the approval date of this project.
	*
	* @return the approval date of this project
	*/
	@Override
	public java.util.Date getApprovalDate() {
		return _project.getApprovalDate();
	}

	/**
	* Returns the company ID of this project.
	*
	* @return the company ID of this project
	*/
	@Override
	public long getCompanyId() {
		return _project.getCompanyId();
	}

	/**
	* Returns the coord x of this project.
	*
	* @return the coord x of this project
	*/
	@Override
	public long getCoordX() {
		return _project.getCoordX();
	}

	/**
	* Returns the coord y of this project.
	*
	* @return the coord y of this project
	*/
	@Override
	public long getCoordY() {
		return _project.getCoordY();
	}

	/**
	* Returns the cover image ID of this project.
	*
	* @return the cover image ID of this project
	*/
	@Override
	public long getCoverImageId() {
		return _project.getCoverImageId();
	}

	/**
	* Returns the create date of this project.
	*
	* @return the create date of this project
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _project.getCreateDate();
	}

	/**
	* Returns the description of this project.
	*
	* @return the description of this project
	*/
	@Override
	public java.lang.String getDescription() {
		return _project.getDescription();
	}

	/**
	* Returns the end date of this project.
	*
	* @return the end date of this project
	*/
	@Override
	public java.util.Date getEndDate() {
		return _project.getEndDate();
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _project.getExpandoBridge();
	}

	/**
	* Returns the group ID of this project.
	*
	* @return the group ID of this project
	*/
	@Override
	public long getGroupId() {
		return _project.getGroupId();
	}

	/**
	* Returns the location of this project.
	*
	* @return the location of this project
	*/
	@Override
	public java.lang.String getLocation() {
		return _project.getLocation();
	}

	/**
	* Returns the manager name of this project.
	*
	* @return the manager name of this project
	*/
	@Override
	public java.lang.String getManagerName() {
		return _project.getManagerName();
	}

	/**
	* Returns the modified date of this project.
	*
	* @return the modified date of this project
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _project.getModifiedDate();
	}

	/**
	* Returns the name of this project.
	*
	* @return the name of this project
	*/
	@Override
	public java.lang.String getName() {
		return _project.getName();
	}

	/**
	* Returns the primary key of this project.
	*
	* @return the primary key of this project
	*/
	@Override
	public long getPrimaryKey() {
		return _project.getPrimaryKey();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _project.getPrimaryKeyObj();
	}

	/**
	* Returns the project ID of this project.
	*
	* @return the project ID of this project
	*/
	@Override
	public long getProjectId() {
		return _project.getProjectId();
	}

	/**
	* Returns the required funds of this project.
	*
	* @return the required funds of this project
	*/
	@Override
	public double getRequiredFunds() {
		return _project.getRequiredFunds();
	}

	/**
	* Returns the start date of this project.
	*
	* @return the start date of this project
	*/
	@Override
	public java.util.Date getStartDate() {
		return _project.getStartDate();
	}

	/**
	* Returns the user ID of this project.
	*
	* @return the user ID of this project
	*/
	@Override
	public long getUserId() {
		return _project.getUserId();
	}

	/**
	* Returns the user name of this project.
	*
	* @return the user name of this project
	*/
	@Override
	public java.lang.String getUserName() {
		return _project.getUserName();
	}

	/**
	* Returns the user uuid of this project.
	*
	* @return the user uuid of this project
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _project.getUserUuid();
	}

	@Override
	public int hashCode() {
		return _project.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _project.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _project.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _project.isNew();
	}

	@Override
	public void persist() {
		_project.persist();
	}

	/**
	* Sets the actual funds of this project.
	*
	* @param actualFunds the actual funds of this project
	*/
	@Override
	public void setActualFunds(double actualFunds) {
		_project.setActualFunds(actualFunds);
	}

	/**
	* Sets the approval date of this project.
	*
	* @param approvalDate the approval date of this project
	*/
	@Override
	public void setApprovalDate(java.util.Date approvalDate) {
		_project.setApprovalDate(approvalDate);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_project.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this project.
	*
	* @param companyId the company ID of this project
	*/
	@Override
	public void setCompanyId(long companyId) {
		_project.setCompanyId(companyId);
	}

	/**
	* Sets the coord x of this project.
	*
	* @param coordX the coord x of this project
	*/
	@Override
	public void setCoordX(long coordX) {
		_project.setCoordX(coordX);
	}

	/**
	* Sets the coord y of this project.
	*
	* @param coordY the coord y of this project
	*/
	@Override
	public void setCoordY(long coordY) {
		_project.setCoordY(coordY);
	}

	/**
	* Sets the cover image ID of this project.
	*
	* @param coverImageId the cover image ID of this project
	*/
	@Override
	public void setCoverImageId(long coverImageId) {
		_project.setCoverImageId(coverImageId);
	}

	/**
	* Sets the create date of this project.
	*
	* @param createDate the create date of this project
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_project.setCreateDate(createDate);
	}

	/**
	* Sets the description of this project.
	*
	* @param description the description of this project
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_project.setDescription(description);
	}

	/**
	* Sets the end date of this project.
	*
	* @param endDate the end date of this project
	*/
	@Override
	public void setEndDate(java.util.Date endDate) {
		_project.setEndDate(endDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_project.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_project.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_project.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this project.
	*
	* @param groupId the group ID of this project
	*/
	@Override
	public void setGroupId(long groupId) {
		_project.setGroupId(groupId);
	}

	/**
	* Sets the location of this project.
	*
	* @param location the location of this project
	*/
	@Override
	public void setLocation(java.lang.String location) {
		_project.setLocation(location);
	}

	/**
	* Sets the manager name of this project.
	*
	* @param managerName the manager name of this project
	*/
	@Override
	public void setManagerName(java.lang.String managerName) {
		_project.setManagerName(managerName);
	}

	/**
	* Sets the modified date of this project.
	*
	* @param modifiedDate the modified date of this project
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_project.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this project.
	*
	* @param name the name of this project
	*/
	@Override
	public void setName(java.lang.String name) {
		_project.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_project.setNew(n);
	}

	/**
	* Sets the primary key of this project.
	*
	* @param primaryKey the primary key of this project
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_project.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_project.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the project ID of this project.
	*
	* @param projectId the project ID of this project
	*/
	@Override
	public void setProjectId(long projectId) {
		_project.setProjectId(projectId);
	}

	/**
	* Sets the required funds of this project.
	*
	* @param requiredFunds the required funds of this project
	*/
	@Override
	public void setRequiredFunds(double requiredFunds) {
		_project.setRequiredFunds(requiredFunds);
	}

	/**
	* Sets the start date of this project.
	*
	* @param startDate the start date of this project
	*/
	@Override
	public void setStartDate(java.util.Date startDate) {
		_project.setStartDate(startDate);
	}

	/**
	* Sets the user ID of this project.
	*
	* @param userId the user ID of this project
	*/
	@Override
	public void setUserId(long userId) {
		_project.setUserId(userId);
	}

	/**
	* Sets the user name of this project.
	*
	* @param userName the user name of this project
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_project.setUserName(userName);
	}

	/**
	* Sets the user uuid of this project.
	*
	* @param userUuid the user uuid of this project
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_project.setUserUuid(userUuid);
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.evp.admin.model.Project> toCacheModel() {
		return _project.toCacheModel();
	}

	@Override
	public com.liferay.evp.admin.model.Project toEscapedModel() {
		return new ProjectWrapper(_project.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _project.toString();
	}

	@Override
	public com.liferay.evp.admin.model.Project toUnescapedModel() {
		return new ProjectWrapper(_project.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _project.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProjectWrapper)) {
			return false;
		}

		ProjectWrapper projectWrapper = (ProjectWrapper)obj;

		if (Validator.equals(_project, projectWrapper._project)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	@Deprecated
	public Project getWrappedProject() {
		return _project;
	}

	@Override
	public Project getWrappedModel() {
		return _project;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _project.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _project.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_project.resetOriginalValues();
	}

	private final Project _project;
}