package ReoImpl;




import java.sql.*;

import Database.ConnectionProvider;
import Model.teacherModel;
import Repository.AdminInterfaceRepo;
public class AdminRepoImplements  implements AdminInterfaceRepo{
 
  ResultSet rs;
  PreparedStatement stmt;
  Connection con = ConnectionProvider.getConnectionProvider();
	  
	@Override
	public  boolean TeacherLogin(String name , String password) {
		  try {
		    stmt=con.prepareStatement("select * from teacher where tname=? and password=?");
		      stmt.setString(1, name);
		      stmt.setString(2, password);
		     
			rs = stmt.executeQuery();
			
			 while(rs.next())
			 {
				 System.out.println("----------------->");
				return true;
			
			 }
		} catch (Exception e) {
			System.out.println(" teacher error is "+e);
			
		}
		
		  return false;
	}
	@Override
	public boolean studentLogin(String name, String email) {

		try {
			System.out.println("->"+name+"\t"+email);

			stmt=con.prepareStatement("select * from studentrecords where studentname=? and email=?");
			stmt.setString(1, name);
			stmt.setString(2, email);
			rs=stmt.executeQuery();
			while(rs.next())
			{
				return true;
			}
		} catch (Exception e) {

			System.out.println("studentrecords error is"+e);
		}
		return false;
	}
	@Override
	public boolean addTeacher(teacherModel tm) {
		 try {
			 System.out.println("data loaded..");

			stmt=con.prepareStatement("insert into teacher values('0',?,?,?)");
			stmt.setString(1, tm.getTname());
			stmt.setString(2, tm.getTsubject());
			stmt.setString(3, tm.getPassword());
			 int val= stmt.executeUpdate();
			 System.out.println("data executed..");
			 if(val>0)
			  return true;
			 else
				 return false;
		} catch (SQLException e) {
System.out.println("Teacher error is"+e);
return false;

		}
	}

}
