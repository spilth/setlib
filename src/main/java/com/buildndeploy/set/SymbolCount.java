package com.buildndeploy.set;

import java.util.EnumSet;

public enum SymbolCount {
	ONE, TWO, THREE;
	
	public static SymbolCount findThirdCardCount(SymbolCount first, SymbolCount second) {
		SymbolCount third = null;
		if (first.equals(second)) {
			third = first;

		} else {			
			EnumSet<SymbolCount> twoCounts = EnumSet.of(first, second);
			third = (SymbolCount) EnumSet.complementOf(twoCounts).toArray()[0];
		}
		
		return third;
	}
}
