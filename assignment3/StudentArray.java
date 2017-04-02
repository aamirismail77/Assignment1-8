package com.bellinfo.assignment3;

import java.util.Scanner;

public class StudentArray {
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter total number of students");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int id[] = new int[20];
		String name[] = new String[20];
		double fee[] = new double[20];
		char section[] = new char[20];
		for(int i=0;i<n;i++)
		{	
			System.out.println("Enter Student "+(i+1)+" id");
			id[i] = sc.nextInt();
			System.out.println("Enter Student "+(i+1)+" name");
			name[i] = sc.next();
			System.out.println("Enter Student "+(i+1)+" fee");
			fee[i] = sc.nextDouble();
			System.out.println("Enter Student "+(i+1)+" section");
			section[i] = sc.next().charAt(0);
		}
		System.out.println("Enter the section that you want to search");
		char a = sc.next().charAt(0);
		for(int i=0;i<n;i++)
		{
			if(section[i]==a)
			{
				System.out.println(id[i]+"   "+name[i]+"   "+fee[i]+"   "+section[i]);
			}
		}
		
	}

}

