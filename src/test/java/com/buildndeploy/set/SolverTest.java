package com.buildndeploy.set;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SolverTest {	
	@Test
	public void simpleSet() {
		Card a = new Card(Count.ONE, Color.RED, Symbol.CAPSULE, Shading.SOLID);
		Card b = new Card(Count.TWO, Color.RED, Symbol.CAPSULE, Shading.SOLID);
		Card c = new Card(Count.THREE, Color.RED, Symbol.CAPSULE, Shading.SOLID);
		assertTrue(Solver.isSet(a, b, c));
	}

	@Test
	public void complexSet() {
		Card a = new Card(Count.ONE, Color.RED, Symbol.CAPSULE, Shading.SOLID);
		Card b = new Card(Count.TWO, Color.GREEN, Symbol.DIAMOND, Shading.SHADED);
		Card c = new Card(Count.THREE, Color.PURPLE, Symbol.SQUIGGLE, Shading.CLEAR);
		assertTrue(Solver.isSet(a, b, c));
	}

	@Test
	public void findSet() {
		Card a = new Card(Count.ONE, Color.RED, Symbol.CAPSULE, Shading.SOLID);
		Card b = new Card(Count.TWO, Color.RED, Symbol.CAPSULE, Shading.SOLID);
		Card c = new Card(Count.TWO, Color.GREEN, Symbol.CAPSULE, Shading.SOLID);
		Card d = new Card(Count.THREE, Color.RED, Symbol.CAPSULE, Shading.SOLID);
		Card e = new Card(Count.TWO, Color.PURPLE, Symbol.CAPSULE, Shading.SOLID);

		List<Card> cards = new ArrayList<Card>();
		cards.add(a);
		cards.add(b);
		cards.add(c);
		cards.add(d);
		cards.add(e);
		
		assertEquals(2, Solver.findSets(cards).size());
		assertEquals(new Set(a, b, d), Solver.findSets(cards).get(0));
		assertEquals(new Set(b, c, e), Solver.findSets(cards).get(1));
	}
	
	@Test
	public void deckSetCount() {
		assertEquals(1080, Solver.findSets(new Deck().getCards()).size());
	}

	@Test
	public void drawHas0to13Sets() {
		Deck deck;
		List<Card> cards;
		List<Set> sets;
		
		for (int i = 0; i < 100; i++) {
			deck = new Deck();
			deck.shuffle();
			cards = deck.draw(12);
			sets = Solver.findSets(cards);
			assertTrue(sets.size() >= 0);
			assertTrue(sets.size() <= 13);
		}
	}

	
}
