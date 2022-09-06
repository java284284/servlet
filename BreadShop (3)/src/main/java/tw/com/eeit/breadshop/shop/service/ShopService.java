package tw.com.eeit.breadshop.shop.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import tw.com.eeit.breadshop.conn.ConnectionFactory;
import tw.com.eeit.breadshop.shop.model.bean.Products;
import tw.com.eeit.breadshop.shop.model.dao.ProductsDAO;

public class ShopService {

	public ArrayList<Products> getAllProducts() {
		ArrayList<Products> aL = new ArrayList<Products>();

		Connection conn = ConnectionFactory.getconnection();
		try {
			aL = new ProductsDAO(conn).readAllProducts();

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

	public String addProdcut(Products p) {

		try {
			Connection conn = ConnectionFactory.getconnection();
			ProductsDAO productsDAO = new ProductsDAO(conn);
			productsDAO.createProduct(p);
			
			FileOutputStream fis = new FileOutputStream("C:\\temp\\ProductPhoto\\"+p.getName()+".jpeg");
			
			fis.write(p.getImg());
			
			fis.close();
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			
			return "新增失敗!!!!!";
		}

		return "新增成功";
	}

}
