package com.bellinfo.assignment3;
import java.util.Scanner;
public class StudentDetails {
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter total number of students");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		StudentInput stu[] = new StudentInput[n];
		for(int i=0;i<n;i++)
		{	
			StudentInput s1 = new StudentInput();
			System.out.println("Enter Student "+(i+1)+" id");
			s1.setId(sc.nextInt());
			System.out.println("Enter Student "+(i+1)+" name");
			s1.setName(sc.next());
			System.out.println("Enter Student "+(i+1)+" fee");
			s1.setFee(sc.nextDouble());
			System.out.println("Enter Student "+(i+1)+" section");
			s1.setSection(sc.next().charAt(0));
			stu[i]=s1;
		}
		StudentInput s2 = new StudentInput();
		System.out.println("******RESULT******");
		System.out.println("ID   	NAME    	FEE    	SECTION");
		for(int i=0;i<n;i++)
		{
		 s2 = stu[i];	
		 System.out.println(s2.getId()+"	"+s2.getName()+"	"+s2.getFee()+"	"+s2.getSection());
		}
		
	}

}
class StudentInput {
	int id;
	String name;
	double fee;
	char section;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	
}