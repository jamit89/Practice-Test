package com.practice;

import java.util.Scanner;

public class DiamondStarPattern {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value:");
		int num=sc.nextInt();
		System.out.println("Output is:");
		for (int i = 1; i <= num; i++) 
        { 
                for (int j = num; j > i; j--)
	{
		System.out.print(" ");
	}
	for (int k = 1; k <= (i * 2) - 1; k++) 
                { 
                        System.out.print("*"); 
                } 
                System.out.println(); 
        } 
		for (int i = num - 1; i >= 1; i--)
		{
			for (int j = num - 1; j >= i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= (i * 2) - 1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
