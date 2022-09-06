package tw.com.eeit.toptic.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import tw.com.eeit.toptic.model.bean.Users;

public class UsersDAO {

	Connection conn;

	public UsersDAO(Connection conn) {

		this.conn = conn;
	}

	public ArrayList<Users> readAllUsers() throws SQLException {
		String sql = "SELECT * FROM [TopticDB].[dbo].[Users]";
		PreparedStatement preState = conn.prepareStatement(sql);
		ResultSet rs = preState.executeQuery();

		ArrayList<Users> aL = new ArrayList<Users>();

		while (rs.next()) {
			Users p = new Users();
//			type type = (type) rs.nextElement();
			p.setId(rs.getString("id"));
			p.setAccount(rs.getString("account"));
			p.setPassword(rs.getNString("password"));
			p.setName(rs.getNString("name"));
			aL.add(p);

		}

		rs.close();
		preState.close();
		return aL;
	}

	public void createUsers(Users p) throws SQLException {
		String sql = "INSERT INTO [TopticDB].[dbo].[Users](account,password,name) VALUES(?,?,?)";
		PreparedStatement preState = conn.prepareStatement(sql);
		preState.setString(1, p.getAccount());
		preState.setString(2, p.getPassword());
		preState.setString(3, p.getName());
		preState.execute();

		preState.close();
	}

	public void updateUsers(Users p) throws SQLException {
		String sql = "UPDATE [TopticDB].[dbo].[Users] SET account=?,password=?,name=? WHERE id=?";
		PreparedStatement preState = conn.prepareStatement(sql);
		preState.setString(1, p.getAccount());
		preState.setString(2, p.getPassword());
		preState.setString(3, p.getName());
		preState.setString(4, p.getId());
		preState.executeUpdate();

		preState.close();

	}

	public void deleteUsers(Users p) throws SQLException {
		String sql = "DELETE FROM [TopticDB].[dbo].[Users] WHERE id=?";
		PreparedStatement preState = conn.prepareStatement(sql);
		preState.setString(1, p.getId());
		
		preState.execute();
		preState.close();

	}

	public void deleteOneUser(String id) throws SQLException {
		String sql = "DELETE FROM [TopticDB].[dbo].[Users] WHERE id=?";
		PreparedStatement preState = conn.prepareStatement(sql);
		preState.setString(1, id);

		preState.execute();

		preState.close();

	}
}