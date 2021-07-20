package com.practice;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value:");
		int num=sc.nextInt();
		System.out.println("Output is:");
		for (int i = 1; i <= num; i++) {
			for (int j = num; j >i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
	}
}
