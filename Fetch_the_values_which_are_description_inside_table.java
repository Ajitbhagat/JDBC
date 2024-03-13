//12 wap to fetch the values which are description inside table
package Start_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch_the_values_which_are_description_inside_table {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_curd", "root", "root");
		Statement statement =connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from Teacher");
		while(resultSet.next())
		{
			System.out.println("Teacher ID "+resultSet.getInt(1));
			System.out.println("Teacher Name "+resultSet.getString(2));
			System.out.println("Teacher Email id "+resultSet.getString(3));
			System.out.println("Teacher Mobile Number "+resultSet.getLong(4));
			System.out.println("Teacher Salary "+resultSet.getLong(5));
		}
//		System.out.println("NOT FOUND!");
	
	}

}
