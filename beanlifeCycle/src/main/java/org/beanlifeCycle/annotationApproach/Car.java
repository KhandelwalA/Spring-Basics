package org.beanlifeCycle.annotationApproach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Car {

	private String carName;

	public void setCarName(String carName) {
		this.carName = carName;
	}

	/**
	 * This is bean lifecycle init method, called after bean creation and
	 * setting properties
	 */
	@PostConstruct
	public void init() throws Exception {

		System.out
				.println("Inside afterPropertiesSet method of car bean and carName is::"
						+ carName);
	}

	public void printValues() {
		System.out.println("inside printValues: car name is: " + carName);
	}

	/**
	 * This is bean lifecycle destroy method, called before bean destruction
	 * 
	 */
	@PreDestroy
	public void destroy() {
		System.out.println("Inside destroy method of car bean");
	}
}
