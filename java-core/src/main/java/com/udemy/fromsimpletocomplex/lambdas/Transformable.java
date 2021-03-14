package com.udemy.fromsimpletocomplex.lambdas;

@FunctionalInterface
public interface Transformable<T> {

    T transform(T t);

}
