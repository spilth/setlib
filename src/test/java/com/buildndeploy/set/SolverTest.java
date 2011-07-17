package com.buildndeploy.set;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolverTest {

	@Test
	public void simpleSet() {
		Card a = new Card(SymbolCount.ONE, SymbolColor.RED, SymbolShape.CAPSULE, SymbolShading.SOLID);
		Card b = new Card(SymbolCount.TWO, SymbolColor.RED, SymbolShape.CAPSULE, SymbolShading.SOLID);
		Card c = new Card(SymbolCount.THREE, SymbolColor.RED, SymbolShape.CAPSULE, SymbolShading.SOLID);
		assertTrue(Solver.isSet(a, b, c));
	}

	public void complexSet() {
		Card a = new Card(SymbolCount.ONE, SymbolColor.RED, SymbolShape.CAPSULE, SymbolShading.SOLID);
		Card b = new Card(SymbolCount.TWO, SymbolColor.GREEN, SymbolShape.DIAMOND, SymbolShading.SHADED);
		Card c = new Card(SymbolCount.THREE, SymbolColor.PURPLE, SymbolShape.SQUIGGLE, SymbolShading.CLEAR);
		assertTrue(Solver.isSet(a, b, c));
	}
}
