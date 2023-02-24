package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "mca", "mca");
			Statement stmt = con.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the id");
			int id = sc.nextInt();
			String name = "vas";
			StringBuilder sb = new StringBuilder("insert into test values('");
			sb.append(id);
			sb.append("','");
			sb.append(name);
			sb.append("')");
			
			stmt.executeUpdate(sb.toString());
			System.out.println("Table up");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
