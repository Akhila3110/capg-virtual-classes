package com.capg.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sbu")
public class SBU {
	@Value("${sbuCode}")
	private int sbuCode;
	@Value("${sbuName}")
	private String sbuName;
	@Value("${sbuHead}")
	private String sbuHead;
	
	public SBU() {
		// TODO Auto-generated constructor stub
	}

	public int getSbuCode() {
		return sbuCode;
	}

	public void setSbuCode(int sbuCode) {
		this.sbuCode = sbuCode;
	}

	public String getSbuName() {
		return sbuName;
	}

	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}

	public String getSbuHead() {
		return sbuHead;
	}

	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}

	public SBU(int sbuId, String sbuName, String sbuHead) {
		super();
		this.sbuCode = sbuCode;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
	}

	@Override
	public String toString() {
		return "SBU [sbuCode=" + sbuCode + ", sbuHead=" + sbuHead + ", sbuName=" + sbuName + "]";
	}

}
