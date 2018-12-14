<%@ include file="/WEB-INF/jsp/common/CommonHeader.jspf"%>
<%@ include file="/WEB-INF/jsp/common/CommonNavigation.jspf"%>

<div class="product-status mg-b-15">
	<div class="container-fluid">

		<br> <br> <br>
		<div class="row">
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
				<div class="product-status-wrap">
					<h4>User</h4>
					<div class="asset-inner">
						<form:form method="post" modelAttribute="user">

							<form:hidden path="id" />
							<fieldset class="form-group">
								<form:label path="empName">Employee Name</form:label>
								<form:input path="empName" type="text" class="form-control"
									required="required" />
								<form:errors path="empName" cssClass="text-warning" />

								<select id="myselect" class="selectpicker"
									data-show-subtext="true" data-live-search="true">
									<button class="btn btn-success">test</button>
									<c:forEach items="${employees}" var="employee">
										<option value=${employee.number }
											data-subtext=${employee.number} >${employee.nameEn}</option>
									</c:forEach>
								</select>

							</fieldset>

							<fieldset class="form-group">
								<form:label path="userName">User Name</form:label>
								<form:input path="userName" type="text" class="form-control"
									required="required" />
								<form:errors path="userName" cssClass="text-warning" />
							</fieldset>
							<fieldset class="form-group">
								<form:label path="enabled">Is Enabled?</form:label>
								<form:input path="enabled" type="text" class="form-control"
									required="required" />
								<form:errors path="enabled" cssClass="text-warning" />
							</fieldset>
							<button type="submit"
								class="btn btn-sm btn-primary login-submit-cs">Save
								Change</button>
							<input type="button" class="btn btn-white"
								onclick="location.href='/retrieve-users';" value="Cancel" />
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<%@ include file="/WEB-INF/jsp/common/CommonFooter.jspf"%>