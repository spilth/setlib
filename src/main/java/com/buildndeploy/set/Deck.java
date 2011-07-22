package com.buildndeploy.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards = new ArrayList<Card>();
	
	public Deck() {
		generateStandardSetDeck();
	}

	private void generateStandardSetDeck() {
		for (Count count : Count.values()) {
			for (Color color : Color.values()) {
				for (Shading shading : Shading.values()) {
					for (Symbol shape : Symbol.values()) {
						Card card = new Card(count, color, shape, shading);
						cards.add(card);
					}	
				}
			}
		}
	}
	
	public List<Card> getCards() {
		return cards;
	}
	
	public int size() {
		return cards.size();
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public List<Card> draw(int count) {
		List<Card> draw = new ArrayList<Card>();
		for (int i = 0; i < count; i++) {
			Card card = cards.remove(0);
			draw.add(card);
		}
		return draw;
	}
}
