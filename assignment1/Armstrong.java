package com.bellinfo.assignment1;
import java.util.Scanner;
public class Armstrong {
	public static void main(String args[])
	{
		int i,x=0,extnum=0,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check if it is armstrong or not");
		i=sc.nextInt();
		j=i;
		while(i>0)
		{
			extnum=i%10;
			x=x+(extnum*extnum*extnum);
			i=i/10;
		}
		System.out.println(x);
		
		if (x==j)
		{
			System.out.println("The number is Armstrong");
		}
		else
		{
			System.out.println("The number is not an Armstrong");
		}
	}

}
