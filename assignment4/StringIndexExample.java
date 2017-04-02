package com.bellinfo.assignment4;

import java.lang.reflect.Array;

public class StringIndexExample {
	public static void main(String args[])
	{
		String s = "This is a Java class"; 
		for(int i=0;i<s.length();i++)
		{
			char a = s.charAt(i);
			int x = s.indexOf(a);
			System.out.println(a+"\t"+x);
		}
		String[] words = s.split("\\s+");
		for(int i=0;i<Array.getLength(words);i++)
		{
			char b = words[i].charAt(0);
			int y = s.indexOf(b);
			System.out.println(y+"\t"+words[i]);
		}
		
	}

}
