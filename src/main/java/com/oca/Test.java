package com.oca;

interface Inter{
  default void run(){ System.out.println("Inter");}
}

class Parent {
  public void run(){ System.out.println("Parent");}
}

class Child extends Parent implements Inter {
  public static void main(String[] args) {
    new Child().run();
  }
}