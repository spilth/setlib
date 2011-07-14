package com.buildndeploy.set;

import java.util.EnumSet;

public enum CardShading {
	SOLID, SHADED, CLEAR;

	public static CardShading findThirdCardShading(CardShading first, CardShading second) {
		CardShading third = null;
		if (first.equals(second)) {
			third = first;

		} else {			
			EnumSet<CardShading> twoShadings = EnumSet.of(first, second);
			third = (CardShading) EnumSet.complementOf(twoShadings).toArray()[0];
		}
		
		return third;
	}
}
