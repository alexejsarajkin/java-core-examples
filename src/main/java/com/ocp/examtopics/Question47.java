package com.ocp.examtopics;

public class Question47 {
}

//final class Cream {
class Cream {
    public void prepare() {
    }
}

class Cake extends Cream {
    public void bake(int min, int temp) {
    }

    public void mix() {
    }
}

class Shop {
    private Cake c = new Cake();
    private final double discount = 0.25;

    public void makeReady() {
        c.bake(10, 120);
    }
}

class Bread extends Cake {
    public void bake(int minutes, int temperature) {
    }

    public void addToppings() {
    }
}
