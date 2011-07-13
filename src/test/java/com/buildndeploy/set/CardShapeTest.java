package com.buildndeploy.set;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardShapeTest {

	@Test
	public void similarShapes() {
		assertEquals(CardShape.DIAMOND, CardShape.findThirdCardShape(CardShape.DIAMOND, CardShape.DIAMOND));
		assertEquals(CardShape.CAPSULE, CardShape.findThirdCardShape(CardShape.CAPSULE, CardShape.CAPSULE));
		assertEquals(CardShape.SQUIGGLE, CardShape.findThirdCardShape(CardShape.SQUIGGLE, CardShape.SQUIGGLE));
	}

	@Test
	public void disimilarShapes() {
		assertEquals(CardShape.CAPSULE, CardShape.findThirdCardShape(CardShape.DIAMOND, CardShape.SQUIGGLE));
		assertEquals(CardShape.CAPSULE, CardShape.findThirdCardShape(CardShape.SQUIGGLE, CardShape.DIAMOND));
		assertEquals(CardShape.SQUIGGLE, CardShape.findThirdCardShape(CardShape.CAPSULE, CardShape.DIAMOND));
		assertEquals(CardShape.SQUIGGLE, CardShape.findThirdCardShape(CardShape.DIAMOND, CardShape.CAPSULE));
		assertEquals(CardShape.DIAMOND, CardShape.findThirdCardShape(CardShape.CAPSULE, CardShape.SQUIGGLE));
		assertEquals(CardShape.DIAMOND, CardShape.findThirdCardShape(CardShape.SQUIGGLE, CardShape.CAPSULE));
	}
	
}
