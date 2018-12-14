<%@ include file="/WEB-INF/jsp/common/CommonHeader.jspf"%>
<%@ include file="/WEB-INF/jsp/common/CommonNavigation.jspf"%>


<div class="container">



	<div class="row">
		<div class="col-lg-3" style="padding: 10px">

			<div class="stats-icon pull-left">
				<i class="fa fa-database fa-3x"></i>
			</div>
			<div class="stats-title pull-left">
				<h1>&nbsp;&nbsp; Database Master</h1>
			</div>
		</div>
		<div class="col-lg-9">&nbsp;</div>
				<div class="clearfix"></div>
		<div class="col-lg-4">
			<div class="panel-body" id="parentpanel">
				<div class="row">
					<div class="col-md-12">
						<div class="panel-body">
							<div class="stats-title pull-left">
								<a href="/retrieve-users">
									<h4>Users</h4>
								</a>
							</div>
							<div class="stats-icon pull-right">
								<i class="fa fa-user"></i>
							</div>
							<div class="m-t-xl widget-cl-1">
								<h1 class="text-info">${numberOfUsers}</h1>
								<small> List Of Users</small>
							</div>
						</div>

					</div>
					<div class="col-md-6">
						<div class="panel-body">
							<div class="stats-title pull-left">
								<a href="/retrieve-roles">
									<h4>Roles</h4>
								</a>
							</div>
							<div class="stats-icon pull-right">
								<i class="fa fa-scroll"></i>
							</div>
							<div class="m-t-xl widget-cl-1">
								<h1 class="text-info">${numberOfRoles}</h1>
								<small> List Of Roles </small>
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
</div>


<%@ include file="/WEB-INF/jsp/common/CommonFooter.jspf"%>