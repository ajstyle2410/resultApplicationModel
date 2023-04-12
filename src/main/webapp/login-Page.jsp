<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
</head>
<body>
	<section class="vh-100">
		<div class="container py-5 h-100">
			<div
				class="row d-flex align-items-center justify-content-center h-100">
				<div class="col-md-8 col-lg-7 col-xl-6">
					<img
						src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.svg"
						class="img-fluid" alt="Phone image">
				</div>
				<div class="col-md-7 col-lg-5 col-xl-5 offset-xl-1">
					<p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">Sign
						up</p>

					<form action="studentOrAdminLoginPage">
						<!-- Email input -->
						<div class="form-outline mb-4">
							<input type="text" id="form1Example13"
								class="form-control form-control-lg" name="UserName" required
								autocomplete="off" /> <label class="form-label"
								for="form1Example13">User Name</label>
						</div>

						<!-- Password input -->
						<div class="form-outline mb-4">
							<input type="password" id="form1Example23"
								class="form-control form-control-lg" name="Password" required
								autocomplete="off" /> <label class="form-label"
								for="form1Example23">Password</label>
						</div>

						<div class="d-flex justify-content-around align-items-center mb-4">

							<a href="registrationPage.html">Register here?</a>
						</div>

						<!-- Submit button -->
						<button type="submit"
							class="btn btn-primary btn-lg btn-block text-center">Sign
							in</button>
									<%
											String   msg = request.getParameter("error");
										   if(msg!=null)
										 out.println("<h3>"+msg+"<h3>");
									%>

					</form>
					
				</div>
			</div>
		</div>
	</section>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
		crossorigin="anonymous"></script>
</body>
</html>