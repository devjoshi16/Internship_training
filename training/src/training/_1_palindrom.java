package training;

import java.util.Scanner;

public class _1_palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter value");
		Scanner scanner = new Scanner(System.in);
		int val1,val2;
		val1=scanner.nextInt();
		val2=0;
		int temp=val1;
		while(temp!=0)
		{
			val2=val2*10+temp%10;
			temp=temp/10;
			
		}
		if(val2==val1)
		{
			System.out.println("Given number is pallindrom");
		}
		else {
			System.out.println("Given number is not a pallindrom");
		}
	}

}
