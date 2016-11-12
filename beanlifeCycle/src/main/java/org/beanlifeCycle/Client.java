package org.beanlifeCycle;

import java.util.Scanner;
import org.springframework.beans.BeansException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) throws BeansException,
			ClassNotFoundException {
		ConfigurableApplicationContext cac = new ClassPathXmlApplicationContext(
				"Spring.xml");

		/**************** Bean Life Cycle Programmatic approach *******************************************/
		org.beanlifeCycle.programmaticApproach.Car carProgrammaticApproach = (org.beanlifeCycle.programmaticApproach.Car) cac
				.getBean(Class
						.forName("org.beanlifeCycle.programmaticApproach.Car"));
		org.beanlifeCycle.xmlApproach.Car carXmlApproach = (org.beanlifeCycle.xmlApproach.Car) cac
				.getBean(Class.forName("org.beanlifeCycle.xmlApproach.Car"));
		org.beanlifeCycle.annotationApproach.Car carAnnotationApproach = (org.beanlifeCycle.annotationApproach.Car) cac
				.getBean(Class
						.forName("org.beanlifeCycle.annotationApproach.Car"));

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String option = scanner.next();

			switch (option) {

			case "program":
				carProgrammaticApproach.printValues();
				break;
			case "xml":
				carXmlApproach.printValues();
				break;
			case "annotation":
				carAnnotationApproach.printValues();
				break;
			default:
				cac.close();
				break;
			}
		}

	}
}
