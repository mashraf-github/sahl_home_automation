<div class="modal fade" id="PasswordModal" tabindex="-1" role="dialog"
	aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="container">
		<div class="row">
			<div class="col-lg-8 col-lg-offset-2">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h3 class="modal-title">
								Change Password
								<button type="button" class="close" data-dismiss="modal"
									aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
							</h3>
						</div>
						<div class="modal-body">


							<form  id="PasswordForm" method="post">
								<input id="id" name="id" type="hidden">

								
								<div class="form-group">
									<label for="username"> Username</label> <input type="text"
										id="username" name="username" class="form-control" required disabled />
								</div>

								<div class="form-group">
									<label for="password"> password</label> <input type="password"
										id="password" name="password" class="form-control" required />
								</div>
								<div class="form-group hidden" >
								<input class="form-check-input" type="checkbox" id="enabled" name="enabled" /> <label
									for="enabled">&nbsp; Is Enabled?</label>
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

