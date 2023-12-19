package com.aixtor.trainnig.java.factory_pattern.factory_pattern;

public class FactoryPattern {

	public Vehical name(String str) {
		if(str.equals("bike"))
		{
			return (Vehical) new Bike();
		}else if(str.equals("car")) {
			return (Vehical) new Car();
		}
		return null;
	}
	

}
