package com.example.demo;

import org.springframework.stereotype.Component;

@Component("lap")
public class Laptop {
	private int lid;
	private int lname;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public int getLname() {
		return lname;
	}
	public void setLname(int lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
	}
	
	public void compile() {
		System.out.println("Compile");
	}
	
}
