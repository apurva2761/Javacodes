package com.demo.test;

import com.demo.beans.Employee;
import com.demo.beans.Person;
import com.demo.beans.SalariedEmp;

public class TestEmployeehierarchy {

	public static void main(String[] args) {
		Person ob= new SalariedEmp();
		System.out.println(ob instanceof Person);
		System.out.println(ob instanceof SalariedEmp);
		System.out.println(ob instanceof Employee);
		

	}


	}


