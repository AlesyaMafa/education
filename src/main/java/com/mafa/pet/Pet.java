package com.mafa.pet;

public class Pet {

    private String name;
    private String breed;
    private byte age;
    private String color;

    public Pet(String name, String breed, byte age, String color){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public Pet() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public byte getAge() {
        return this.age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format(getName() + ", " + getBreed() + ", " + String.valueOf(getAge()) + ", " +  getColor());
    }
 }
