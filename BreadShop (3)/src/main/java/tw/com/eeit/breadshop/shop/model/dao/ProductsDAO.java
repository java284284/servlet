package tw.com.eeit.breadshop.shop.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import tw.com.eeit.breadshop.shop.model.bean.Products;

public class ProductsDAO {

	Connection conn;

	public ProductsDAO(Connection conn) {

		this.conn = conn;
	}

	public ArrayList<Products> readAllProducts() throws SQLException {
		String sql = "SELECT * FROM [BreadShopDB].[dbo].[Products]";
		PreparedStatement preState = conn.prepareStatement(sql);
		ResultSet rs = preState.executeQuery();

		ArrayList<Products> aL = new ArrayList<Products>();

		while (rs.next()) {
			Products p = new Products();
			p.setId(rs.getString("id"));
			p.setName(rs.getString("name"));
			p.setPrice(rs.getInt("price"));
			aL.add(p);
		}

		rs.close();
		preState.close();

		return aL;
	}

	public void createProduct(Products p) throws SQLException {
		String sql = "INSERT INTO [BreadShopDB].[dbo].[Products](name,price) VALUES(?,?)";
		PreparedStatement preState = conn.prepareStatement(sql);
		preState.setString(1, p.getName());
		preState.setInt(2, p.getPrice());

		preState.execute();
		preState.close();
	}

	public void updateProduct(Products p) throws SQLException {
		String sql = "UPDATE [BreadShopDB].[dbo].[Products] SET name=?,price=? WHERE id=?";
		PreparedStatement preState = conn.prepareStatement(sql);
		preState.setString(1, p.getName());
		preState.setInt(2, p.getPrice());
		preState.setString(3, p.getId());

		preState.executeUpdate();
		preState.close();
	}

	public void deleteProduct(Products p) throws SQLException {
		String sql = "DELETE FROM [BreadShopDB].[dbo].[Products] WHERE id=?";
		PreparedStatement preState = conn.prepareStatement(sql);
		preState.setString(1, p.getId());
		
		preState.execute();
		preState.close();
	}

}
