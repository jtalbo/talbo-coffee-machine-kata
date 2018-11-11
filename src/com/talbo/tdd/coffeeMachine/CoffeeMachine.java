package com.talbo.tdd.coffeeMachine;

public class CoffeeMachine {

	public static Order process(String command) {
		Order order = new Order();
		
		String[] splittedCommand = command.split(":");
		
		verifyOrderPayment(splittedCommand, order);
		
		
		return order;
	}

	
	private static Order verifyOrderPayment(String[] splittedCommand, Order order) {
		boolean enoughMoney = false;
		Double expectedPriceForThisDrink;
		String insertedCoin = splittedCommand[3].toString();
		Double insertedCoinInDoubleValue = Double.parseDouble(insertedCoin);
		
		if ("T".equals(splittedCommand[0])) {
			expectedPriceForThisDrink = 0.40;
			System.out.println("You have select a Tea ! Please insert 0.40 cts ...");
			if (insertedCoinInDoubleValue >= expectedPriceForThisDrink) {
				enoughMoney = true;
				order.setPrice(expectedPriceForThisDrink);
			} else {
				Double calculChange = expectedPriceForThisDrink - insertedCoinInDoubleValue;
				String insertedCoinInDoubleFormat = String.format("%.2f", insertedCoinInDoubleValue);
				String restMoney = String.format("%.2f", calculChange);
				System.out.println("You have insert "+ insertedCoinInDoubleFormat + " cts, you need to insert "+ restMoney + " cts more.");
			}
		} else if ("H".equals(splittedCommand[0])) {
			expectedPriceForThisDrink = 0.50;
			System.out.println("You have select a Chocolate ! Please insert 0.50 cts ...");
			if (insertedCoinInDoubleValue >= expectedPriceForThisDrink) {
				enoughMoney = true;
				order.setPrice(expectedPriceForThisDrink);
			} else {
				Double calculChange = expectedPriceForThisDrink - insertedCoinInDoubleValue;
				String insertedCoinInDoubleFormat = String.format("%.2f", insertedCoinInDoubleValue);
				String restMoney = String.format("%.2f", calculChange);
				System.out.println("You have insert "+ insertedCoinInDoubleFormat + " cts, you need to insert "+ restMoney + " cts more.");
			}
		} else if ("C".equals(splittedCommand[0])) {
			expectedPriceForThisDrink = 0.60;
			System.out.println("You have select a Coffee ! Please insert 0.60 cts ...");
			if (insertedCoinInDoubleValue >= expectedPriceForThisDrink) {
				enoughMoney = true;
				order.setPrice(expectedPriceForThisDrink);
			} else {
				Double calculChange = expectedPriceForThisDrink - insertedCoinInDoubleValue;
				String insertedCoinInDoubleFormat = String.format("%.2f", insertedCoinInDoubleValue);
				String restMoney = String.format("%.2f", calculChange);
				System.out.println("You have insert "+ insertedCoinInDoubleFormat + " cts, you need to insert "+ restMoney + " cts more.");
			}
		}
		
		if (enoughMoney) {
			prepareOrder(splittedCommand, order);
		}
		
		
		return order;
	}

	
	private static Order prepareOrder(String[] splittedCommand, Order order) {
		String noValue = "";
		
		if ("T".equals(splittedCommand[0])) {
			order.setDrink(Order.DrinkType.TEA);
		} else if ("H".equals(splittedCommand[0])) {
			order.setDrink(Order.DrinkType.CHOCOLATE);
		} else if ("C".equals(splittedCommand[0])) {
			order.setDrink(Order.DrinkType.COFFEE);
		}
		
		if (noValue.equals(splittedCommand[1]) && noValue.equals(splittedCommand[2])) {
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

		System.out.println(order.toString());
		
		return order;
		
	}
	
	
}
