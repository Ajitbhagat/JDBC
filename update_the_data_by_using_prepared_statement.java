// 10 wap to update the data by using prepared statement
package Start_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class update_the_data_by_using_prepared_statement {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_curd", "root", "root");
	PreparedStatement preparedStatement = connection.prepareStatement("update Teacher set t_name=?,t_eid=?,t_mobile=?,t_salary=? where t_id=?");
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Teacher Name to Update");
	String t_name = scanner.next();
	System.out.println("Enter the Teacher Email Id to Update");
	String t_email = scanner.next();
	System.out.println("Enter the Teacher Mobile Number to Update");
	long t_phone = scanner.nextLong();
	System.out.println("Enter the Teacher Salary to Update");
	long t_salary = scanner.nextLong();
	int t_id = scanner.nextInt();
	
	preparedStatement.setString(1, t_name);
	preparedStatement.setString(2, t_email);
	preparedStatement.setLong(3, t_phone);
	preparedStatement.setLong(4, t_salary);
	preparedStatement.setInt(5, t_id);
	
	preparedStatement.execute();
	System.out.println("Data has been update");
	
	
}
}
