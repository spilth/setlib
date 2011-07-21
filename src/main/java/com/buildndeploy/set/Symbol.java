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
}
