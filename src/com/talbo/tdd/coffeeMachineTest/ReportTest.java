package com.talbo.tdd.coffeeMachineTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.talbo.tdd.coffeeMachine.BeverageQuantityChecker;
import com.talbo.tdd.coffeeMachine.CoffeeMachine;
import com.talbo.tdd.coffeeMachine.Order;
import com.talbo.tdd.coffeeMachine.Report;

public class ReportTest {

	Report report = new Report();
	
	@Test
	public void reportNumberOfCoffeeSold() {
		String command = "T:1:0:0.40";
		Order order = CoffeeMachine.process(command);
		report.add(order);
		String command2 = "H:::0.50";
		Order order2 = CoffeeMachine.process(command2);
		report.add(order2);
		String command3 = "C:2:0:0.60";
		Order order3 = CoffeeMachine.process(command3);
		report.add(order3);
		String command4 = "C:::0.60";
		Order order4 = CoffeeMachine.process(command4);
		report.add(order4);
		String command5 = "Ch:::0.60";
		Order order5 = CoffeeMachine.process(command5);
		report.add(order5);
		
		assertEquals(report.numberOfEachDrinkOrdered(report.orderList, Order.DrinkType.COFFEE), 3);
	}
	
	@Test
	public void reportNumberOfTeaSold() {
		String command = "T:1:0:0.40";
		Order order = CoffeeMachine.process(command);
		report.add(order);
		String command2 = "T:::0.50";
		Order order2 = CoffeeMachine.process(command2);
		report.add(order2);
		String command3 = "T:2:0:0.60";
		Order order3 = CoffeeMachine.process(command3);
		report.add(order3);
		String command4 = "T:::0.60";
		Order order4 = CoffeeMachine.process(command4);
		report.add(order4);
		String command5 = "Ch:::0.60";
		Order order5 = CoffeeMachine.process(command5);
		report.add(order5);
		
		assertEquals(report.numberOfEachDrinkOrdered(report.orderList, Order.DrinkType.TEA), 4);
	}
	
	@Test
	public void reportNumberOfChocolateSold() {
		String command = "H:1:0:0.50";
		Order order = CoffeeMachine.process(command);
		report.add(order);
		String command2 = "H:::0.50";
		Order order2 = CoffeeMachine.process(command2);
		report.add(order2);
		String command3 = "C:2:0:0.60";
		Order order3 = CoffeeMachine.process(command3);
		report.add(order3);
		String command4 = "O:::0.60";
		Order order4 = CoffeeMachine.process(command4);
		report.add(order4);
		String command5 = "Hh:::0.60";
		Order order5 = CoffeeMachine.process(command5);
		report.add(order5);
		
		assertEquals(report.numberOfEachDrinkOrdered(report.orderList, Order.DrinkType.CHOCOLATE), 3);
	}
	
	@Test
	public void reportNumberOfOrangeJuiceSold() {
		String command = "T:1:0:0.40";
		Order order = CoffeeMachine.process(command);
		report.add(order);
		String command2 = "H:::0.50";
		Order order2 = CoffeeMachine.process(command2);
		report.add(order2);
		String command3 = "C:2:0:0.60";
		Order order3 = CoffeeMachine.process(command3);
		report.add(order3);
		String command4 = "O:::0.60";
		Order order4 = CoffeeMachine.process(command4);
		report.add(order4);
		String command5 = "O:::0.60";
		Order order5 = CoffeeMachine.process(command5);
		report.add(order5);
		
		assertEquals(report.numberOfEachDrinkOrdered(report.orderList, Order.DrinkType.ORANGE_JUICE), 2);
	}
	
	@Test
	public void reportNumberOfOrangeJuiceSoldAndMoneyTotal() {
		String command = "T:1:0:0.40";
		Order order = CoffeeMachine.process(command);
		report.add(order);
		String command2 = "H:::0.50";
		Order order2 = CoffeeMachine.process(command2);
		report.add(order2);
		String command3 = "C:2:0:0.60";
		Order order3 = CoffeeMachine.process(command3);
		report.add(order3);
		String command4 = "O:::0.60";
		Order order4 = CoffeeMachine.process(command4);
		report.add(order4);
		String command5 = "O:::0.60";
		Order order5 = CoffeeMachine.process(command5);
		report.add(order5);
		
		double totalMoney = 2.70d;
		
		assertEquals(report.numberOfEachDrinkOrdered(report.orderList, Order.DrinkType.ORANGE_JUICE), 2);
		assertEquals(report.howMuchMoney(report.orderList), totalMoney, 0.0);
	}

	@Test
	public void drinkWithNoIngredients() {
		// ajout d'un dernier paramètre qui signifie qu'il n'y a plus d'eau
		String command = "T:1:0:0.40:1";
		Order order = CoffeeMachine.process(command);
		assertNotNull(order);
		assertEquals(order.isNoWater(), true);
		
	}

}
