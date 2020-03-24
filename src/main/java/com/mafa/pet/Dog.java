package com.mafa.pet;

public class Dog extends Pet {

    private String tail;

    public Dog(String name, String breed, byte age, String color, String tail) {
        super(name, breed, age, color);
        this.tail = tail;
    }

    public Dog(Pet pet) {
        super(pet.getName(), pet.getBreed(), pet.getAge(), pet.getColor());
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return String.format("dog" + ", " + getName() + ", " + getBreed() + ", " + String.valueOf(getAge()) + ", " +  getColor() + ", " + getTail());
    }
}
