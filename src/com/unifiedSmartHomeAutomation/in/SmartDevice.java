package com.unifiedSmartHomeAutomation.in;

interface SmartDevice {
		void turnOn();
		void turnOff();
}

interface SmartLight extends SmartDevice {
		void setBrightness(int level);
		void setColor(String color);
}

interface SmartThermostat extends SmartDevice {
	    void setTemperature(double temperature);
	    double getTemperature();
}

interface SmartCamera extends SmartDevice {
		void startRecording();
		void stopRecording();
}
