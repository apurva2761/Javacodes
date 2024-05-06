package com.demo.beans;

public class Customer extends Person{
	private String type;
	private double creditlimits;
	public Customer() {
		super();
	}
	public Customer(int pid, String pname, String pmob,String type, double creditlimits) {
		super(pid,pname, pmob);
		System.out.println("in Customer paramterised ");
		this.type = type;
		this.creditlimits = creditlimits;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getCreditlimits() {
		return creditlimits;
	}
	public void setCreditlimits(double creditlimits) {
		this.creditlimits = creditlimits;
	}
	@Override
	public String toString() {
		return super.toString()+"Customer [type=" + type + ", creditlimits=" + creditlimits + "]";
	}
	

}
