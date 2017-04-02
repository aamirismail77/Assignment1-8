package com.bellinfo.assignment1;
import java.util.Scanner;
public class Min4Num {
	public static void main(String args[])
	{
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 4 numbers to find minimum of them");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		if ((a<b)&&(a<c)&&(a<d))
		{
		System.out.println(a+" is minimum");	
		}
		else if((b<a)&&(b<c)&&(b<d))
		{
		System.out.println(b+" is minimum");	
		}
		else if((c<a)&&(c<b)&&(c<d))
		{
		System.out.println(c+" is minimum");	
		}
		else //if((d<a)&&(d<c)&&(d<b))
		{
		System.out.println(d+" is minimum");	
		}
	}

}
