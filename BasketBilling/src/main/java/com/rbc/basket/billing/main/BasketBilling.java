package com.rbc.basket.billing.main;

import com.rbc.basket.billing.helper.BasketHelper;
import com.rbc.basket.billing.impl.Basket;

public class BasketBilling {

	public static void main(String[] args) {
		Basket basket = BasketHelper.getBasketList();
		
		System.out.println("Total cost:\t" + basket.calculateTotal());
	}

}
