package com.mafa.pet;

import java.util.ArrayList;
import java.util.Scanner;

public interface IOperation {

    public Pet addPet(Scanner scanner);

    public void addCat(Scanner scanner);

    public void addDog(Scanner scanner);

    public void addHorse(Scanner scanner);

    public void listPet();

    public void updatePet(Scanner scanner);

    public void updateCat(Scanner scanner);

    public void updateDog(Scanner scanner);

    public void updateHorse(Scanner scanner);

    public void deletePet(Scanner scanner);


}
