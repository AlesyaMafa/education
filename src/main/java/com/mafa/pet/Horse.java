package com.mafa.pet;

public class Horse extends Pet {

    private String horseshoe;

    public Horse(Type type, String name, String breed, int age, String color, String horseshoe) {
        super(type, name, breed, age, color);
        this.horseshoe=horseshoe;
    }

    public String getHorseshoe() {
        return horseshoe;
    }

    public void setHorseshoe(String horseshoe) {
        this.horseshoe = horseshoe;
    }
}
