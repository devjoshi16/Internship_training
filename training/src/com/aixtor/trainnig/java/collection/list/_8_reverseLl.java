package com.aixtor.trainnig.java.collection.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class _8_reverseLl {

	public static void main(String[] args) {

		        LinkedList<Integer> l = new LinkedList<Integer>();

		        l.add(1);
		        l.add(2);
		        l.add(3);
		        l.add(4);
		        l.add(5);
		        System.out.println(l);

		        LinkedList<Object> lrev= new LinkedList<Object>();

		        ListIterator litr = l.listIterator(l.size());

		        while (litr.hasPrevious()) {
		            lrev.add(litr.previous());
		        }
		        System.out.println(lrev);
		    
		
	}

}
