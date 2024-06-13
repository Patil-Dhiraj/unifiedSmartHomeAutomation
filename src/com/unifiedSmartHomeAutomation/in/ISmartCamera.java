package com.unifiedSmartHomeAutomation.in;

public class ISmartCamera extends AbstractSmartDevice implements SmartDevice{
	
	private boolean isRecording;
	
	public ISmartCamera(String deviceId, String deviceName) {
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

	public void startRecording() {
		 isRecording = true;
		 System.out.println(getDeviceName() + " started recording ");
	}
	
	public void stopRecording() {
		isRecording = false;
		System.out.println(getDeviceName() + " stop recording.");
	}
	
}
