package PropertyClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configoderTest {
	private static Properties pro;
	static {
		 pro= new Properties();
	}
		
	public static String getMyValue(String key) {
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
		String value=prop.getProperty(key);
		return value;	
	
	}
}
