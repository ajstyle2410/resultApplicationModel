package StudentMarks;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ClassImpl.studentMarksImplements;
import Interface.studentMarksInterface;
import Model.studentAllMarksModel;
@WebServlet("/StudentAddMarks")
public class AddMarkPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		  PrintWriter out = response.getWriter();
		int id=Integer.parseInt(request.getParameter("ssid"));
  
		   out.println("<!DOCTYPE html>\r\n"
		   		+ "<html>\r\n"
		   		+ "<head>\r\n"
		   		+ "	<title>Student Marks Fill-up Form</title>\r\n"
		   		+ "	<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\r\n"
		   		+ "	<style>\r\n"
		   		+ "		.container {\r\n"
		   		+ "			margin-top: 50px;\r\n"
		   		+" background-color:#e7eefb"
		   		+"width:50%"
		   		+ "		}\r\n"
		   		+ "	</style>\r\n"
		   		+ "</head>\r\n"
		   		+ "<body>\r\n"
		   		+ "	<div class=\"container\">\r\n"
		   		+ "		<h2 class='text-center d-flex'>Student Marks Fill-up Form</h2>\r\n"
		   	     +"<form action='addMarks'>"
			    +"<input type='hidden' name='sid' value='"+id+"'>"
		   		+ "			<div class=\"form-group\">\r\n"
		   		+ "				<label for=\"name\">MicoController:</label>\r\n"
		   		+ "				<input type=\"text\" class=\"form-control\"  id=\"name\" name='MicoController'required>\r\n"
		   		+ "			</div>\r\n"
		   		+ "			<div class=\"form-group\">\r\n"
		   		+ "				<label for=\"grade\">MicroProcessor:</label>\r\n"
		   		+ "				<input type=\"text\" class=\"form-control\" id=\"grade\" name='MicroProcessor' required>\r\n"
		   		+ "			</div>\r\n"
		   		+ "			<div class=\"form-group\">\r\n"
		   		+ "				<label for=\"maths\">DigitalElectronics:</label>\r\n"
		   		+ "				<input type=\"text\" class=\"form-control\" id=\"maths\"name='DigitalElectronics' required>\r\n"
		   		+ "			</div>\r\n"
		   		+ "			<div class=\"form-group\">\r\n"
		   		+ "				<label for=\"science\">ControlSystem:</label>\r\n"
		   		+ "				<input type=\"text\" class=\"form-control\" id=\"science\" name='ControlSystem' required>\r\n"
		   		+ "			</div>\r\n"
		   		+ "			<div class=\"form-group\">\r\n"
		   		+ "				<label for=\"english\">AnologCircuit:</label>\r\n"
		   		+ "				<input type=\"text\" class=\"form-control\" id=\"english\" name='AnologCircuit' required>\r\n"
		   		+ "			</div>\r\n"
		   		+"<div class=\"form-group\">\r\n"
				   		+ "				<label for=\"english\">SignalAndSignal:</label>\r\n"
				   		+ "				<input type=\"text\" class=\"form-control\" id=\"english\" name='SignalAndSignal' required>\r\n"
				   		+ "			</div>\r\n"
				         +"<input type='submit' value='submit'>"
		   		+ "		</form>\r\n"
		   		+ "	</div>\r\n"
		   		+ "	<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"></script>\r\n"
		   		+ "	<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\r\n"
		   		+ "	<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n"
		   		+ "</body>\r\n"
		   		+ "</html>\r\n"
		   		+ "");
		  
		  
	}

}
