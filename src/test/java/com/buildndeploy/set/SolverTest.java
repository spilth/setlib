package com.buildndeploy.set;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SolverTest {

	@Test
	public void simpleSet() {
		Card a = new Card(SymbolCount.ONE, SymbolColor.RED, SymbolShape.CAPSULE, SymbolShading.SOLID);
		Card b = new Card(SymbolCount.TWO, SymbolColor.RED, SymbolShape.CAPSULE, SymbolShading.SOLID);
		Card c = new Card(SymbolCount.THREE, SymbolColor.RED, SymbolShape.CAPSULE, SymbolShading.SOLID);
		assertTrue(Solver.isSet(a, b, c));
	}

	@Test
	public void complexSet() {
		Card a = new Card(SymbolCount.ONE, SymbolColor.RED, SymbolShape.CAPSULE, SymbolShading.SOLID);
		Card b = new Card(SymbolCount.TWO, SymbolColor.GREEN, SymbolShape.DIAMOND, SymbolShading.SHADED);
		Card c = new Card(SymbolCount.THREE, SymbolColor.PURPLE, SymbolShape.SQUIGGLE, SymbolShading.CLEAR);
		assertTrue(Solver.isSet(a, b, c));
	}

	@Test
	public void findSet() {
		Card a = new Card(SymbolCount.ONE, SymbolColor.RED, SymbolShape.CAPSULE, SymbolShading.SOLID);
		Card b = new Card(SymbolCount.TWO, SymbolColor.RED, SymbolShape.CAPSULE, SymbolShading.SOLID);
		Card c = new Card(SymbolCount.TWO, SymbolColor.GREEN, SymbolShape.CAPSULE, SymbolShading.SOLID);
		Card d = new Card(SymbolCount.THREE, SymbolColor.RED, SymbolShape.CAPSULE, SymbolShading.SOLID);
		Card e = new Card(SymbolCount.TWO, SymbolColor.PURPLE, SymbolShape.CAPSULE, SymbolShading.SOLID);

		List<Card> cards = new ArrayList<Card>();
		cards.add(a);
		cards.add(b);
		cards.add(c);
		cards.add(d);
		cards.add(e);
		
		assertEquals(2, Solver.findSets(cards).size());
		assertArrayEquals(new int[] {0,1,3}, Solver.findSets(cards).get(0));
		assertArrayEquals(new int[] {1,2,4}, Solver.findSets(cards).get(1));
	}
	
	@Test
	public void deckSetCount() {
		assertEquals(1080, Solver.findSets(new Deck().getCards()).size());
	}

}
