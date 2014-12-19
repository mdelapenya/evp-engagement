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

package com.liferay.evp.admin.service.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Volunteer service. Represents a row in the &quot;evp_Volunteer&quot; database table, with each column mapped to a property of this class.
 *
 * @author Joan.Kim
 * @see VolunteerModel
 * @see com.liferay.evp.admin.service.model.impl.VolunteerImpl
 * @see com.liferay.evp.admin.service.model.impl.VolunteerModelImpl
 * @generated
 */
@ProviderType
public interface Volunteer extends VolunteerModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.liferay.evp.admin.service.model.impl.VolunteerImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
}