package com.demo.test;


import com.demo.beans.Class1;
import com.demo.beans.I1;


public class TestMyclass {

	public static void main(String[] args) {
		I1 obj=new Class1();
		obj.m1();
		((Class1)obj).m4();

	}

}
