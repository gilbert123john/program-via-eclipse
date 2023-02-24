package jdbc;

import java.sql.*;

public class CreateTable {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "mca", "mca");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("Create  table test (tid varchar2(5),tname varchar2(10))");
			System.out.println("Table Created");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
