package com.bellinfo.assignment8;

import java.util.Collections;
import java.util.HashSet;

public class MinElemHashSet {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add(200);
		hs.add(50);
		hs.add(150);
		hs.add(170);
		hs.add(65);
		Object x = Collections.min(hs);
		System.out.println("Minimum of HashSet Elements is: "+x);
	}
	}
