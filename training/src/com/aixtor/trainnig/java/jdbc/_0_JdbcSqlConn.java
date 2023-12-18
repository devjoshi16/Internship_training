package com.aixtor.trainnig.java.jdbc;

import java.sql.*;
import java.util.Scanner;

class _0_JdbcSqlConn {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
			Statement statement;
			statement = connection.createStatement();

//			 create table

//			int result;
//			result=statement.executeUpdate("CREATE TABLE Persons ( PersonID int,LastName varchar(255),FirstName varchar(255),Address varchar(255),City varchar(255));");
//			
//			if(result==1)
//				System.out.println("table created successfully");

//			Add tuples

//            int result;
//            result=statement.executeUpdate("INSERT INTO employee_details  VALUES (102, 'dev', '2008-11-11', 'gujarat', 1);"); 
//
//            if (result==1)
//            	System.out.println("inserted successfuly");

//Query execute
			ResultSet resultSet;
			resultSet = statement.executeQuery("select * from employee_details;");
			int code;
			String title;
			Date date;
			String stateString;
			int department_id;
			System.out.println("id:\tname:\tdate:\tstate:\tdepartment_id:\t");
			while (resultSet.next()) {
				code = resultSet.getInt("employee_id");
				title = resultSet.getString("employee_name").trim();
				date = resultSet.getDate("dob");
				stateString = resultSet.getString("state");
				department_id = resultSet.getInt("department_id");

				System.out.println(code + " \t" + title + "\t " + date + "\t " + stateString + " \t" + department_id);
			}
			System.out.println("Enter any one name of department \n 1.hr \n 2.developer \n 3.account \n 4.admin");
			Scanner scanner=new Scanner(System.in);
			String str=scanner.next().toLowerCase();
			
			System.out.println("\nfetch based on department \n");
			
			resultSet = statement.executeQuery("select * from employee_details where department_id = (select department_id from department where name='"+str+"');");
			System.out.println("id:\tname:\tdate:\tstate:\tdepartment_id:\t");
			while (resultSet.next()) {
				code = resultSet.getInt("employee_id");
				title = resultSet.getString("employee_name").trim();
				date = resultSet.getDate("dob");
				stateString = resultSet.getString("state");
				department_id = resultSet.getInt("department_id");

				System.out.println(code + " \t" + title + "\t " + date + "\t " + stateString + " \t" + department_id);
			}
			resultSet.close();
			statement.close();
			connection.close();
		} catch (Exception exception) {
			System.out.println(exception);
		}

	}

}
