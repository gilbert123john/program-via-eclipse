package jdbc;
import java.sql.*;

public class SelectQuery {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","mca","mca");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from project");
			while(rs.next()) {
				System.out.println(rs.getString(1) + rs.getString(2));
			}
			con.close();
			}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
