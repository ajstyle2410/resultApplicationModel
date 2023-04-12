package student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/studentUpdateRecords")
public class studentUpdateRecords extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      int updateId=Integer.parseInt(request.getParameter("id"));
       String name = request.getParameter("name");
       long  contact = Integer.parseInt(request.getParameter("contact"));
       String address=request.getParameter("address");
               

            
            out.println("<!doctype html>\r\n"
            		+ "<html lang=\"en\">\r\n"
            		+ "  <head>\r\n"
            		+ "    <meta charset=\"utf-8\">\r\n"
            		+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
            		+ "    <title>Update Data</title>\r\n"
            		+ "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\" crossorigin=\"anonymous\">\r\n"
            		+ "  </head>\r\n"
            		+ "  <body class='justify-content-center align-items-center text-center d-flex bg-primary'>\r\n"
            		+ " <form action='finalUpdate' class='w-50'>"
            		+"<h3>Student Update Data</h3>"
            		+" <div class=\"form-group\">\r\n"
                     		+ "      <input type=\"hidden\"  class=\"form-control\" id=\"exampleInputPassword1\" name='id' value='"+updateId+"'>\r\n"
                     		+ "    </div>"
            		+ "    <div class=\"form-group\">\r\n"
            		+ "      <label for=\"exampleInputPassword1\" class=\"form-label mt-4\">Student Name</label>\r\n"
            		+ "      <input type=\"text\" class=\"form-control\" id=\"exampleInputPassword1\" name='name' value='"+name+"'>\r\n"
            		+ "    </div>"
            		+ "    <div class=\"form-group\">\r\n"
            		+ "      <label for=\"exampleInputEmail1\" class=\"form-label mt-4\">Email address</label>\r\n"
            		+ "      <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\"name='address' value='"+address+"'>\r\n"
            		+ "      <small id=\"emailHelp\" class=\"form-text text-muted\">We'll never share your email with anyone else.</small>\r\n"
            		+ "    </div>\r\n"
            	
            		+ "    <div class=\"form-group\">\r\n"
            		+ "      <label for=\"exampleInputPassword1\" class=\"form-label mt-4\">Enter Contact</label>\r\n"
            		+ "      <input type=\"text\" class=\"form-control\" id=\"exampleInputPassword1\" name='contact' value='"+contact+"'>\r\n"
            		+ "    </div>"
            		+"<input type=\"submit\" class='btn btn-primary mt-3' value='submit'/>\r\n"
            	
            		+ "</form> "
            		+ "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN\" crossorigin=\"anonymous\"></script>\r\n"
            		+ "  </body>\r\n"
            		+ "</html>");
                
	}


}
