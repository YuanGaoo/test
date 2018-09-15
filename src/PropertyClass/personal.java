package PropertyClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class personal {
public static void main(String[] args) {
	Properties per= new Properties();
	
	try {
		FileInputStream flin= new FileInputStream("yuan.properties");
		per.load(flin);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(per);
	Set<Entry<Object, Object>> set = per.entrySet();
	for (Entry<Object, Object> entry : set) {
		System.out.print("key---->"+entry.getKey());
		System.out.println(",value--->"+entry.getValue());
		
	}
	System.out.println(per.getProperty("eat"));

	
}
}
