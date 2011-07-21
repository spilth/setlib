package com.buildndeploy.set;

public class Rules {

	public static boolean isSet(Object a, Object b, Object c) {
		return (Rules.areSimilar(a,b,c) || Rules.areUnique(a,b,c));
	}

	public static boolean areUnique(Object a, Object b, Object c) {
		return !a.equals(b) && !a.equals(c) && !b.equals(c);
	}

	public static boolean areSimilar(Object a, Object b, Object c) {
		return a.equals(b) && b.equals(c);
	}
}
