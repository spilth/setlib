package com.buildndeploy.set;

public class Card {

	@SuppressWarnings("unused")
	private Card() {}
	
	public Card(String number, String color, String shape, String shading) {}

	public static final String SHADING_SOLID = "Solid";
	public static final String SHADING_SHADED = "Shaded";
	public static final String SHADING_CLEAR = "Clear";
	
	public static final String SHAPE_CAPSULE = "Capsule";
	public static final String SHAPE_DIAMOND = "Diamond";
	public static final String SHAPE_SQUIGGLE = "Squiggle";

	public static final String COLOR_RED = "Red";
	public static final String COLOR_GREEN = "Green";
	public static final String COLOR_PURPLE = "Purple";
	
	public static final String NUMBER_1 = "One";
	public static final String NUMBER_2 = "Two";
	public static final String NUMBER_3 = "Three";
}
