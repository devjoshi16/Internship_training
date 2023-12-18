package com.aixtor.trainnig.java.basics;

import java.util.ArrayList;
import java.util.Iterator;

public class _7_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			arrayList.add(i);
		}
		System.out.println("print through iteratorA");
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
			
		}
	}
}
