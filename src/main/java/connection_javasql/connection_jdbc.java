package connection_javasql;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection_jdbc {
	public static Connection getConnection() {
		Connection c = null;
		try {
			//b1 dang ki voi driver manage
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			//b2 cacthongso
			String url="jdbc:mySQL://localhost:3306/student_management";
			String username = "hanh";
			String password = "hanh121120";
			c = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
	public static void closeconnection(Connection c) {
		try {
			if(c!=null) {
				c.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void printInfor(Connection c) {
		try {
			if(c!=null) {
				DatabaseMetaData mtdt = c.getMetaData();
				System.out.println(mtdt.getDatabaseProductName());
				System.out.println(mtdt.getDatabaseProductVersion());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
