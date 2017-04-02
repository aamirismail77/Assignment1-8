package com.bellinfo.assignment4;

import java.lang.reflect.Array;

public class StringAssg {
	public static void main(String args[]) {
		int i;
		int y = 0;
		String s = "This is a Java class";
		String[] words = s.split("\\s+");
		int length = s.length();
		System.out.println("Number of words in String: " + Array.getLength(words));
		System.out.println("Length of the String: " + length);
		for (i = 0; i < Array.getLength(words); i++) {
			if (words[i].length() == 1) {
				y = y + 1;
			}
		}
		System.out.println("Total number of single character letters in String: " + y);
		String str[] = new String[20];
		System.out.println("Each word reversed: ");
		for (i = 0; i < Array.getLength(words); i++) {
			String reverse = "";
			// System.out.print(words[i]+" ");
			for (int j = (words[i].length() - 1); j >= 0; j--) {
				reverse = reverse + words[i].charAt(j);
			}
			str[i] = reverse + " ";
			System.out.print(str[i]);
		}
		System.out.println();
		String reverseString[] = new String[20];
		System.out.println("Reversed String: ");
		for (i = Array.getLength(words) - 1; i >= 0; i--) {
			reverseString[i] = str[i] + " ";
			System.out.print(reverseString[i]);
		}
		// String str2 = new StringBuilder(s).reverse().toString();
		// System.out.println(str2);
		System.out.println();
		String str1 = s.replace("Java", "SQL");
		System.out.println("String after replace: " + str1);
		char a = s.charAt(s.length() / 2);
		System.out.println("Letter at the centre is: " + a);
		int b = s.indexOf(s.charAt(s.length() / 2));
		System.out.println("Index of centre letter: " + b);
		char j;
		// int counter = 0;
		for (j = 'a'; j < 'z'; j++) {
			int counter = 0;
			for (i = 0; i < s.length(); i++) {
				char k = s.charAt(i);
				if (k == j) {
					counter++;
				}
			}
			if (counter == 1) {
				System.out.println(j + " 		" + counter);
			}
		}
		String upCase = s.toUpperCase();
		System.out.println(upCase);

	}

}
