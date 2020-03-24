package com.mafa.pet;

public class Cat extends Pet {

    private String hair;

    public Cat(String name, String breed, byte age, String color, String hair) {
        super(name, breed, age, color);
        this.hair = hair;
    }

    public Cat(Pet pet) {
        super(pet.getName(), pet.getBreed(), pet.getAge(), pet.getColor());
    }

    public String getHair () {
        return this.hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String toString() {
        return String.format("cat" + ", " + getName() + ", " + getBreed() + ", " + String.valueOf(getAge()) + ", " +  getColor() + ", " + getHair());
    }
}
