package student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ClassImpl.studentRegisterationImplements;
import Interface.studentRegistrationInterface;

@WebServlet("/studentDeleteRecords")
public class studentDeleteRecords extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    int deleteId=Integer.parseInt(request.getParameter("id"));
	    out.println(" Student delete id"+deleteId);
	
	      studentRegistrationInterface rs = new studentRegisterationImplements();
	    boolean b=    rs.StudentDeleteData(deleteId);
	     if(b)
	     {
	    	 RequestDispatcher rd = request.getRequestDispatcher("showStudentRecords");
	    	 rd.include(request, response);
	    	  System.out.println("data deleted....");
	     }else {
	    	 System.out.println("data not added....");
	     }
	       	
	}


}
