package com.wesring.example;

import java.util.ArrayList;

/**
 * 
 * @author Wes Ring
 * @version 0.0.1
 */
public class Main {
	public static void main(String[] args) {
		ArrayList<User> userList = new ArrayList<User>();//Create the array
		
		/*
		 * To add the user to the array list we must first create a new user, this is done with
		 * new User("James", new Car("Ford", "2030"), new Drink("Tea"))
		 * 
		 * The user consistes of a string, and two objects (car and Drink)
		 * 
		 */
		userList.add(new User("James", new Car("Ford", "2030"), new Drink("Tea")));//Example with everyting from scratch
		
		Car randomCar = new Car("Honda", "2003");//New car object
		Drink energyDrink = new Drink("Gatorade");//New Drink
		
		userList.add(new User("Rachel", randomCar, energyDrink));//Add a new object using two existing objects
		
		
		
		/*
		 * First you must select the User object, then you can call the method from it
		 */
		System.out.println(userList.get(0).getUserCar());//Get  james's car
	}
}
