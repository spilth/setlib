package com.buildndeploy.set;

public class Card {

	private Count count;
	private Color color;
	private Symbol shape;
	private Shading shading;
	private String description;
	private String imageName;
	
	@SuppressWarnings("unused")
	private Card() {}
	
	public Card(Count count, Color color, Symbol symbol, Shading shading) {
		this.count = count;
		this.color = color;
		this.shape = symbol;
		this.shading = shading;		
		this.description = generateName(count, color, symbol, shading);
		this.imageName = generateImageName(count, color, symbol, shading);
	}

	private String generateImageName(Count count, Color color, Symbol symbol,
			Shading shading) {
		return new StringBuffer().append(count.ordinal()).append(color.ordinal()).append(symbol.ordinal()).append(shading.ordinal()).toString();
	}

	private String generateName(Count count, Color color, Symbol symbol,
			Shading shading) {
		return new StringBuffer().append(count.toString()).append(" ").append(color.toString()).append(" ").append(shading.toString()).append(" ").append(symbol.toString()).toString();
	}
	
	public String toString() {
		return description;
	}

	public Count getCount() {
		return count;
	}

	public Color getColor() {
		return color;
	}

	public Symbol getShape() {
		return shape;
	}

	public Shading getShading() {
		return shading;
	}

	public String getImageName() {
		return imageName;
	}
}
