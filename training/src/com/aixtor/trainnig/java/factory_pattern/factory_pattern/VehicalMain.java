package com.aixtor.trainnig.java.factory_pattern.factory_pattern;

import java.util.Scanner;

public class VehicalMain {

	public static void main(String[] args) {


		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter bike or car");
		String str =scanner.next();
		FactoryPattern factoryPattern=new FactoryPattern();
		Vehical vehical= factoryPattern.name(str);
		vehical.function();
	}

}
