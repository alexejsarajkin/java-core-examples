package com.ocp.examtopics;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class Question137 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fis = new FileInputStream("test.txt");
             InputStreamReader ist = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(ist)) {
            if (br.markSupported()) {
                System.out.println((char) br.read());
                br.mark(2);
                System.out.println((char) br.read());
                br.reset();
                System.out.println((char) br.read());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// 122
