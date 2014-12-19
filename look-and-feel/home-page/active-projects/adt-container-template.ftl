<#assign journalArticleLocalService = serviceLocator.findService("com.liferay.portlet.journal.service.JournalArticleLocalService") />

<div class="active-projects">
	<#if entries?has_content>
		<#list entries as curEntry>
			<#assign journalArticle = journalArticleLocalService.getLatestArticle(curEntry.getClassPK()) />

			${journalContentUtil.getContent(journalArticle.getGroupId(), journalArticle.getArticleId(), "", locale, themeDisplay)}

		</#list>
	</#if>
</div>

<style>
.active-projects .heart {
	background: url('/documents/10181/0/hearts-sprite.png') no-repeat top left;
	display: inline-block;
	height: 40px;
	width: 40px;
}
.active-projects .heart.blue {
	background-position:0 -0px;
}

.active-projects .heart.green {
	background-position:0 -40px;
}

.active-projects .heart.red {
	background-position:0 -80px;
}
.active-projects .heart.greenchecked {
	background-position:0 -120px;
}

.active-projects .project-entry {
	display: inline-block;
	width: 33%;
}

.active-projects .project-entry .project-background-image {
	height: 200px;
}

.active-projects .project-entry .project-name {
	position: relative;
	top: 10px;
	vertical-align: top;
}

@media (max-width: 979px) {
	.active-projects .project-entry {
		display: block;
		width: 100%;
	}
}

</style>