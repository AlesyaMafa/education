package com.mafa.pet;

import java.util.ArrayList;
import java.util.Scanner;

public class StoragePets {

    public static void main(String[] args) {
        ArrayList<Pet> storage = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        Boolean flag;
        String st;
        String[] tokens;

        while (true) {
            flag = false;
            System.out.println("Input pet cat, dog or horse ('exit' to stop): ");
            st = in.nextLine();
            if (st.trim().equals("exit")) {
                break;
            }
            if (st.trim().equals("cat")) {
                System.out.println("Input name, breed, age, color, hair length: ");
                st = in.nextLine();
                tokens = st.split(", ");
                storage.add(new Cat(Pet.Type.cat, tokens[0], tokens[1], Integer.valueOf(tokens[2]), tokens[3], tokens[4]));
                flag = true;
            }
            if (st.trim().equals("dog")) {
                System.out.println("Input name, breed, age, color, tail presence: ");
                st = in.nextLine();
                tokens = st.split(", ");
                storage.add(new Dog(Pet.Type.dog, tokens[0], tokens[1], Integer.valueOf(tokens[2]), tokens[3], tokens[4]));
                flag = true;
            }
            if (st.trim().equals("horse")) {
                System.out.println("Input name, breed, age, color, presence of horseshoes: ");
                st = in.nextLine();
                tokens = st.split(", ");
                storage.add(new Horse(Pet.Type.horse, tokens[0], tokens[1], Integer.valueOf(tokens[2]), tokens[3], tokens[4]));
                flag = true;
            }
            if (flag == false) {
                System.out.println("Incorrect type of pet");
            }
        }
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i).getType().equals(Pet.Type.cat)) {
                System.out.print(storage.get(i).getType() + ", " + storage.get(i).getName() + ", " + storage.get(i).getBreed() + ", " + storage.get(i).getAge() + ", " + storage.get(i).getColor());
            }
            if (storage.get(i).getType().equals(Pet.Type.dog)) {
                System.out.print(storage.get(i).getType() + ", " + storage.get(i).getName() + ", " + storage.get(i).getBreed() + ", " + storage.get(i).getAge() + ", " + storage.get(i).getColor());
            }
            if (storage.get(i).getType().equals(Pet.Type.horse)) {
                System.out.print(storage.get(i).getType() + ", " + storage.get(i).getName() + ", " + storage.get(i).getBreed() + ", " + storage.get(i).getAge() + ", " + storage.get(i).getColor());
            }
            }
        in.close();
    }
}
