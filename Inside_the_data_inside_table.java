//3. wap to inside the data inside table?
package Start_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Inside_the_data_inside_table {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_curd", "root", "root");
		Statement  statement = connection.createStatement();
		statement.execute("insert into Teacher values (1,'Jalal','jalal@gmail.com',7890382125, 45000)");
		System.out.println("Inside the data inside table");
	}
}
