//Assume that login is a table which has Uname, Upass. Check whether a record with “Uname=”Bob” and “UPass=”Alice123#”is present in the table. 
package slot16;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MAinClass16_2 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			Statement stmt=con.createStatement();
			String p="create table login(uname varchar2(10),upass varchar2(10))";
			stmt.executeUpdate(p);
			System.out.println("table created");
			String p1="insert into login values('Bob','Alice123#')";
			String q1="insert into login values('Alice','al@123')";
			stmt.executeUpdate(p1);
			stmt.executeUpdate(q1);
			ResultSet rs=stmt.executeQuery("select * from login where uname='Bob'and upass='Alice123#'");
			if(rs.next())
			{
				System.out.println("the value is present");
			}
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
