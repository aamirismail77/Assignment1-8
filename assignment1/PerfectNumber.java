package com.bellinfo.assignment1;
import java.util.Scanner;
public class PerfectNumber {
	public static void main(String args[])
	{
		int i,j,x=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check if it is Perfect or not");
		i=sc.nextInt();
		for(j=1;j<i;j++)
		{
			if(i%j==0)
			{
				x=x+j;
			}
		}
		System.out.println(i);
		System.out.println(x);
		if(i==x)
		{
			System.out.println("It's a perfect number");
		}
		else
		{
			System.out.println("It's not a perfect number");
		}
	}
	

}
