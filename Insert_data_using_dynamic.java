// 13 wap to insert data using dynamic
package Start_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert_data_using_dynamic {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_curd", "root", "root");
		PreparedStatement preparedStatement= connection.prepareStatement("Insert into Teacher values (?,?,?,?,?)");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Teacher Id to Insert");
		int t_id = scanner.nextInt();
		System.out.println("Enter the Teacher Name to Insert");
		String t_name = scanner.next();
		System.out.println("Enter the Teacher Email Id to Insert");
		String t_email = scanner.next();
		System.out.println("Enter the Teacher Mobile Number to Insert");
		long t_phone = scanner.nextLong();
		System.out.println("Enter the Teacher Salary to Insert");
		long t_salary = scanner.nextLong();
		
		preparedStatement.setInt(1, t_id);
		preparedStatement.setString(2, t_name);
		preparedStatement.setString(3, t_email);
		preparedStatement.setLong(4, t_phone);
		preparedStatement.setLong(5, t_salary);
		
		
		preparedStatement.execute();
		System.out.println("Data Insert");
	
		
	}

}
