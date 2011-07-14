package com.buildndeploy.set;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardCountTest {

	@Test
	public void similarShading() {
		assertEquals(CardCount.ONE, CardCount.findThirdCardCount(CardCount.ONE, CardCount.ONE));
		assertEquals(CardCount.TWO, CardCount.findThirdCardCount(CardCount.TWO, CardCount.TWO));
		assertEquals(CardCount.THREE, CardCount.findThirdCardCount(CardCount.THREE, CardCount.THREE));
	}

	@Test
	public void disimilarColors() {
		assertEquals(CardCount.TWO, CardCount.findThirdCardCount(CardCount.ONE, CardCount.THREE));
		assertEquals(CardCount.TWO, CardCount.findThirdCardCount(CardCount.THREE, CardCount.ONE));
		assertEquals(CardCount.THREE, CardCount.findThirdCardCount(CardCount.TWO, CardCount.ONE));
		assertEquals(CardCount.THREE, CardCount.findThirdCardCount(CardCount.ONE, CardCount.TWO));
		assertEquals(CardCount.ONE, CardCount.findThirdCardCount(CardCount.TWO, CardCount.THREE));
		assertEquals(CardCount.ONE, CardCount.findThirdCardCount(CardCount.THREE, CardCount.TWO));
	}
	
}
