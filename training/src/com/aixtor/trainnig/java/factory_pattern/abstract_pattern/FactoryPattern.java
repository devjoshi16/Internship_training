package com.aixtor.trainnig.java.factory_pattern.abstract_pattern;

//public class FactoryPattern implements factory_interface{
	public class FactoryPattern extends FactoryAbstract{


	public Company getInstace(String str) {
		if(str.equals("aixtor"))
			return new Aixtor();
		else if(str.equals("google"))
			return new Google();
		return null;
	}

	

	

	
}
