package com.practice;

import java.util.Iterator;
import java.util.Scanner;

public class Tables {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=sc.nextInt();
		System.out.println("Expected Output is:");
		for (int i = 1; i <=10; i++) {
	        System.out.println(num+" * "+i+" = "+(num*i));
		}
		
	}

}
