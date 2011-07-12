package com.buildndeploy.set;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardColorTest {

	@Test
	public void similarColors() {
		assertEquals(CardColor.RED, CardColor.findThirdCardColor(CardColor.RED, CardColor.RED));
	}

	@Test
	public void disimilarColors() {
		assertEquals(CardColor.GREEN, CardColor.findThirdCardColor(CardColor.RED, CardColor.PURPLE));
	}

}
