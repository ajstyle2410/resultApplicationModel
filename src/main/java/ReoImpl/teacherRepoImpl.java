package ReoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java. sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Database.ConnectionProvider;
import Model.teacherModel;
import Repository.teacherRepositroy;

public class teacherRepoImpl  implements teacherRepositroy{
	Connection con;
	ResultSet rs;
	ResultSet rss;
	PreparedStatement stmt;
	
	  List<teacherModel> lst;
//	  public teacherRepoImpl()
//	  {
//		  
//		  try {
//				Class.forName("com.mysql.jdbc.Driver");
//				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/result", "root", "root");
//				System.out.println("connection loaded...");
//				
//				  
//				
//			} catch (Exception e) {
//				System.out.println(e);
//			}
//		}
//	  
	@Override
	public List<teacherModel> ShowTeacher() {
    Connection con= ConnectionProvider.getConnectionProvider();
		  try {
			stmt=con.prepareStatement("select * from teacher");
			rs=stmt.executeQuery();
			 lst = new ArrayList<teacherModel>();
			  while(rs.next())

			  {
				  teacherModel tm = new teacherModel();
				  tm.setTid(rs.getInt(1));
				  tm.setTname(rs.getString(2));
				  tm.setTname(rs.getString(3));
				  tm.setPassword(rs.getString(4));
				  lst.add(tm);
			  }
			
		} catch (SQLException e) {

		 System.out.println(e);
		}
		
		return lst;
	}

	@Override
	public boolean deleteTeacher(int id) {

		  Connection con = ConnectionProvider.getConnectionProvider();
		  
		  try {
			stmt=con.prepareStatement("delete from teacher where id=?");
			  stmt.setInt(1, id);
			int k=  stmt.executeUpdate();
			  
			    if(k>0)
			    	return true;
			    else
			    	return false;
		} catch (SQLException e) {
		
			System.out.println(e);
		}
		
		return false;
	}

}
