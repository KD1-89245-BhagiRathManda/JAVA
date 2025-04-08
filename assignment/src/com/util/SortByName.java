package com.util;

import java.util.Comparator;
import com.sunbeam.Employee;

public class SortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee k1, Employee k2) {
		// TODO Auto-generated method stub
		return (int)(k1.getName().compareTo(k2.getName()));
	}

}
