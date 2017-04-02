
package com.bellinfo.assignment2;
import java.util.Scanner;
interface Interface1
	{
		public void add( );
		
	}
interface Interface2
	{
		public void sub();
	}
abstract class Base1 implements Interface1, Interface2
	{
		public void add( )
		{
			System.out.println("Inside interface 1");
		}
		public void sub()
		{
			System.out.println("Inside interface 2");
		}
		abstract public void mul();
	
	}
class StatInst extends Base1 implements Interface1, Interface2
	{
	 public void mul()
	{
		System.out.println("Inside mul in statInst");
	}
	public static void main(String args[])
	{
	// InterfaceSameMethod I1 = new InterfaceSameMethod();
	 //I1.add(1,2);
	 Base1 s1 = new StatInst();
	 //s1.add();
	// s1.sub();
	 s1.mul();

	}
	
	

}
