package com.ocp.book.selikoff_boyarsky.review.ch1;

public class Q16 {
    class Inner {
        public Inner() {
            System.out.println("test");
        }
    }

    public static void main(String[] args) {
        new Q16().doStuff();
    }

    private void doStuff() {
        Inner in1 = new Inner();
        Q16.Inner in3 = new Q16.Inner();
        Q16.Inner in5 = new Q16().new Inner();
    }
}
