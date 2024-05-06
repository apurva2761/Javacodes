package com.demo.test;

import com.demo.beans.ContractEmp;
import com.demo.beans.Customer;
import com.demo.beans.Employee;
import com.demo.beans.Person;
import com.demo.beans.SalariedEmp;
import com.demo.beans.Vendor;

public class TestEmployee {

	public static void main(String[] args) {
		Person p= new Person(11,"aaa","66666");
		//Employee e = new Employee (12,"abc","25255","IT","ASE");
		Employee e=new SalariedEmp(12,"abc","25255","IT","ASE",80000);
		System.out.println(e);
		System.out.println(e.CalcNetSal());
		Employee e1=new ContractEmp(12,"abc","25255","IT","ASE",8.2f,150.6f);
		System.out.println(e1);
		System.out.println(e1.CalcNetSal());
		Employee e2=new Vendor(12,"abc","25255","IT","ASE",5000,5);
		System.out.println(e2);
		System.out.println(e2.CalcNetSal());
		Customer c=new Customer(13,"xba","67776","platinum",50000);
		System.out.println(c);

	}

}
