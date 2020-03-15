package com.mafa.pet;

public class Dog extends Pet {

    private String tail;

    public Dog(Type type, String name, String breed, int age, String color, String tail) {
        super(type, name, breed, age, color);
        this.tail=tail;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
