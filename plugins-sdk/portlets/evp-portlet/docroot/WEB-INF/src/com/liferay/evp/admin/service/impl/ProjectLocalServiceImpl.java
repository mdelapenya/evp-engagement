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

import com.liferay.evp.admin.model.Project;
import com.liferay.evp.admin.model.impl.LiferayAuditPOJO;
import com.liferay.evp.admin.service.base.ProjectLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the project local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.evp.admin.service.ProjectLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Manuel de la Peña
 * @see com.liferay.evp.admin.service.base.ProjectLocalServiceBaseImpl
 * @see com.liferay.evp.admin.service.ProjectLocalServiceUtil
 */
@ProviderType
public class ProjectLocalServiceImpl extends ProjectLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.liferay.evp.admin.service.ProjectLocalServiceUtil} to access the project local service.
	 */

	public Project addProject(
		long groupId, LiferayAuditPOJO liferayAudit, String name,
		String description, String location, long coordX, long coordY,
		long coverImageId, double requiredFunds, double actualFunds,
		Date startDate, Date endDate, Date approvalDate, String managerName) {

		long id = counterLocalService.increment();

		Project project = projectPersistence.create(id);

		liferayAudit.setCreateDate(new Date());

		_setProjectValues(
			project, groupId, liferayAudit, name, description, location, coordX,
			coordY, coverImageId, requiredFunds, actualFunds, startDate,
			endDate, approvalDate, managerName);

		return addProject(project);
	}

	public List<Project> findAllProjects(long companyId) {
		return projectPersistence.findByCompany(companyId);
	}

	public List<Project> findProjectsByManagerName(String managerName) {
		return projectPersistence.findByManagerName(managerName);
	}

	public Project updateProject(
		long projectId, long groupId, LiferayAuditPOJO liferayAudit,
		String name, String description, String location, long coordX,
		long coordY, long coverImageId, double requiredFunds,
		double actualFunds, Date startDate, Date endDate, Date approvalDate,
		String managerName) {

		Project project = projectPersistence.findByPrimaryKey(projectId);

		_setProjectValues(
			project, groupId, liferayAudit, name, description, location, coordX,
			coordY, coverImageId, requiredFunds, actualFunds, startDate,
			endDate, approvalDate, managerName);

		return updateProject(project);
	}

	private void _setProjectValues(
		Project project, long groupId, LiferayAuditPOJO liferayAudit,
		String name, String description, String location, long coordX,
		long coordY, long coverImageId, double requiredFunds,
		double actualFunds, Date startDate, Date endDate, Date approvalDate,
		String managerName) {

		project.setGroupId(groupId);

		// Audit fields

		liferayAudit.setCreateDate(project.getCreateDate());

		project.setCompanyId(liferayAudit.getCompanyId());
		project.setUserId(liferayAudit.getUserId());
		project.setUserName(liferayAudit.getUserName());
		project.setCreateDate(liferayAudit.getCreateDate());
		project.setModifiedDate(liferayAudit.getModifiedDate());

		// Other fields

		project.setName(name);
		project.setDescription(description);
		project.setLocation(location);
		project.setCoordX(coordX);
		project.setCoordY(coordY);
		project.setCoverImageId(coverImageId);
		project.setRequiredFunds(requiredFunds);
		project.setActualFunds(actualFunds);
		project.setStartDate(startDate);
		project.setEndDate(endDate);
		project.setApprovalDate(approvalDate);
		project.setManagerName(managerName);
	}

}