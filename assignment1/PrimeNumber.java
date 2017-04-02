package com.bellinfo.assignment1;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String args[])
	{
		int i,x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check if it is prime or not");
		i=sc.nextInt();
		for (x=1;x<i;x++)
		{
			if (i%x==0)
			{
				System.out.println("Not a Prime number");
				break;
			}
			else
			{
				System.out.println("Prime number");
				break;
			}
		}
	}
}
