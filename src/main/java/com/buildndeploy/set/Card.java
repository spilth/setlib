package com.buildndeploy.set;

public class Card {

	private SymbolCount count;
	private SymbolColor color;
	private SymbolShape shape;
	private SymbolShading shading;
	private String description;
	
	@SuppressWarnings("unused")
	private Card() {}
	
	public Card(SymbolCount count, SymbolColor color, SymbolShape shape, SymbolShading shading) {
		this.count = count;
		this.color = color;
		this.shape = shape;
		this.shading = shading;		
		this.description = new StringBuffer().append(count.toString()).append(" ").append(color.toString()).append(" ").append(shading.toString()).append(" ").append(shape.toString()).toString();
	}
	
	public String toString() {
		return description;
	}

	public SymbolCount getCount() {
		return count;
	}

	public SymbolColor getColor() {
		return color;
	}

	public SymbolShape getShape() {
		return shape;
	}

	public SymbolShading getShading() {
		return shading;
	}
}
