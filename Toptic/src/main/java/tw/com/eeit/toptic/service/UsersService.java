package tw.com.eeit.toptic.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import tw.com.eeit.toptic.conn.ConnectionFactory;
import tw.com.eeit.toptic.model.bean.Users;
import tw.com.eeit.toptic.model.dao.UsersDAO;

public class UsersService {

	public ArrayList<Users> getAllUsers() {
		ArrayList<Users> aL = new ArrayList<Users>();

		Connection conn = ConnectionFactory.getConnection();
		try {
			aL = new UsersDAO(conn).readAllUsers();

			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return aL;
	}

	public byte[] getImgByName(String name) {

		String path = "C:\\temp\\ProductPhoto\\";

		byte[] bytes = null;
		try {
			FileInputStream fis = new FileInputStream(path + name + ".jpeg");

			bytes = fis.readAllBytes();

			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return bytes;

	}

	public String addUsers(Users p) {
		try {
			Connection conn = ConnectionFactory.getConnection();
			UsersDAO usersDAO = new UsersDAO(conn);
			usersDAO.createUsers(p);

			FileOutputStream fis = new FileOutputStream("C:\\temp\\ProductPhoto\\" + p.getName() + ".jpeg");

			fis.write(p.getImg());

			fis.close();

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			
			return "無法新增帳號!!";
		}
		return "新增帳號完成";

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

	public boolean deleteUsers(String id) {
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
	
	public String updateUsers(Users p) {
		try {
			Connection conn = ConnectionFactory.getConnection();
			UsersDAO usersDAO = new UsersDAO(conn);
			usersDAO.updateUsers(p);

//			FileOutputStream fis = new FileOutputStream("C:\\temp\\ProductPhoto\\" + p.getName() + ".jpeg");
//
//			fis.write(p.getImg());
//
//			fis.close();

			conn.close();
		} catch (Exception e) {
//			e.printStackTrace();
			
			return "無法修改帳號!!";
		}
		return "修改帳號完成";

	}
	
}
