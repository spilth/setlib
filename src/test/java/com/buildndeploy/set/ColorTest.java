package com.buildndeploy.set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ColorTest {

	@Test
	public void similarColors() {
		assertEquals(Color.RED, Color.findThirdCardColor(Color.RED, Color.RED));
		assertEquals(Color.GREEN, Color.findThirdCardColor(Color.GREEN, Color.GREEN));
		assertEquals(Color.PURPLE, Color.findThirdCardColor(Color.PURPLE, Color.PURPLE));
	}

	@Test
	public void disimilarColors() {
		assertEquals(Color.GREEN, Color.findThirdCardColor(Color.RED, Color.PURPLE));
		assertEquals(Color.GREEN, Color.findThirdCardColor(Color.PURPLE, Color.RED));
		assertEquals(Color.PURPLE, Color.findThirdCardColor(Color.GREEN, Color.RED));
		assertEquals(Color.PURPLE, Color.findThirdCardColor(Color.RED, Color.GREEN));
		assertEquals(Color.RED, Color.findThirdCardColor(Color.GREEN, Color.PURPLE));
		assertEquals(Color.RED, Color.findThirdCardColor(Color.PURPLE, Color.GREEN));
	}

	@Test
	public void colorsAreSimilar() {
		assertTrue(Color.areSimilar(Color.RED, Color.RED, Color.RED));
		assertTrue(Color.areSimilar(Color.RED, Color.RED, Color.RED));
	}
	
	@Test
	public void colorsAreUnique() {
		assertTrue(Color.areUnique(Color.RED, Color.GREEN, Color.PURPLE));
		assertFalse(Color.areUnique(Color.RED, Color.GREEN, Color.GREEN));
	}
	
}
