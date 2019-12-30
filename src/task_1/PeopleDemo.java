package task_1;

import java.util.ArrayList;
import java.util.Scanner;

public class PeopleDemo {
    public static void main(String[] args) {
        Boolean flag = false;
        Scanner in = new Scanner(System.in);
        ArrayList<Human> people = new ArrayList<Human>();
        people.add(new Woman("Ann", 160, 50, "(.)(.)", "to show my boobs!;)", 2, "Hi"));
        people.add(new Woman("Kate", 156, 55, "Where is the money!?", "rich men $$$", 1, "Hi"));
        people.add(new Woman("Sara", 170, 60, "I was offended :(", "sweets", 2, "Hi"));
        people.add(new Man("Adam", 180, 90, "I am strong!", "protein and exercise!", 15, "Hi"));
        people.add(new Man("Karl", 176, 65, "I am geek", "Minecraft and WoW!", 16, "Hi"));
        people.add(new Man("Tom", 190, 85, "I am rich", "OOP and Java!", 17, "Hi"));

        while (true) {
            System.out.print("Input a name, 'exit' to stop: ");
            String num = in.next();

            if (num.trim().equals("exit")) {
                break;
            }

            for (int i = 0; i < people.size(); i++) {
                if (people.get(i).getName().equals(num)) {
                    people.get(i).say();
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.println("An incorrect name, try again.");
            }
        }
    }
}
