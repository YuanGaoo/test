package ComparingObjects;

public class Person implements Comparable<Person>{
	String name;
	int age;
	@Override
	public int compareTo(Person o) {
		
		//return this.name.compareTo(o.name);
		if(this.name.equals(o.name))
			return o.age- this.age;
		return this.name.compareTo(o.name);
	
	}
	
	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
	

}
