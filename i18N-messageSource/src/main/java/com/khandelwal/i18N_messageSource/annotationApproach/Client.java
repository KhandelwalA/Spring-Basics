package com.khandelwal.i18N_messageSource.annotationApproach;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"AnnotationApproach.xml");

		System.out.println(applicationContext.getMessage("label1", new Object[] {"Abhishek","Software"},
				Locale.US));

		System.out.println(applicationContext.getMessage("label1", new Object[] {"Ching","Computer"},
				Locale.SIMPLIFIED_CHINESE));
	}
}
