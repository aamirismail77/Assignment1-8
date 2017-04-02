package com.bellinfo.assignment7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;

public class WordsInFile {
	public static void main(String[] args) {
		BufferedWriter bw = null;
		try {
		String str = "newfile.txt";
		String path = System.getProperty("user.dir");
		String absolutePath = path + File.separator + str;
		File file = new File(absolutePath);
		System.out.println(absolutePath);
		if (!file.exists()) {
		file.createNewFile();
		}
		System.out.println("Enter the content to write to the file");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		FileWriter fw = new FileWriter(file);
		bw = new BufferedWriter(fw);
		bw.write(str1);
		//System.out.println("Successful");
		} catch (IOException e) {
		e.printStackTrace();
		} finally {
		try {
		if (bw != null)
		bw.close();
		} catch (Exception ex) {
		System.out.println("Error occured" + ex);
		}
		}
		FileReader fr;
		try {
			fr = new FileReader("C:\\Users\\Aamir\\workspace\\Belljava\\newfile.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			String[] words = new String[100];
			int count = 0;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				words = line.split("\\s+");
				for (String w : words) {
					count++;
				}
			}
			System.out.println("Total Number of Words in file: "+count);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
