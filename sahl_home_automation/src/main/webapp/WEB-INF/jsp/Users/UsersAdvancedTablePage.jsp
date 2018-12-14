<%@ include file="/WEB-INF/jsp/common/CommonHeader.jspf"%>
<%@ include file="/WEB-INF/jsp/common/CommonNavigation.jspf"%>


<!-- Static Table Start -->
<div class="data-table-area mg-b-15">
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<div class="sparkline13-list">
					<div class="sparkline13-hd">
						<div class="main-sparkline13-hd">
						<div class="container-fluid">
								<div class="row">
									<div class="col-lg-3">
										<h1>
											Users <span class="table-project-n">List</span>
										</h1>
									</div>
									<div class="col-lg-9">
										<span class="pull-right">
											<button class="btn btn-info" data-href="/add-user"
												data-btntype="formbtn" data-target="#UserModal">
												<span class="glyphicon glyphicon glyphicon-plus"></span>Add
												User
											</button>
										</span>
									</div>
								</div>
							</div>
						</div>
						<div class="add-product">
						</div>
					</div>
					<div class="sparkline13-graph">
						<div class="datatable-dashv1-list custom-datatable-overright">
							<div id="toolbar">
								<select class="form-control dt-tb">
									<option value="">Export Basic</option>
									<option value="all">Export All</option>
									<option value="selected">Export Selected</option>
								</select>
							</div>
							<table id="table" data-toggle="table" data-pagination="true"
								data-search="true" data-show-columns="true"
								data-show-pagination-switch="true" data-show-refresh="true"
								data-key-events="true" data-show-toggle="true"
								data-resizable="true" data-cookie="true"
								data-cookie-id-table="saveId" data-show-export="true"
								data-click-to-select="true" data-toolbar="#toolbar">
								<thead>
								
                                    <tr>
                                        <th data-field="state" data-checkbox="true"></th>
                                        <th data-field="id">ID</th>
                                        <th data-field="nameAr" data-editable="false">Arabic name</th>
                                        <th data-field="emailAdress" data-editable="false">Email address</th>
                                        <th data-field="mobileNumber" data-editable="false">Mobile number</th>
                                        <th data-field="username" data-editable="false">Username</th>
                                        <th data-field="enabled" data-editable="false">Is Enabled?</th>
                                        <th data-field="nameEn">Updated By</th>
										<th data-field="updatedAt">Updated At</th>
                                        <th data-field="update"></th>
                                    </tr>
								</thead>
								<tbody>
									<c:forEach items="${users}" var="user">
										<tr>
											<td></td>
											<td>${user.id}</td>
											<td>${user.nameAr}</td>
											<td>${user.emailAdress}</td>
											<td>${user.mobileNumber}</td>
											<td>${user.username}</td>
											<td>${user.enabled}</td>
											<td>${user.updateUser.nameEn}</td>
											<td>${user.updateUser.updatedAt}</td>
											<td>
												<button class="btn btn-warning"
													data-href="/update-user?id=${user.id}" data-btntype="formbtn"
													 data-target="#UserModal">
													<i class="fa fa-pencil-square-o" aria-hidden="true"></i>&nbsp;
													Update
												</button>
											
												<button class="btn btn-success"
													data-href="/update-userpassword?id=${user.id}" data-btntype="formbtn"
													 data-target="#PasswordModal">
													<i class="fa fa-pencil-square-o" aria-hidden="true"></i>&nbsp;
													change password
												</button>
										
												<button class="btn btn-danger"
													data-href="/delete-user?id=${user.id}" data-toggle="modal"
													data-target="#myModal">
													<i class="fa fa-trash-o" aria-hidden="true"></i>&nbsp;
													Delete
												</button>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ include file="/WEB-INF/jsp/Users/PasswordModal.jsp"%>
<%@ include file="/WEB-INF/jsp/Users/UserModal.jsp"%>
<%@ include file="/WEB-INF/jsp/common/CommonFooter.jspf"%>

<script>
$('#PasswordModal').on('show.bs.modal', function(e) {
    //$(this).find('.btn-ok').attr('href', $(e.relatedTarget).data('href'));
    $(this).find("input[type='password']").val('');
});

</script>