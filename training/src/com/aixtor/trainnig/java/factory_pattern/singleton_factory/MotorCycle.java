package com.aixtor.trainnig.java.factory_pattern.singleton_factory;

public class MotorCycle implements Vehical{
	private static MotorCycle obj1;
	
	private MotorCycle()
	{
	}
	public static Vehical getInstance() {
		if(obj1==null)
		{
			System.out.println("new bike object created");
			return obj1 =new MotorCycle();
		}
		System.out.println("old bike object returned");

		return obj1;
	}
	@Override
	public void function() {

		System.out.println("Bike running");
	}
}
