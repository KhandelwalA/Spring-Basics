package com.khandelwal.collection;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Car {

	List<Engine> listEngine;
	Set<Engine> setEngine;
	Engine arrayEngine[];
	Map<String, Engine> mapEngine;

	public void setListEngine(List<Engine> listEngine) {
		this.listEngine = listEngine;
	}

	public void setSetEngine(Set<Engine> setEngine) {
		this.setEngine = setEngine;
	}

	public void setArrayEngine(Engine[] arrayEngine) {
		this.arrayEngine = arrayEngine;
	}

	public void setMapEngine(Map<String, Engine> mapEngine) {
		this.mapEngine = mapEngine;
	}

	public void getListOfEngines() {
		for (Engine engine : listEngine) {
			System.out.println("List of Engines:" + engine.getYear());
		}
	}

	public void getSetOfEngines() {
		for (Engine engine : setEngine) {
			System.out.println("Sett of Engines:" + engine.getYear());
		}
	}

	public void getmapOfEngines() {
		for (Entry<String, Engine> engine : mapEngine.entrySet()) {
			System.out.println("Map of Engines:" + engine.getValue().getYear());
		}
	}

	public void getArrayOfEngines() {
		for (Engine engine : arrayEngine) {
			System.out.println("array of Engines:" + engine.getYear());
		}

	}

}
