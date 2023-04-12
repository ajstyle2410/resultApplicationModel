package AllRecords;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ClassImpl.studentAllDataImplements;
import Interface.studentAllDataInterface;
import Model.studentRegistration;

@WebServlet("/studentSpacificData")
public class studentSpacificData extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	 response.setContentType("text/html");
	 PrintWriter out = response.getWriter();

	  int registerId= Integer.parseInt(request.getParameter("registerId"));
	// int registerId =14;
	 System.out.println("Register id is:"+registerId);
	
	  studentAllDataInterface ad = new studentAllDataImplements( );
	  
	studentRegistration reg =ad.studentSpacificData( registerId);
	          
    out.println("<!DOCTYPE html>\r\n"
    		+ "<html>\r\n"
    		+ "<head>\r\n"
    		+ "	<title>Student Report Card</title>\r\n"
    		+ "	<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\r\n"
    		+ "	<style>\r\n"
    		+ "		.container {\r\n"
    		+ "			margin-top: 50px;\r\n"
    		+ "		}\r\n"
    		+ "	</style>\r\n"
    		+ "</head>\r\n"
    		+ "<body>\r\n"
    		+ "	<div class=\"container\">\r\n"
    		+ "		<div class=\"row\">\r\n"
    		+ "			<div class=\"col-sm-6\">\r\n"
    		+ "				<h2>Student Information</h2>\r\n"
    		+ "				<p><strong>Name:</strong> "+reg.getName()+"</p>\r\n"
    	    + "				<p><strong>Email:</strong>"+reg.getAddress()+"</p>\r\n"
    	    + "				<p><strong>Contact:</strong>"+reg.getContact()+"</p>\r\n"

    		+ "				<p><strong>Grade:</strong> 10</p>\r\n"
    		+ "				<p><strong>Teacher:</strong> Ms. Smith</p>\r\n"
    		+ "			</div>\r\n"
    		
    		+ "					</tbody>\r\n"
    		+ "				</table>\r\n"
    		+ "			</div>\r\n"
    		+ "		</div>\r\n"
    		+ "		<hr>\r\n"
    		+ "		<div class=\"row\">\r\n"
    		+ "			<div class=\"col-sm-6\">\r\n"
    		+ "				<h2>Grades</h2>\r\n"
    		+ "				<table class=\"table table-striped\">\r\n"
    		+ "					<thead>\r\n"
    		+ "						<tr>\r\n"
    		+ "							<th>Subjects</th>\r\n"
    		+ "							<th>Percentage</th>\r\n"
    		+ "						<tr>\r\n"
    		+ "					</thead>\r\n"
    		+ "						<tr>\r\n"
    		+ "							<td>MicoController</td>\r\n"
    		+ "							<td>"+reg.getStudentMarks().getMicoController()+"</td>\r\n"
    		+ "						</tr>\r\n"
    		+ "					<tbody>\r\n"
    		+ "						<tr>\r\n"
    		+ "							<td>MicroProcessor</td>\r\n"
    		+ "							<td>"+reg.getStudentMarks().getMicroProcessor()+"%</td>\r\n"
    		+ "						</tr>\r\n"
    		+ "						<tr>\r\n"
    		+ "							<td>DigitalElectronics</td>\r\n"
    		+ "							<td>"+reg.getStudentMarks().getDigitalElectronics()+"%</td>\r\n"
    		+ "						</tr>\r\n"
    		+ "						<tr>\r\n"
    		+ "							<td>Control System</td>\r\n"
    		+ "							<td>"+reg.getStudentMarks().getControlSystem()+"%</td>\r\n"
    		+ "						</tr>\r\n"
    	    +"                  	<tr>\r\n"
    		+ "							<td>Anolog Circuit</td>\r\n"
    		+ "							<td>"+reg.getStudentMarks().getAnologCircuit()+"%</td>\r\n"
    		+ "						</tr>\r\n"
    		  +"                  	<tr>\r\n"

    		+ "							<td>Signal And Signal</td>\r\n"
    		+ "							<td>"+reg.getStudentMarks().getSignalAndSignal()+"%</td>\r\n"
    		+ "						</tr>\r\n"
    		  +"                  	<tr>\r\n"

//    		+ "							<td>Student Aggrigation</td>\r\n"
//    		+ "							<td>"+reg.getStudentMarks().getStudentAgg()+"%</td>\r\n"
//    		+ "						</tr>\r\n"
//    		  +"                  	<tr>\r\n"

    		+ "							<th><strong>Percentage<t<strong</th>\r\n"
    		+ "							<th>"+reg.getStudentMarks().getTotalMarks()+"%</th>\r\n"
    		+ "						</tr>\r\n"
    		
    		+ "					</tbody>\r\n"
    		+ "				</table>\r\n"
    		+ "			</div>\r\n"
    		+ "			<div class=\"col-sm-6\">\r\n"
    		+ "				<h2>Comments</h2>\r\n"
    		+ "				<p>"+reg.getName()+"\t is a hardworking student who always completes his assignments on time. He could benefit from additional practice in math.</p>\r\n"
    		+ "			</div>\r\n"
    		+ "		</div>\r\n"
    		+ "	</div>\r\n"
    		+ "	<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"></script>\r\n"
    		+ "	<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\r\n"
    		+ "	<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n"
    		+ "</body>\r\n"
    		+ "</html>\r\n"
    		+ "");

		}

}
