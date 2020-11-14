package com.udemy.from_simple_to_complex.lambdas.model;

public class Rectangle implements Shape {
	public Rectangle() {
		System.out.println("Creating rectangle");
	}

	@Override
	public double calcSquare() {
		return 3;
	}


}
