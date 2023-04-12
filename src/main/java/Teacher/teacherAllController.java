package Teacher;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ClassImpl.TeacherAllDataImplements;
import Interface.TeacherAllDataInterface;
import Model.teacherModel;

@WebServlet("/teacherA")
public class teacherAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 response.setContentType("text/html");
	
	   PrintWriter out = response.getWriter();
	   
	   List<teacherModel>list = new ArrayList<>();
	   
	   
	     TeacherAllDataInterface td = new TeacherAllDataImplements();
	     
	          list= td.ShowTeacher();
	          
	           out.println("<!doctype html>\r\n"
	           		+ "<html lang=\"en\">\r\n"
	           		+ "  <head>\r\n"
	           		+ "    <meta charset=\"utf-8\">\r\n"
	           		+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
	           		+ "    <title>Bootstrap demo</title>\r\n"
	           		+ "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp\" crossorigin=\"anonymous\">\r\n"
	           		+ "  </head>\r\n"
	           		+ "  <body>\r\n"
	           		+ "    <table class=\"table\">\r\n"
	           		+ "  <thead>\r\n"
	           		+ "    <tr>\r\n"
	           		+ "      <th scope=\"col\">#</th>\r\n"
	           		+ "      <th scope=\"col\">Techer Name</th>\r\n"
	           		+ "      <th scope=\"col\">Teacher Subject</th>\r\n"
	           		+ "      <th scope=\"col\">Password</th>\r\n"
	           		+ "    </tr>\r\n");
	           		
	            for (teacherModel tm : list) {
					
			
	           
	           	  out.println(	"  </thead>\r\n"
	           		+ "  <tbody>\r\n"
	           		+ "    <tr>\r\n"
	           		+ "      <th scope=\"row\">"+tm.getTid()+"</th>\r\n"
	           		+ "      <th scope=\"row\">"+tm.getTname()+"</th>\r\n"
	           		+ "      <th scope=\"row\">"+tm.getTsubject()+"</th>\r\n"
	           		+ "      <th scope=\"row\">"+tm.getPassword()+"</th>\r\n"
	           		+ "    </tr>\r\n");
	            }
	         out.println( "  </tbody>\r\n"
	           		+ "</table>"
	           		+ "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N\" crossorigin=\"anonymous\"></script>\r\n"
	           		+ "  </body>\r\n"
	           		+ "</html>");
	   
	}

}
