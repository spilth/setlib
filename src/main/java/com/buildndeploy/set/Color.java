package com.buildndeploy.set;

import java.util.EnumSet;

public enum Color {
	RED, GREEN, PURPLE;

	public static Color findThirdCardColor(Color first, Color second) {
		Color third = null;
		if (first.equals(second)) {
			third = first;

		} else {			
			EnumSet<Color> twoColors = EnumSet.of(first, second);
			third = (Color) EnumSet.complementOf(twoColors).toArray()[0];
		}
		
		return third;
	}
	
	public static boolean areSimilar(Color a, Color b, Color c) {
		return a.equals(b) && b.equals(c);
	}

	public static boolean areUnique(Color a, Color b, Color c) {
		return !a.equals(b) && !a.equals(c) && !b.equals(c);
	}

	public static boolean isSet(Color a, Color b, Color c) {
		return (areSimilar(a,b,c) || areUnique(a,b,c));
	}
}
