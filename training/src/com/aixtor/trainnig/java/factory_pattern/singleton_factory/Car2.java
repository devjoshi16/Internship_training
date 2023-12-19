package com.aixtor.trainnig.java.factory_pattern.singleton_factory;


public class Car2 implements Vehical {

	@Override
	public void function() {

		System.out.println("Car running");
	}
	private static Car2 obj1;

	private Car2() {
		// TODO Auto-generated constructor stub
	}


	public static Vehical getInstance() {
		if (obj1 == null)
		{
			System.out.println("new car object created");
			
			return obj1=new Car2();
		}
		System.out.println("old car object returned");

		return obj1;
	}
}
