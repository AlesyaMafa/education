package task_1;

import java.util.Random;
import java.util.Scanner;

public class PeopleDemo {
    public static void main(String[] args) {
        Boolean flag = false;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Input a name or a pose, 'exit' to stop: ");
            String num = in.next();

            if (num.trim().equals("exit")) {
                break;
            }

            if (num.trim().equals("pose")){
                Random rand = new Random();
                int randomIndex = rand.nextInt(posesDescr.size());
                posesDescr.get(randomIndex).descrOutput();
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
