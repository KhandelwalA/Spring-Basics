package org.lookUpMethodDependency.concreteClass;

public class ConcreteCar {

	public Engine getEngine() {
		
		Engine engine = new Engine();
		engine.setEngineModel("Hydro Engine");
		return engine;
	}
}
