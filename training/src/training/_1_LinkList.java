package training;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class _1_LinkList {

	public static void printall(LinkedList<Integer> ll) {

//	Access element
		System.out.println("Access through for loop");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		System.out.println("Access through iterator");
		for (Iterator iterator = ll.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}

		System.out.println("Access through listIterator");
		ListIterator<Integer> listIterator = ll.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());

		}

		System.out.println("Access through foreach");
		for (Integer integer : ll) {
			System.out.println(integer);
		}

		System.out.println("Access through foreach method");
		ll.forEach((element) -> System.out.println(element));

		System.out.println("Access through foreachRemaining method");
		Iterator<Integer> iterator = ll.iterator();
		iterator.forEachRemaining((element) -> System.out.println(element));

	}

	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter element");
		for (int i = 0; i < 5; i++) {
			int temp = scanner.nextInt();
			ll.add(temp);
		}
		int input;
		System.out.println("Enter \n 1 to add element\n" + " 2 to replace element \n " + "3 for remove element \n "
				+ "4 To delete all element \n " + "5 to reverse list\n" + " 0 to exit");

		input = scanner.nextInt();

		while (input != 0) {

			int subinput;

			switch (input) {
//		Enter 1 to add element

			case 1: {
				System.out.println("Enter \n 1 to add at first\n" + " 2 to add at last \n " + "3 to add at index \n");

				subinput = scanner.nextInt();
				switch (subinput) {
//				1 to add at first
				case 1: {
					System.out.println("Enter value \n");
					int value = scanner.nextInt();
					ll.addFirst(value);
					print(ll);

					System.out.println(
							"Enter \n 1 to add element\n" + " 2 to replace element \n" + "3 for remove element \n "
									+ "4 To delete all element \n " + "5 to reverse list\n" + " 0 to exit");

					input = scanner.nextInt();
					break;
				}
//				2 to add at last
				case 2: {
					System.out.println("Enter value \n");
					int value = scanner.nextInt();
					ll.addLast(value);
					print(ll);

					System.out.println(
							"Enter \n 1 to add element\n" + " 2 to replace element \n" + "3 for remove element \n "
									+ "4 To delete all element \n " + "5 to reverse list\n" + " 0 to exit");

					input = scanner.nextInt();
					break;
				}
//				3 to add at index
				case 3: {
					System.out.println("Enter Index \n");
					int index = scanner.nextInt();
					System.out.println("Enter value \n");
					int value = scanner.nextInt();
					add_at(ll, value, index);
					print(ll);

					System.out.println(
							"Enter \n 1 to add element\n" + " 2 to replace element\n " + "3 for remove element \n "
									+ "4 To delete all element \n " + "5 to reverse list\n" + " 0 to exit");

					input = scanner.nextInt();
					break;
				}

				default:
					break;
				}

				break;
			}
//		 2 to replace element 

			case 2: {
				System.out.println(
						"Enter \n 1 to replace at first\n" + " 2 to replace at last\n " + "3 to replace at index \n");

				subinput = scanner.nextInt();
				switch (subinput) {
//				1 to replace at first
				case 1: {

					System.out.println("Enter value \n");
					int value = scanner.nextInt();
					ll.set(0, value);
					print(ll);

					System.out.println(
							"Enter \n 1 to add element\n" + " 2 to replace element\n " + "3 for remove element \n "
									+ "4 To delete all element \n " + "5 to reverse list\n" + " 0 to exit");

					input = scanner.nextInt();
					break;
				}
//				2 to replace at last
				case 2: {
					System.out.println("Enter value \n");
					int value = scanner.nextInt();
					ll.set(ll.size() - 1, value);
					print(ll);

					System.out.println(
							"Enter \n 1 to add element\n" + " 2 to replace element\n " + "3 for remove element \n "
									+ "4 To delete all element \n " + "5 to reverse list\n" + " 0 to exit");

					input = scanner.nextInt();
					break;
				}
//				3 to replace at index
				case 3: {
					System.out.println("Enter value \n");
					int value = scanner.nextInt();
					System.out.println("Enter Index \n");
					int index = scanner.nextInt();
					ll.set(index, value);
					print(ll);

					System.out.println(
							"Enter \n 1 to add element\n" + " 2 to replace element\n " + "3 for remove element \n "
									+ "4 To delete all element \n " + "5 to reverse list\n" + " 0 to exit");

					input = scanner.nextInt();

					break;
				}
				case 0: {
					break;
				}

				default:
					break;
				}

				break;
			}
//		3 for remove element

			case 3: {
				System.out.println(
						"Enter \n 1 to remove at first\n" + " 2 to remove at last\n " + "3 to remove at index \n");

				subinput = scanner.nextInt();
				switch (subinput) {
//				1 to remove at first
				case 1: {

					ll.removeFirst();
					print(ll);

					System.out.println(
							"Enter \n 1 to add element\n" + " 2 to replace element\n " + "3 for remove element \n "
									+ "4 To delete all element \n " + "5 to reverse list\n" + " 0 to exit");

					input = scanner.nextInt();
					break;
				}
//				2 to remove at last
				case 2: {
					ll.removeLast();
					print(ll);

					System.out.println(
							"Enter \n 1 to add element\n" + " 2 to replace element\n " + "3 for remove element \n "
									+ "4 To delete all element \n " + "5 to reverse list\n" + " 0 to exit");

					input = scanner.nextInt();
					break;
				}
//				3 to remove at index
				case 3: {
					System.out.println("Enter Index \n");
					int index = scanner.nextInt();
					ll.remove(index);
					print(ll);
					System.out.println(
							"Enter \n 1 to add element\n" + " 2 to replace element\n " + "3 for remove element \n "
									+ "4 To delete all element \n " + "5 to reverse list\n" + " 0 to exit");

					input = scanner.nextInt();
					break;
				}

				default:
					break;
				}

				break;
			}
			case 4: {
				ll.clear();
				print(ll);
				System.out.println(
						"Enter \n 1 to add element\n" + " 2 to replace element \n" + "3 for remove element \n "
								+ "4 To delete all element \n " + "5 to reverse list\n" + " 0 to exit");

				input = scanner.nextInt();
				break;
			}
			case 5: {
				reverse_list(ll);
				print(ll);
				System.out.println(
						"Enter \n 1 to add element\n" + " 2 to replace element \n" + "3 for remove element \n "
								+ "4 To delete all element \n " + "5 to reverse list\n\n" + " 0 to exit");

				input = scanner.nextInt();
				break;
			}
			case 0:
				break;

			default: {
				System.out.println("Invalid input \n");
				System.out.println(
						"Enter \n 1 to add element\n" + " 2 to replace element \n" + "3 for remove element \n "
								+ "4 To delete all element \n " + "5 to reverse list\n" + " 0 to exit");

				input = scanner.nextInt();
				break;
			}
			}
		}

	}

	public static void print(LinkedList<Integer> ll) {
		for (Iterator iterator = ll.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}

	public static void reverse_list(LinkedList<Integer> ll) {

		Collections.reverse(ll);
	}

	public static void add_at(LinkedList<Integer> ll, int value, int index) {
		ll.add(index, value);
	}

}
