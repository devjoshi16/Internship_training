package com.aixtor.trainnig.java.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class _0_ArrayLsit {

	public static void main(String[] args) {

//		Initialization

//		Add element
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of list");
		int n = scanner.nextInt();
		ArrayList<Integer> arrayList = new ArrayList<Integer>(n);
		System.out.println("Enter element");
		for (int i = 0; i < n; i++) {
			int temp = scanner.nextInt();
			arrayList.add(temp);
		}
		
//		Access element
		System.out.println("Access through for loop");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

		System.out.println("Access through iterator");
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}

		System.out.println("Access through listIterator");
		ListIterator<Integer> listIterator = arrayList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());

		}

		System.out.println("Access through foreach");
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}

		System.out.println("Access through foreach method");
		arrayList.forEach((element) -> System.out.println(element));	

		System.out.println("Access through foreachRemaining method");
		Iterator<Integer> iterator = arrayList.iterator();
		iterator.forEachRemaining((element) -> System.out.println(element));

		System.out.println("Enter \n 1 to add element\n 2 to replace element \n 3 for remove element \n 4 To delete all element \n 0 to exit");
		int input;
		input = scanner.nextInt();

		while (input != 0) {

			switch (input) {
			case 0: {

				break;
			}
			case 1: {
				System.out.println("Enter index on which you like to add");
				int index = scanner.nextInt();
				System.out.println("Enter value");
				int value = scanner.nextInt();
				arrayList.add(index, value);
				print(arrayList);
				System.out.println("Enter \n 1 to add element\n 2 to replace element \n 3 for remove element \n 4 To delete all element \n 0 to exit");
				input = scanner.nextInt();

				break;

			}
			case 3: {
				System.out.println("Enter Element value to delete");
				int value = scanner.nextInt();
				if (arrayList.contains(value)) {
					arrayList.remove(arrayList.indexOf(value));
				} else {
					System.out.println("element does not exist");
				}
				print(arrayList);
				System.out.println("Enter \n 1 to add element\n 2 to replace element \n 3 for remove element \n 4 To delete all element \n 0 to exit");
				input = scanner.nextInt();
				break;
			}
			case 2: {
				System.out.println("Enter Element value to replace");
				int value = scanner.nextInt();
				System.out.println("enter new value:");
				int value_new = scanner.nextInt();
				arrayList.set(arrayList.indexOf(value), value_new);
				print(arrayList);
				System.out.println("Enter \n 1 to add element\n 2 to replace element \n 3 for remove element \n 4 To delete all element \n 0 to exit");
				input = scanner.nextInt();
				break;

			}
			case 4:
			{
				arrayList.clear();
				break;
			}
			default:
				System.out.println("Invalid operation");
				System.out.println("Enter \n 1 to add element\n 2 to replace element \n 3 for remove element \n 4 To delete all element \n 0 to exit");
				input = scanner.nextInt();
				break;
			}
		}

	}
	public static void print(ArrayList<Integer> arrayList) {
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
	}
	
	
}
