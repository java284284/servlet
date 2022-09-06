package tw.com.eeit.users.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import tw.com.eeit.users.model.bean.Users;

public class UsersDAO {

	private Connection conn;

	public UsersDAO(Connection conn) {
		this.conn = conn;
	}

	/**
	 * 從資料庫取得所有使用者的資料，存放在ArrayList裡。
	 * 
	 * @return ArrayList，泛型為Users
	 */
	public ArrayList<Users> readAllUsers() throws SQLException {
		String sql = "SELECT * FROM [ServletDB].[dbo].[users]";
		PreparedStatement preState = conn.prepareStatement(sql);
		ResultSet rs = preState.executeQuery();

		ArrayList<Users> aL = new ArrayList<Users>();
		while (rs.next()) {

			Users u = new Users();
			u.setId(rs.getString("id"));
			u.setAccount(rs.getString("account"));
			u.setUserName(rs.getString("username"));
			u.setPassword(rs.getString("password"));
			u.setImgPath(rs.getString("imgpath"));

			aL.add(u);
		}

		rs.close();
		preState.close();

		return aL;
	}

	public void deleteOneUser(String id) throws SQLException {
		String sql = "DELETE FROM [ServletDB].[dbo].[users] WHERE id=?";
		PreparedStatement preState = conn.prepareStatement(sql);
		preState.setString(1, id);

		preState.execute();

		preState.close();

	}
}
