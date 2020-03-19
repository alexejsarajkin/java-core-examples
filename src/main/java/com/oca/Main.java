package com.oca;

public class Main {
  public static void main(String[] args) {
    B b = new B();
  }
}

class B extends A {

  public B() {
    test();
  }

  private void test() {
    System.out.println("Test B");
  }
}

class A {
  public A() {
    test();
  }

  private void test() {
    System.out.println("Test A");
  }
}
