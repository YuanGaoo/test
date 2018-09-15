package ComparingObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class RunnerClass {
	public static void main(String[] args) {
//	    List<Student> people = new ArrayList<>();
//	     people.add(new Student(1,"Adam"));
//	     people.add(null);
//	     people.add(new Student(5,"Dave"));
//	     people.add(new Student(4,"Zain"));
//	     people.add(new Student(2,"Bob"));
//	     String num="1";
//	     String num1=null;
//	     String num3="3";
//	     String num4="2";
	   //  System.out.println(num.compareTo(num1));
		Comparator<Student> id= new IdComparator();
	    Comparator<Student> name= new lasCharComparator();
	    Comparator<Student> bothCom= id.thenComparing(name);
	    TreeSet<Student> student= new TreeSet<>(bothCom);
	    student.add(new Student(1, "Adam"));
	    student.add(new Student(2, "Zod"));
	    student.add(new Student(2, "Superman"));
	    student.add(new Student(4, "Batmanx"));
	    student.add(new Student(5, "Zob"));
	    
	    System.out.println(student);
	      	   
	 
	}

}

class lasCharComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}



