package com.bellinfo.assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class SortingElementsArray {
	public static void main(String[] args) {
		System.out.println("Enter number of element in the array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements in an array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Sorted Elements:");
		for (int num : a) {
			System.out.println(num);
		}

		System.out.println("Second Highest: " + a[n - 2]);

	}

}
