package com.javaex.problem04;

public class RectTriangle extends Shape {
	double width;
	double height;
	
	public RectTriangle() {}
	public RectTriangle(double w, double h) {
		super(3);
		this.width = w;
		this.height = h;
	}
	
	public double getArea() {
		return (width+height)/2;
	}
	public double getPerimeter() {
		return width+height+Math.sqrt((Math.pow(width, 2)+Math.pow(height,2)));
	}
}
