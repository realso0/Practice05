package com.javaex.problem04;

public abstract class Shape {
	int countSides;
	
	public Shape() {}
	public Shape(int countSides) {
		this.countSides=countSides;
	}
	
	public int getCountSides() {
		return countSides;
	}

	public abstract double getArea();
	public abstract double getPerimeter();
	
}
