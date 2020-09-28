package CodingChallange;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class findDuplicateEle {

	public static void main(String[] args) {
		String name[] = { "Java", "python", "JavaScrip", "Java", "c#", "A", "C", "B", "A", "Java", "A" };
		printDuplicateWithMap(name);
		loopFindOut(name);
		System.out.println("---------------");
		usingSet(name);
	}

	// find out duplicate and print times repeat
	public static void printDuplicateWithMap(String[] name) {
		Map<String, Integer> map = new HashMap<>();
		for (String string : name) {
			if (map.containsKey(string)) {
				map.put(string, map.get(string) + 1);
			} else {
				map.put(string, 1);
			}
		}
		System.out.println(map);
	}

	// Bad scenario but it work
	public static void loopFindOut(String[] name) {
		for (int i = 0; i < name.length; i++) {
			for (int j = i + 1; j < name.length; j++) {
				if (name[i].equals(name[j])) {
					System.out.println("Duplicate ele::" + name[i]);
				}
			}
		}
	}

	// using Hash Set
	public static void usingSet(String[] name) {

		Set<String> store = new HashSet<>();
		for (String string : name) {
			if (store.add(string) == false) {
				System.out.println("duplicate::" + string);
			}
		}
	}
	
	public static int[] eliminateDuplicates(int[] list) {
		int newLength = list.length;
		// find length w/o duplicates:
		for (int i = 1; i < list.length; i++) {
			for (int j = 0; j < i; j++) {
				if (list[i] == list[j]) { // if duplicate founded then decrease length by 1
					newLength--;
					break;
				}
			}
		}

		int[] newArray = new int[newLength]; // create new array with new length
		newArray[0] = list[0]; // 1st element goes to new array
		int inx = 1; // index for 2nd element of new array
		boolean isDuplicate;

		for (int i = 1; i < list.length; i++) {
			isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (list[i] == list[j]) { // if duplicate founded then change boolean variable and break
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) { // if it's not duplicate then put it to new array
				newArray[inx] = list[i];
				inx++;
			}
		}
		return newArray;
	}
}
