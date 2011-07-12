package com.buildndeploy.set;

public enum CardColor {
	RED, GREEN, PURPLE;

	public static CardColor findThirdCardColor(CardColor first, CardColor second) {
		CardColor third = null;
		if (first.equals(second)) {
			third = first;

		} else {
			switch (first) {
				case RED:
					switch (second) {
						case GREEN:
							third = PURPLE;
							break;
						case PURPLE:
							third = GREEN;
							break;
					}
					break;
					
				case GREEN:
					switch (second) {
						case RED:
							third = PURPLE;
							break;
						case PURPLE:
							third = RED;
							break;
					}
					break;
					
				case PURPLE:
					switch (second) {
						case RED:
							third = GREEN;
							break;
						case GREEN:
							third = RED;
							break;
					}
					break;
					
			}

		}
		
		return third;
	}
}
