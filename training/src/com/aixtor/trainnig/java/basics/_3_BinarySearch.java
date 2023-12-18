package com.aixtor.trainnig.java.basics;

import java.util.Scanner;

public class _3_BinarySearch {
	public static void bubblesort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;

			if (arr[mid] == x)
				return mid;

			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			return binarySearch(arr, mid + 1, r, x);
		}

		return -1;
	}

	public static void main(String[] args) {
		int arr[] = new int[10];

		System.out.println("Enter value in ascending order");
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println("enter value to find index");
		int value = scanner.nextInt();

		// check for order and sort if not in order

		bubblesort(arr);
		int index = binarySearch(arr, 0, arr.length - 1, value);
		System.out.println("Index of " + value + "is" + index);

	}

}
