package tw.com.eeit.breadshop.conn;

import java.sql.Connection;

import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * 產生連線的工廠。
 */
public class ConnectionFactory {

	public static Connection getconnection() {

		DataSource ds;
		try {
			ds = (DataSource) new InitialContext().lookup("java:comp/env/jdbc/BreadShopDB");
			return ds.getConnection();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


	
	
}

