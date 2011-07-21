package com.buildndeploy.set;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Solver {
	private static Logger logger = LoggerFactory.getLogger("Solver");

	private Solver(){};
	
	public static boolean isSet(Card a, Card b, Card c) {
		return (
				Rules.isSet(a.getColor(), b.getColor(), c.getColor()) &&
				Rules.isSet(a.getCount(), b.getCount(), c.getCount()) &&
				Rules.isSet(a.getShading(), b.getShading(), c.getShading()) &&
				Rules.isSet(a.getShape(), b.getShape(), c.getShape())
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
						logger.debug("Set Found:" + cards[i] + ", "+ cards[j] + ", " + cards[k]);
					}
				}
			}
		}

		return sets;

	}

}
