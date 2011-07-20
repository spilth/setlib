package com.buildndeploy.set;

import java.util.EnumSet;

public enum Symbol {
	DIAMOND, CAPSULE, SQUIGGLE;

	public static Symbol findThirdCardShape(Symbol first, Symbol second) {
		Symbol third = null;
		if (first.equals(second)) {
			third = first;

		} else {
			EnumSet<Symbol> twoShapes = EnumSet.of(first, second);
			third = (Symbol) EnumSet.complementOf(twoShapes).toArray()[0];
		}
		
		return third;
	}
	
	public static boolean areSimilar(Symbol a, Symbol b, Symbol c) {
		return a.equals(b) && b.equals(c);
	}

	public static boolean areUnique(Symbol a, Symbol b, Symbol c) {
		return !a.equals(b) && !a.equals(c) && !b.equals(c);
	}

	public static boolean isSet(Symbol a, Symbol b, Symbol c) {
		return (areSimilar(a,b,c) || areUnique(a,b,c));
	}
}
