package com.khandelwal.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		System.out.println("Inside main method of Client class");
        
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"CollectionBeanDefinition.xml");
		for (String beanName : applicationContext.getBeanDefinitionNames()) {
			System.out.println("Bean Name is :" + beanName);
		}

		Car car = (Car) applicationContext.getBean("car");
		car.getListOfEngines();
		car.getSetOfEngines();
		car.getmapOfEngines();
		car.getArrayOfEngines();

	}

}
