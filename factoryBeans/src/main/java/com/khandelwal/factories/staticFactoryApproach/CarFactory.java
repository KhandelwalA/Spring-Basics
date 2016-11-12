package com.khandelwal.factories.staticFactoryApproach;

public class CarFactory {

	private static String carName;

	public static void setCarName(String carName) {
		CarFactory.carName = carName;
	}

	public static Car getCar() throws InstantiationException,
			IllegalAccessException, ClassNotFoundException {

		Car car = (Car) Class.forName(carName).newInstance();
		return car;

	}
}
