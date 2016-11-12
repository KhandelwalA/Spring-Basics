package com.khandelwal.propertyPlaceHolder.annotationApproach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Client 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AnnotationApproach.xml");
    	
    	Person person = (Person) applicationContext.getBean("person");

        System.out.println( "First name is: " + person.getFirstName());
        System.out.println( "Last name is: " + person.getLastName());
        System.out.println( "Account no is: " + person.getAccountNo());
    }
}
