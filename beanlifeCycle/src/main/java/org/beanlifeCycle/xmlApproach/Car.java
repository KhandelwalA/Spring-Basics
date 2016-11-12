package org.beanlifeCycle.xmlApproach;

public class Car {

	private String carName;

	public void setCarName(String carName) {
		this.carName = carName;
	}

	/**
	 * This is bean lifecycle init method, called after bean creation and
	 * setting properties
	 */
	public void myInit() throws Exception {

		System.out.println("Inside myInit method of car bean and carName is::"
				+ carName);
	}

	public void printValues() {
		System.out.println("inside printValues: car name is: " + carName);
	}

	/**
	 * This is bean lifecycle destroy method, called before bean destruction
	 * 
	 */
	public void myDestroy() {
		System.out.println("Inside myDestroy method of car bean");
	}
}
