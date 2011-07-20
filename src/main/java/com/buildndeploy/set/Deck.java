package com.buildndeploy.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Deck {
	private List<Card> cards = new ArrayList<Card>();
	private static Logger logger = LoggerFactory.getLogger("Solver");
	
	public Deck() {
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
			logger.debug(card.toString());
			draw.add(card);
		}
		return draw;
	}
}
