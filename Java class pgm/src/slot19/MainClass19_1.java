//1.	Write a JDBC program with Parametrized queries to update a given record (Rani’s salary to 15,000) in the Emp table
package slot19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainClass19_1 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			Statement stmt=con.createStatement();
			String query="UPDATE EMPLOYEE SET SALARY = 15000 WHERE EMPNAME = 'Rani'";
			stmt.executeUpdate(query);
			System.out.print("table Updated with salary ");
			ResultSet rs=stmt.executeQuery("SELECT SALARY FROM EMPLOYEE WHERE EMPNAME = 'Rani'");
			while(rs.next()) {
				System.out.print(rs.getString(1));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
