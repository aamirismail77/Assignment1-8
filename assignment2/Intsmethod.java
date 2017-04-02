package com.bellinfo.assignment2;
	interface add
	{
	 public int add(int a, int b);	
	}

public class Intsmethod implements add{
	 static
	 {
		 System.out.println("I am static block");
	 }
	 Intsmethod()
	 {
		 System.out.println("I am the constructor");
	 }
	 {
		 System.out.println("I am instance block");
	 }
	
	public int add(int a, int b)
	{
		int x = a+b;
		return x;
		
	}

	public static void main(String args[])
	{
		Intsmethod Iobj = new Intsmethod();
		//double y = Iobj.add(4, 3);
		//System.out.println(y);
	}
}
