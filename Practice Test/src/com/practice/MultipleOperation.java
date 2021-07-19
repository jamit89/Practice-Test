package com.practice;

import java.util.Scanner;

public class MultipleOperation {
	
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Number:");
		int num2=sc.nextInt();
		System.out.println("Total is:");
		int num3=num1+num2;
		int num4=num1-num2;
		int num5=num1*num2;
		int num6=num1/num2;
		int num7=num1%num2;
		System.out.println(num1+"+"+num2+" = "+num3);
		System.out.println(num1+"-"+num2+" = "+num4);
		System.out.println(num1+"*"+num2+" = "+num5);
		System.out.println(num1+"/"+num2+" = "+num6);
		System.out.println(num1+"%"+num2+" = "+num7);
		
	}

}
