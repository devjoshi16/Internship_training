package com.aixtor.trainnig.java.factory_pattern.singleton_factory;

import java.util.Scanner;


public class VehicalMain {

	public static void main(String[] args) {


		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter bike or car");
		String str =scanner.next();
		
		FactoryPattern factoryPattern=new FactoryPattern();
		
		Vehical vehical= factoryPattern.name(str);
		Vehical car= factoryPattern.name("car");
		Vehical bike= factoryPattern.name("bike");
		
		
		vehical.function();
		car.function();
		bike.function();
		scanner.close();
	}

}
