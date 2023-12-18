package com.aixtor.trainnig.java.basics;

import java.util.Arrays;


public class _4_CopyArray {

	public static void main(String[] args) {

		int []arr= {1,2,3,4,5};
//		method1
		int []arr2=new int[arr.length];
		int []arr3=new int[arr.length];
		int []arr4=new int[arr.length];
		int []arr5=new int[arr.length];
		
		
		for (int i = 0; i < arr.length; i++) {
			arr2[i]=arr[i];
		
		}
//		metod 2
		arr2=arr.clone();
		
//		method3
		System.arraycopy(arr, 0, arr3, 0, arr.length);
		
//		method3
		arr4=Arrays.copyOf(arr, arr.length);
		
//		method4
		arr5=Arrays.copyOfRange(arr, 0, arr.length);
		
		System.out.println("\narray 1");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println("\narray 2");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]); 
		}
		System.out.println("\narray 3");
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]);
		}
		System.out.println("\narray 4");
		for (int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i]);
		}
		System.out.println("\narray 5");
		for (int i = 0; i < arr5.length; i++) {
			System.out.print(arr5[i]);
		}
		String dg;
		String xx=new String();
		System.out.println("null"+xx.equals(""));
	}

	
	
	
	
	}
