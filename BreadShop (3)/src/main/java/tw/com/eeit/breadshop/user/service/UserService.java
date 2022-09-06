package tw.com.eeit.breadshop.user.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Base64;

import tw.com.eeit.breadshop.conn.ConnectionFactory;
import tw.com.eeit.breadshop.user.model.bean.Users;
import tw.com.eeit.breadshop.user.model.bean.UsersDAO;

public class UserService {

	public Users testLogin(Users u) {
		try {

			Connection conn = ConnectionFactory.getconnection();
			Users sqlUser = new UsersDAO(conn).getUserByAccount(u.getAccount());
			sqlUser.setPhotoBase64(Base64.getEncoder().encodeToString(sqlUser.getPhoto()));

			if (u.getPassword().equals(sqlUser.getPassword())) {
				return sqlUser;
			}

			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

}
