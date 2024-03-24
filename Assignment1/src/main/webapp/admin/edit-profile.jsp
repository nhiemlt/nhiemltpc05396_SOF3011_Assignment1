<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<main>
	<div class="py-5 ">
		<div class="container px-5">
			<div class="text-bg-light rounded-3 py-5 px-4 px-md-5 mb-5">
				<div class="text-center mb-5 ">
					<image  src="images/account.png"
						class="img-fluid col-2 rounded-circle border border-primary">
				</div>
				<div class="row gx-5 justify-content-center">
					<div class="col-lg-8 col-xl-6">
						<form id="contactForm" name="frmAccount">
							<div class="form-floating mb-3">
								<input class="form-control " id="username" type="text"
									name="username" readonly /> <label for="username">Username</label>
							</div>
							<div class="form-floating mb-3">
								<input class="form-control" name="fullname" type="text" required />
								<label for="name">Full name</label>
							</div>
							<div class="form-floating mb-3">
								<input class="form-control" type="email" name="email" required />
								<label for="email">Email address</label>
							</div>
							<div class="form-floating mb-3">
								<input class="form-control" id="password" type="password"
									name="password" /> <label for="password">Birthday</label>
							</div>
							<div class="d-grid">
								<button type="submit" class="btn btn-primary w-50 mt-5 m-auto">Update
									account</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</main>
</html>