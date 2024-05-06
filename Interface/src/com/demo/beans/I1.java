package com.demo.beans;

 public interface I1 {
	int m1();
	default void m3()
	{
		System.out.println("in I1's m2");
	}
	
	}
	


