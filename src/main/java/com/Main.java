package com;


import java.util.stream.Stream;

public class Main implements Two {

	public static void main(String[] args) {
//		Stream<Integer>.of(1,2).count();      // n1
		Stream.<Integer>of(1, 2).count();      // n2
//		Stream.<>of(1,2).count();             // n3
		Stream.of(1, 2).count();               // n4

	}


}

interface One{
	void run();
}

interface Two extends One{
	@Override
	default void run(){}
}
