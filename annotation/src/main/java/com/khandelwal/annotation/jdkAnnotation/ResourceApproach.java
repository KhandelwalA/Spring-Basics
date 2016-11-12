package com.khandelwal.annotation.jdkAnnotation;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;
import com.khandelwal.annotation.Engine;

//J2EE annotation, same as @Component
@Named(value = "jdkAnnotationResourceApproach")
public class ResourceApproach {

	// Check byType then byName (Though there are 3 beans of type Engine but
	// there exists a bean by name engine)
	@Resource
	private Engine engine;

	// Check byType then byName (Since there are 3 beans of type Engine but and
	// none of them by name eng, hence Qualifier is required)
	@Resource
	@Qualifier(value = "engine1")
	private Engine eng;

	public void callEngine() {
		engine.printMessgageToEngine("Calling Engine from ResourceApproach");
	}

	public void callEng() {
		engine.printMessgageToEngine("Calling Eng from ResourceApproach");
	}
}
