package com.rbc.basket.billing;

import com.rbc.basket.billing.impl.Fruit;

/**
 * Any new basket item type visitor method should be declared here
 * 
 * @author Rupesh Wakde
 *
 */
public interface BasketVisitor {

	double visit(Fruit fruit);
}
