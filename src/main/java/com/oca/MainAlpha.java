package com.oca;

public class MainAlpha {
  public static void main(String[] args) {
    Beta beta = new Beta();
  }
}

class Alpha {
   Alpha doStuff(char c) {
    return new Alpha();
  }
}

class Beta extends Alpha {
   Beta doStuff(char c) {
    return new Beta();
  }
}