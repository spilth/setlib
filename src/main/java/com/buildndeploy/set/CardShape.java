package com.buildndeploy.set;

import java.util.EnumSet;

public enum CardShape {
	DIAMOND, CAPSULE, SQUIGGLE;

	public static CardShape findThirdCardShape(CardShape first, CardShape second) {
		CardShape third = null;
		if (first.equals(second)) {
			third = first;

		} else {
			EnumSet<CardShape> twoShapes = EnumSet.of(first, second);
			third = (CardShape) EnumSet.complementOf(twoShapes).toArray()[0];
		}
		
		return third;	}
}
