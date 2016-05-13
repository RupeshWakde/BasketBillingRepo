/**
 * 
 */
package com.rbc.basket.billing;

import java.util.ArrayList;

import com.rbc.basket.billing.BasketItem;
import com.rbc.basket.billing.helper.BasketHelper;
import com.rbc.basket.billing.impl.Basket;
import com.rbc.basket.billing.impl.Fruit;

import junit.framework.TestCase;

/**
 * @author Rupesh Wakde
 *
 */
public class TestBasket extends TestCase {

	public void testBasket1() {
		Basket basket = new Basket();
		basket.addItem(new Fruit("Peaches", 5, 3));
		basket.addItem(new Fruit("Bananas", 1.24, 2));

		assertEquals("Total basket price", 17.48, basket.calculateTotal());
	}

	public void testBasket2() {
		Basket basket = new Basket();
		ArrayList<BasketItem> itemLst = new ArrayList<BasketItem>();
		itemLst.add(new Fruit("Peaches", 5, 3));
		itemLst.add(new Fruit("Bananas", 1.24, 2));
		basket.addItem(itemLst);

		assertEquals("Total basket price", 17.48, basket.calculateTotal());
	}

	public void testBasket3() {
		Basket basket = BasketHelper.getBasketList();

		assertEquals("Total basket price", 65.44, basket.calculateTotal());
	}

	public void testBasket4() {
		Basket basket = new Basket();
		basket.addItem(new Fruit("Bananas", 1.24, 6));
		basket.addItem(new Fruit("Oranges", 2.50, 4));
		basket.addItem(new Fruit("Apples", 4.50, 6));
		basket.addItem(new Fruit("Lemons", 1.10, 6));
		basket.addItem(new Fruit("Peaches", 2.40, 6));

		assertEquals("Total basket price", 65.44, basket.calculateTotal());
	}
}
