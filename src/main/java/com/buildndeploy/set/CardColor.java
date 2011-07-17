package com.buildndeploy.set;

import java.util.EnumSet;

public enum CardColor {
	RED, GREEN, PURPLE;

	public static CardColor findThirdCardColor(CardColor first, CardColor second) {
		CardColor third = null;
		if (first.equals(second)) {
			third = first;

		} else {			
			EnumSet<CardColor> twoColors = EnumSet.of(first, second);
			third = (CardColor) EnumSet.complementOf(twoColors).toArray()[0];
		}
		
		return third;
	}
	
	public static boolean areSimilar(CardColor a, CardColor b, CardColor c) {
		return a.equals(b) && b.equals(c);
	}

	public static boolean areUnique(CardColor a, CardColor b, CardColor c) {
		return !a.equals(b) && !a.equals(c) && !b.equals(c);
	}
}
