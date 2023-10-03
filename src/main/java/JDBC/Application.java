package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Application {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/employees_database";
		try {

			// Establishing the connection Object
			Connection connect = DriverManager.getConnection(url, "root", "Venky@27");

			// create a statement object to send to the database 
			Statement statement = connect.createStatement();
			
			//Execute the statement object
			ResultSet resultSet=statement.executeQuery("select * FROM employees_tbl");
			
			//process the result
			while(resultSet.next()) {
				System.err.println(resultSet.getString("name"));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}
