package com.bellinfo.assignment6;

import java.util.Scanner;

public class ThreeDimensionalArray {
	public static void main(String[] args) {
		int a[][][] = new int[100][100][100];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table that you want to print");
		int n = sc.nextInt();
		for (int i=1;i<=10;i++) {
			for (int j=1;j<=10;j++) {
				a[n][i][j] = n*i*j;
				System.out.println(n+" * "+i+" * "+j+" = "+a[n][i][j]);
			}
		}
	}

}
