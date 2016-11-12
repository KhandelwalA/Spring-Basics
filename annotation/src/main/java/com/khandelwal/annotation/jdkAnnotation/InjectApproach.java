package com.khandelwal.annotation.jdkAnnotation;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;

import com.khandelwal.annotation.Engine;

//J2EE annotation, same as @Component
@Named(value = "jdkAnnotationInjectApproach")
public class InjectApproach {

	// Check byType then byName (Though there are 3 beans of type Engine but
	// there exists a bean by name engine)
	@Inject
	private Engine engine;

	// Check byType then byName (Since there are 3 beans of type Engine but and
	// none of them by name eng, hence Qualifier is required)
	@Inject
	@Qualifier(value = "engine1")
	private Engine eng;

	public void callEngine() {
		engine.printMessgageToEngine("Calling Engine from InjectApproach");
	}

	public void callEng() {
		engine.printMessgageToEngine("Calling Eng from InjectApproach");
	}
}
