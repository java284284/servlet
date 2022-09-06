package tw.com.eeit.base64.test;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Base64;

public class BytesToBase64 {

	public static void main(String[] args) throws Exception {

		String mineType = "data:image/jpeg;base64,";

		FileInputStream fis = new FileInputStream("C:\\Users\\Student\\Desktop\\A.jpg");

		byte[] imgBytes = fis.readAllBytes();

		fis.close();

		String imgBase64String = Base64.getEncoder().encodeToString(imgBytes);

		FileWriter fw = new FileWriter("C:\\Users\\Student\\Desktop\\test.txt");
		fw.write(mineType + imgBase64String);
		fw.close();
	}

}
