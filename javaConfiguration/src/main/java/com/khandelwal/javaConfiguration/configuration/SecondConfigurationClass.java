package com.khandelwal.javaConfiguration.configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import com.khandelwal.javaConfiguration.domainmodel.Car;
import com.khandelwal.javaConfiguration.domainmodel.Engine;

@Configurable
@Import(FirstConfigurationClass.class)
public class SecondConfigurationClass {

	@Bean (initMethod="onStartup" , destroyMethod="onEnd")
	public Engine engineTwo () {
		Engine engine = new Engine ();
		engine.setYear(2015);
		return engine;
	}
	
	@Bean
	public Car carTwo () {
		return new Car(engineTwo ());
	}
}
