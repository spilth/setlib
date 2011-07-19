package com.buildndeploy.set;

import static org.junit.Assert.*;

import org.junit.Test;


public class CardTest {

	@Test
	public void cardDescription() {
		Card card = new Card(SymbolCount.ONE, SymbolColor.RED, SymbolShape.CAPSULE, SymbolShading.SOLID);
		assertEquals("ONE RED SOLID CAPSULE", card.toString());
	}
	
	@Test
	public void cardImageName() {
		Card card = new Card(SymbolCount.ONE, SymbolColor.RED, SymbolShape.DIAMOND, SymbolShading.SOLID);
		assertEquals("0000", card.getImageName());

		card = new Card(SymbolCount.THREE, SymbolColor.PURPLE, SymbolShape.SQUIGGLE, SymbolShading.CLEAR);
		assertEquals("2222", card.getImageName());

	}
}
