package com.sunbeam;

public class Employee implements Comparable<Employee> {

	private int id;
	private String Name;
	
	public Employee(int id, String Name){
		this.id = id;
		this.Name = Name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public int compareTo(Employee o) {
		int k = this.id - o.id;
		return k;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + "]";
	}
	
	
	
	

}
