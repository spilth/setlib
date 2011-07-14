package com.buildndeploy.set;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardShadingTest {

	@Test
	public void similarShading() {
		assertEquals(CardShading.SOLID, CardShading.findThirdCardShading(CardShading.SOLID, CardShading.SOLID));
		assertEquals(CardShading.SHADED, CardShading.findThirdCardShading(CardShading.SHADED, CardShading.SHADED));
		assertEquals(CardShading.CLEAR, CardShading.findThirdCardShading(CardShading.CLEAR, CardShading.CLEAR));
	}

	@Test
	public void disimilarColors() {
		assertEquals(CardShading.SHADED, CardShading.findThirdCardShading(CardShading.SOLID, CardShading.CLEAR));
		assertEquals(CardShading.SHADED, CardShading.findThirdCardShading(CardShading.CLEAR, CardShading.SOLID));
		assertEquals(CardShading.CLEAR, CardShading.findThirdCardShading(CardShading.SHADED, CardShading.SOLID));
		assertEquals(CardShading.CLEAR, CardShading.findThirdCardShading(CardShading.SOLID, CardShading.SHADED));
		assertEquals(CardShading.SOLID, CardShading.findThirdCardShading(CardShading.SHADED, CardShading.CLEAR));
		assertEquals(CardShading.SOLID, CardShading.findThirdCardShading(CardShading.CLEAR, CardShading.SHADED));
	}
	
}
