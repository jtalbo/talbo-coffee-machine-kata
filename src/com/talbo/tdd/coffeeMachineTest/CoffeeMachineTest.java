package com.talbo.tdd.coffeeMachineTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.talbo.tdd.coffeeMachine.CoffeeMachine;
import com.talbo.tdd.coffeeMachine.Order;

public class CoffeeMachineTest {
	
	@Test
	public void teaIsNotFreeTea() {
		String command = "T:1:0:0.40";
		Order order = CoffeeMachine.process(command);
		assertNotNull(order);
		assertEquals(order.getDrink(), Order.DrinkType.TEA);
		assertEquals(order.getNbSugar(), new Integer(1));
		assertEquals(order.isHasStick(), true);
		assertEquals(order.getPrice(), new Double(0.40));
		assertEquals(order.isExtraHot(), false);
	}
	
	@Test
	public void chocolateIsNotFreeChocolate() {
		String command = "H:::0.50";
		Order order = CoffeeMachine.process(command);
		assertNotNull(order);
		assertEquals(order.getDrink(), Order.DrinkType.CHOCOLATE);
		assertEquals(order.getNbSugar(), new Integer(0));
		assertEquals(order.isHasStick(), false);
		assertEquals(order.getPrice(), new Double(0.50));
		assertEquals(order.isExtraHot(), false);
	}
	
	@Test
	public void coffeeIsNotFreeCoffee() {
		String command = "C:2:0:0.60";
		Order order = CoffeeMachine.process(command);
		assertNotNull(order);
		assertEquals(order.getDrink(), Order.DrinkType.COFFEE);
		assertEquals(order.getNbSugar(), new Integer(2));
		assertEquals(order.isHasStick(), true);
		assertEquals(order.getPrice(), new Double(0.60));
		assertEquals(order.isExtraHot(), false);
		
	}
	
	@Test
	public void orangeIsOrange() {
		String command = "O:::0.60";
		Order order = CoffeeMachine.process(command);
		assertNotNull(order);
		assertEquals(order.getDrink(), Order.DrinkType.ORANGE_JUICE);
		assertEquals(order.getNbSugar(), new Integer(0));
		assertEquals(order.isHasStick(), false);
		assertEquals(order.getPrice(), new Double(0.60));
		assertEquals(order.isExtraHot(), false);
	}
	
	@Test
	public void hotCoffeeIsHotCoffee() {
		String command = "Ch:::0.60";
		Order order = CoffeeMachine.process(command);
		assertNotNull(order);
		assertEquals(order.getDrink(), Order.DrinkType.COFFEE);
		assertEquals(order.getNbSugar(), new Integer(0));
		assertEquals(order.isHasStick(), false);
		assertEquals(order.getPrice(), new Double(0.60));
		assertEquals(order.isExtraHot(), true);
		
	}
	
	@Test
	public void hotChocolateIsHotChocolate() {
		String command = "Hh:1:0:0.50";
		Order order = CoffeeMachine.process(command);
		assertNotNull(order);
		assertEquals(order.getDrink(), Order.DrinkType.CHOCOLATE);
		assertEquals(order.getNbSugar(), new Integer(1));
		assertEquals(order.isHasStick(), true);
		assertEquals(order.getPrice(), new Double(0.50));
		assertEquals(order.isExtraHot(), true);
	}
	
	@Test
	public void hotTeaIsHotTea() {
		String command = "Th:2:0:0.40";
		Order order = CoffeeMachine.process(command);
		assertNotNull(order);
		assertEquals(order.getDrink(), Order.DrinkType.TEA);
		assertEquals(order.getNbSugar(), new Integer(2));
		assertEquals(order.isHasStick(), true);
		assertEquals(order.getPrice(), new Double(0.40));
		assertEquals(order.isExtraHot(), true);
	}
	
	

}
