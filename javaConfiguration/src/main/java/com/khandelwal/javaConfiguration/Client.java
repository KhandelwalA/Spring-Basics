package com.khandelwal.javaConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.khandelwal.javaConfiguration.configuration.SecondConfigurationClass;
import com.khandelwal.javaConfiguration.domainmodel.Car;

/**
 * Hello world!
 *
 */
public class Client 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SecondConfigurationClass.class);
        Car carOne = (Car) applicationContext.getBean("carOne");
        Car carTwo = (Car) applicationContext.getBean("carTwo");
        carOne.getCarDetails();
        carTwo.getCarDetails();
    }
}
