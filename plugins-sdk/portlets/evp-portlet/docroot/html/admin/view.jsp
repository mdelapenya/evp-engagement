<%--
/**
* Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
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
--%>

<%@include file="/html/init.jsp"%>

<%
long companyId = themeDisplay.getCompanyId();
%>

<liferay-ui:search-container emptyResultsMessage="evp-project-empty-results-message">
	<liferay-ui:search-container-results
		results="<%= ProjectLocalServiceUtil.findAllProjects(companyId) %>"
		total="<%= ProjectLocalServiceUtil.countAllProjects(companyId) %>" />

	<liferay-ui:search-container-row
		className="com.liferay.evp.admin.model.Project" keyProperty="projectId"
		modelVar="project" escapedModel="<%= true %>">

		<liferay-ui:search-container-column-text name="name"
			value="<%= project.getName() %>" />

		<liferay-ui:search-container-column-text name="part-number"
			property="partNumber" />

		<liferay-ui:search-container-column-text name="quantity"
			property="quantity" />

		<liferay-ui:search-container-column-text name="start-date"
			value="<%= new SimpleDateFormat(\"MMMM dd, yyyy\").format(project.getStartDate()) %>" />

		<liferay-ui:search-container-column-text name="end-date"
			value="<%= new SimpleDateFormat(\"MMMM dd, yyyy\").format(project.getEndDate()) %>" />

		<liferay-ui:search-container-column-text name="manageName"
			property="managerName" />

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>