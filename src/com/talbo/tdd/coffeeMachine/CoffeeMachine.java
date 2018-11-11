package com.talbo.tdd.coffeeMachine;

public class CoffeeMachine {

	public static Order process(String command) {
		Order order = new Order();
		
		String[] splittedCommand = command.split(":");
		
		verifyDrinkType(splittedCommand, order);
		
		System.out.println(order.toString());
		
		return order;
	}

	
	private static Order verifyDrinkType(String[] splittedCommand, Order order) {
		if ("T".equals(splittedCommand[0])) {
			order.setDrink(Order.DrinkType.TEA);
		} else if ("H".equals(splittedCommand[0])) {
			order.setDrink(Order.DrinkType.CHOCOLATE);
		} else if ("C".equals(splittedCommand[0])) {
			order.setDrink(Order.DrinkType.COFFEE);
		}
		
		prepareOrder(splittedCommand, order);
		
		return order;
	}

	
	private static Order prepareOrder(String[] splittedCommand, Order order) {
		Integer drinkWithoutSugarAndStick = 1;
		
		if (drinkWithoutSugarAndStick.equals(splittedCommand.length)) {
			order.setNbSugar(0);
			order.setHasStick(false);
			order.setStickString("no");
		} else {
			
			if ("1".equals(splittedCommand[1])) {
				order.setNbSugar(1);
			} else if ("2".equals(splittedCommand[1])) {
				order.setNbSugar(2);
			}
			
			if ("".equals(splittedCommand[2])) {
				order.setHasStick(false);
				order.setStickString("no");
			} else if ("0".equals(splittedCommand[2])) {
				order.setHasStick(true);
				order.setStickString("a");
			}
		
		}
		
		return order;
		
	}
	
	
}
