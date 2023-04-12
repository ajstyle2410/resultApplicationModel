	package AllRecords;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ClassImpl.studentAllDataImplements;
import Interface.studentAllDataInterface;
import Model.studentAllMarksModel;
import Model.studentRegistration;

@WebServlet("/StudentAllRecords")
public class StudentAllRecords extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		
		   String id = request.getParameter("id");
		  System.out.println("---0000>"+id);
		   
		       if(id!=null)
		       {
		    	   RequestDispatcher rd = request.getRequestDispatcher("TeacherDashboard.jsp");
		    	   rd.include(request, response);
		       }
		List<studentAllMarksModel> li = new ArrayList<>();
		List<studentRegistration> sa = new ArrayList<>();

		studentAllDataInterface af = new studentAllDataImplements();
		li = af.studentAllResult();
		sa = af.studentRecords();

		out.println("<!doctype html>\r\n" + "<html lang=\"en\">\r\n" + "  <head>\r\n"
				+ "    <meta charset=\"utf-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "    <title>Bootstrap demo</title>\r\n"
				+ "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp\" crossorigin=\"anonymous\">\r\n"
				+ "<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootswatch@4.5.2/dist/minty/bootstrap.min.css\" integrity=\"sha384-H4X+4tKc7b8s4GoMrylmy2ssQYpDHoqzPa9aKXbDwPoPUA3Ra8PA5dGzijN+ePnH\" crossorigin=\"anonymous\"> "
				+ " </head>\r\n" + "  <body>\r\n");
		out.println("<div class=\"row\">\r\n"
				+ "  ");
		for (studentRegistration studentRegistration : sa) {

			out.println("<div class=\\\"col-sm-6\\\">"
					+ "<div class='card w-75 text-center'>"
					 + "<div class='card-body'>"

					+ "<div class='card-title'>" 
					+ "<h5> Student Name :" + studentRegistration.getName() + " </h5>"
					+ "<h5> Student Roll No :"+studentRegistration.getSid()+" </h5>" 
					+ "<h5> Student Contact :"+studentRegistration.getContact()+" </h5>" 
					+ "<h5> Student Address :"+studentRegistration.getAddress()+" </h5>"
					+ "<div class='card-text'>"
					+ "<h5> Student Marks</h5>");

			for (studentAllMarksModel reg : li) {
				if (studentRegistration.getSid() == reg.getStudentFkId()) {
					out.println("<table class='table '>"
							+ "<tr>"
				    		+ "					</thead>\r\n"
				    		+ "						<tr>\r\n"
				    		+ "							<td>MicoController</td>\r\n"
				    		+ "							<td>"+reg.getMicoController()+"</td>\r\n"
				    		+ "						</tr>\r\n"
				    		+ "					<tbody>\r\n"
				    		+ "						<tr>\r\n"
				    		+ "							<td>MicroProcessor</td>\r\n"
				    		+ "							<td>"+reg.getMicroProcessor()+"%</td>\r\n"
				    		+ "						</tr>\r\n"
				    		+ "						<tr>\r\n"
				    		+ "							<td>DigitalElectronics</td>\r\n"
				    		+ "							<td>"+reg.getDigitalElectronics()+"%</td>\r\n"
				    		+ "						</tr>\r\n"
				    		+ "						<tr>\r\n"
				    		+ "							<td>Control System</td>\r\n"
				    		+ "							<td>"+reg.getControlSystem()+"%</td>\r\n"
				    		+ "						</tr>\r\n"
				    	    +"                  	<tr>\r\n"
				    		+ "							<td>Anolog Circuit</td>\r\n"
				    		+ "							<td>"+reg.getAnologCircuit()+"%</td>\r\n"
				    		+ "						</tr>\r\n"
				    		  +"                  	<tr>\r\n"
				    		+ "							<td>Signal And Signal</td>\r\n"
				    		+ "							<td>"+reg.getSignalAndSignal()+"%</td>\r\n"
				    		+ "						</tr>\r\n"
				    		  +"                  	<tr>\r\n"
				    		+ "							<th><strong>Percentage<t<strong</th>\r\n"
				    		+ "							<th>"+reg.getTotalMarks()+"%</th>\r\n"
				    		+ "						</tr>\r\n"
				    		
				    		+ "					</tbody>\r\n"

							+ "</table>");
				}
			}
			out.println("</div>"
					+ "</div>"
					+ "</div>" + "</div>");
		}
		
				out.println( "</div>"
						+ "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N\" crossorigin=\"anonymous\"></script>\r\n"
				+ "  </body>\r\n" + "</html>");
	}

}
