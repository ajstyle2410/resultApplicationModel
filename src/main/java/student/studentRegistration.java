package student;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ClassImpl.studentAllDataImplements;
import ClassImpl.studentMarksImplements;
import ClassImpl.studentRegisterationImplements;
import Interface.studentAllDataInterface;
import Interface.studentMarksInterface;
import Interface.studentRegistrationInterface;
import Model.studentAllMarksModel;

@WebServlet("/studentRegi")
public class studentRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.setContentType("text/html");
		  PrintWriter out = response.getWriter();
		  
		  String studentName = request.getParameter("studentName");
		  String studentEmail=request.getParameter("studentEmail");
		  long studentContact = Integer.parseInt( request.getParameter("studentContact"));
		   System.out.println(studentName+"\t"+studentEmail+"\t"+studentContact);
		   
			  studentAllDataInterface si = new studentAllDataImplements();
			 
			  
			  
		  		  studentRegistrationInterface sr = new studentRegisterationImplements();
//
		  List<studentAllMarksModel> list = sr.showMarksData();
		  System.out.println(list.toString());
			  
//			  
			  studentAllMarksModel  studentAllResult = new studentAllMarksModel();
		    Model.studentRegistration rs = new Model.studentRegistration();
		      rs.setName(studentName);
		      rs.setContact(studentContact);
		      rs.setAddress(studentEmail);
		      rs.setStudentMarks(studentAllResult);
		  	   studentRegistrationInterface rf = new studentRegisterationImplements();
		   
		    boolean b = rf.AddRgistrationData(rs);
		     if(b)
		     {
		    	 RequestDispatcher rd = request.getRequestDispatcher("registrationPage.html");
		    	 rd.include(request, response);
		    	out.println("<h3>data added..</h3>");
		     }else {
		    	 RequestDispatcher rd = request.getRequestDispatcher("registrationPage.html");
		    	 rd.include(request, response);
		    	System.out.println("<h3>data not added...</h3>"); 
		     }
		   
		    
		
	}

}
