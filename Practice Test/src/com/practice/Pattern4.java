package com.practice;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the Alphabet Number");
		int alphabet=sc.nextInt();
		System.out.println("Enter the Number to Print Pattern2");
		int number=sc.nextInt();
		for (int i = 1; i <=number; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print((char)(alphabet+i-1)+" ");
			}
			System.out.println();
			
		}
	}
}
