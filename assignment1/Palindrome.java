package com.bellinfo.assignment1;
import java.util.Scanner;
public class Palindrome {
	public static void main(String args[])
	{
	int i,reverse=0,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to check if it is Palindrome or not");
	i=sc.nextInt();
	j=i;
	while(i>0)
	{
		reverse=reverse*10;
		reverse=reverse+i%10;
		i=i/10;
	}
	if (reverse==j)
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not a palindrome");
	}
	}
	

}

