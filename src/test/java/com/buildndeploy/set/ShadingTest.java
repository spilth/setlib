package com.buildndeploy.set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ShadingTest {

	@Test
	public void similarShading() {
		assertEquals(Shading.SOLID, Shading.findThirdCardShading(Shading.SOLID, Shading.SOLID));
		assertEquals(Shading.SHADED, Shading.findThirdCardShading(Shading.SHADED, Shading.SHADED));
		assertEquals(Shading.CLEAR, Shading.findThirdCardShading(Shading.CLEAR, Shading.CLEAR));
	}

	@Test
	public void disimilarColors() {
		assertEquals(Shading.SHADED, Shading.findThirdCardShading(Shading.SOLID, Shading.CLEAR));
		assertEquals(Shading.SHADED, Shading.findThirdCardShading(Shading.CLEAR, Shading.SOLID));
		assertEquals(Shading.CLEAR, Shading.findThirdCardShading(Shading.SHADED, Shading.SOLID));
		assertEquals(Shading.CLEAR, Shading.findThirdCardShading(Shading.SOLID, Shading.SHADED));
		assertEquals(Shading.SOLID, Shading.findThirdCardShading(Shading.SHADED, Shading.CLEAR));
		assertEquals(Shading.SOLID, Shading.findThirdCardShading(Shading.CLEAR, Shading.SHADED));
	}

	@Test
	public void shadingAreSimilar() {
		assertTrue(Shading.areSimilar(Shading.SOLID, Shading.SOLID, Shading.SOLID));
		assertTrue(Shading.areSimilar(Shading.SOLID, Shading.SOLID, Shading.SOLID));
	}
	
	@Test
	public void shadingAreUnique() {
		assertTrue(Shading.areUnique(Shading.SOLID, Shading.SHADED, Shading.CLEAR));
		assertFalse(Shading.areUnique(Shading.SOLID, Shading.SHADED, Shading.SHADED));
	}

	
}
