package com.ocp.briefer;

public class Question35 {
}

class Canvas implements Drawable {
    public void draw() {
    }
}

abstract class Board extends Canvas {
}

class Paper extends Canvas {
    protected void draw(int color) {
    }
}

class Frame extends Canvas implements Drawable {
    public void resize() {
    }
}

interface Drawable {
    public abstract void draw();
}
