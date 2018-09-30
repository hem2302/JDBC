package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		Statement createStatement = con.createStatement();
		ResultSet executeQuery = createStatement.executeQuery("select * from emp");
		while(executeQuery.next())
		{
			System.out.println(executeQuery.getString(1)+" "+executeQuery.getString(2));
		}
		con.close();
		
	}

}
