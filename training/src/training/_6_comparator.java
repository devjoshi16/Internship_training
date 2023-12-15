package training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class _6_comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Student> com = (o1, o2) -> o1.id < o2.id ? -1 : 1;

		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(2, "dev"));
		arrayList.add(new Student(43, "dskfa"));
		arrayList.add(new Student(34, "sdmklmd"));

		Collections.sort(arrayList, com);
		System.out.println(arrayList);

	}

}

class Student implements Comparable<Student>{
	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public int compareTo(Student o) {
			return this.id<o.id?-1:1;
		 
	}



}