package com.khandelwal.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.khandelwal.annotation.jdkAnnotation.InjectApproach;
import com.khandelwal.annotation.jdkAnnotation.ResourceApproach;
import com.khandelwal.annotation.springAnnotation.AutowiredApproach;

public class Client {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
		
		AutowiredApproach springAutowiredApproach = (AutowiredApproach) applicationContext.getBean("springAutowiredApproach");
		springAutowiredApproach.callEngine();
		springAutowiredApproach.callEng();
		
		ResourceApproach jdkAnnotationResourceApproach = (ResourceApproach) applicationContext.getBean("jdkAnnotationResourceApproach");
		jdkAnnotationResourceApproach.callEngine();
		jdkAnnotationResourceApproach.callEng();
		
		InjectApproach jdkAnnotationInjectApproach = (InjectApproach) applicationContext.getBean("jdkAnnotationInjectApproach");
		jdkAnnotationInjectApproach.callEngine();
		jdkAnnotationInjectApproach.callEng();
	}

}
