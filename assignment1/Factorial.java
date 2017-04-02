package com.bellinfo.assignment1;
import java.util.Scanner;
public class Factorial {
	public static void main(String args[])
	{
	int i,factorial=1,x;
	Scanner sc=new Scanner(System.in);
	i=sc.nextInt();
	for(x=i;x>0;x--)
	{
		factorial=factorial*x;
	}
	System.out.println(factorial);
	}

}
