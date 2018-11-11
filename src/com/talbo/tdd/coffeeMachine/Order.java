package com.talbo.tdd.coffeeMachine;

public class Order {
	
	public enum DrinkType {
		COFFEE, TEA, CHOCOLATE, ORANGE_JUICE;
	}

	private DrinkType drink;

	private Integer nbSugar;
	
	private boolean hasStick;
	
	private String stickString;
	
	private String message;
	
	private Double price;
	
	private boolean isExtraHot;
	
	
	public boolean isExtraHot() {
		return isExtraHot;
	}

	public void setExtraHot(boolean isExtraHot) {
		this.isExtraHot = isExtraHot;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

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
		String extraHot;
		if (isExtraHot) {
			extraHot = "extra hot ";
		} else {
			extraHot = "";
		}
		return "Drink maker make 1 " + extraHot + drink + " with " + nbSugar + " sugar and " + stickString + " stick.";
	}
	
	
	
	
}
