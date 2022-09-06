package tw.com.eeit.breadshop.user.model.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsersDAO {

	Connection conn;

	public UsersDAO(Connection conn) {

		this.conn = conn;
	}

	public ArrayList<Users> readAllUsers() throws SQLException {
		String sql = "SELECT * FROM [BreadShopDB].[dbo].[Users]";
		PreparedStatement preState = conn.prepareStatement(sql);
		ResultSet rs = preState.executeQuery();

		ArrayList<Users> aL = new ArrayList<Users>();

		while (rs.next()) {
			Users u = new Users();
			u.setId(rs.getString("id"));
			u.setName(rs.getString("name"));
			u.setAccount(rs.getString("account"));
			u.setPassword(rs.getString("password"));
			u.setRole(rs.getString("role"));
			u.setPhoto(rs.getBytes("photo"));
			aL.add(u);
		}

		rs.close();
		preState.close();

		return aL;
	}

	public void createProduct(Users u) throws SQLException {
		String sql = "INSERT INTO [BreadShopDB].[dbo].[Users](account,password,name,role,photo) VALUES(?,?,?,?,?)";
		PreparedStatement preState = conn.prepareStatement(sql);
		preState.setString(3, u.getName());
		preState.setString(2, u.getPassword());
		preState.setString(1, u.getAccount());
		preState.setString(4, u.getRole());
		preState.setBytes(5, u.getPhoto());

		preState.execute();
		preState.close();
	}

	public Users getUserByAccount(String account) throws SQLException {
		String sql = "SELECT * FROM [BreadShopDB].[dbo].[Users] WHERE account=?";
		PreparedStatement preState = conn.prepareStatement(sql);
		preState.setString(1, account);

		ResultSet rs = preState.executeQuery();
		rs.next();

		Users u = new Users();
		u.setId(rs.getString("id"));
		u.setName(rs.getString("name"));
		u.setAccount(rs.getString("account"));
		u.setPassword(rs.getString("password"));
		u.setRole(rs.getString("role"));
		u.setPhoto(rs.getBytes("photo"));

		return u;
	}
}
