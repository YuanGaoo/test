package PropertyClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configloader {
	public static void main(String[] args) {
		
		Properties prop = new Properties();
		try {
			FileInputStream fils= new FileInputStream("config.properties");
			prop.load(fils);
			System.out.println(prop);
		} 
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value=prop.getProperty("fairfax");
		System.out.println(value);
		
	}
}
