package com.buildndeploy.set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CountTest {

	@Test
	public void similarShading() {
		assertEquals(Count.ONE, Count.findThirdCardCount(Count.ONE, Count.ONE));
		assertEquals(Count.TWO, Count.findThirdCardCount(Count.TWO, Count.TWO));
		assertEquals(Count.THREE, Count.findThirdCardCount(Count.THREE, Count.THREE));
	}

	@Test
	public void disimilarCounts() {
		assertEquals(Count.TWO, Count.findThirdCardCount(Count.ONE, Count.THREE));
		assertEquals(Count.TWO, Count.findThirdCardCount(Count.THREE, Count.ONE));
		assertEquals(Count.THREE, Count.findThirdCardCount(Count.TWO, Count.ONE));
		assertEquals(Count.THREE, Count.findThirdCardCount(Count.ONE, Count.TWO));
		assertEquals(Count.ONE, Count.findThirdCardCount(Count.TWO, Count.THREE));
		assertEquals(Count.ONE, Count.findThirdCardCount(Count.THREE, Count.TWO));
	}

	@Test
	public void countAreSimilar() {
		assertTrue(Count.areSimilar(Count.ONE, Count.ONE, Count.ONE));
		assertTrue(Count.areSimilar(Count.ONE, Count.ONE, Count.ONE));
	}
	
	@Test
	public void countAreUnique() {
		assertTrue(Count.areUnique(Count.ONE, Count.TWO, Count.THREE));
		assertFalse(Count.areUnique(Count.ONE, Count.TWO, Count.TWO));
	}
	
}
