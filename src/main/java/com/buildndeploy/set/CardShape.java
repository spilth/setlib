package com.buildndeploy.set;

public enum CardShape {
	DIAMOND, CAPSULE, SQUIGGLE;

	public static CardShape findThirdCardShape(CardShape first, CardShape second) {
		CardShape third = null;
		if (first.equals(second)) {
			third = first;

		} else {
			switch (first) {
				case DIAMOND:
					switch (second) {
						case CAPSULE:
							third = SQUIGGLE;
							break;
						case SQUIGGLE:
							third = CAPSULE;
							break;
					}
					break;
					
				case CAPSULE:
					switch (second) {
						case DIAMOND:
							third = SQUIGGLE;
							break;
						case SQUIGGLE:
							third = DIAMOND;
							break;
					}
					break;
					
				case SQUIGGLE:
					switch (second) {
						case DIAMOND:
							third = CAPSULE;
							break;
						case CAPSULE:
							third = DIAMOND;
							break;
					}
					break;
					
			}

		}
		
		return third;	}
}
