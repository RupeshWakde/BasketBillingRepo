package com.rbc.basket.billing.helper;

import com.rbc.basket.billing.impl.Basket;
import com.rbc.basket.billing.impl.Fruit;

public class BasketHelper {

	public static Basket getBasketList() {
		Basket basket = new Basket();
		basket.addItem(new Fruit("Bananas", 1.24, 6));
		basket.addItem(new Fruit("Oranges", 2.50, 4));
		basket.addItem(new Fruit("Apples", 4.50, 6));
		basket.addItem(new Fruit("Lemons", 1.10, 6));
		basket.addItem(new Fruit("Peaches", 2.40, 6));
		return basket;
	}

}
