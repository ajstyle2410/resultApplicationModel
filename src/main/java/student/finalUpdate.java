package student;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ClassImpl.studentRegisterationImplements;
import Interface.studentRegistrationInterface;

@WebServlet("/finalUpdate")
public class finalUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	  int updateId = Integer.parseInt(request.getParameter("id"));
		String name= request.getParameter("name");
		long contact=Integer.parseInt(request.getParameter("contact"));
		String email=request.getParameter("address");//		 studentRegistration rs = new studentRegistration();
		 studentRegistrationInterface rf = new studentRegisterationImplements();
      boolean b=   rf.StudentUpdateData(updateId,name,contact,email);
        if(b)
        {
        	RequestDispatcher rd = request.getRequestDispatcher("showStudentRecords");
        	rd.forward(request, response);
        }else {
        	request.setAttribute("invalid","data not updated..");
        }
	}

}
