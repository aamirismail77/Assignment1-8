	package com.bellinfo.assignment2;
	
	public class P {
		int a;
		int b;
		int add(int a, int b)
		{
			return (a+b);
		}
		int sub(int a, int b)
		{
			return (a-b);
		}
	
	}

	class ChildClass extends P {
		int a;
		int b;
		int add(int a,int b)
		{
			return (a-b);
		}
	}	

