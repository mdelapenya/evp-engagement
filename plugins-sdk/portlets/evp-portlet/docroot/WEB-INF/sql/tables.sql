create table evp_Fund (
	fundId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	projectId LONG,
	amount DOUBLE,
	volunteerId LONG,
	receiveDate DATE null
);

create table evp_Project (
	projectId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	location VARCHAR(75) null,
	coordX LONG,
	coordY LONG,
	coverImageId LONG,
	requiredFunds DOUBLE,
	actualFunds DOUBLE,
	startDate DATE null,
	endDate DATE null,
	approvalDate DATE null,
	managerName VARCHAR(75) null
);

create table evp_Volunteer (
	volunteerId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	address VARCHAR(75) null,
	coordX LONG,
	coordY LONG
);