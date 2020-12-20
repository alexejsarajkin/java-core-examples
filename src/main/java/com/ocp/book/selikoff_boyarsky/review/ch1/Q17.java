package com.ocp.book.selikoff_boyarsky.review.ch1;

public enum Q17 {

    MAMMAL(true),
    FISH(Boolean.FALSE),

    BIRD(false),

    REPTILE(false), AMPHIBIAN(false),

    INVERTEBRATE(false);

    boolean hasHair;

    private Q17(boolean hasHair) {
        this.hasHair = hasHair;
    }

    public boolean hasHair() {
        return hasHair;
    }

    public void giveWig() {
        hasHair = true;
    }
}
