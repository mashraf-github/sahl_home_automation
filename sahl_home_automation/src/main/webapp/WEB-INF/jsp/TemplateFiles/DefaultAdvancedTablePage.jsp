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
							<h1>
								Projects <span class="table-project-n">Data</span> Table
							</h1>
							<button class="btn btn-info" data-toggle="modal"
								data-href="/add-cartype" data-btntype="formbtn"
								data-target="#CarTypeModal">
								<span class="glyphicon glyphicon glyphicon-plus"></span>Add Car
								Type
							</button>
						</div>
						<div class="add-product"></div>
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
										<th data-field="type" data-editable="true">Type Name</th>
										<th data-field="update">Update</th>
										<th data-field="delete">Delete</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${carsTypes}" var="cartype">
										<tr>
											<td></td>
											<td>${cartype.id}</td>
											<td>${cartype.type}</td>
											<td>
												<button class="btn btn-warning"
													data-href="/update-cartype?id=${cartype.id}"
													data-btntype="formbtn" data-toggle="modal"
													data-target="#CarTypeModal">
													<i class="fa fa-pencil-square-o" aria-hidden="true"></i>&nbsp;
													Update
												</button>
											</td>
											<td>
												<button class="btn btn-danger"
													data-href="/delete-cartype?id=${cartype.id}"
													data-toggle="modal" data-target="#myModal">
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

<%@ include file="/WEB-INF/jsp/common/CommonFooter.jspf"%>