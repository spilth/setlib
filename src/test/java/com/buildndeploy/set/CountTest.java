package com.buildndeploy.set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CountTest {

	@Test
	public void similarShading() {
		assertEquals(Count.ONE, Count.findThird(Count.ONE, Count.ONE));
		assertEquals(Count.TWO, Count.findThird(Count.TWO, Count.TWO));
		assertEquals(Count.THREE, Count.findThird(Count.THREE, Count.THREE));
	}

	@Test
	public void disimilarCounts() {
		assertEquals(Count.TWO, Count.findThird(Count.ONE, Count.THREE));
		assertEquals(Count.TWO, Count.findThird(Count.THREE, Count.ONE));
		assertEquals(Count.THREE, Count.findThird(Count.TWO, Count.ONE));
		assertEquals(Count.THREE, Count.findThird(Count.ONE, Count.TWO));
		assertEquals(Count.ONE, Count.findThird(Count.TWO, Count.THREE));
		assertEquals(Count.ONE, Count.findThird(Count.THREE, Count.TWO));
	}

	@Test
	public void countAreSimilar() {
		assertTrue(Rules.areSimilar(Count.ONE, Count.ONE, Count.ONE));
		assertTrue(Rules.areSimilar(Count.ONE, Count.ONE, Count.ONE));
	}
	
	@Test
	public void countAreUnique() {
		assertTrue(Rules.areUnique(Count.ONE, Count.TWO, Count.THREE));
		assertFalse(Rules.areUnique(Count.ONE, Count.TWO, Count.TWO));
	}
	
}
