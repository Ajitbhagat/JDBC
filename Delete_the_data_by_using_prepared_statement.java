// 11 wap to delete the data by using prepared statement dynamic input
package Start_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete_the_data_by_using_prepared_statement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_curd", "root", "root");
		PreparedStatement preparedStatement = connection.prepareStatement("delete from Teacher where t_id=?");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Teacher ID to Delete the Data");
		int t_id = scanner.nextInt();
		preparedStatement.setInt(1, t_id);
		preparedStatement.execute();
		System.out.println("Data has been Deleted");
	}

}
