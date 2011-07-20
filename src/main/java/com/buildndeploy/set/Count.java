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

	public static boolean areSimilar(Count a, Count b, Count c) {
		return a.equals(b) && b.equals(c);
	}

	public static boolean areUnique(Count a, Count b, Count c) {
		return !a.equals(b) && !a.equals(c) && !b.equals(c);
	}

	public static boolean isSet(Count a, Count b, Count c) {
		return (areSimilar(a,b,c) || areUnique(a,b,c));
	}

}
