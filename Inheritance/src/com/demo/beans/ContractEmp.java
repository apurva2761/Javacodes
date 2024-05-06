package com.demo.beans;

public class ContractEmp extends Employee {
	private float hrs;
	private float charges;
	public ContractEmp() {
		super();
	}
	public ContractEmp(int pid, String pname, String pmob,String dept, String desg,float hrs, float charges) {
		super(pid,pname,pmob,dept,desg);
		System.out.println("in ContractEmp paramterised ");
		this.hrs = hrs;
		this.charges = charges;
	}
	public float getHrs() {
		return hrs;
	}
	public void setHrs(float hrs) {
		this.hrs = hrs;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return super.toString()+"ContractEmp [hrs=" + hrs + ", charges=" + charges + "]";
	}
	@Override
	public double CalcNetSal() {
		
		return hrs*charges;
	}
	
	
}
