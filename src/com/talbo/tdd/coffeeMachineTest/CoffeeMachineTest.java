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
		
	}

}
