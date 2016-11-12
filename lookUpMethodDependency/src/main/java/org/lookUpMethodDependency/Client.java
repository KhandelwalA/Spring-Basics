package org.lookUpMethodDependency;

import java.util.Scanner;

import org.lookUpMethodDependency.abstractClass.AbstractCar;
import org.lookUpMethodDependency.concreteClass.ConcreteCar;
import org.lookUpMethodDependency.interfaceApproach.InterfaceCar;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"Spring.xml");

		AbstractCar absttractCar = (AbstractCar) applicationContext
				.getBean("abstractCar");
		InterfaceCar interfaceCar = (InterfaceCar) applicationContext
				.getBean("interfaceCar");
		ConcreteCar concreteCar = (ConcreteCar) applicationContext
				.getBean("concreteCar");

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter options:\n 1 for Steam Engine\n 2 for Electric Engine\n 3 for Nuclear Engine");

		while (true) {
			int option = scanner.nextInt();

			switch (option) {
			case 1:
				System.out.println("Engine Model is: "
						+ absttractCar.getEngine().getEngineModel());
				break;
			case 2:
				System.out.println("Engine Model is: "
						+ interfaceCar.getEngine().getEngineModel());
				break;
			case 3:
				System.out.println("Engine Model is: "
						+ concreteCar.getEngine().getEngineModel());
				break;
			default:
				System.out.println("Not a valid option, please try again");
				break;
			}
		}

	}

}
