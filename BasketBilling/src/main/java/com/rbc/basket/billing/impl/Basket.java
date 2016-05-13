package com.rbc.basket.billing.impl;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import com.rbc.basket.billing.BasketItem;
import com.rbc.basket.billing.BasketVisitor;

public class Basket {

	List<BasketItem> items;

	public Basket() {
		this.items = new LinkedList<BasketItem>();
	}

	public Basket(List<BasketItem> list) {
		this.items = list;
	}

	public void addItem(BasketItem item) {
		this.items.add(item);
	}
	
	public void addItem(Collection<BasketItem> items) {
		this.items.addAll(items);
	}

	public void removeItem(BasketItem item) {
		this.items.remove(item);
	}

	public double calculateTotal() {
		validate();
		BasketVisitor visitor = new BasketVisitorImpl();
		double sum = 0;
		for (BasketItem item : items) {
			sum += item.accept(visitor);
		}
		return sum;
	}

	private void validate() {
		// TODO This can have validations if and can throw custom exception 	
	}

}
