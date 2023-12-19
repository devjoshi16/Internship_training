package com.aixtor.trainnig.java.factory_pattern.factory_pattern;

import com.aixtor.trainnig.java.factory_pattern.singleton_factory.Vehical;

public class Car implements Vehical {

	@Override
	public void function() {
		
		System.out.println("Car running");
	}
}
