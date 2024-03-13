// 5. wap to Alter the table by adding column
package Start_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Alter_the_table_by_adding_column {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_curd", "root", "root");
		Statement  statement = connection.createStatement();
		statement.execute("alter table Teacher add column t_salary bigint not null");
		System.out.println("Table has been alter Teacher");
	}

}
