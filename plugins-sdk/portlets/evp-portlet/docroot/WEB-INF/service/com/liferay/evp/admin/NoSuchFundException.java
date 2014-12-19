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

package com.liferay.evp.admin;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.NoSuchModelException;

/**
 * @author Joan.Kim
 */
@ProviderType
public class NoSuchFundException extends NoSuchModelException {

	public NoSuchFundException() {
	}

	public NoSuchFundException(String msg) {
		super(msg);
	}

	public NoSuchFundException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchFundException(Throwable cause) {
		super(cause);
	}

}