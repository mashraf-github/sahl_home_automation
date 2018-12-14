<div class="modal fade" id="UserRoleModal" tabindex="-1" role="dialog"
	aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="container">
		<div class="row">
			<div class="col-lg-8 col-lg-offset-2">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h3 class="modal-title">
								Car Color Form
								<button type="button" class="close" data-dismiss="modal"
									aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
							</h3>
						</div>
						<div class="modal-body">
							<form method="post" data-hform="UserRoleModal">
								<input id="id" name="id" type="hidden">

								<div class="form-group" >
									<label for="usernamecombo"> username </label> <br> <select
										id="usernamecombo" data-url="/retrieve-users-list"
										data-model="user" data-text="username" data-value="id"
										data-subtext="id" name="user.id"
										class="selectpicker" data-show-subtext="true"
										data-live-search="true" data-width="100%">
									</select>
								</div>
								
								<div class="form-group" >
									<label for="employee.number"> Role </label> <br> <select
										id="UserRoleCombo" data-url="/retrieve-Roles-list"
										data-model="role" data-text="name" data-value="id"
										data-subtext="id" name="role.id"
										class="selectpicker" data-show-subtext="true"
										data-live-search="true" data-width="100%">
									</select>
								</div>
								
								
								<div class="form-group">
									<button type="submit" class="btn btn-primary">save</button>
									<button type="button" class="btn btn-default"
										data-dismiss="modal">cancel</button>
								</div>

							</form>
						</div>
						<%@ include file="/WEB-INF/jsp/common/CommonCopyright.jspf"%>

					</div>
				</div>
			</div>
		</div>
	</div>
</div>