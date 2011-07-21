package com.buildndeploy.set;

import java.util.EnumSet;

public enum Shading {
	SOLID, SHADED, CLEAR;

	public static Shading findThirdCardShading(Shading first, Shading second) {
		Shading third = null;
		if (first.equals(second)) {
			third = first;

		} else {			
			EnumSet<Shading> twoShadings = EnumSet.of(first, second);
			third = (Shading) EnumSet.complementOf(twoShadings).toArray()[0];
		}
		
		return third;
	}
}
