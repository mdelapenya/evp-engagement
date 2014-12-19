package com.liferay.evp.admin.model.impl;

import java.util.Date;

/**
 * @author Manuel de la Peña
 */
public class LiferayAuditPOJO {

	public LiferayAuditPOJO(
		long companyId, Date createDate, long userId,
		String userName) {

		super();

		this.companyId = companyId;
		this.createDate = createDate;
		this.modifiedDate = new Date();
		this.userId = userId;
		this.userName = userName;
	}

	public long getCompanyId() {
		return companyId;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public long getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	private long companyId;
	private Date createDate;
	private Date modifiedDate;
	private long userId;
	private String userName;

}