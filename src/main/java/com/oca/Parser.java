package com.oca;

import static java.lang.System.out;

public class Parser {
  String input = "0123";

  public void parseMe(String str) {
    int output = 0;
    try {
      String input = str;
      output = Integer.parseInt(input);
    } catch (IllegalArgumentException iae) {
      out.println("Wrong argument!");
    }
    out.println(
        "input: " + input + ", output: " + output);
  }

  public static void main(String[] args) {
    Parser p = new Parser();
    p.parseMe("2013");
  }
}