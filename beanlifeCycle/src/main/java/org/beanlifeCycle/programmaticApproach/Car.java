package org.beanlifeCycle.programmaticApproach;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car implements InitializingBean, DisposableBean {

	private String carName;

	public void setCarName(String carName) {
		this.carName = carName;
	}

	/**
	 * This is bean lifecycle init method, called after bean creation and
	 * setting properties
	 */
	@Override
	public void afterPropertiesSet() throws Exception {

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
	@Override
	public void destroy() {
		System.out.println("Inside destroy method of car bean");
	}
}
