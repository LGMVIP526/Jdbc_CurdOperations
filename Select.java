package in.jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","root");
		PreparedStatement p=c.prepareStatement("select * from employee");
		ResultSet r=p.executeQuery();
		System.out.println("------Employee Table------");
		while(r.next()) {
			String name=r.getString("ename");
			System.out.println(name);
			int age=r.getInt("eage");
			System.out.println(+age);
			String city=r.getString("ecity");
			System.out.println(city);
			System.out.println("------------");
		}
		
		c.close();
	}

}
