package com.buildndeploy.set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ShadingTest {

	@Test
	public void similarShading() {
		assertEquals(Shading.SOLID, Shading.findThird(Shading.SOLID, Shading.SOLID));
		assertEquals(Shading.SHADED, Shading.findThird(Shading.SHADED, Shading.SHADED));
		assertEquals(Shading.CLEAR, Shading.findThird(Shading.CLEAR, Shading.CLEAR));
	}

	@Test
	public void disimilarColors() {
		assertEquals(Shading.SHADED, Shading.findThird(Shading.SOLID, Shading.CLEAR));
		assertEquals(Shading.SHADED, Shading.findThird(Shading.CLEAR, Shading.SOLID));
		assertEquals(Shading.CLEAR, Shading.findThird(Shading.SHADED, Shading.SOLID));
		assertEquals(Shading.CLEAR, Shading.findThird(Shading.SOLID, Shading.SHADED));
		assertEquals(Shading.SOLID, Shading.findThird(Shading.SHADED, Shading.CLEAR));
		assertEquals(Shading.SOLID, Shading.findThird(Shading.CLEAR, Shading.SHADED));
	}

	@Test
	public void shadingAreSimilar() {
		assertTrue(Rules.areSimilar(Shading.SOLID, Shading.SOLID, Shading.SOLID));
		assertTrue(Rules.areSimilar(Shading.SOLID, Shading.SOLID, Shading.SOLID));
	}
	
	@Test
	public void shadingAreUnique() {
		assertTrue(Rules.areUnique(Shading.SOLID, Shading.SHADED, Shading.CLEAR));
		assertFalse(Rules.areUnique(Shading.SOLID, Shading.SHADED, Shading.SHADED));
	}

	
}
