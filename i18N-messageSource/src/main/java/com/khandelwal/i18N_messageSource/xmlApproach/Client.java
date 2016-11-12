package com.khandelwal.i18N_messageSource.xmlApproach;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Client {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"XMLApproach.xml");

		System.out.println(applicationContext.getMessage("label1", new Object[] {"Abhishek","Software"},
				Locale.US));

		System.out.println(applicationContext.getMessage("label1", new Object[] {"Ching","Computer"},
				Locale.SIMPLIFIED_CHINESE));
	}
}
