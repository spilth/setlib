package com.buildndeploy.set;

import java.util.EnumSet;

public enum CardCount {
	ONE, TWO, THREE;
	
	public static CardCount findThirdCardCount(CardCount first, CardCount second) {
		CardCount third = null;
		if (first.equals(second)) {
			third = first;

		} else {			
			EnumSet<CardCount> twoCounts = EnumSet.of(first, second);
			third = (CardCount) EnumSet.complementOf(twoCounts).toArray()[0];
		}
		
		return third;
	}
}
