package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertiesFile {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\testing\\prop1.properties");
		Properties prop = new Properties();
		prop.load(fis);

		String a = prop.getProperty("correctEmail");
		System.out.println(a);

		System.out.println(prop.getProperty("language"));

		// Let's add/set data:

		prop.setProperty("DataKeynew", "Data Value");
		System.out.println(prop.getProperty("Data Key"));

		FileOutputStream fos = new FileOutputStream("C:\\testing\\prop1.properties");
		prop.store(fos, "Any message we can type here.");

	}

}
