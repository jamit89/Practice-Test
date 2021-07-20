package com.practice;

import java.util.Scanner;

public class CalculateAreaPerimeter {
	public static void main(String args[])
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Value:");
			double radius=sc.nextDouble();
			//formula always remember
			double perimeter = 2 * Math.PI * radius;
		    double area = Math.PI * radius * radius;
		    System.out.println("Perimeter is:"+perimeter);
		    System.out.println("Area is:"+area);
	}

}
