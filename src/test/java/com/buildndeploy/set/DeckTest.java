package com.buildndeploy.set;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;


public class DeckTest {
	@Test
	public void deckSize() {
		assertEquals(81, new Deck().size());
	}
	
	@Test
	public void shuffle() {
		Deck deck = new Deck();
		Card firstCard = deck.getCards().get(0);
		deck.shuffle();
		Card newFirstCard = deck.getCards().get(0);
		assertThat(newFirstCard, is(not(firstCard)));
	}
	
	@Test
	public void draw() {
		Deck deck = new Deck();
		deck.shuffle();
		deck.draw(12);
		assertEquals(69, deck.size());
	}
	
}
