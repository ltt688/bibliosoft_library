package utils;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

import java.sql.DriverManager;

public class JdbcUtil {

	static{
		try {
		Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
		public static Connection getConnection() throws SQLException{
		String dbUrl="jdbc:mysql://localhost:3306/bibliosoft?useUnicode=true&characterEncoding=utf8";
		String dbUser="root";
		String dbPassword="";
		return DriverManager.getConnection(dbUrl,dbUser,dbPassword);
		
		}

		public static void close(Statement stmt,Connection conn) throws SQLException{
		stmt.close();
		conn.close();
		}
}
