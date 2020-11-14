package com.ocp.book.lambda;

public class DogPlay {
	DogQuerier dogQuerier;

	public DogPlay(DogQuerier dogQuerier) {
		this.dogQuerier = dogQuerier;
	}

	public boolean doQuery(Dog d) {
		return dogQuerier.test(d);
	}
}
