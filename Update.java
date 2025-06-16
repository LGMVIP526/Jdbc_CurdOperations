package in.jdbcproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Update {
	public static void main(String[] args) throws Exception {
		String ecity="delhi";
		String ename="pooja";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","root");
	PreparedStatement pm=con.prepareStatement("update employee set ecity=? where ename=?");
	pm.setString(1, ecity);
	pm.setString(2, ename);
	int count=pm.executeUpdate();
	if(count>0) {
		System.out.println("Updated");
		
	}
	else {
		System.out.println("Not updated");
}
	con.close();
	}

}
