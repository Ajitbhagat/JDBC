//8 fetch the value
package Start_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch_the_value {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_curd", "root", "root");
		Statement  statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select*from teacher where t_id=1");
		while(resultSet.next())
		{
			System.out.println("t_id"+" "+resultSet.getInt(1)+"\n"+"t_name"+" "+resultSet.getString(2)+"\n"+"t_eid"+" "+resultSet.getString(3)+"\n"+"t_mobile"+" "+resultSet.getBigDecimal(4)+"\n"+"t_salary"+" "+resultSet.getBigDecimal(5));
		}
	}
}
