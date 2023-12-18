package com.aixtor.trainnig.java.collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class _7_comparable {

	public static void main(String[] args) {


		ArrayList<Student> arrayList=new ArrayList<Student>();
		arrayList.add(new Student(23, "rohan"));
		arrayList.add(new Student(33, "dev"));
		arrayList.add(new Student(33, "dev"));
		arrayList.add(new Student(53, "sunny"));
		Collections.sort(arrayList);
		System.out.println(arrayList);
		
	}

}
