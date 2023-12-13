package training;

import java.util.Scanner;

public class _2_BubbleSort {
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void bubblesort(int []arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = new int[10];

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		bubblesort(arr);
		System.out.println("shorted");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
