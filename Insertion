package in.jdbcproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Insertion {		
			static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
			static String DB_URL = "jdbc:mysql://localhost:3306/employeeS";
			static  String DB_USERNAME = "root";
			static String DB_PASSWORD = "root";
			public static void main(String[] args) throws Exception
			{
			 Class.forName(DB_DRIVER);
			 Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			 String s="insert into employee values(?,?,?)";
				//String s = "insert into user1 values("n","mm","ll")";
				//String s = "delete from user1 where name = ?";
				PreparedStatement ps = con.prepareStatement(s);
				ps.setString(1, "prakya");
				ps.setInt(2, 16);
				ps.setString(3, "Mumbai");
				
				int count = ps.executeUpdate();
				if(count>0)
	{
					System.out.println("Insertion done");
				}
				else
				{
					System.out.println("not done");
				}
		    con.close();
			
			}
			
		}

