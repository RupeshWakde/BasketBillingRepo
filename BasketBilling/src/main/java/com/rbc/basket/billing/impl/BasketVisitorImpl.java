package com.rbc.basket.billing.impl;

import com.rbc.basket.billing.BasketVisitor;

public class BasketVisitorImpl implements BasketVisitor {

	public double visit(Fruit fruit) {
		double cost = fruit.getQuantity() * fruit.getPrice();
		//System.out.println(fruit + " cost =\t" + cost);
		return cost;
	}
}
