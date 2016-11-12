package com.khandelwal.factories.factoryBeanApproach;

import org.springframework.beans.factory.FactoryBean;

public class AirPlaneFactory implements FactoryBean<Object> {

	private String airPlaneName;

	public void setAirPlaneName(String airPlaneName) {
		this.airPlaneName = airPlaneName;
	}

	public Object getObject() throws Exception {
		AirPlane airPlane = (AirPlane) Class.forName(airPlaneName)
				.newInstance();
		return airPlane;
	}

	public Class<AirPlane> getObjectType() {

		return AirPlane.class;
	}

	public boolean isSingleton() {

		return true;
	}
}
