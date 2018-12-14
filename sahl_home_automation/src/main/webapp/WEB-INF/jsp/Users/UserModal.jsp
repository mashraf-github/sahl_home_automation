<div class="modal fade" id="UserModal" tabindex="-1" role="dialog"
	aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="container">
		<div class="row">
			<div class="col-lg-8 col-lg-offset-2">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h3 class="modal-title">
								User Form
								<button type="button" class="close" data-dismiss="modal"
									aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
							</h3>
						</div>
						<div class="modal-body">


							<form action="/add-user" id="UserForm" method="post">
								<input id="id" name="id" type="hidden">

								<div class="form-group">
									<label for="userName"> Username</label> <input type="text"
										id="userName" name="userName" class="form-control" required />
								</div>

								<div class="form-group">
									<label for="password"> password</label> <input type="password"
										id="password" name="password" class="form-control" required />
								</div>
								
								<div class="form-group">
									<label for="roles.id"> Roles </label> <br> <select
										id="RolesCombo" data-url="/retrieve-roles-list"
										data-model="role" data-text="name" data-value="id"
										data-subtext="id" name="roles.id"
										class="selectpicker" data-show-subtext="true"
										data-live-search="true" data-width="100%">
									</select>
								</div>
								
								<input class="form-check-input" type="checkbox" id="enabled" name="enabled" /> <label
									for="enabled">&nbsp; Is Enabled?</label>
								<div class="form-group"></div>

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

