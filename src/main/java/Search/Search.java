package Search;

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

import ClassImpl.TeacherAllDataImplements;
import ClassImpl.studentAllDataImplements;
import ClassImpl.studentRegisterationImplements;
import Interface.TeacherAllDataInterface;
import Interface.studentAllDataInterface;
import Interface.studentRegistrationInterface;
import Model.studentAllMarksModel;
import Model.studentRegistration;
import Model.teacherModel;

@WebServlet("/StudentSorting")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		List<studentRegistration> lst;
		List<studentAllMarksModel> li = new ArrayList<>();

		boolean flag = false;
		studentAllDataInterface af = new studentAllDataImplements();
		li = af.studentAllResult();
		studentRegistrationInterface rs = new studentRegisterationImplements();
		lst = new ArrayList<>();
		lst = rs.ShowData();
		
		
		 List<teacherModel>list = new ArrayList<>();
		   
		   
	     TeacherAllDataInterface td = new TeacherAllDataImplements();
	     
	          list= td.ShowTeacher();
		String Search = request.getParameter("name");
		RequestDispatcher rd = request.getRequestDispatcher("TeacherDashboard.jsp");
		RequestDispatcher rd1 = request.getRequestDispatcher("TeacherDashboard.jsp");
		RequestDispatcher rd2 = request.getRequestDispatcher("TeacherDashboard.jsp");

		for (studentRegistration studentRegistration : lst) {

			if (Search.equals(studentRegistration.getName())) {
				flag = true;
				rd.include(request, response);
				out.println("<h5>" + "id :" + studentRegistration.getSid() + "\t" + "Student Name :"
						+ studentRegistration.getName() + "\t" + "Student Contact :" + studentRegistration.getContact()
						+ "\t" + "Student Address :" + studentRegistration.getAddress() + "</h5>");
				for (studentAllMarksModel reg : li) {
					if (studentRegistration.getSid() == reg.getStudentFkId()) {
						out.println("Mico Controller" + reg.getMicoController() + "\t" + "Micro Processor"
								+ reg.getMicroProcessor() + "\t" + "Digital Electronics" + reg.getDigitalElectronics()
								+ "\t" + "Control System" + reg.getControlSystem() + "\t" + "Anolog Circui"
								+ reg.getAnologCircuit() + "\t" + "Signal And Signals" + reg.getSignalAndSignal() + "\t"
								+ "total marks" + reg.getStudentAgg() + "\t" + "Percentage" + reg.getTotalMarks());
					}
				}
			}
		}
		
		   for (teacherModel tm : list) {
				if (Search.equals(tm.getTname())) {
				flag = true;
				rd.include(request, response);
				out.println(tm.getTid()+"\t"+tm.getTname()+"\t"+tm.getTsubject());
	            }
		   }
		
		if (flag == false) {
			rd1.include(request, response);
			out.println("<h3>data not found</h3>");
		}

	}
}

