package com.bellinfo.assignment8;

import java.util.ArrayList;
import java.util.TreeMap;

public class TmHiLo {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put(2, "ABC");
		tm.put(1, "CDE");
		tm.put(5, "EFG");
		tm.put(4, "GHI");
		tm.put(3, "JKL");
		Object lowest = tm.firstKey();
		Object highest = tm.lastKey();
		System.out.println("Lowest Key: "+lowest);
		System.out.println("Highest Key: "+highest);
		
}
}