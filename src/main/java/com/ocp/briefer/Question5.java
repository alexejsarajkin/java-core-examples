package com.ocp.briefer;

public class Question5 {

}

class Book {

    private String read(String bname) {
        return "Read" + bname;
    }
}

class EBook extends Book {
    public String read(String url) {
        return "View" + url;
    }
}

class Test {
    public static void main(String[] args) {
//        Book b1 = new Book();
//        b1.read("Java Programing");
//        Book b2 = new EBook();
//        b2.read("http://ebook.com/ebook");
    }
}
