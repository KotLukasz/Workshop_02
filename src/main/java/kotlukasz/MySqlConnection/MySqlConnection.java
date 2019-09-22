package kotlukasz.MySqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {

	private static final String URL =
			"jdbc:mysql://localhost:3306/Workshop_02?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASSWORD = "coderslab";

	public static Connection getConnection() throws SQLException {

		return DriverManager.getConnection(URL, USER, PASSWORD);

	}

}
