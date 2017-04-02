package com.bellinfo.assignment2;

public class PassbyValue {
	static int i=50;
	static int change(int i)
	{
		i = i*2;
		System.out.println(i);
		return i;
	}
	
public static void main(String args[])
	{
		
		int x= change(i);
		System.out.println(x);
	}
}
