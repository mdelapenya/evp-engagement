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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the project service. This utility wraps {@link ProjectPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Joan.Kim
 * @see ProjectPersistence
 * @see ProjectPersistenceImpl
 * @generated
 */
@ProviderType
public class ProjectUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Project project) {
		getPersistence().clearCache(project);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Project> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Project> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Project> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Project> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Project update(Project project) {
		return getPersistence().update(project);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Project update(Project project, ServiceContext serviceContext) {
		return getPersistence().update(project, serviceContext);
	}

	/**
	* Returns all the projects where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching projects
	*/
	public static java.util.List<com.liferay.evp.admin.service.model.Project> findByCompany(
		long companyId) {
		return getPersistence().findByCompany(companyId);
	}

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
	public static java.util.List<com.liferay.evp.admin.service.model.Project> findByCompany(
		long companyId, int start, int end) {
		return getPersistence().findByCompany(companyId, start, end);
	}

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
	public static java.util.List<com.liferay.evp.admin.service.model.Project> findByCompany(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.service.model.Project> orderByComparator) {
		return getPersistence()
				   .findByCompany(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first project in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project
	* @throws com.liferay.evp.admin.service.NoSuchProjectException if a matching project could not be found
	*/
	public static com.liferay.evp.admin.service.model.Project findByCompany_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.service.model.Project> orderByComparator)
		throws com.liferay.evp.admin.service.NoSuchProjectException {
		return getPersistence().findByCompany_First(companyId, orderByComparator);
	}

	/**
	* Returns the first project in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project, or <code>null</code> if a matching project could not be found
	*/
	public static com.liferay.evp.admin.service.model.Project fetchByCompany_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.service.model.Project> orderByComparator) {
		return getPersistence()
				   .fetchByCompany_First(companyId, orderByComparator);
	}

	/**
	* Returns the last project in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project
	* @throws com.liferay.evp.admin.service.NoSuchProjectException if a matching project could not be found
	*/
	public static com.liferay.evp.admin.service.model.Project findByCompany_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.service.model.Project> orderByComparator)
		throws com.liferay.evp.admin.service.NoSuchProjectException {
		return getPersistence().findByCompany_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last project in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project, or <code>null</code> if a matching project could not be found
	*/
	public static com.liferay.evp.admin.service.model.Project fetchByCompany_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.service.model.Project> orderByComparator) {
		return getPersistence().fetchByCompany_Last(companyId, orderByComparator);
	}

