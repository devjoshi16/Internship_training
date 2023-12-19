package com.aixtor.trainnig.java.factory_pattern.abstract_pattern;

import java.util.Scanner;

public class CompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String str =scanner.next();
		FactoryPattern factoryPattern=new FactoryPattern();
		Company company=factoryPattern.getInstace(str);
		company.name();
				
	}

}
