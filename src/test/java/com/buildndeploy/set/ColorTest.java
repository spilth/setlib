package com.buildndeploy.set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ColorTest {

	@Test
	public void similarColors() {
		assertEquals(Color.RED, Color.findThird(Color.RED, Color.RED));
		assertEquals(Color.GREEN, Color.findThird(Color.GREEN, Color.GREEN));
		assertEquals(Color.PURPLE, Color.findThird(Color.PURPLE, Color.PURPLE));
	}

	@Test
	public void disimilarColors() {
		assertEquals(Color.GREEN, Color.findThird(Color.RED, Color.PURPLE));
		assertEquals(Color.GREEN, Color.findThird(Color.PURPLE, Color.RED));
		assertEquals(Color.PURPLE, Color.findThird(Color.GREEN, Color.RED));
		assertEquals(Color.PURPLE, Color.findThird(Color.RED, Color.GREEN));
		assertEquals(Color.RED, Color.findThird(Color.GREEN, Color.PURPLE));
		assertEquals(Color.RED, Color.findThird(Color.PURPLE, Color.GREEN));
	}

	@Test
	public void colorsAreSimilar() {
		assertTrue(Rules.areSimilar(Color.RED, Color.RED, Color.RED));
		assertTrue(Rules.areSimilar(Color.RED, Color.RED, Color.RED));
	}
	
	@Test
	public void colorsAreUnique() {
		assertTrue(Rules.areUnique(Color.RED, Color.GREEN, Color.PURPLE));
		assertFalse(Rules.areUnique(Color.RED, Color.GREEN, Color.GREEN));
	}
	
}
