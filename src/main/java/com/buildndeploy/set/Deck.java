package com.buildndeploy.set;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	private List<Card> cards = new ArrayList<Card>();
	
	public Deck() {
		for (SymbolCount count : SymbolCount.values()) {
			for (SymbolColor color : SymbolColor.values()) {
				for (SymbolShading shading : SymbolShading.values()) {
					for (SymbolShape shape : SymbolShape.values()) {
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
}
