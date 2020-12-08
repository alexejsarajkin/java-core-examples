package com.ocp.book.selikoff_boyarsky.review.ch3;

import java.util.Arrays;
import java.util.Comparator;

public class Q9 {
	public static void main(String[] args) {
		String[] values = {"123", "Abb", "aab"};
		Arrays.sort(values, new MyComparator());
		for (String s : values)
			System.out.print(s + " ");
	}
}


class MyComparator implements Comparator<String> {
	public int compare(String a, String b) {
		return b.toLowerCase().compareTo(a.toLowerCase());
	}
}