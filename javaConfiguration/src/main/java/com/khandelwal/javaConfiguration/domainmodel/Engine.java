package com.khandelwal.javaConfiguration.domainmodel;

public class Engine {

	private int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void onStartup () {
		System.out.println("This is init method of Engine class");
	}
	
	public void onEnd () {
		System.out.println("This is destroy method of Engine class");
	}
}
