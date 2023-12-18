package com.aixtor.trainnig.java.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


public class CustomException {

	public static void main(String[] args) throws IOException {

		try {
			BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

			// Custom integer array of size 10
			int num[] = new int[10];
			// Array of string type to store input
			String[] strNums;

			// Display message
			System.out.println("enter string of numbers");

			// Reading input a string
			strNums = bi.readLine().split(" ");
			Set<Integer> hashSet = new HashSet<Integer>();

			for (int i = 0; i < strNums.length; i++) {
				num[i] = Integer.parseInt(strNums[i]);

				if (hashSet.contains(num[i])) {

					throw new DuplicateNumberException("Duplicate");
				} else {
					hashSet.add(num[i]);
				}
			}
		} catch (DuplicateNumberException e) {

			System.out.println("Exception handled");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("done");

		}

	}

}

class DuplicateNumberException extends Exception {
	DuplicateNumberException(String str) {
		super(str);

		// calling the constructor of parent Exception
	}
}
