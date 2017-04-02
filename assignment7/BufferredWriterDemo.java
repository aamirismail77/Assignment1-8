package com.bellinfo.assignment7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferredWriterDemo {
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
			str = sc.nextLine();

			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(str);
			System.out.println("Successful");

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
	}
}