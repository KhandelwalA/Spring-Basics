package com.khandelwal.annotation.springAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.khandelwal.annotation.Engine;

@Component(value="springAutowiredApproach")
public class AutowiredApproach {

	//Check byType then byName (Though there are 3 beans of type Engine but there exists a bean by name engine)
	@Autowired
	private Engine engine;
	
	//Check byType then byName (Since there are 3 beans of type Engine but and none of them by name eng, hence Qualifier is required)
	@Autowired
	@Qualifier(value="engine1")
	private Engine eng;
	
	public void callEngine () {
		engine.printMessgageToEngine("Calling Engine from AutowiredApproach");
	}
	
	public void callEng () {
		engine.printMessgageToEngine("Calling Eng from AutowiredApproach");
	}
}
