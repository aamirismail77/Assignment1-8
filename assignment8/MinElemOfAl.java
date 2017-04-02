package com.bellinfo.assignment8;

import java.util.ArrayList;
import java.util.Collections;

public class MinElemOfAl {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(100);
	al.add(200);
	al.add(50);
	al.add(150);
	al.add(170);
	al.add(65);
	Object x = Collections.min(al);
	System.out.println("Minimum of ArrayList Elements is: "+x);
	System.out.println("Before : " + al);
	Collections.reverse(al);
	System.out.println("Reverse Order : " + al);
}
}
