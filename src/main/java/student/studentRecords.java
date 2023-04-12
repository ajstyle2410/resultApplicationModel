package student;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ClassImpl.studentRegisterationImplements;
import Interface.studentRegistrationInterface;

@WebServlet("/TeacherAdminPanel")
public class studentRecords extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		List<Model.studentRegistration> lst;

		studentRegistrationInterface rs = new studentRegisterationImplements();
		lst = new ArrayList<>();
		lst = rs.ShowData();
		int sid = 0;


		out.println("<!doctype html>\r\n" + "<html lang=\"en\">\r\n" + "  <head>\r\n"
				+ "    <meta charset=\"utf-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "    <title>Teacher Panel</title>\r\n"
				+ "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\" crossorigin=\"anonymous\">\r\n"
				+ "<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootswatch@4.5.2/dist/darkly/bootstrap.min.css\" integrity=\"sha384-nNK9n28pDUDDgIiIqZ/MiyO3F4/9vsMtReZK39klb/MtkZI3/LtjSjlmyVPS3KdN\" crossorigin=\"anonymous\">"
				+ "  </head>\r\n" + "  <body>\r\n"

				+"<table class=\"table table-hover\">\r\n"
                + " <thead>\r\n"
                + "    <tr>\r\n"
                + "      <th scope=\"col\">Type</th>\r\n"
                + "      <th scope=\"col\">Student Name</th>\r\n"
                + "      <th scope=\"col\">Contact</th>\r\n"
                + "      <th scope=\"col\">Email Address</th>\r\n"
                + "      <th scope=\"col\">Delete</th>\r\n"
                + "      <th scope=\"col\">Update</th>\r\n"
                + "      <th scope=\"col\">Add Marks </th>\r\n"
                + "    </tr>\r\n"
                + "  </thead>"
                + "  <tbody>\r\n");
		         
                for (Model.studentRegistration studentRegistration : lst) {
                      
              out.println("    <tr scope=\"row\">\r\n");	
              sid=studentRegistration.getSid();
              System.out.println("Student id is"+sid);
                    out.println("<td>" + studentRegistration.getSid() + "</td>");
                			out.println("<td>" + studentRegistration.getName() + "</td>");
                		out.println("<td>" + studentRegistration.getContact() +"</td>");
                		out.println("<td>" + studentRegistration.getAddress() + "</td>");
                		out.println("<td><a href='studentDeleteRecords?id="+sid+"'>Delete</a>");
                			out.println("<td><a href='studentUpdateRecords?id="+sid+"'&name=\"\r\n"
                + "					'"+ studentRegistration.getName() + "'&contact='" + studentRegistration.getContact() + "'&address=\"\r\n"
                + "					'"+ studentRegistration.getAddress() + "'>Update</a>");
                
   			out.println("<td><a href='StudentAddMarks?ssid=" + sid + "'>Add Marks</a></td>");
                }
                
            
				out.println( "  </tbody>\r\n"
						+ "</table>   <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN\" crossorigin=\"anonymous\"></script>\r\n"
				+ "  </body>\r\n" + "</html>");
		

	}

}
