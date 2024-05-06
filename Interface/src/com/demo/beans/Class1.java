package com.demo.beans;

public class Class1 implements I1,I2{

	
	public int m1() {
		int x=4;
		return x;
		
	}

	@Override
	public int m4() {
		int y=2;
		return y;
		
	}
	public void m3()
	{
		I2.super.m3();
		I1.super.m3();
		
	}

}
