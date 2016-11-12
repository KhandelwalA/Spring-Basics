package com.khandelwal.methodReplacer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Client {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"resources/Spring.xml");
		Car c = (Car) applicationContext.getBean("car");
		c.getEngineModel();
	}
}
