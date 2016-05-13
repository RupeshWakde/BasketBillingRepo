package com.rbc.basket.billing;

import junit.framework.Test;
import junit.framework.TestSuite;

public class TestRunnerSuite {
	public static void main(String[] args) {
		junit.textui.TestRunner.run(suite());
	}

	public static Test suite() {
		TestSuite suite = new TestSuite("All Tests");
		suite.addTest(new TestSuite(TestFruitVisitor.class));
		suite.addTest(new TestSuite(TestBasket.class));
		return suite;

	}
}
