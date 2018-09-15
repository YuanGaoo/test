package HashMap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapDemo {
	static Map<String,String> countries;
	static String[] linefull;
	static List<String> key;
	static List<String> value;
	public static void main(String[] args) throws FileNotFoundException {
		FileReader fr= new FileReader("/Users/yuan/Downloads/MOCK_DATA-2.csv");
		BufferedReader bf= new BufferedReader(fr);
		
		Map<String,String> ma=new HashMap<>(readFile(bf));
		//Iterator<Map.Entry<String, String>>mat= (Iterator<Entry<String, String>>) ma.entrySet();
		Set<Entry<String, String>> set=ma.entrySet();
		Iterator<Entry<String, String>> it=set.iterator();
		while(it.hasNext()) {
			Map.Entry<String, String > me= it.next();
			String key=me.getKey();
			String value=me.getValue();
			System.out.println(key+" "+value);
		}
		System.out.println(ma);
		
	}
	public static Map<String,String> readFile(BufferedReader bf) {
		String line="";
		countries=new 	HashMap<String,String>();
		key= new ArrayList<>();
		value= new ArrayList<>();
		try {
			while((line=bf.readLine())!=null) {
				linefull=line.split(",");
			key.add(linefull[1]);
			value.add(linefull[0]);
			countries.put(linefull[1], linefull[0]);
			}
			return countries;
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return countries;
		
	}
}
