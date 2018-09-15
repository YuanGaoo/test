package PropertyClass;

import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class propertyClass {
	public static void main(String[] args) {
		Properties prop= new Properties();
		prop.setProperty("Tyson","20282");
		prop.setProperty("Fairfax","22030");
		prop.setProperty("Centreville","20120");
		prop.setProperty("Dulutu", "30096");
		prop.getProperty("china", "10086");
	
			Set<Entry<Object, Object>> set = prop.entrySet();
			for (Entry<Object, Object> entry : set) {
			System.out.print("key--->"+entry.getValue());
			System.out.println("value-->"+entry.getKey());
			}
		System.out.println(prop);
		
		
		System.out.println(prop.getProperty("Tyson"));
		
	}
}
