package com.mafa.pet;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Operation implements IOperation {

    ArrayList<Pet> storage = new ArrayList<>();
    final static String NAME = "Input name: ";
    final static String BREED = "Input breed: ";
    final static String AGE = "Input age: ";
    final static String COLOR = "Input color: ";

    @Override
    public Pet addPet(Scanner scanner) {
        Pet pet = new Pet();

        System.out.println(NAME);
        pet.setName(scanner.nextLine());
        System.out.println(BREED);
        pet.setBreed(scanner.nextLine());
        System.out.println(AGE);
        pet.setAge(Byte.parseByte(scanner.nextLine()));
        System.out.println(COLOR);
        pet.setColor(scanner.nextLine());
        pet.setPetId(UUID.randomUUID());
        return pet;
    }

    @Override
    public void addCat(Scanner scanner) {
        Cat cat = new Cat(addPet(scanner));
        System.out.println("Input hair: ");
        cat.setHair(scanner.nextLine());
        storage.add(cat);
    }

    @Override
    public void addHorse(Scanner scanner) {
        Horse horse = new Horse(addPet(scanner));
        System.out.println("Input horseshoe: ");
        horse.setHorseshoe(scanner.nextLine());
        storage.add(horse);
    }

    @Override
    public void addDog(Scanner scanner) {
        Dog dog = new Dog(addPet(scanner));
        System.out.println("Input tail: ");
        dog.setTail(scanner.nextLine());
        storage.add(dog);
    }

    @Override
    public void listPet() {
        for (int i = 0; i < storage.size(); i++) {
            System.out.println(storage.get(i));
        }
    }

    @Override
    public void updatePet(Scanner scanner) {

    }

    @Override
    public void updateCat(Scanner scanner) {

    }

    @Override
    public void updateDog(Scanner scanner) {

    }

    @Override
    public void updateHorse(Scanner scanner) {

    }

    @Override
    public void deletePet(Scanner scanner) {
        for (int i = 0; i < storage.size(); i++) {
            if (String.valueOf(storage.get(i).getPetId()).equals(scanner)) {
                storage.remove(i);
                break;
            }
        }
        System.out.println("Incorrect value, try again");
    }
}
