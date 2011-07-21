package com.buildndeploy.set;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Solver {
	private static Logger logger = LoggerFactory.getLogger("Solver");

	private Solver(){};
	
	public static boolean isSet(Card first, Card second, Card third) {
		return (
				Rules.isSet(first.getColor(), second.getColor(), third.getColor()) &&
				Rules.isSet(first.getCount(), second.getCount(), third.getCount()) &&
				Rules.isSet(first.getShading(), second.getShading(), third.getShading()) &&
				Rules.isSet(first.getShape(), second.getShape(), third.getShape())
		);
	}

	public static List<int[]> findSets(List<Card> cardList) {
		List<int[]> sets = new ArrayList<int[]>();
		
		Object[] cards = cardList.toArray();
		
		Card first,second,third;
		
		for (int firstIndex = 0; firstIndex <cards.length; firstIndex++) {
			for (int secondIndex = firstIndex+1; secondIndex < cards.length; secondIndex++) {
				for (int thirdIndex = secondIndex+1; thirdIndex < cards.length ; thirdIndex++) {
					first = (Card) cards[firstIndex];
					second = (Card) cards[secondIndex];
					third = (Card) cards[thirdIndex];
					if (isSet(first, second, third)) {
						sets.add(new int[] {firstIndex,secondIndex,thirdIndex});
						logger.debug("Set Found:" + cards[firstIndex] + ", "+ cards[secondIndex] + ", " + cards[thirdIndex]);
					}
				}
			}
		}

		return sets;

	}

}
