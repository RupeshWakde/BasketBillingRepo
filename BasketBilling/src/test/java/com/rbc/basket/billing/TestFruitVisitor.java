/**
 * 
 */
package com.rbc.basket.billing;

import com.rbc.basket.billing.BasketVisitor;
import com.rbc.basket.billing.impl.BasketVisitorImpl;
import com.rbc.basket.billing.impl.Fruit;

import junit.framework.TestCase;

/**
 * @author Rupesh Wakde
 *
 */
public class TestFruitVisitor extends TestCase {

	public void testVisit1() {
		Fruit fruit = new Fruit("Bananas", 1.24, 2);
		BasketVisitor visitor = new BasketVisitorImpl();
		assertEquals("Bananas 2 @ 1.24", 2.48, visitor.visit(fruit));
	}
	
	public void testVisit2() {
		Fruit fruit = new Fruit("Peaches", 5, 3);
		BasketVisitor visitor = new BasketVisitorImpl();
		assertEquals("Peaches 3 @ 5", 15d, visitor.visit(fruit));
	}
	
	public void testVisit3() {
		Fruit fruit = new Fruit("Apples", 4.50, 4);
		BasketVisitor visitor = new BasketVisitorImpl();
		assertEquals("Apples 4 @ 4.50", 18d, visitor.visit(fruit));
	}
	
}
