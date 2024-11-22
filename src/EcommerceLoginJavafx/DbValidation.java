package EcommerceLoginJavafx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbValidation {

	private static Connection connection;
	private static Statement statement;

	static {

		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ecommerce", "postgres", "samir");
			statement = connection.createStatement();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public static ResultSet selectQuery(String query) throws SQLException {
		ResultSet resultSet = statement.executeQuery(query);
		return resultSet;

	}

}
