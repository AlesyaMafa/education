package com.mafa.pet;

public abstract class Pet {

    private String name;
    private String breed;
    private int age;
    private String color;
    enum Type {cat, dog, horse};
    private Type type;

    public Pet(Type type, String name, String breed, int age, String color){
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.color=color;
        this.type=type;
    }

    public Type getType(){
        return this.type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getBreed(){
        return this.breed;
    }

    public void setBreed(String breed){
        this.breed=breed;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color=color;
    }

 }
