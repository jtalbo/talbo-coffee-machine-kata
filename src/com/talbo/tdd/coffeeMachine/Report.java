package com.talbo.tdd.coffeeMachine;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.talbo.tdd.coffeeMachine.Order;
import com.talbo.tdd.coffeeMachine.Order.DrinkType;

public class Report {
	
	public List<Order> orderList = new ArrayList<>();
	
	public void add(Order order) {
		orderList.add(order);
	}
	
	public long numberOfEachDrinkOrdered (List<Order> order, Order.DrinkType drinkType) {
		List<String> nbCoffee = new ArrayList<>();
		List<String> nbTea = new ArrayList<>();
		List<String> nbChocolate = new ArrayList<>();
		List<String> nbOrange = new ArrayList<>();
		
		for (Order command : order) {
			DrinkType drink = command.getDrink();
			if ("COFFEE".equals(drink.toString())) {
				nbCoffee.add(drink.toString());
			} else if ("TEA".equals(drink.toString())) {
				nbTea.add(drink.toString());
			} else if ("CHOCOLATE".equals(drink.toString())) {
				nbChocolate.add(drink.toString());
			} else if ("ORANGE_JUICE".equals(drink.toString())) {
				nbOrange.add(drink.toString());
			}
		}
		
		List<String> typeList = null;
		if ("COFFEE".equals(drinkType.toString())) {
			typeList = nbCoffee;
		} else if ("TEA".equals(drinkType.toString())) {
			typeList = nbTea;
		} else if ("CHOCOLATE".equals(drinkType.toString())) {
			typeList = nbChocolate;
		} else if ("ORANGE_JUICE".equals(drinkType.toString())) {
			typeList = nbOrange;
		}
		
		System.out.println("------------------------------------------------------------");
		System.out.println("There is "+ nbCoffee.size() + " coffee been ordered.");
		System.out.println("There is "+ nbTea.size() + " tea been ordered.");
		System.out.println("There is "+ nbChocolate.size() + " chocolate been ordered.");
		System.out.println("There is "+ nbOrange.size() + " orange juice been ordered.");
		System.out.println("------------------------------------------------------------");
		
		return typeList.size();
		
	}
	
	public double howMuchMoney (List<Order> order) {
		double totalMoney = 0;
		
		for (Order command : order) {
			totalMoney += command.getPrice();
		}
		DecimalFormat formatter = new DecimalFormat("#0.00");
		System.out.println("For a total of "+ formatter.format(totalMoney));
		System.out.println("------------------------------------------------------------");
		
		return totalMoney;
	}
}
