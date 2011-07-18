package com.buildndeploy.set;

import static org.junit.Assert.*;

import org.junit.Test;


public class CardTest {

	@Test
	public void cardDescription() {
		Card card = new Card(SymbolCount.ONE, SymbolColor.RED, SymbolShape.CAPSULE, SymbolShading.SOLID);
		assertEquals("ONE RED SOLID CAPSULE", card.toString());
	}
}
