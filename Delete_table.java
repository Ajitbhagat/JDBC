// 7 Table has been Drop
package Start_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete_table {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_curd", "root", "root");
		Statement  statement = connection.createStatement();
		statement.execute(" drop table Teacher  ");
		System.out.println("Table has been Drop");
	}

}
