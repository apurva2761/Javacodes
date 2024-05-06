package com.demo.beans;

public interface I2 {
	
	int m4();
	default void m3() {
		System.out.println("in I2");
	}

}
