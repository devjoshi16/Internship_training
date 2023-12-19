package com.aixtor.trainnig.java.sreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(5);
		list.add(2);
		System.out.println("Count of stream:");

		Stream<Integer> stream = list.stream();
		System.out.print(stream.count());
		System.out.println("\nSorted stream:");

		
		stream = list.stream().sorted();
		stream.forEach(n -> System.out.print(n+" "));
		System.out.println("\nStream to list:");

		
		stream = list.stream();
		List llList = stream.toList();
		System.out.print(llList);
		System.out.println("\ncheck stream with list:");

		
		stream = list.stream();
		System.out.print(list.stream().equals(list));	
		System.out.println("\nskip 2 element:");

		

		
		stream = list.stream().skip(2);
		stream.forEach(s -> System.out.print(s+" "));
		System.out.println("\nmap operation of square:");

		
	
		stream = list.stream();
		List number = Arrays.asList(2, 3, 4, 5);

		List<Integer> ll = list.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.print(ll);
		
		System.out.println("");

//		List<Integer> evenl = ll.stream().filter(x -> x % 2 == 0).toList();
		int even = ll.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);

		System.out.println("addition of even element:");
		System.out.print(even);
	}

}
