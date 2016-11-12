package com.khandelwal.factories.instanceFactoryApproach;

public class ScooterFactory {

	private Scooter bajajSuper = new BajajSuper();

	public Scooter getScooter() {

		return bajajSuper;

	}
}
