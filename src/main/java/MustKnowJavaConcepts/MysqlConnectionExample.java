package MustKnowJavaConcepts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlConnectionExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://182.82.2.3:3306/learn", "root", "1235");
			
			Statement stmt = connection.createStatement();
			ResultSet result = stmt.executeQuery("SELECT * FROM auth_users");
			
			while(result.next()) {
				//result.username
				System.out.println("Username - " + result.getString(2) + " / " +  result.getString("username") + ", First Name - " + result.getString(4));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
