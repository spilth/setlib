package com.buildndeploy.set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SymbolShadingTest {

	@Test
	public void similarShading() {
		assertEquals(SymbolShading.SOLID, SymbolShading.findThirdCardShading(SymbolShading.SOLID, SymbolShading.SOLID));
		assertEquals(SymbolShading.SHADED, SymbolShading.findThirdCardShading(SymbolShading.SHADED, SymbolShading.SHADED));
		assertEquals(SymbolShading.CLEAR, SymbolShading.findThirdCardShading(SymbolShading.CLEAR, SymbolShading.CLEAR));
	}

	@Test
	public void disimilarColors() {
		assertEquals(SymbolShading.SHADED, SymbolShading.findThirdCardShading(SymbolShading.SOLID, SymbolShading.CLEAR));
		assertEquals(SymbolShading.SHADED, SymbolShading.findThirdCardShading(SymbolShading.CLEAR, SymbolShading.SOLID));
		assertEquals(SymbolShading.CLEAR, SymbolShading.findThirdCardShading(SymbolShading.SHADED, SymbolShading.SOLID));
		assertEquals(SymbolShading.CLEAR, SymbolShading.findThirdCardShading(SymbolShading.SOLID, SymbolShading.SHADED));
		assertEquals(SymbolShading.SOLID, SymbolShading.findThirdCardShading(SymbolShading.SHADED, SymbolShading.CLEAR));
		assertEquals(SymbolShading.SOLID, SymbolShading.findThirdCardShading(SymbolShading.CLEAR, SymbolShading.SHADED));
	}

	@Test
	public void shadingAreSimilar() {
		assertTrue(SymbolShading.areSimilar(SymbolShading.SOLID, SymbolShading.SOLID, SymbolShading.SOLID));
		assertTrue(SymbolShading.areSimilar(SymbolShading.SOLID, SymbolShading.SOLID, SymbolShading.SOLID));
	}
	
	@Test
	public void shadingAreUnique() {
		assertTrue(SymbolShading.areUnique(SymbolShading.SOLID, SymbolShading.SHADED, SymbolShading.CLEAR));
		assertFalse(SymbolShading.areUnique(SymbolShading.SOLID, SymbolShading.SHADED, SymbolShading.SHADED));
	}

	
}
