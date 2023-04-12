package Admin;

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

@WebServlet("/studentOrAdminLoginPage")
public class studentOrAdminLoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String Username = request.getParameter("UserName");
		String Password = request.getParameter("Password");

		AdminInterFace ai = new AdminInterInterfaceImple();

		boolean teacherLogin = ai.TeacherLogin(Username, Password);

		boolean studentLogin = ai.StudentLogin(Username, Password);

		if (teacherLogin) {
			RequestDispatcher rd = request.getRequestDispatcher("TeacherDashboard.jsp");
			rd.forward(request, response);
           request.setAttribute("username",Username);
			System.out.println("000000000000>"+Username);
		} 	
		else if (studentLogin) {
			RequestDispatcher rd = request.getRequestDispatcher("StudentRecord_Id.html");
			rd.forward(request, response);
		} 
		else if(Username.equals("admin")&&Password.equals("1234"))
	      {
	    	 RequestDispatcher rd = request.getRequestDispatcher("Admin-MasterPage.jsp");
	    	 rd.forward(request, response);
	    	 request.setAttribute("name", "name");
	      } else {
	    	  RequestDispatcher rd = request.getRequestDispatcher("login-Page.jsp");
	    	 rd.include(request, response);
	    	 response.sendRedirect("login-Page.jsp?error=invalid username and password");
	    	 

	      }

	}

}
