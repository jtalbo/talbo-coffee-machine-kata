package com.talbo.tdd.coffeeMachine;

public class Order {
	
	public enum DrinkType {
		COFFEE, TEA, CHOCOLATE;
	}

	private DrinkType drink;

	private Integer nbSugar;
	
	private boolean hasStick;
	
	private String stickString;
	
	private String message;
	
	
	public DrinkType getDrink() {
		return drink;
	}

	public void setDrink(DrinkType drink) {
		this.drink = drink;
	}

	public Integer getNbSugar() {
		return nbSugar;
	}

	public void setNbSugar(Integer nbSugar) {
		this.nbSugar = nbSugar;
	}

	public boolean isHasStick() {
		return hasStick;
	}

	public void setHasStick(boolean hasStick) {
		this.hasStick = hasStick;
	}

	public String getStickString() {
		return stickString;
	}

	public void setStickString(String stickString) {
		this.stickString = stickString;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "You have order a " + drink + " with " + nbSugar + " sugar and " + stickString + " stick.";
	}
	
	
	
	
}
