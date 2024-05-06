package com.demo.beans;


public class Person {
	private int pid;
	private String pname ;
	private String pmob;
	public Person() {
		System.out.println("in person default");
	}
	public Person(int pid, String pname, String pmob)
	{
		super();
		System.out.println("in person paramterised ");
		this.pid = pid;
		this.pname = pname;
		this.pmob = pmob;
	}
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPmob() {
		return pmob;
	}
	public void setPmob(String pmob) {
		this.pmob = pmob;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", pmob=" + pmob + "]";
	}
	
	
}
