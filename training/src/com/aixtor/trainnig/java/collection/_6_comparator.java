package com.aixtor.trainnig.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _6_comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Comparator<Student> com = (o1, o2) -> o1.id < o2.id ? -1 : 1;
//
//		ArrayList<Student> arrayList = new ArrayList<Student>();
//		arrayList.add(new Student(2, "dev"));
//		arrayList.add(new Student(43, "dskfa"));
//		arrayList.add(new Student(34, "sdmklmd"));
//
//		Collections.sort(arrayList, com);
//		System.out.println(arrayList);

		Comparator<Integer> com = (val1, val2) -> val1 > val2 ? -1 : 1;
//		Comparator<Integer> com =new Comparator<Integer>() {
//			
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o1 > o2 ? -1 : 1;
//			}
//		};

		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(4);

		Collections.sort(arrayList, com);
		System.out.println(arrayList);

	}

}

class Student implements Comparable<Student> {
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
		return this.id < o.id ? -1 : 1;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int ans = this.id * prime;
		ans = ans + name.hashCode();
		return ans;

	}

}