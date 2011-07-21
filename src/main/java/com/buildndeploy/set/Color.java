package com.buildndeploy.set;

import java.util.EnumSet;

public enum Color {
	RED, GREEN, PURPLE;

	public static Color findThird(Color first, Color second) {
		Color third = null;
		if (first.equals(second)) {
			third = first;

		} else {			
			EnumSet<Color> twoColors = EnumSet.of(first, second);
			third = (Color) EnumSet.complementOf(twoColors).toArray()[0];
		}
		
		return third;
	}
}
