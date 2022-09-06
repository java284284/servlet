package tw.com.eeit.serial.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DoMain {

	public static void main(String[] args) throws Exception {

		Product p = new Product();
		p.setName("water");
		p.setPrice(100);

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Student\\Desktop\\myObj"));

		oos.writeObject(p);

		oos.close();

//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Student\\Desktop\\myObj"));
//
//		Product p = (Product) ois.readObject();
//		System.out.println(p.getName());
//		System.out.println(p.getPrice());
//
//		ois.close();
	}

}
