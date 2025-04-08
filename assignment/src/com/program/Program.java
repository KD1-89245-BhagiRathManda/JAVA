package com.program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import com.util.SortById;
import com.util.SortByName;
import com.sunbeam.Employee;

public class Program {
	public static Employee[] getInstance() {
		
		
		Employee[] arr = new Employee[5];
		arr[0] = new Employee(2, "Prateek");
		arr[1] = new Employee(1, "Amit");
		arr[2] = new Employee(3, "Karn");
		arr[3] = new Employee(5, "Jaydeep");
		arr[4] = new Employee(4, "Pratap");
		return arr;
	}
	public static void print(Employee [] arr, Comparator<Employee> comp) {
		Arrays.sort(arr, comp);
		int n = arr.length;
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i]);
		}
	}
	public static int menuList() {
		Scanner sc = new Scanner(System.in);
		System.out.println("0.Exit");
		System.out.println("1.CompareByID : ");
		System.out.println("2.CompareByName : ");
		System.out.println("3.CompareById : ");
		System.out.println("Enter the choice : ");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		
		Employee [] arr = Program.getInstance();
		
		int n = arr.length;
		System.out.println("Before shorting inserted Array");
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i]);
		}
		int choice = 0;
		while((choice = menuList())!= 0) {
			Comparator<Employee> comp = null;
			switch (choice) {
			case 1:
				comp = new SortById();//Upcasting
				break;
				
			case 2:
				comp = new SortByName();//Upcasting
				break;
				
			case 3:
				comp = new SortById();//Upcasting
				break;
				
			default:
				System.out.println("Wrong Choice!!!!!");
				break;
			}
			print(arr, comp);
			print(arr, null);
		}
		
	}
}