	/**
	* Returns the projects before and after the current project in the ordered set where companyId = &#63;.
	*
	* @param projectId the primary key of the current project
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next project
	* @throws com.liferay.evp.admin.service.NoSuchProjectException if a project with the primary key could not be found
	*/
	public static com.liferay.evp.admin.service.model.Project[] findByCompany_PrevAndNext(
		long projectId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.service.model.Project> orderByComparator)
		throws com.liferay.evp.admin.service.NoSuchProjectException {
		return getPersistence()
				   .findByCompany_PrevAndNext(projectId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the projects where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	*/
	public static void removeByCompany(long companyId) {
		getPersistence().removeByCompany(companyId);
	}

	/**
	* Returns the number of projects where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching projects
	*/
	public static int countByCompany(long companyId) {
		return getPersistence().countByCompany(companyId);
	}

	/**
	* Returns all the projects where managerName = &#63;.
	*
	* @param managerName the manager name
	* @return the matching projects
	*/
	public static java.util.List<com.liferay.evp.admin.service.model.Project> findByManagerName(
		java.lang.String managerName) {
		return getPersistence().findByManagerName(managerName);
	}

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
	public static java.util.List<com.liferay.evp.admin.service.model.Project> findByManagerName(
		java.lang.String managerName, int start, int end) {
		return getPersistence().findByManagerName(managerName, start, end);
	}

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
	public static java.util.List<com.liferay.evp.admin.service.model.Project> findByManagerName(
		java.lang.String managerName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.service.model.Project> orderByComparator) {
		return getPersistence()
				   .findByManagerName(managerName, start, end, orderByComparator);
	}

	/**
	* Returns the first project in the ordered set where managerName = &#63;.
	*
	* @param managerName the manager name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project
	* @throws com.liferay.evp.admin.service.NoSuchProjectException if a matching project could not be found
	*/
	public static com.liferay.evp.admin.service.model.Project findByManagerName_First(
		java.lang.String managerName,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.service.model.Project> orderByComparator)
		throws com.liferay.evp.admin.service.NoSuchProjectException {
		return getPersistence()
				   .findByManagerName_First(managerName, orderByComparator);
	}

	/**
	* Returns the first project in the ordered set where managerName = &#63;.
	*
	* @param managerName the manager name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project, or <code>null</code> if a matching project could not be found
	*/
	public static com.liferay.evp.admin.service.model.Project fetchByManagerName_First(
		java.lang.String managerName,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.service.model.Project> orderByComparator) {
		return getPersistence()
				   .fetchByManagerName_First(managerName, orderByComparator);
	}

	/**
	* Returns the last project in the ordered set where managerName = &#63;.
	*
	* @param managerName the manager name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project
	* @throws com.liferay.evp.admin.service.NoSuchProjectException if a matching project could not be found
	*/
	public static com.liferay.evp.admin.service.model.Project findByManagerName_Last(
		java.lang.String managerName,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.service.model.Project> orderByComparator)
		throws com.liferay.evp.admin.service.NoSuchProjectException {
		return getPersistence()
				   .findByManagerName_Last(managerName, orderByComparator);
	}

	/**
	* Returns the last project in the ordered set where managerName = &#63;.
	*
	* @param managerName the manager name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project, or <code>null</code> if a matching project could not be found
	*/
	public static com.liferay.evp.admin.service.model.Project fetchByManagerName_Last(
		java.lang.String managerName,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.service.model.Project> orderByComparator) {
		return getPersistence()
				   .fetchByManagerName_Last(managerName, orderByComparator);
	}

	/**
	* Returns the projects before and after the current project in the ordered set where managerName = &#63;.
	*
	* @param projectId the primary key of the current project
	* @param managerName the manager name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next project
	* @throws com.liferay.evp.admin.service.NoSuchProjectException if a project with the primary key could not be found
	*/
	public static com.liferay.evp.admin.service.model.Project[] findByManagerName_PrevAndNext(
		long projectId, java.lang.String managerName,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.service.model.Project> orderByComparator)
		throws com.liferay.evp.admin.service.NoSuchProjectException {
		return getPersistence()
				   .findByManagerName_PrevAndNext(projectId, managerName,
			orderByComparator);
	}

	/**
	* Removes all the projects where managerName = &#63; from the database.
	*
	* @param managerName the manager name
	*/
	public static void removeByManagerName(java.lang.String managerName) {
		getPersistence().removeByManagerName(managerName);
	}

	/**
	* Returns the number of projects where managerName = &#63;.
	*
	* @param managerName the manager name
	* @return the number of matching projects
	*/
	public static int countByManagerName(java.lang.String managerName) {
		return getPersistence().countByManagerName(managerName);
	}

	/**
	* Caches the project in the entity cache if it is enabled.
	*
	* @param project the project
	*/
	public static void cacheResult(
		com.liferay.evp.admin.service.model.Project project) {
		getPersistence().cacheResult(project);
	}

	/**
	* Caches the projects in the entity cache if it is enabled.
	*
	* @param projects the projects
	*/
	public static void cacheResult(
		java.util.List<com.liferay.evp.admin.service.model.Project> projects) {
		getPersistence().cacheResult(projects);
	}

	/**
	* Creates a new project with the primary key. Does not add the project to the database.
	*
	* @param projectId the primary key for the new project
	* @return the new project
	*/
	public static com.liferay.evp.admin.service.model.Project create(
		long projectId) {
		return getPersistence().create(projectId);
	}

	/**
	* Removes the project with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param projectId the primary key of the project
	* @return the project that was removed
	* @throws com.liferay.evp.admin.service.NoSuchProjectException if a project with the primary key could not be found
	*/
	public static com.liferay.evp.admin.service.model.Project remove(
		long projectId)
		throws com.liferay.evp.admin.service.NoSuchProjectException {
		return getPersistence().remove(projectId);
	}

	public static com.liferay.evp.admin.service.model.Project updateImpl(
		com.liferay.evp.admin.service.model.Project project) {
		return getPersistence().updateImpl(project);
	}

	/**
	* Returns the project with the primary key or throws a {@link com.liferay.evp.admin.service.NoSuchProjectException} if it could not be found.
	*
	* @param projectId the primary key of the project
	* @return the project
	* @throws com.liferay.evp.admin.service.NoSuchProjectException if a project with the primary key could not be found
	*/
	public static com.liferay.evp.admin.service.model.Project findByPrimaryKey(
		long projectId)
		throws com.liferay.evp.admin.service.NoSuchProjectException {
		return getPersistence().findByPrimaryKey(projectId);
	}

	/**
	* Returns the project with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param projectId the primary key of the project
	* @return the project, or <code>null</code> if a project with the primary key could not be found
	*/
	public static com.liferay.evp.admin.service.model.Project fetchByPrimaryKey(
		long projectId) {
		return getPersistence().fetchByPrimaryKey(projectId);
	}

	public static java.util.Map<java.io.Serializable, com.liferay.evp.admin.service.model.Project> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the projects.
	*
	* @return the projects
	*/
	public static java.util.List<com.liferay.evp.admin.service.model.Project> findAll() {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.liferay.evp.admin.service.model.Project> findAll(
		int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.liferay.evp.admin.service.model.Project> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.evp.admin.service.model.Project> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the projects from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of projects.
	*
	* @return the number of projects
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ProjectPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ProjectPersistence)PortletBeanLocatorUtil.locate(com.liferay.evp.admin.service.service.ClpSerializer.getServletContextName(),
					ProjectPersistence.class.getName());

			ReferenceRegistry.registerReference(ProjectUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	@Deprecated
	public void setPersistence(ProjectPersistence persistence) {
	}

	private static ProjectPersistence _persistence;
}