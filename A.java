package com.programmes;

import java.util.Scanner;

public class A {

	public static void main(String[] args)
	
	{
		int age;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your age:");
		age=sc.nextInt();
		try {
		if(age<21|| age>60)
		{
			System.out.println("invalid");
		}
		else
		{
			System.out.println("valid age");
		}
		
		}
		catch(Exception e)
		{
			System.out.println("enter valid age");
			
		}
	}
	
	
}
