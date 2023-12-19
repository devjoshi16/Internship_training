package com.aixtor.trainnig.java.factory_pattern.singleton_factory;

public class FactoryPattern {

	public Vehical name(String str) {
		if(str.equals("bike"))
		{
			return MotorCycle.getInstance();
		}else if(str.equals("car")) {
			return Car2.getInstance();
		}
		return null;
	}
	

}
