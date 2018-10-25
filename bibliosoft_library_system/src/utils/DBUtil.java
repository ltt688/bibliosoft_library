
package utils;

 

import java.sql.Connection;

import java.sql.DriverManager;

 

public class DBUtil {

	private String dbUrl="jdbc:mysql://localhost:3306/bibliosoft?useUnicode=true&characterEncoding=UTF-8";

	private String userName = "root";

	private String password = "";

	private String jdbcName = "com.mysql.jdbc.Driver";

	/**

	 * 获取数据库链接

	 * @return

	 * @throws Exception

	 */

	public Connection getCon() throws Exception{

		Class.forName(jdbcName);

		Connection connection = DriverManager.getConnection(dbUrl,userName,password);

		return connection;

	}

	

	/**

	 * 关闭数据库连接

	 * @param connection

	 * @throws Exception

	 */

	public void closeCon(Connection connection) throws Exception{

		if (null != connection) {

			connection.close();

		}

	}

	

	public static void main(String[] args) {

		DBUtil dbUtil = new DBUtil();

		try {

			dbUtil.getCon();

			System.out.println("数据库连接成功");

		} catch (Exception e) {

			System.out.println("数据库连接异常");

		}

	}

}
