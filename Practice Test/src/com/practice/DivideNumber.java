package com.practice;

import java.util.Scanner;

public class DivideNumber {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Number:");
		int num2=sc.nextInt();
		System.out.println("Divide By Value:");
		System.out.println(num1/num2);
	}
}
