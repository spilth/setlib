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
	
	public Card(Count count, Color color, Symbol shape, Shading shading) {
		this.count = count;
		this.color = color;
		this.shape = shape;
		this.shading = shading;		
		this.description = new StringBuffer().append(count.toString()).append(" ").append(color.toString()).append(" ").append(shading.toString()).append(" ").append(shape.toString()).toString();
		this.imageName = new StringBuffer().append(count.ordinal()).append(color.ordinal()).append(shape.ordinal()).append(shading.ordinal()).toString();
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
