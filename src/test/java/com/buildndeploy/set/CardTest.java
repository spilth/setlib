package com.buildndeploy.set;

import static org.junit.Assert.*;

import org.junit.Test;


public class CardTest {

	@Test
	public void cardDescription() {
		Card card = new Card(Count.ONE, Color.RED, Symbol.CAPSULE, Shading.SOLID);
		assertEquals("ONE RED SOLID CAPSULE", card.toString());
	}
	
	@Test
	public void cardImageName() {
		Card card = new Card(Count.ONE, Color.RED, Symbol.DIAMOND, Shading.SOLID);
		assertEquals("0000", card.getImageName());

		card = new Card(Count.THREE, Color.PURPLE, Symbol.SQUIGGLE, Shading.CLEAR);
		assertEquals("2222", card.getImageName());

	}
}
