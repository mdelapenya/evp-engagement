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

package com.liferay.evp.admin.service.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.evp.admin.service.model.Project;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the project service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Joan.Kim
 * @see ProjectPersistenceImpl
 * @see ProjectUtil
 * @generated
 */
@ProviderType
public interface ProjectPersistence extends BasePersistence<Project> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProjectUtil} to access the project persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the projects where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching projects
	*/
	public java.util.List<com.liferay.evp.admin.service.model.Project> findByCompany(
		long companyId);

	/**
	* Returns a range of all the projects where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.service.model.impl.ProjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @return the range of matching projects
	*/
	public java.util.List<com.liferay.evp.admin.service.model.Project> findByCompany(
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the projects where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.service.model.impl.ProjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching projects
	*/
	public java.util.List<com.liferay.evp.admin.service.model.Project> findByCompany(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.service.model.Project> orderByComparator);

	/**
	* Returns the first project in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project
	* @throws com.liferay.evp.admin.service.NoSuchProjectException if a matching project could not be found
	*/
	public com.liferay.evp.admin.service.model.Project findByCompany_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.service.model.Project> orderByComparator)
		throws com.liferay.evp.admin.service.NoSuchProjectException;

	/**
	* Returns the first project in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project, or <code>null</code> if a matching project could not be found
	*/
	public com.liferay.evp.admin.service.model.Project fetchByCompany_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.service.model.Project> orderByComparator);

	/**
	* Returns the last project in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project
	* @throws com.liferay.evp.admin.service.NoSuchProjectException if a matching project could not be found
	*/
	public com.liferay.evp.admin.service.model.Project findByCompany_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.service.model.Project> orderByComparator)
		throws com.liferay.evp.admin.service.NoSuchProjectException;

	/**
	* Returns the last project in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project, or <code>null</code> if a matching project could not be found
	*/
	public com.liferay.evp.admin.service.model.Project fetchByCompany_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.service.model.Project> orderByComparator);

	/**
	* Returns the projects before and after the current project in the ordered set where companyId = &#63;.
	*
	* @param projectId the primary key of the current project
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next project
	* @throws com.liferay.evp.admin.service.NoSuchProjectException if a project with the primary key could not be found
	*/
	public com.liferay.evp.admin.service.model.Project[] findByCompany_PrevAndNext(
		long projectId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.service.model.Project> orderByComparator)
		throws com.liferay.evp.admin.service.NoSuchProjectException;

	/**
	* Removes all the projects where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	*/
	public void removeByCompany(long companyId);

	/**
	* Returns the number of projects where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching projects
	*/
	public int countByCompany(long companyId);

	/**
	* Returns all the projects where managerName = &#63;.
	*
	* @param managerName the manager name
	* @return the matching projects
	*/
	public java.util.List<com.liferay.evp.admin.service.model.Project> findByManagerName(
		java.lang.String managerName);

	/**
	* Returns a range of all the projects where managerName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.service.model.impl.ProjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param managerName the manager name
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @return the range of matching projects
	*/
	public java.util.List<com.liferay.evp.admin.service.model.Project> findByManagerName(
		java.lang.String managerName, int start, int end);

	/**
	* Returns an ordered range of all the projects where managerName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.service.model.impl.ProjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param managerName the manager name
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching projects
	*/
	public java.util.List<com.liferay.evp.admin.service.model.Project> findByManagerName(
		java.lang.String managerName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.service.model.Project> orderByComparator);

	/**
	* Returns the first project in the ordered set where managerName = &#63;.
	*
	* @param managerName the manager name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project
	* @throws com.liferay.evp.admin.service.NoSuchProjectException if a matching project could not be found
	*/
	public com.liferay.evp.admin.service.model.Project findByManagerName_First(
		java.lang.String managerName,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.service.model.Project> orderByComparator)
		throws com.liferay.evp.admin.service.NoSuchProjectException;

	/**
	* Returns the first project in the ordered set where managerName = &#63;.
	*
	* @param managerName the manager name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project, or <code>null</code> if a matching project could not be found
	*/
	public com.liferay.evp.admin.service.model.Project fetchByManagerName_First(
		java.lang.String managerName,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.service.model.Project> orderByComparator);

	/**
	* Returns the last project in the ordered set where managerName = &#63;.
	*
	* @param managerName the manager name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project
	* @throws com.liferay.evp.admin.service.NoSuchProjectException if a matching project could not be found
	*/
	public com.liferay.evp.admin.service.model.Project findByManagerName_Last(
		java.lang.String managerName,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.service.model.Project> orderByComparator)
		throws com.liferay.evp.admin.service.NoSuchProjectException;

	/**
	* Returns the last project in the ordered set where managerName = &#63;.
	*
	* @param managerName the manager name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project, or <code>null</code> if a matching project could not be found
	*/
	public com.liferay.evp.admin.service.model.Project fetchByManagerName_Last(
		java.lang.String managerName,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.service.model.Project> orderByComparator);

	/**
	* Returns the projects before and after the current project in the ordered set where managerName = &#63;.
	*
	* @param projectId the primary key of the current project
	* @param managerName the manager name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next project
	* @throws com.liferay.evp.admin.service.NoSuchProjectException if a project with the primary key could not be found
	*/
	public com.liferay.evp.admin.service.model.Project[] findByManagerName_PrevAndNext(
		long projectId, java.lang.String managerName,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.service.model.Project> orderByComparator)
		throws com.liferay.evp.admin.service.NoSuchProjectException;

	/**
	* Removes all the projects where managerName = &#63; from the database.
	*
	* @param managerName the manager name
	*/
	public void removeByManagerName(java.lang.String managerName);

	/**
	* Returns the number of projects where managerName = &#63;.
	*
	* @param managerName the manager name
	* @return the number of matching projects
	*/
	public int countByManagerName(java.lang.String managerName);

	/**
	* Caches the project in the entity cache if it is enabled.
	*
	* @param project the project
	*/
	public void cacheResult(com.liferay.evp.admin.service.model.Project project);

	/**
	* Caches the projects in the entity cache if it is enabled.
	*
	* @param projects the projects
	*/
	public void cacheResult(
		java.util.List<com.liferay.evp.admin.service.model.Project> projects);

	/**
	* Creates a new project with the primary key. Does not add the project to the database.
	*
	* @param projectId the primary key for the new project
	* @return the new project
	*/
	public com.liferay.evp.admin.service.model.Project create(long projectId);

	/**
	* Removes the project with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param projectId the primary key of the project
	* @return the project that was removed
	* @throws com.liferay.evp.admin.service.NoSuchProjectException if a project with the primary key could not be found
	*/
	public com.liferay.evp.admin.service.model.Project remove(long projectId)
		throws com.liferay.evp.admin.service.NoSuchProjectException;

	public com.liferay.evp.admin.service.model.Project updateImpl(
		com.liferay.evp.admin.service.model.Project project);

	/**
	* Returns the project with the primary key or throws a {@link com.liferay.evp.admin.service.NoSuchProjectException} if it could not be found.
	*
	* @param projectId the primary key of the project
	* @return the project
	* @throws com.liferay.evp.admin.service.NoSuchProjectException if a project with the primary key could not be found
	*/
	public com.liferay.evp.admin.service.model.Project findByPrimaryKey(
		long projectId)
		throws com.liferay.evp.admin.service.NoSuchProjectException;

	/**
	* Returns the project with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param projectId the primary key of the project
	* @return the project, or <code>null</code> if a project with the primary key could not be found
	*/
	public com.liferay.evp.admin.service.model.Project fetchByPrimaryKey(
		long projectId);

	@Override
	public java.util.Map<java.io.Serializable, com.liferay.evp.admin.service.model.Project> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the projects.
	*
	* @return the projects
	*/
	public java.util.List<com.liferay.evp.admin.service.model.Project> findAll();

	/**
	* Returns a range of all the projects.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.service.model.impl.ProjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @return the range of projects
	*/
	public java.util.List<com.liferay.evp.admin.service.model.Project> findAll(
		int start, int end);

	/**
	* Returns an ordered range of all the projects.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.admin.service.model.impl.ProjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of projects
	*/
	public java.util.List<com.liferay.evp.admin.service.model.Project> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.service.model.Project> orderByComparator);

	/**
	* Removes all the projects from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of projects.
	*
	* @return the number of projects
	*/
	public int countAll();
}