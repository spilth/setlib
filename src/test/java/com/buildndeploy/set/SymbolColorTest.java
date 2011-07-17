package com.buildndeploy.set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SymbolColorTest {

	@Test
	public void similarColors() {
		assertEquals(SymbolColor.RED, SymbolColor.findThirdCardColor(SymbolColor.RED, SymbolColor.RED));
		assertEquals(SymbolColor.GREEN, SymbolColor.findThirdCardColor(SymbolColor.GREEN, SymbolColor.GREEN));
		assertEquals(SymbolColor.PURPLE, SymbolColor.findThirdCardColor(SymbolColor.PURPLE, SymbolColor.PURPLE));
	}

	@Test
	public void disimilarColors() {
		assertEquals(SymbolColor.GREEN, SymbolColor.findThirdCardColor(SymbolColor.RED, SymbolColor.PURPLE));
		assertEquals(SymbolColor.GREEN, SymbolColor.findThirdCardColor(SymbolColor.PURPLE, SymbolColor.RED));
		assertEquals(SymbolColor.PURPLE, SymbolColor.findThirdCardColor(SymbolColor.GREEN, SymbolColor.RED));
		assertEquals(SymbolColor.PURPLE, SymbolColor.findThirdCardColor(SymbolColor.RED, SymbolColor.GREEN));
		assertEquals(SymbolColor.RED, SymbolColor.findThirdCardColor(SymbolColor.GREEN, SymbolColor.PURPLE));
		assertEquals(SymbolColor.RED, SymbolColor.findThirdCardColor(SymbolColor.PURPLE, SymbolColor.GREEN));
	}

	@Test
	public void colorsAreSimilar() {
		assertTrue(SymbolColor.areSimilar(SymbolColor.RED, SymbolColor.RED, SymbolColor.RED));
		assertTrue(SymbolColor.areSimilar(SymbolColor.RED, SymbolColor.RED, SymbolColor.RED));
	}
	
	@Test
	public void colorsAreUnique() {
		assertTrue(SymbolColor.areUnique(SymbolColor.RED, SymbolColor.GREEN, SymbolColor.PURPLE));
		assertFalse(SymbolColor.areUnique(SymbolColor.RED, SymbolColor.GREEN, SymbolColor.GREEN));
	}
	
}
