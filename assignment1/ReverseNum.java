package com.bellinfo.assignment1;
import java.util.Scanner;
public class ReverseNum {
	public static void main(String args[])
	{
		int i,reverse=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to be reversed");
		i=sc.nextInt();
		int j=i;
		while(j>0)
		{
			reverse=reverse*10;
			reverse=reverse+j%10;
			j=j/10;
		}
		System.out.println("Reverse of "+i+" is "+reverse);
	}

}

