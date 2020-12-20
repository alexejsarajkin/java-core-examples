package com.ocp.examtopics;

import java.io.IOException;

public class Question {
    public static void main(String[] args) {
        try {
            new Game().play();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Video {
    public void play() throws IOException {
        System.out.println("Video played");
    }
}

class Game extends Video {
//    @Override
//    public void play() throws Exception {
//        System.out.println("Game played");
//    }
}

// A compilation error occurs.
