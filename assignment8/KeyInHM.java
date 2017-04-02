package com.bellinfo.assignment8;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class KeyInHM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "abc");
		hm.put(2, "def");
		hm.put(3, "ghi");
		hm.put(4, "abc");
		System.out.println(hm);
		System.out.println("Enter the key to search");
		int x = sc.nextInt();
		if(hm.containsKey(x)) {
			System.out.println("Exists");
		}
		else {
			System.out.println("Not Exists");
		}
		System.out.println("Enter the value to search");
		String str = sc.next();
		if(hm.containsValue(str)) {
			System.out.println("Exists");
		}
		else {
			System.out.println("Not Exists");
		}
	}

}
