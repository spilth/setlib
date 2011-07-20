package com.buildndeploy.set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SymbolTest {

	@Test
	public void similarShapes() {
		assertEquals(Symbol.DIAMOND, Symbol.findThirdCardShape(Symbol.DIAMOND, Symbol.DIAMOND));
		assertEquals(Symbol.CAPSULE, Symbol.findThirdCardShape(Symbol.CAPSULE, Symbol.CAPSULE));
		assertEquals(Symbol.SQUIGGLE, Symbol.findThirdCardShape(Symbol.SQUIGGLE, Symbol.SQUIGGLE));
	}

	@Test
	public void disimilarShapes() {
		assertEquals(Symbol.CAPSULE, Symbol.findThirdCardShape(Symbol.DIAMOND, Symbol.SQUIGGLE));
		assertEquals(Symbol.CAPSULE, Symbol.findThirdCardShape(Symbol.SQUIGGLE, Symbol.DIAMOND));
		assertEquals(Symbol.SQUIGGLE, Symbol.findThirdCardShape(Symbol.CAPSULE, Symbol.DIAMOND));
		assertEquals(Symbol.SQUIGGLE, Symbol.findThirdCardShape(Symbol.DIAMOND, Symbol.CAPSULE));
		assertEquals(Symbol.DIAMOND, Symbol.findThirdCardShape(Symbol.CAPSULE, Symbol.SQUIGGLE));
		assertEquals(Symbol.DIAMOND, Symbol.findThirdCardShape(Symbol.SQUIGGLE, Symbol.CAPSULE));
	}

	@Test
	public void ShapeAreSimilar() {
		assertTrue(Symbol.areSimilar(Symbol.DIAMOND, Symbol.DIAMOND, Symbol.DIAMOND));
		assertTrue(Symbol.areSimilar(Symbol.DIAMOND, Symbol.DIAMOND, Symbol.DIAMOND));
	}
	
	@Test
	public void ShapeAreUnique() {
		assertTrue(Symbol.areUnique(Symbol.DIAMOND, Symbol.CAPSULE, Symbol.SQUIGGLE));
		assertFalse(Symbol.areUnique(Symbol.DIAMOND, Symbol.CAPSULE, Symbol.CAPSULE));
	}
	
}
