package cybersoft.java12.jsp.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection {
	//LỚP CONNECTION
	private static String url = "jdbc:mysql://localhost:3306/Customerdb";
	private static String username ="root";
	private static String password = "1234";

	private static Connection connection = null;
	
	public static Connection getConnection() {
		if(connection != null)
			return connection;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //cài đặt Driver //có thể set nhiều loại SQl khác nhau
			connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Cannot find mysql db Driver !!!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Cannot connect to database due to: invalid  url or invalid ");
		}
		
		return  connection;
	}
}
