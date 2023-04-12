package Teacher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ClassImpl.TeacherAllDataImplements;
import Interface.TeacherAllDataInterface;


@WebServlet("/TecherEditDelete")
public class TecherEditDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		 
		  PrintWriter out = response.getWriter();
	
		   Object update=request.getAttribute("msg");
		     int id = Integer.valueOf((String) update);
		   System.out.println("your data :"+id);
		     TeacherAllDataInterface ti = new TeacherAllDataImplements();
		     ti.DeleteTechar(id);
	}

}
