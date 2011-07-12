package com.buildndeploy.set;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolverTest {

	@Test
	public void simpleSet() {
		Card a = new Card(Card.NUMBER_1, Card.COLOR_RED, Card.SHAPE_CAPSULE, Card.SHADING_SOLID);
		Card b = new Card(Card.NUMBER_2, Card.COLOR_RED, Card.SHAPE_CAPSULE, Card.SHADING_SOLID);
		Card c = new Card(Card.NUMBER_3, Card.COLOR_RED, Card.SHAPE_CAPSULE, Card.SHADING_SOLID);
		assertTrue(Solver.isSet(a, b, c));
		
	}

}
