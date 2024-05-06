package com.demo.beans;

public class SalariedEmp extends Employee {
	private double sal;
	private double bonus;
	public SalariedEmp() {
		super();
	}
	public SalariedEmp(int pid, String pname, String pmob,String dept, String desg,double sal) {
		super(pid,pname,pmob,dept,desg);
		System.out.println("in salariedEmp paramterised ");
		this.sal = sal;
		this.bonus = 0.10*sal;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return super.toString()+"SalariedEmp [sal=" + sal + ", bonus=" + bonus + "]";
	}
	@Override
	public double CalcNetSal() {
		return sal+bonus+0.10*sal+0.15*sal-0.08*sal;
		
	}
	
}
