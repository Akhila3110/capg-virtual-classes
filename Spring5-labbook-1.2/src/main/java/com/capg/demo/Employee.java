package com.capg.demo;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
	
	@Value("${eAge}")
	private int empAge;
	@Value("${eId}")
	private int empId;
	@Value("${eName}")
	private String empName;
	public Employee(int empAge, int empId, String empName, double empSal, SBU empBU) {
		super();
		this.empAge = empAge;
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empBU = empBU;
	}
	@Value("${eSal}")
	private double empSal;
	//@Value("${eBUnit}")
	private SBU empBU;
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public SBU getEmpBU() {
		return empBU;
	}
	public void setEmpBU(SBU empBU) {
		this.empBU = empBU;
	}
	@Override
	public String toString() {
		return "Employee [empAge=" + empAge + ", empId=" + empId + ", empName=" + empName + ", empSal=" + empSal
				+ ", empBU=" + empBU + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SBU getSbuDetails() {
		// TODO Auto-generated method stub
		return empBU;
	}
	
}
	