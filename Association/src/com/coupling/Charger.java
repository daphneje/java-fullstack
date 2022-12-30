package com.coupling;

public class Charger {
	private String modelName;
	private String batteryCapacity;
	
	public Charger(String modelName, String batteryCapacity) {
		super();
		this.modelName = modelName;
		this.batteryCapacity = batteryCapacity;
	}

	public String getModelName() {
		return modelName;
	}

	public String getBatteryCapacity() {
		return batteryCapacity;
	}
	
	
}
