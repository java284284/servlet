package tw.com.eeit.conn;

import java.sql.Connection;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ConnectionFactory {

	public static Connection getConnection() {

		try {
			InitialContext namingContext = new InitialContext();
			DataSource ds = (DataSource) namingContext.lookup("java:comp/env/jdbc/AWDB");

			return ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
