package com.bellinfo.assignment8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.lang.Math;

public class SearchBySpeZip {
	int num;
	int zipcode[] = new int[10];
	String[] dSpecialiaztion = new String[10];

	public static void main(String[] args) {
		SearchBySpeZip ed = new SearchBySpeZip();
		Hospital[] originalArray = ed.getInputs();
		ed.display(originalArray);
		ed.searchByZip(originalArray);

	}

	Hospital[] getInputs() {
		Hospital[] originalArray = new Hospital[100];
		HashSet<Hospital> hs = new HashSet<>();
		System.out.println("Enter the number of Hospitals");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the Hospital Name");
			String hName = sc.next();
			System.out.println("Enter the Address 1");
			String hAddr1 = sc.next();
			System.out.println("Enter the Address 2");
			String hAddr2 = sc.next();
			System.out.println("Enter the city");
			String hCity = sc.next();
			System.out.println("Enter the State");
			String hState = sc.next();
			System.out.println("Enter the ZipCode");
			int hZip = sc.nextInt();
			zipcode[i] = hZip;
			System.out.println("Enter the Doctor Id / Name / Specialization");
			int dId = sc.nextInt();
			String dName = sc.next();
			String dSpe = sc.next();
			dSpecialiaztion[i] = dSpe;
			Hospital h = HospitalDetails(hName, hAddr1, hAddr2, hCity, hState, hZip, dId, dName, dSpe);
			originalArray[i] = h;

		}
		return originalArray;
	}

	Hospital HospitalDetails(String hName, String hAddr1, String hAddr2, String hCity, String hState, int hZip, int dId,
			String dName, String dSpe) {
		Address a = new Address();
		a.setAddress1(hAddr1);
		a.setAddress2(hAddr2);
		a.setCity(hCity);
		a.setState(hState);
		a.setZipCode(hZip);
		Doctor d = new Doctor();
		d.setDocId(dId);
		d.setName(dName);
		d.setSpecialization(dSpe);
		Hospital h = new Hospital();
		h.setHospitalName(hName);
		h.setHospitalAddress(a);
		h.setDoc(d);
		return h;

	}

	void display(Hospital[] array) {
		System.out.println("----------Unique Records------------");
		Hospital h3 = new Hospital();
		HashSet<Hospital> hs = new HashSet<>();
		for (int i = 0; i < num; i++) {
			hs.add(array[i]);
		}
		for (Hospital h : hs) {
			System.out.println(h.toString());
		}
	}

	void searchByZip(Hospital[] array1) {

		HashMap<String, Hospital> hm = new HashMap<>();
		for (int i = 0; i < num; i++) {
			hm.put(dSpecialiaztion[i], array1[i]);
		}
		System.out.println("----Search by Zip code and illness----");
		System.out.println("Enter the illness");
		Scanner sc = new Scanner(System.in);
		String illness = sc.next();
		Set<String> s1 = hm.keySet();
		for (String s : s1) {
			// System.out.println(s+"\t"+hm.get(s));
			if (s.contains(illness)) {
				System.out.println(s + "\t" + hm.get(s));
			}
		}

	}
}
