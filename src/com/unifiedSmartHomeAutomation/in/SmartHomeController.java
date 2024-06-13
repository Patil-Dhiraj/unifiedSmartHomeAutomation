package com.unifiedSmartHomeAutomation.in;

public class SmartHomeController {
	
	private SmartDevice devices[];
	private int numberOfDevices;
	
	public SmartHomeController(int capacity) {
		devices = new SmartDevice[capacity];
		numberOfDevices = 0;
	}
	
	public void addDevice(SmartDevice device) {
		if(numberOfDevices >= devices.length) {
			System.out.println("no more capacity to add device.");
			return;
		}
		
		devices[numberOfDevices++] = device;
	}
	
	public void turnAllOn() {
		for(int i=0; i<numberOfDevices; i++) {
			devices[i].turnOn();
		}
	}
	
	public void turnAllOff() {
		for(int i=0; i<numberOfDevices; i++) {
			devices[i].turnOff();
		}
	}	
	
}
