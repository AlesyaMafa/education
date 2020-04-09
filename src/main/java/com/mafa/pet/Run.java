package com.mafa.pet;

import java.util.Scanner;

public class Run implements IRun {

    final static String INCORRECTVALUE = "Incorrect value, try again";
    final static String INPUTPET = "Input type of pet: cat, dog or horse";
    final static String INPUTAPP = "Type 'add' to add new pet\nType 'update' to update existing pet\nType 'delete' to delete existing pet\nType 'list' to view all pets\nType 'exit' to stop app";
    final static String UPDATEPET = "To updtae pet type ID\nIf you don't remember ID, type list";
    final static String DELETEPET = "To delete pet type ID\nIf you don't remember ID, type list";

    @Override
    public void interfaceRun(Scanner scanner) {
        String st;
        Boolean flag;
        Operation operation = new Operation();

        while (true) {

            flag = false;

            System.out.println(INPUTAPP);
            st = scanner.nextLine().trim();
            if (st.equals("exit")) {
                break;
            }
            if (st.equals("list")) {
                operation.listPet();
                flag = true;
            }

            if (st.equals("add")) {
                System.out.println(INPUTPET);
                st = scanner.nextLine().trim();
            }
                if (st.equals("cat")) {
                    operation.addCat(scanner);
                    flag = true;
                }
                if (st.equals("dog")) {
                    operation.addDog(scanner);
                    flag = true;
                }
                if (st.equals("horse")) {
                    operation.addHorse(scanner);
                    flag = true;
                }
            if (st.equals("update")) {
                System.out.println(UPDATEPET);
                if (scanner.nextLine().trim().equals("list")) {
                    operation.listPet();
                }
                else operation.updatePet(scanner);
                flag = true;
            }
            if (st.equals("delete")) {
                System.out.println(DELETEPET);
                if (scanner.nextLine().trim().equals("list")) {
                    operation.listPet();
                }
                else operation.deletePet(scanner);
                flag = true;
            }

            if (flag == false) {
                System.out.println(INCORRECTVALUE);
            }
        }
        scanner.close();
    }
}
