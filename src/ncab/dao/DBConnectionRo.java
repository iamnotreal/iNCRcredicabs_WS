/**
 * 
 */
package ncab.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author hm185049
 *
 */
public class DBConnectionRo {

	public Connection getConnection(){
		
		Connection connection = null;
		
		try {
			String connectionUrl = "jdbc:mysql://ec2-18-219-151-75.us-east-2.compute.amazonaws.com:1525/NCABDB";
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			System.out.println("connected");
			connection = DriverManager.getConnection(connectionUrl, "NCAB_RO", "NCAB_RO");	
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}

}
