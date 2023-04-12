<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="Database.ConnectionProvider"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Teacher Details</title>
<!-- Include Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootswatch@4.5.2/dist/cyborg/bootstrap.min.css"
	integrity="sha384-nEnU7Ae+3lD52AK+RGNzgieBWMnEfgTbRHIwEvp1XXPdqdO6uLTd/NwXbzboqjc2"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1 class='text-center '>Tacher Details</h1>

		<div class="row">
			<%
			int id;

			try {
				Connection con = ConnectionProvider.getConnectionProvider();
				PreparedStatement stmt;
				ResultSet rs;
				stmt = con.prepareStatement("select * from Teacher");
				rs = stmt.executeQuery();

				while (rs.next()) {
			%>
			<div class="col-md-3">
				<div class="card">
					<img src="https://via.placeholder.com/150" class="card-img-top"
						alt="...">
					<div class="card-body text-center">

						<h5 class="card-title"><%=rs.getString(2)%></h5>

						<p class="card-text"><%=rs.getString(3)%></p>
						<p class="card-text"><%=rs.getString(4)%></p>

						<a href="#" class="btn btn-primary">go to page</a>
						<div class='mt-3'>
							<form action=''>
								<button type="submit" name='<%id = rs.getInt(1);%>'
									value='update' class="btn btn-light">Update</button>
								<button type="submit" name='<%id = rs.getInt(1);%>'
									value='delete' class="btn btn-danger">Delete</button>
							</form>

						</div>
					</div>
				</div>
			</div>


			<%
			
			}
				System.out.println(id + "\t" + id);
				if (id > 0) {
				RequestDispatcher rd = request.getRequestDispatcher("TecherEditDelete");
				rd.include(request, response);
				request.setAttribute("msg", id);
				}
			} catch (Exception ex) {
			System.out.println(ex);
			}
			
			
			%>
		</div>

	</div>


	<!-- Include Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>

</html>
