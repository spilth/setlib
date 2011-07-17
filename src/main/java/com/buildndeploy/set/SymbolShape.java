package com.buildndeploy.set;

import java.util.EnumSet;

public enum SymbolShape {
	DIAMOND, CAPSULE, SQUIGGLE;

	public static SymbolShape findThirdCardShape(SymbolShape first, SymbolShape second) {
		SymbolShape third = null;
		if (first.equals(second)) {
			third = first;

		} else {
			EnumSet<SymbolShape> twoShapes = EnumSet.of(first, second);
			third = (SymbolShape) EnumSet.complementOf(twoShapes).toArray()[0];
		}
		
		return third;
	}
	
	public static boolean areSimilar(SymbolShape a, SymbolShape b, SymbolShape c) {
		return a.equals(b) && b.equals(c);
	}

	public static boolean areUnique(SymbolShape a, SymbolShape b, SymbolShape c) {
		return !a.equals(b) && !a.equals(c) && !b.equals(c);
	}
}
