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

public class ReplaceWords {
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
			// System.out.println("Successful");
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
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the word that you want to replace");
			String str2 = sc.next();
			System.out.println("Enter the new word");
			String str3 = sc.next();
			String text = "";

			while ((line = br.readLine()) != null) {

				text = text + line + "\r\n";
			}
			String modText = text.replaceAll(str2, str3);
			FileWriter writer = new FileWriter("newfile.txt");
			writer.write(modText);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
