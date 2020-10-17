package com.oca;

public class InitOrder {
	public String first = "instance";

	public InitOrder() {
		first = "constructor";
	}

	{
		first = "block";
	}

	public void print() {
		System.out.println(first);
	}

	public static void main(String... args) {
		new InitOrder().print();
	}
}
