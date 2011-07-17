package com.buildndeploy.set;

import java.util.EnumSet;

public enum SymbolColor {
	RED, GREEN, PURPLE;

	public static SymbolColor findThirdCardColor(SymbolColor first, SymbolColor second) {
		SymbolColor third = null;
		if (first.equals(second)) {
			third = first;

		} else {			
			EnumSet<SymbolColor> twoColors = EnumSet.of(first, second);
			third = (SymbolColor) EnumSet.complementOf(twoColors).toArray()[0];
		}
		
		return third;
	}
	
	public static boolean areSimilar(SymbolColor a, SymbolColor b, SymbolColor c) {
		return a.equals(b) && b.equals(c);
	}

	public static boolean areUnique(SymbolColor a, SymbolColor b, SymbolColor c) {
		return !a.equals(b) && !a.equals(c) && !b.equals(c);
	}

	public static boolean isSet(SymbolColor a, SymbolColor b, SymbolColor c) {
		return (areSimilar(a,b,c) || areUnique(a,b,c));
	}
}
