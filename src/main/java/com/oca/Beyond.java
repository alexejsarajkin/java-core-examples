package com.oca;

class Infinity {
}

public class Beyond extends Infinity {
    static Integer i;

    public static void main(String[] args) {
        int sw = 0;
        switch (sw) {
            case 0: {
                for (int x = 10; x > 5; x++) {
                    if (x > 10000000) x = 10;
                }
            }
            case 1: {
                int y = 7 * i;
                break;
            }
            case 2: {
                Infinity inf = new Beyond();
                Beyond b = (Beyond) inf;
            }
        }
        System.out.println(i);
    }
}
