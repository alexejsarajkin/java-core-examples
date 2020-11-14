package com;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		String str = "15681884330";
		System.out.println(new BigDecimal("15681884330"));
		System.out.println(new DecimalFormat("#").format(new BigDecimal("15681884330")));
	}
}
