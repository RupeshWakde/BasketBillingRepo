package com.rbc.basket.billing;

/**
 * All new selling items should implement this
 * 
 * @author Rupesh Wakde
 *
 */
public interface BasketItem {

	public double accept(BasketVisitor visitor);
}
