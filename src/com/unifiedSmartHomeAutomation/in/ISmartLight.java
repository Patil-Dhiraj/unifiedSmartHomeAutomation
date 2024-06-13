package com.unifiedSmartHomeAutomation.in;

public class ISmartLight extends AbstractSmartDevice implements SmartDevice{

	private int brightness;
	private String color;

	public ISmartLight(String deviceId, String deviceName) {
		super(deviceId, deviceName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println(getDeviceName()+ " is turned on.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println(getDeviceName()+ " is turned off.");
	}
	
	public void setBrightness(int level) {
		this.brightness = level;
		System.out.println(getDeviceName() + " brightness is "+level);
	}
	
	public void setcolor(String color) {
		this.color = color;
		System.out.println(getDeviceName() + " color set to "+ color);
	}	

}
