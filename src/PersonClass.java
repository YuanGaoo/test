

import java.util.HashSet;
import java.util.Set;

public class PersonClass {
	public String name;
	public int age;
	
	
	public PersonClass(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}


	public static void main(String[] args) {
	Set<PersonClass> personSet= new HashSet<>();
		personSet.add(new PersonClass("adam", 33));
		personSet.add(new PersonClass("adam", 33));
		personSet.add(new PersonClass("adam", 33));
		personSet.add(new PersonClass("adam", 33));
		personSet.add(new PersonClass("adam", 33));
		System.out.println(new PersonClass("adam", 33));
		System.out.println(new PersonClass("adam", 33));

		

	}

}
