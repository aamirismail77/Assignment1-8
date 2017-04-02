package com.bellinfo.assignment8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.lang.Math;

public class ElilminateDuplicates {
	String hosName[] = new String[10];
	String specialization[] = new String[10];
	int zipcode[] = new int[10];
	int num;

	public static void main(String[] args) {
		ElilminateDuplicates ed = new ElilminateDuplicates();
		Hospital[] originalArray = ed.getInputs();
		ed.display(originalArray);
		ed.searchByZip(originalArray);
		ed.SearchByHname(originalArray);
		ed.SearchBySpecialization(originalArray);

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
			hosName[i] = hName;
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
			specialization[i] = dSpe;
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
		HashSet<Hospital> hs = new HashSet<>();
		for (int i = 0; i < num; i++) {
			hs.add(array[i]);
		}
		for (Hospital h : hs) {
			System.out.println(h.toString());
		}
	}

	void searchByZip(Hospital[] array1) {

		System.out.println("-----Search Hospital by Zip Code-----");

		HashMap<Integer, Hospital> hm = new HashMap<>();
		for (int i = 0; i < num; i++) {
			hm.put(zipcode[i], array1[i]);
		}
		Set<Integer> s1 = hm.keySet();
		System.out.println("Enter your Zip Code");
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();
		int x[] = new int[num];
		for (int i = 0; i < num; i++) {
			int y = (zipcode[i] - z);
			x[i] = Math.abs(y);
		}
		Arrays.sort(x);
		for (int i = 0; i < num; i++) {
			hm.put(x[0], array1[0]);
		}
		System.out.println("----Nearest Hospital to your location----");
		System.out.println(x[0] + "\t" + array1[0]);

	}

	void SearchByHname(Hospital[] array1) {
		HashSet<Hospital> hs3 = new HashSet<>();
		System.out.println("Enter name of the Hospital");
		Scanner sc = new Scanner(System.in);
		String hn = sc.next();
		for (int i = 0; i < num; i++) {
			if (hosName[i].equals(hn)) {
				hs3.add(array1[i]);
			}
		}
		for (Hospital h : hs3) {
			System.out.println(h.toString());
		}
	}

	void SearchBySpecialization(Hospital[] array1) {
		HashSet<Hospital> hs4 = new HashSet<>();
		System.out.println("Enter the specialization");
		Scanner sc = new Scanner(System.in);
		String sn = sc.next();
		for (int i = 0; i < num; i++) {
			if (specialization[i].equals(sn)) {
				hs4.add(array1[i]);
			}
		}
		for (Hospital h : hs4) {
			System.out.println(h.toString());
		}
	}

}

class Hospital {
	String hospitalName;
	Doctor doc;
	Address hospitalAddress;

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public Doctor getDoc() {
		return doc;
	}

	public void setDoc(Doctor doc) {
		this.doc = doc;
	}

	public Address getHospitalAddress() {
		return hospitalAddress;
	}

	public void setHospitalAddress(Address hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((doc == null) ? 0 : doc.hashCode());
		result = prime * result + ((hospitalAddress == null) ? 0 : hospitalAddress.hashCode());
		result = prime * result + ((hospitalName == null) ? 0 : hospitalName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hospital other = (Hospital) obj;
		if (doc == null) {
			if (other.doc != null)
				return false;
		} else if (!doc.equals(other.doc))
			return false;
		if (hospitalAddress == null) {
			if (other.hospitalAddress != null)
				return false;
		} else if (!hospitalAddress.equals(other.hospitalAddress))
			return false;
		if (hospitalName == null) {
			if (other.hospitalName != null)
				return false;
		} else if (!hospitalName.equals(other.hospitalName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Hospital [hospitalName=" + hospitalName + ", doc=" + doc + ", hospitalAddress=" + hospitalAddress + "]";
	}

}

class Doctor {
	int docId;
	String name;
	String specialization;

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + docId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((specialization == null) ? 0 : specialization.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		if (docId != other.docId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (specialization == null) {
			if (other.specialization != null)
				return false;
		} else if (!specialization.equals(other.specialization))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Doctor [docId=" + docId + ", name=" + name + ", specialization=" + specialization + "]";
	}

}

class Address {
	String address1;
	String address2;
	String city;
	String state;
	int zipCode;

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address1 == null) ? 0 : address1.hashCode());
		result = prime * result + ((address2 == null) ? 0 : address2.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + zipCode;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (address1 == null) {
			if (other.address1 != null)
				return false;
		} else if (!address1.equals(other.address1))
			return false;
		if (address2 == null) {
			if (other.address2 != null)
				return false;
		} else if (!address2.equals(other.address2))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (zipCode != other.zipCode)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Address [address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", state=" + state
				+ ", zipCode=" + zipCode + "]";
	}

}