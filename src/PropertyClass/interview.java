package PropertyClass;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class interview {
	public static void main(String[] args) throws IOException {

		// prints the word with second highest repititions that has length greater than
		// 4
	System.out.println(Macbeth("macbeth.txt"));

	}

	public static String Macbeth(String macbethtxtFile) throws IOException {
		FileReader rd = new FileReader(macbethtxtFile);
		BufferedReader bf = new BufferedReader(rd);
		String[] str = null;
		List<String> some = new ArrayList<>();
		String temp = bf.readLine();
		while (temp != null) { // readLine
			str = (temp.split(",")); // read and split by ", . ! ? - " and into array
			temp = bf.readLine();
		}
		some = Arrays.asList(str);
		//combine list to map , assgin word to key , and find how many time occur, and only load witch more than 4 character 
		Map<String, Integer> map = new HashMap<>();
		for (String string : some) {

			if (map.get(string) == null && string.length() > 4) {
				map.put(string, 1);
			}

			else if (map.get(string) != null && string.length() > 4) {
				map.put(string, map.get(string) + 1);
			}
		}
		int max = -1;
	
		// find key with largest number of repititons
		for (Entry<String, Integer> each : map.entrySet()) {
			if (each.getValue() > max)
				max = each.getValue();
		}
		int secondMax = -1;
		String secondKey = "";

		// find key with second largest number of repititons
		for (Entry<String, Integer> each : map.entrySet()) {
			if (each.getValue() > secondMax & each.getValue() != max) {// get second max count
				secondMax = each.getValue();
				secondKey = each.getKey();
			}
		}
		return  secondKey+",times -->"+secondMax;
	}
}