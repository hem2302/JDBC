package sql;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLconnection {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			Statement createStatement = con.createStatement();
			ResultSet executeQuery = createStatement.executeQuery("select * from salgrade");
			while(executeQuery.next())
			{
				System.out.println(executeQuery.getString(1)+" "+executeQuery.getString(2));
			}
			con.close();		
		}

}
