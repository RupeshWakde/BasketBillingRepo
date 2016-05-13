package com.rbc.basket.billing.impl;

import com.rbc.basket.billing.BasketItem;
import com.rbc.basket.billing.BasketVisitor;

public class Fruit implements BasketItem {

	private String name;
	private double price;
	private int quantity;

	public Fruit() {
		// default constructor
	}

	public Fruit(String name, double price, int quantity) {
		this.quantity = quantity;
		this.name = name;
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double accept(BasketVisitor visitor) {
		return visitor.visit(this);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[Name : ");
		sb.append(name);
		sb.append(", Price : ");
		sb.append(price);
		sb.append(", Quantity : ");
		sb.append(quantity);
		sb.append(" ]");
		return sb.toString();
	}
}
