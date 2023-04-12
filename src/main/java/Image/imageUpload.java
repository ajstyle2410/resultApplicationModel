package Image;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/imageUpload")
public class imageUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		  response.setContentType("text/html");
		  
		  PrintWriter out = response.getWriter();
		  boolean b = ServletFileUpload.isMultipartContent(request);
		  String fileName;
		   if(!b)
		   {
			   out.println("invalid file upload");
		   }else {
			   
			   // file uploading logic
			   
			   DiskFileItemFactory factory = new DiskFileItemFactory();
			   factory.setSizeThreshold(5*1024);
			   factory.setRepository (new File("C:\\test"));
			   ServletFileUpload upload = new ServletFileUpload(factory);
			   
			   //set max file size
			   upload.setSizeMax(50*1024*1024);
			   try {
				   List<FileItem> fileItem = upload.parseRequest(request);
				   for (FileItem item : fileItem)
				   {
					b=item.isFormField();
						if(!b)
						{
							//Get File Details
							 fileName=item.getName();
							String fieldName=item.getFieldName();
							String contentType=item.getContentType();
							long size = item.getSize();
							out.println("file name is"+fileName);
							out.println("field name is"+fieldName);
							out.println("Content type"+contentType);
							ServletContext context = this.getServletContext();
							String realPath = context.getRealPath("/");
							out.println("file path "+realPath);
							File f = new File(realPath+"images");
							
						  if (!f.exists()) {
							f.mkdir();
						}
							f=new File(realPath+"images\\"+fileName);
							item.write(f);
							out.println("file upload success....");
						}else {
							String controlName=item.getFieldName();
							String data = item.getString();
							System.out.println(controlName+"\t\t\t\t\t\t\t"+data);
						}
				   }
			   }catch(Exception ex)
			   {
				   System.out.println(ex);
			   }
			   
		   }
		
	}

}
