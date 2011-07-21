package com.buildndeploy.set;

public class Rules {

	public static boolean isSet(Object first, Object second, Object third) {
		return (Rules.areSimilar(first,second,third) || Rules.areUnique(first,second,third));
	}

	public static boolean areUnique(Object first, Object second, Object third) {
		return !first.equals(second) && !first.equals(third) && !second.equals(third);
	}

	public static boolean areSimilar(Object first, Object second, Object third) {
		return first.equals(second) && second.equals(third);
	}
}
