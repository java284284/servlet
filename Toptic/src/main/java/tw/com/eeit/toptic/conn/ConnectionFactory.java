package tw.com.eeit.toptic.conn;

import java.sql.Connection;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ConnectionFactory {

	public static Connection getConnection() {

		try {
			InitialContext namingcontext = new InitialContext();
			DataSource ds = (DataSource) namingcontext.lookup("java:comp/env/jdbc/TopticDB");
			
			return ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}
}
