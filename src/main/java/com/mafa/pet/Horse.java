package com.mafa.pet;

public class Horse extends Pet {

    private String horseshoe;

    public Horse(String name, String breed, byte age, String color, String horseshoe) {
        super(name, breed, age, color);
        this.horseshoe = horseshoe;
    }

    public Horse(Pet pet) {
        super(pet.getName(), pet.getBreed(), pet.getAge(), pet.getColor());
    }

    public String getHorseshoe() {
        return horseshoe;
    }

    public void setHorseshoe(String horseshoe) {
        this.horseshoe = horseshoe;
    }

    @Override
    public String toString() {
        return String.format("horse" + ", " + getName() + ", " + getBreed() + ", " + String.valueOf(getAge()) + ", " +  getColor() + ", " + getHorseshoe());
    }

}
