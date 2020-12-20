package com.ocp.book.selikoff_boyarsky.review.ch1;

public class Q2 {
    private int ISBN;
    private String title, author;
    private int pageCount;

    public int hashCode() {
        return ISBN;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Q2)) {
            return false;
        }
        Q2 other = (Q2) obj;
        return this.ISBN == other.ISBN;
    }
}
