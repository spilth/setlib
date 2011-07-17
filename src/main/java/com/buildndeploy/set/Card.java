package com.buildndeploy.set;

public class Card {

	private SymbolCount count;
	private SymbolColor color;
	private SymbolShape shape;
	private SymbolShading shading;
	
	@SuppressWarnings("unused")
	private Card() {}
	
	public Card(SymbolCount count, SymbolColor color, SymbolShape shape, SymbolShading shading) {
		this.count = count;
		this.color = color;
		this.shape = shape;
		this.shading = shading;		
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
