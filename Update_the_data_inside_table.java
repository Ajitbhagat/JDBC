// 4. Wap to Update the data inside table
package Start_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update_the_data_inside_table {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_curd", "root", "root");
		Statement statement = connection.createStatement();
		statement.execute("update Teacher set t_name='Sachin Kumar',t_eid='Sachink@gmail.com', t_mobile='7890382125',t_salary='50000'");
		System.out.println("Data has been Update");
		
	}

}
