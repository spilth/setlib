package com.buildndeploy.set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SymbolTest {

	@Test
	public void similarShapes() {
		assertEquals(Symbol.DIAMOND, Symbol.findThird(Symbol.DIAMOND, Symbol.DIAMOND));
		assertEquals(Symbol.CAPSULE, Symbol.findThird(Symbol.CAPSULE, Symbol.CAPSULE));
		assertEquals(Symbol.SQUIGGLE, Symbol.findThird(Symbol.SQUIGGLE, Symbol.SQUIGGLE));
	}

	@Test
	public void disimilarShapes() {
		assertEquals(Symbol.CAPSULE, Symbol.findThird(Symbol.DIAMOND, Symbol.SQUIGGLE));
		assertEquals(Symbol.CAPSULE, Symbol.findThird(Symbol.SQUIGGLE, Symbol.DIAMOND));
		assertEquals(Symbol.SQUIGGLE, Symbol.findThird(Symbol.CAPSULE, Symbol.DIAMOND));
		assertEquals(Symbol.SQUIGGLE, Symbol.findThird(Symbol.DIAMOND, Symbol.CAPSULE));
		assertEquals(Symbol.DIAMOND, Symbol.findThird(Symbol.CAPSULE, Symbol.SQUIGGLE));
		assertEquals(Symbol.DIAMOND, Symbol.findThird(Symbol.SQUIGGLE, Symbol.CAPSULE));
	}

	@Test
	public void ShapeAreSimilar() {
		assertTrue(Rules.areSimilar(Symbol.DIAMOND, Symbol.DIAMOND, Symbol.DIAMOND));
		assertTrue(Rules.areSimilar(Symbol.DIAMOND, Symbol.DIAMOND, Symbol.DIAMOND));
	}
	
	@Test
	public void ShapeAreUnique() {
		assertTrue(Rules.areUnique(Symbol.DIAMOND, Symbol.CAPSULE, Symbol.SQUIGGLE));
		assertFalse(Rules.areUnique(Symbol.DIAMOND, Symbol.CAPSULE, Symbol.CAPSULE));
	}
	
}
