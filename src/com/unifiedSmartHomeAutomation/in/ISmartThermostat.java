package com.unifiedSmartHomeAutomation.in;

public class ISmartThermostat extends AbstractSmartDevice implements SmartDevice {
	
	private double temperature;
	
	public ISmartThermostat(String deviceId, String deviceName) {
		super(deviceId, deviceName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println(getDeviceName() + " is turned on.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println(getDeviceName() + " is turned off.");
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
		System.out.println(getDeviceName() + " temperature set to "+temperature);
	}
	
	

}
