package com.buildndeploy.set;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolverTest {

	@Test
	public void simpleSet() {
		Card a = new Card(CardCount.ONE, CardColor.RED, CardShape.CAPSULE, CardShading.SOLID);
		Card b = new Card(CardCount.TWO, CardColor.RED, CardShape.CAPSULE, CardShading.SOLID);
		Card c = new Card(CardCount.THREE, CardColor.RED, CardShape.CAPSULE, CardShading.SOLID);
		assertTrue(Solver.isSet(a, b, c));
	}
	
}
