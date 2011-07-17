package com.buildndeploy.set;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SymbolShapeTest {

	@Test
	public void similarShapes() {
		assertEquals(SymbolShape.DIAMOND, SymbolShape.findThirdCardShape(SymbolShape.DIAMOND, SymbolShape.DIAMOND));
		assertEquals(SymbolShape.CAPSULE, SymbolShape.findThirdCardShape(SymbolShape.CAPSULE, SymbolShape.CAPSULE));
		assertEquals(SymbolShape.SQUIGGLE, SymbolShape.findThirdCardShape(SymbolShape.SQUIGGLE, SymbolShape.SQUIGGLE));
	}

	@Test
	public void disimilarShapes() {
		assertEquals(SymbolShape.CAPSULE, SymbolShape.findThirdCardShape(SymbolShape.DIAMOND, SymbolShape.SQUIGGLE));
		assertEquals(SymbolShape.CAPSULE, SymbolShape.findThirdCardShape(SymbolShape.SQUIGGLE, SymbolShape.DIAMOND));
		assertEquals(SymbolShape.SQUIGGLE, SymbolShape.findThirdCardShape(SymbolShape.CAPSULE, SymbolShape.DIAMOND));
		assertEquals(SymbolShape.SQUIGGLE, SymbolShape.findThirdCardShape(SymbolShape.DIAMOND, SymbolShape.CAPSULE));
		assertEquals(SymbolShape.DIAMOND, SymbolShape.findThirdCardShape(SymbolShape.CAPSULE, SymbolShape.SQUIGGLE));
		assertEquals(SymbolShape.DIAMOND, SymbolShape.findThirdCardShape(SymbolShape.SQUIGGLE, SymbolShape.CAPSULE));
	}
	
}
