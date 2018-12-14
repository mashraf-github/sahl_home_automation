<%@ include file="/WEB-INF/jsp/common/CommonHeader.jspf"%>
<%@ include file="/WEB-INF/jsp/common/CommonNavigation.jspf"%>

<div class="container">
	<h2>Application has encountered an error. Please contact support on ...</h2>
	<br>
	<h2>${url}</h2>
	<br>
	<h2>${exception}</h2>
	
	<!-- ${exception} -->
</div>

<%@ include file="/WEB-INF/jsp/common/CommonFooter.jspf"%>