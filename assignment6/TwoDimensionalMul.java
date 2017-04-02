package com.bellinfo.assignment6;

import java.util.Scanner;

public class TwoDimensionalMul {
	public static void main(String[] args) {
		int a[][] = new int[200][200];
		System.out.println("Enter the table that you want to print");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int col = 10;
		for (int j = 1; j <= col; j++) {
			a[n][j] = n * j;
			System.out.println(n + " * " + j + " = " + a[n][j]);
		}

	}
	
}
