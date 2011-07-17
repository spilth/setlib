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
}
