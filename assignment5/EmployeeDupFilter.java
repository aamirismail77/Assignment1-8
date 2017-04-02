package com.bellinfo.assignment5;

import java.util.Scanner;

public class EmployeeDupFilter {
	public static void main(String args[]) {
		EmployeeDupFilter e1 = new EmployeeDupFilter();
		Employee[] uniqueDetails = e1.getInputs();
		e1.display(uniqueDetails);
//		for (int i = 0; i < uniqueDetails.length; i++) {
//			 System.out.println(uniqueDetails[i]);
//			 }
	}

	Employee[] getInputs() {
		System.out.println("Enter the number of Employees");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Employee[] originalArray = new Employee[num];
		Employee[] uniqueArray = new Employee[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter Employee id: ");
			int eId = sc.nextInt();
			System.out.println("Enter Employee name: ");
			String eName = sc.next();
			System.out.println("Enter Employee Salary: ");
			double eSalary = sc.nextDouble();
			System.out.println("Enter Employee Department ID: ");
			int dId = sc.nextInt();
			System.out.println("Enter Employee Department Name");
			String dName = sc.next();
			System.out.println("Enter the Department Location");
			String dLocation = sc.next();
			Employee e = employeeDetails(eId, eName, eSalary, dId, dName, dLocation);
			originalArray[i] = e;
		}
		uniqueArray = uniqueDetails(originalArray);
		return uniqueArray;
	}

	Employee employeeDetails(int eId, String eName, double eSalary, int dId, String dName, String dLocation) {

		Department d = new Department();
		d.setDeptId(dId);
		d.setDeptName(dName);
		d.setLocation(dLocation);
		Employee e = new Employee();
		e.setId(eId);
		e.setName(eName);
		e.setSalary(eSalary);
		e.setDept(d);
		return e;
	}

	void display(Employee[] array) {
		int i;
		System.out.println("----------Unique Records------------");
		for (i = 0; i < array.length; i++) {
			if (array[i]!= null) {
				Employee empObj = array[i];
				System.out.println(empObj.toString());
			}
		}
	}

	Employee[] uniqueDetails(Employee[] originalArray) {
		Employee[] filteredArray = new Employee[originalArray.length];
		Employee[] x = new Employee[originalArray.length];
		filteredArray = originalArray.clone();
		for (int i = 0; i < originalArray.length - 1; i++) {
			Employee e2 = originalArray[i];
			for (int j = i + 1; j < originalArray.length - 1; j++) {
				Employee e3 = originalArray[j];
				if (e2.equals(e3)) {
					filteredArray[j] = null;
				}
			}
		}
		 for (int i = 0; i < filteredArray.length - 1; i++) {
		System.out.println("***************************");
		 System.out.println(filteredArray[i]);
		 }

		return filteredArray;
	}
}

class Employee {
	int id;
	String name;
	Department dept;
	double salary;

	// setter/getter methods
	// override equals method
	// override toString
	// override hasCode
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

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	 @Override
	 public int hashCode() {
	 final int prime = 31;
	 int result = 1;
	 result = prime * result + ((dept == null) ? 0 : dept.hashCode());
	 result = prime * result + id;
	 result = prime * result + ((name == null) ? 0 : name.hashCode());
	 long temp;
	 temp = Double.doubleToLongBits(salary);
	 result = prime * result + (int) (temp ^ (temp >>> 32));
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
	 Employee other = (Employee) obj;
	 if (dept == null) {
	 if (other.dept != null)
	 return false;
	 } else if (!dept.equals(other.dept))
	 return false;
	 if (id != other.id)
	 return false;
	 if (name == null) {
	 if (other.name != null)
	 return false;
	 } else if (!name.equals(other.name))
	 return false;
	 if (Double.doubleToLongBits(salary) !=
	 Double.doubleToLongBits(other.salary))
	 return false;
	 return true;
	 }

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}

}

class Department {
	int deptId;
	String deptName;
	String location;

	// setter/getter methods
	// override equals method
	// override equals method
	// override toString
	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	 @Override
	 public int hashCode() {
	 final int prime = 31;
	 int result = 1;
	 result = prime * result + deptId;
	 result = prime * result + ((deptName == null) ? 0 : deptName.hashCode());
	 result = prime * result + ((location == null) ? 0 : location.hashCode());
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
	 Department other = (Department) obj;
	 if (deptId != other.deptId)
	 return false;
	 if (deptName == null) {
	 if (other.deptName != null)
	 return false;
	 } else if (!deptName.equals(other.deptName))
	 return false;
	 if (location == null) {
	 if (other.location != null)
	 return false;
	 } else if (!location.equals(other.location))
	 return false;
	 return true;
	 }

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", location=" + location + "]";
	}

}
