package com.talbo.tdd.coffeeMachineTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.talbo.tdd.coffeeMachine.CoffeeMachine;
import com.talbo.tdd.coffeeMachine.Order;

public class CoffeeMachineTest {

	@Test
	public void teaIstea() {
		String command = "T:1:0";
		Order order = CoffeeMachine.process(command);
		assertNotNull(order);
		assertEquals(order.getDrink(), Order.DrinkType.TEA);
		assertEquals(order.getNbSugar(), new Integer(1));
		assertEquals(order.isHasStick(), true);
	}
	
	@Test
	public void chocolateIsChocolate() {
		String command = "H::";
		Order order = CoffeeMachine.process(command);
		assertNotNull(order);
		assertEquals(order.getDrink(), Order.DrinkType.CHOCOLATE);
		assertEquals(order.getNbSugar(), new Integer(0));
		assertEquals(order.isHasStick(), false);
		
	}
	
	@Test
	public void coffeeIsCoffee() {
		String command = "C:2:0";
		Order order = CoffeeMachine.process(command);
		assertNotNull(order);
		assertEquals(order.getDrink(), Order.DrinkType.COFFEE);
		assertEquals(order.getNbSugar(), new Integer(2));
		assertEquals(order.isHasStick(), true);
		
	}

}
