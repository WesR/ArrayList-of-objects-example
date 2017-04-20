package com.wesring.example;

/**
 * 
 * @author Wes
 *
 * An example car object class
 */

public class Car {
	String make;
	String year;
	
	/**
	 * Used to create a new car object
	 * @param _model Car model
	 * @param _year Car year
	 */
	public Car(String _make, String _year) {
		make = _make;
		year = _year;
	}
	
	public String getMake() {
		return make;
	}
	
	public String getYear() {
		return year;
	}
}
