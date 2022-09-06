package tw.com.eeit.users.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import tw.com.eeit.conn.ConnectionFactory;
import tw.com.eeit.users.model.bean.Users;
import tw.com.eeit.users.model.dao.UsersDAO;

/**
 * 此為使用者服務。
 */
public class UsersService {

	/**
	 * 此方法會回傳所有使用者。
	 * 
	 * @return ArrayList，內容為使用者bean
	 */
	public ArrayList<Users> getAllUsers() {
		try {
			Connection conn = ConnectionFactory.getConnection();

			UsersDAO usersDAO = new UsersDAO(conn);
			ArrayList<Users> aL = usersDAO.readAllUsers();

			conn.close();

			return aL;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean deleteUserByID(String id) {
		try {
			Connection conn = ConnectionFactory.getConnection();

			UsersDAO usersDAO = new UsersDAO(conn);
			usersDAO.deleteOneUser(id);

			conn.close();

			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}
}
