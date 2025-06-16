package in.jdbcproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Deletion {
	public static void main(String[] args) throws Exception {
		String ename="pooja";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection dm=DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","root");
		PreparedStatement pm=dm.prepareStatement("delete from employee where ename=?");
		pm.setString(1, ename);
		int c=pm.executeUpdate();
	    if(c>0) {
	    	System.out.println("deleted");
	    	
	    }
	    else {
	    	System.out.println("Not done");
	    }
		dm.close();
	}

}
