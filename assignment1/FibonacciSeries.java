package com.bellinfo.assignment1;
import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String args[])
	{
		int i,j,x=1,y=1,z=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a range for fibonacci series");
		i=sc.nextInt();
		for(j=0;j<i;j++)
		{
		 x=y;
		 y=z;
		 z=x+y;
		 System.out.println(z);
		}
	
	}

}
