package com.mafa.pet;

import java.util.ArrayList;
import java.util.Scanner;

public class StoragePets {

    public static void main(String[] args) {
        Run run = new Run();
        Operation operation = new Operation();
        Scanner scanner = new Scanner(System.in);

        run.interfaceRun(scanner);

    }
}
//    public static Pet readPet(Scanner scanner) {
//        Pet pet = new Pet();
//
//        System.out.println(NAME);
//        pet.setName(scanner.nextLine());
//        System.out.println(BREED);
//        pet.setBreed(scanner.nextLine());
//        System.out.println(AGE);
//        pet.setAge(Byte.parseByte(scanner.nextLine()));
//        System.out.println(COLOR);
//        pet.setColor(scanner.nextLine());
//
//        return pet;
//    }
//
//    public static void inputCat(Scanner scanner) {
//        Cat cat = new Cat(readPet(scanner));
//        System.out.println("Input hair: ");
//        cat.setHair(scanner.nextLine());
//        storage.add(cat);
//    }
//
//    public static void inputHorse(Scanner scanner) {
//        Horse horse = new Horse(readPet(scanner));
//        System.out.println("Input horseshoe: ");
//        horse.setHorseshoe(scanner.nextLine());
//        storage.add(horse);
//    }
//
//    public static void inputDog(Scanner scanner) {
//        Dog dog = new Dog(readPet(scanner));
//        System.out.println("Input tail: ");
//        dog.setTail(scanner.nextLine());
//        storage.add(dog);
//    }
//
//
//    public static void interfaceRun() {
//        Scanner in = new Scanner(System.in);
//        String st;
//        Boolean flag;
//
//        while (true) {
//            flag = false;
//            System.out.println("Input pet: cat, dog or horse ('exit' to stop, 'list' to print all pets)");
//            st = in.nextLine().trim();
//            if (st.equals("exit")) {
//                break;
//            }
//            if (st.equals("list")) {
//                for (int i = 0; i < storage.size(); i++) {
//                    System.out.println(storage.get(i));
//                }
//                flag = true;
//            }
//            if (st.equals("cat")) {
//                inputCat(in);
//                flag = true;
//            }
//            if (st.equals("dog")) {
//                inputDog(in);
//                flag = true;
//            }
//            if (st.equals("horse")) {
//                inputHorse(in);
//                flag = true;
//            }
//            if (flag == false) {
//                System.out.println("Incorrect type of pet");
//            }
//
//        }
//        in.close();
//    }
//}

