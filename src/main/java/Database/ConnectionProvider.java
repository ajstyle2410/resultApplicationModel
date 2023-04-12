package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
          public static Connection getConnectionProvider()
          {
        	  try {
        	   Class.forName("com.mysql.jdbc.Driver");
        	   
           	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/result","root","root");
			return con;

        	  }catch(Exception ex)
        	  {
        		  return null;
        	  }
        	  
          }
 }
