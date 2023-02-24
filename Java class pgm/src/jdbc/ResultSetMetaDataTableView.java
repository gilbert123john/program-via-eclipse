package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ResultSetMetaDataTableView {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "mca", "mca");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from project");
			ResultSetMetaData resultSetMetaData = rs.getMetaData();
			for (int i = 1; i <= resultSetMetaData.getColumnCount(); i++) {
				System.out.print(resultSetMetaData.getColumnName(i) + "\t\t");
			}
			System.out.println("\n------------------------------------------------------------------------------------------------");
			while (rs.next()) {
				for (int i = 1; i <= resultSetMetaData.getColumnCount(); i++) {
					System.out.print(rs.getString(i)+"\t");
				}System.out.println();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
