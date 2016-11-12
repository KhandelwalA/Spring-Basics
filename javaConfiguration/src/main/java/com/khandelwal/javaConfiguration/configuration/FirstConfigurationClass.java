package com.khandelwal.javaConfiguration.configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import com.khandelwal.javaConfiguration.domainmodel.Car;
import com.khandelwal.javaConfiguration.domainmodel.Engine;

@Configurable
public class FirstConfigurationClass {
	
	@Bean (initMethod="onStartup" , destroyMethod="onEnd")
	public Engine engineOne() {
		Engine engine = new Engine ();
		engine.setYear(2016);
		return engine;
	}
	
	@Bean
	public Car carOne () {
		return new Car(engineOne ());
	}
}
