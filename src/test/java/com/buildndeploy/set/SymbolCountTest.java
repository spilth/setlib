package com.buildndeploy.set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SymbolCountTest {

	@Test
	public void similarShading() {
		assertEquals(SymbolCount.ONE, SymbolCount.findThirdCardCount(SymbolCount.ONE, SymbolCount.ONE));
		assertEquals(SymbolCount.TWO, SymbolCount.findThirdCardCount(SymbolCount.TWO, SymbolCount.TWO));
		assertEquals(SymbolCount.THREE, SymbolCount.findThirdCardCount(SymbolCount.THREE, SymbolCount.THREE));
	}

	@Test
	public void disimilarCounts() {
		assertEquals(SymbolCount.TWO, SymbolCount.findThirdCardCount(SymbolCount.ONE, SymbolCount.THREE));
		assertEquals(SymbolCount.TWO, SymbolCount.findThirdCardCount(SymbolCount.THREE, SymbolCount.ONE));
		assertEquals(SymbolCount.THREE, SymbolCount.findThirdCardCount(SymbolCount.TWO, SymbolCount.ONE));
		assertEquals(SymbolCount.THREE, SymbolCount.findThirdCardCount(SymbolCount.ONE, SymbolCount.TWO));
		assertEquals(SymbolCount.ONE, SymbolCount.findThirdCardCount(SymbolCount.TWO, SymbolCount.THREE));
		assertEquals(SymbolCount.ONE, SymbolCount.findThirdCardCount(SymbolCount.THREE, SymbolCount.TWO));
	}

	@Test
	public void countAreSimilar() {
		assertTrue(SymbolCount.areSimilar(SymbolCount.ONE, SymbolCount.ONE, SymbolCount.ONE));
		assertTrue(SymbolCount.areSimilar(SymbolCount.ONE, SymbolCount.ONE, SymbolCount.ONE));
	}
	
	@Test
	public void countAreUnique() {
		assertTrue(SymbolCount.areUnique(SymbolCount.ONE, SymbolCount.TWO, SymbolCount.THREE));
		assertFalse(SymbolCount.areUnique(SymbolCount.ONE, SymbolCount.TWO, SymbolCount.TWO));
	}
	
}
