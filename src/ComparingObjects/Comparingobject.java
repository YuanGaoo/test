package ComparingObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import YouTubeClass.Collection;

public class Comparingobject {


	public static void main(String[] args) {
			List<String> name=Arrays.asList("adam","adam","bob","davie","bob");
			
			Collections.sort(name);
			List<Person> people= new ArrayList<>();
				people.add(new Person("Adam", 22));
				people.add(new Person("Odam", 25));
				people.add(new Person("Bob", 88));
				people.add(new Person("Eavie", 19));
				people.add(new Person("Bob", 44));
				
				Collections.sort(people);
			//	System.out.println(people);
					
			String s1="A";
			String s2="B";
			String s3="C";
			String s4="ee";
			String s5="ee";
			String s6="22";
			
			System.out.println(s1.compareTo(s4));
			//System.out.println(s1.compareTo(s3));
			
				
				
	}
}
