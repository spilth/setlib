package com.buildndeploy.set;

public class Solver {

	public static boolean isSet(Card a, Card b, Card c) {
		return (
				SymbolColor.isSet(a.getColor(), b.getColor(), c.getColor()) &&
				SymbolCount.isSet(a.getCount(), b.getCount(), c.getCount()) &&
				SymbolShading.isSet(a.getShading(), b.getShading(), c.getShading()) &&
				SymbolShape.isSet(a.getShape(), b.getShape(), c.getShape())
		);

	}

}
