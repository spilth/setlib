package com.buildndeploy.set;

import java.util.EnumSet;

public enum Count {
	ONE, TWO, THREE;
	
	public static Count findThirdCardCount(Count first, Count second) {
		Count third = null;
		if (first.equals(second)) {
			third = first;

		} else {			
			EnumSet<Count> twoCounts = EnumSet.of(first, second);
			third = (Count) EnumSet.complementOf(twoCounts).toArray()[0];
		}
		
		return third;
	}
}
