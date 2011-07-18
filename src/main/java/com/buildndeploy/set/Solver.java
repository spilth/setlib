package com.buildndeploy.set;

import java.util.ArrayList;
import java.util.List;

public class Solver {

	public static boolean isSet(Card a, Card b, Card c) {
		return (
				SymbolColor.isSet(a.getColor(), b.getColor(), c.getColor()) &&
				SymbolCount.isSet(a.getCount(), b.getCount(), c.getCount()) &&
				SymbolShading.isSet(a.getShading(), b.getShading(), c.getShading()) &&
				SymbolShape.isSet(a.getShape(), b.getShape(), c.getShape())
		);

	}

	public static List<int[]> findSets(List<Card> cardList) {
		List<int[]> sets = new ArrayList<int[]>();
		
		Object[] cards = cardList.toArray();
		
		Card first,second,third;
		
		for (int i = 0; i <cards.length; i++) {
			for (int j = i+1; j < cards.length; j++) {
				for (int k = j+1; k < cards.length ; k++) {
					first = (Card) cards[i];
					second = (Card) cards[j];
					third = (Card) cards[k];
					if (isSet(first, second, third)) {
						sets.add(new int[] {i,j,k});
					}
				}
			}
		}

		return sets;

	}

}
