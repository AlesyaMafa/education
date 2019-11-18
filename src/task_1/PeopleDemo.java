package task_1;

import java.util.ArrayList;
import java.util.Scanner;

public class PeopleDemo {
    public static void main(String[] args) {
        ArrayList people = new ArrayList();
        Woman w1 = new WomanBoobs("Ann");
        Woman w2 = new WomanMoney("Kate");
        Woman w3 = new WomanResentment("Sara");
        Man m1 = new ManGym("Adam");
        Man m2 = new ManProg("Karl");
        Man m3 = new ManGame("Tom");

        people.add(w1.name);
        people.add(w2.name);
        people.add(w3.name);
        people.add(m1.name);
        people.add(m2.name);
        people.add(m3.name);

        System.out.println(people);
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Input a name, 'exit' to stop: ");
            String num = in.nextLine();
            if (num.trim().equals("exit")) {
                break;
            }
            int index = people.indexOf(num);
            switch (index) {
                case 0: w1.say();
                    break;
                case 1: w2.say();
                    break;
                case 2: w3.say();
                    break;
                case 3: m1.say(); m1.prefer();
                    break;
                case 4: m2.say(); m2.prefer();
                    break;
                case 5: m3.say(); m3.prefer();
                    break;
                default: System.out.println ("An incorrect name, try again.");
            }
        }

    }
}
