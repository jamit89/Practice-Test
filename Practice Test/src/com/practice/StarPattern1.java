package com.practice;

import java.util.Scanner;

public class StarPattern1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value:");
		int num=sc.nextInt();
		System.out.println("Output is:");
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
