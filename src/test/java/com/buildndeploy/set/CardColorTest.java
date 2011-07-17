package com.buildndeploy.set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CardColorTest {

	@Test
	public void similarColors() {
		assertEquals(CardColor.RED, CardColor.findThirdCardColor(CardColor.RED, CardColor.RED));
		assertEquals(CardColor.GREEN, CardColor.findThirdCardColor(CardColor.GREEN, CardColor.GREEN));
		assertEquals(CardColor.PURPLE, CardColor.findThirdCardColor(CardColor.PURPLE, CardColor.PURPLE));
	}

	@Test
	public void disimilarColors() {
		assertEquals(CardColor.GREEN, CardColor.findThirdCardColor(CardColor.RED, CardColor.PURPLE));
		assertEquals(CardColor.GREEN, CardColor.findThirdCardColor(CardColor.PURPLE, CardColor.RED));
		assertEquals(CardColor.PURPLE, CardColor.findThirdCardColor(CardColor.GREEN, CardColor.RED));
		assertEquals(CardColor.PURPLE, CardColor.findThirdCardColor(CardColor.RED, CardColor.GREEN));
		assertEquals(CardColor.RED, CardColor.findThirdCardColor(CardColor.GREEN, CardColor.PURPLE));
		assertEquals(CardColor.RED, CardColor.findThirdCardColor(CardColor.PURPLE, CardColor.GREEN));
	}

	@Test
	public void colorsAreSimilar() {
		assertTrue(CardColor.areSimilar(CardColor.RED, CardColor.RED, CardColor.RED));
		assertTrue(CardColor.areSimilar(CardColor.RED, CardColor.RED, CardColor.RED));
	}
	
	@Test
	public void colorsAreUnique() {
		assertTrue(CardColor.areUnique(CardColor.RED, CardColor.GREEN, CardColor.PURPLE));
		assertFalse(CardColor.areUnique(CardColor.RED, CardColor.GREEN, CardColor.GREEN));
	}
	
}
