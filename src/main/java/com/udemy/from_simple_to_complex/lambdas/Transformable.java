package com.udemy.from_simple_to_complex.lambdas;

@FunctionalInterface
public interface Transformable<T> {

	T transform(T t);

}
