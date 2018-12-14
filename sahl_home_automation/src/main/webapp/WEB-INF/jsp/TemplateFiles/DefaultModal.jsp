<div class="modal fade" id="CarModal" tabindex="-1" role="dialog"
	aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="container">
		<div class="row">
			<div class="col-lg-8 col-lg-offset-2">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h3 class="modal-title">
								Car Form
								<button type="button" class="close" data-dismiss="modal"
									aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
							</h3>
						</div>
						<div class="modal-body">


							<form action="/add-car" id="CarForm" method="post">
								<input id="id" name="id" type="hidden">
								<div class="form-group">
									<label for="imageName"> Sticker Number</label> <input
										type="text" id="imageName" name="imageName"
										class="form-control" required />
								</div>

								<div class="form-group">
									<label for="number"> Car Number</label> <input type="text"
										id="number" name="number" class="form-control" required />
								</div>
								<div class="form-group">
									<label for="carName.id"> Car Name </label> <br> <select
										id="CarNameCombo" data-url="/retrieve-carsnames-list"
										data-model="carName" name="carName.id" data-text="name"
										data-value="id" data-subtext="id" class="selectpicker"
										data-show-subtext="true" data-live-search="true" data-width="100%">
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

