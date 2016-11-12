package com.khandelwal.methodReplacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class CarMethodOverride implements MethodReplacer {

	public Object reimplement(Object arg0, Method arg1, Object[] arg2)
			throws Throwable {
		System.out.println ("Inside CarMethodOverride class and is reimplement method");
		return null;
	}
	
	
}