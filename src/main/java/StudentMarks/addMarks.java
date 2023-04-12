package StudentMarks;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ClassImpl.studentMarksImplements;
import Interface.studentMarksInterface;
import Model.studentAllMarksModel;


@WebServlet("/addMarks")
public class addMarks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	  response.setContentType("text/html");
	  PrintWriter out = response.getWriter();
	  
		 int id=Integer.parseInt(request.getParameter("sid"));
		   System.out.println("reigstration id "+id);
	  float MicoController =Float.parseFloat(request.getParameter("MicoController"));
	  float MicroProcessor =Float.parseFloat(request.getParameter("MicroProcessor"));
	  float   DigitalElectronics =Float.parseFloat(request.getParameter("DigitalElectronics"));
	  float   ControlSystem =Float.parseFloat(request.getParameter("ControlSystem"));
	  float AnologCircuit =Float.parseFloat(request.getParameter("AnologCircuit"));
	  float SignalAndSignal = Float.parseFloat(request.getParameter("SignalAndSignal"));

	  float agg= MicoController+MicroProcessor+DigitalElectronics+ControlSystem+SignalAndSignal+AnologCircuit;
	
	  float  total= agg/6;
	
	  studentAllMarksModel sm = new studentAllMarksModel();
	  sm.setMicoController(MicoController);
	  sm.setMicroProcessor(MicroProcessor);
	  sm.setControlSystem(ControlSystem);
	  sm.setDigitalElectronics(DigitalElectronics);
	  sm.setAnologCircuit(AnologCircuit);
	  sm.setSignalAndSignal(SignalAndSignal);
	  sm.setTotalMarks(total);
	  sm.setStudentFkId(id);
	  sm.setStudentAgg(agg);
	  
	  studentMarksInterface sf = new studentMarksImplements();
	boolean b= sf.addMarks(sm);
    
	  if (b) {
		RequestDispatcher rd = request.getRequestDispatcher("StudentAddMarks");
		rd.include(request, response);
		request.setAttribute("marks added..","marks");
	}else {
		RequestDispatcher rd = request.getRequestDispatcher("StudentAddMarks");
		rd.include(request, response);
		request.setAttribute("marks not added..","marks");
	}
		  
	}

	
}
