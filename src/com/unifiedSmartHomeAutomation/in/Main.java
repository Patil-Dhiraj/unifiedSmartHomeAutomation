package com.unifiedSmartHomeAutomation.in;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartHomeController controller = new SmartHomeController(0);
		
		ISmartLight light = new ISmartLight("1", "Dining Hall");
		ISmartThermostat thermostat = new ISmartThermostat("2", "Kitchen");
		ISmartCamera camera = new ISmartCamera("3", "Entry Camera");
		
		controller.addDevice(light);
		controller.addDevice(thermostat);
		controller.addDevice(camera);
		
		Scanner sc = new Scanner(System.in);
		String name;
		
			while(true) {
				System.out.println("Please Enter below option: " +"add, turnAllOn, turnAllOff,exit");
				name = sc.nextLine();
				
				switch(name) {
				
				case "add":
							System.out.println("Add Device: "+"Light, Thrmostat, Camera");
							String deviceType = sc.nextLine();
							System.out.println("Enter Device Id: ");
							String deviceId = sc.nextLine();
							System.out.println("Enter Device Name: ");
							String deviceName = sc.nextLine();
							
						if(deviceType.equals("light")) {
							ISmartLight newlight = new ISmartLight(deviceId, deviceName);
							controller.addDevice(newlight);
						}else if(deviceType.equals("thermostat")) {
							ISmartThermostat newthermostat = new ISmartThermostat(deviceId, deviceName);
							controller.addDevice(newthermostat);
						}else if(deviceType.equals("camera")) {
							ISmartCamera newcamera = new ISmartCamera(deviceId, deviceName);
							controller.addDevice(newcamera);
						}
						
						break;
						
						
			case "turnAllOn":
								controller.turnAllOn();
								break;
								
			case "turnAllOff":
								controller.turnAllOff();
								break;
								
			case "exit":
								System.out.println("Existing");
								return;
							
			default:
								System.out.println("Invalid Command");
				}
			}
		
	}

}
