package com.khandelwal.javaConfiguration.domainmodel;

public class Car {

	private Engine engine;

	public Car(Engine engine) {
		this.engine = engine;
	}

	public void getCarDetails() {
		System.out
				.println("Inside Car class's getCarDetails method engine is: "
						+ engine.getYear());
	}
}
