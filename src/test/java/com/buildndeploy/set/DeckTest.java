package com.buildndeploy.set;

import static org.junit.Assert.*;

import org.junit.Test;


public class DeckTest {
	@Test
	public void deckSize() {
		assertEquals(81, new Deck().size());
	}
	
}
