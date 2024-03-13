// 6. wap to Alter the table_by deleteing column
package Start_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Alter_the_table_by_deleteing_column {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_curd", "root", "root");
		Statement  statement = connection.createStatement();
		statement.execute("alter table Teacher drop column t_mobile");
		System.out.println("Column has been Drop");
	}

}
