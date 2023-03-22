//2.	Write a JDBC program with Parametrized queries to list the records of Emp table which has records whose names start with the alphabet “R”.
package slot19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainClass19_2 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			Statement stmt=con.createStatement();
			String query="SELECT * FROM EMPLOYEE WHERE EMPNAME like 'R%'";
			ResultSet rs=stmt.executeQuery(query);
			int i=2;
			while(rs.next()) {
				System.out.println(rs.getString(i));
				//i++;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
