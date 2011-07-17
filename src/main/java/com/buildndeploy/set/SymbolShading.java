package com.buildndeploy.set;

import java.util.EnumSet;

public enum SymbolShading {
	SOLID, SHADED, CLEAR;

	public static SymbolShading findThirdCardShading(SymbolShading first, SymbolShading second) {
		SymbolShading third = null;
		if (first.equals(second)) {
			third = first;

		} else {			
			EnumSet<SymbolShading> twoShadings = EnumSet.of(first, second);
			third = (SymbolShading) EnumSet.complementOf(twoShadings).toArray()[0];
		}
		
		return third;
	}

	public static boolean areSimilar(SymbolShading a, SymbolShading b, SymbolShading c) {
		return a.equals(b) && b.equals(c);
	}

	public static boolean areUnique(SymbolShading a, SymbolShading b, SymbolShading c) {
		return !a.equals(b) && !a.equals(c) && !b.equals(c);
	}

	public static boolean isSet(SymbolShading a, SymbolShading b, SymbolShading c) {
		return (areSimilar(a,b,c) || areUnique(a,b,c));
	}


}
