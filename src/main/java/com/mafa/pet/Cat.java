package com.mafa.pet;

public class Cat extends Pet {

    private String hair;

    public Cat(Type type, String name, String breed, int age, String color, String hair) {
        super(type, name, breed, age, color);
        this.hair=hair;
    }

    public String getHair (){
        return this.hair;
    }
     public void setHair(String hair){
        this.hair=hair;
     }
}
