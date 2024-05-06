package com.demo.beans;

public class Vendor extends Employee {
	private double amt;
	private int noemp;
	public Vendor() {
		super();
	}
	public Vendor(int pid, String pname, String pmob,String dept, String desg,double amt, int noemp) {
		super(pid,pname,pmob,dept,desg);
		System.out.println("in Vendor  paramterised ");
		this.amt = amt;
		this.noemp = noemp;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	public int getNoemp() {
		return noemp;
	}
	public void setNoemp(int noemp) {
		this.noemp = noemp;
	}
	@Override
	public String toString() {
		return super.toString()+"Vendor [amt=" + amt + ", noemp=" + noemp + "]";
	}
	@Override
	public double CalcNetSal() {
		
		return amt*noemp;
	}
	
}
