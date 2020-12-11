package com.ocp.book.selikoff_boyarsky.review.ch1;

public class Q4 {
	private String city, mascot;
	private int numberOfPlayers;

	public boolean equals(Object obj) {
		if (!(obj instanceof Q4)) return false;
		Q4 other = (Q4) obj;
		return (city.equals(other.city) && mascot.equals(other.mascot));
	}

	public int hashCode() {
		return numberOfPlayers;
	}

}