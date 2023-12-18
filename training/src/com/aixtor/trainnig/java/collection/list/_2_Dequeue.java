package com.aixtor.trainnig.java.collection.list;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

public class _2_Dequeue {

	public static void main(String[] args) {

		ArrayDeque<Integer> dl = new ArrayDeque<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter element");
		for (int i = 0; i < 5; i++) {
			int temp = scanner.nextInt();
			dl.add(temp);
		}
		int input;
		System.out.println("Enter \n 1 to add element\n" + " 2 for remove element \n " + "3 To delete all element \n "
				+ "0 to exit");

		input = scanner.nextInt();

		while (input != 0) {

			int subinput;

			switch (input) {
//		Enter 1 to add element

			case 1: {
				System.out.println("Enter \n 1 to add at first\n" + " 2 to add at last \n ");

				subinput = scanner.nextInt();
				switch (subinput) {
//				1 to add at first
				case 1: {
					System.out.println("Enter value \n");
					int value = scanner.nextInt();
					dl.addFirst(value);
					print(dl);

					System.out.println("Enter \n 1 to add element\n" + " 2 for remove element \n "
							+ "3 To delete all element \n " + "0 to exit");

					input = scanner.nextInt();
					break;
				}
//				2 to add at last
				case 2: {
					System.out.println("Enter value \n");
					int value = scanner.nextInt();
					dl.addLast(value);
					print(dl);

					System.out.println("Enter \n 1 to add element\n" + " 2 for remove element \n "
							+ "3 To delete all element \n " + "0 to exit");
					input = scanner.nextInt();
					break;
				}
				case 0:
				{
					break;
				}

				default:
				{
					break;
				}
				}

				break;
			}

//		3 for remove element

			case 2: {
				System.out.println("Enter \n 1 to remove at first\n" + " 2 to remove at last \n");

				subinput = scanner.nextInt();
				switch (subinput) {
//				1 to remove at first
				case 1: {

					dl.removeFirst();
					print(dl);

					System.out.println("Enter \n 1 to add element\n" + " 2 for remove element \n "
							+ "3 To delete all element \n " + "0 to exit");
					input = scanner.nextInt();
					break;
				}
//				2 to remove at last
				case 2: {
					dl.removeLast();
					print(dl);

					System.out.println("Enter \n 1 to add element\n" + " 2 for remove element \n "
							+ "3 To delete all element \n " + "0 to exit");

					input = scanner.nextInt();
					break;
				}

				default:
					break;
				}

				break;
			}
			case 3: {
				dl.clear();
				print(dl);
				break;
			}
			case 0:
			{
				break;
			}

			default: {
				System.out.println("Invalid input \n");
				System.out.println("Enter \n 1 to add element\n" + " 2 for remove element \n "
						+ "3 To delete all element \n " + "0 to exit");

				input = scanner.nextInt();
				break;
			}
			}
		}
		scanner.close();

	}

	public static void print(ArrayDeque<Integer> ll) {
		
		for (Iterator iterator = ll.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}

}
