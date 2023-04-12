package Teacher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ClassImpl.AdminInterInterfaceImple;
import Interface.AdminInterFace;
import Model.teacherModel;

@WebServlet("/TeacherRegistration")
public class TeacherRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("tname");
		String subject = request.getParameter("tsubject");
		String password = request.getParameter("password");
		String rpassword = request.getParameter("rpassword");
		teacherModel md = new teacherModel();
		md.setTname(name);
		md.setTsubject(subject);
		md.setPassword(password);
		System.out.println(md.toString());
		AdminInterFace ai = new AdminInterInterfaceImple();
	boolean b=	ai.addTeacher(md);
	
	     if(b!=false)
	     {
	         RequestDispatcher rd = request.getRequestDispatcher("TeacherAdminPanel"); 
	         rd.forward(request, response);
	         request.setAttribute("name", name);
	         request.setAttribute("subject", subject);
	     }

	}

}
