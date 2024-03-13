// 2. wap to create table inside database
package Start_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_Table_inside_db {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_curd", "root", "root");
		Statement statement = connection.createStatement();
		statement.execute("create table Teacher (t_id integer primary key, t_name varchar (30) not null, t_eid varchar (70) not null unique, t_mobile bigint not null unique)");
		System.out.println("Table has been created");
	}

}
