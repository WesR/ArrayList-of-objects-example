package com.wesring.example;

/**
 * 
 * @author Wes Ring
 *
 *
 *
 * Here we are making a user object, used to store usernames
 */

public class User {
	String userName;
	Car userCar;
	Drink userDrink;
	public User(String _userName, Car _userCar, Drink _userDrink) {
		userName = _userName;
		userCar = _userCar;
		userDrink = _userDrink;
	}
	
	public String getUserName(){
		return userName;
	}
	
	public String getUserCar() {
		return userCar.getMake();
	}
	
	public String getUserDrink() {
		return userDrink.getDrinkType();
	}
}
