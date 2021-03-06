package com.mafa.alesya;

import java.util.Random;
import java.util.Scanner;

public class PeopleDemo {

    public static void main(String[] args) {
        Boolean flag = false;
        Scanner in = new Scanner(System.in);
        IActions humanAction = new HumanActions();
        ResourceService resourceService = new ResourceService();
        GameResource gameResources = resourceService.loadResources();

        while (true) {

            System.out.print("Input a name or a pose, 'exit' to stop: ");
            String num = in.next();

            if (num.trim().equals("exit")) {
                break;
            }

            if (num.trim().equals("pose")){
                Random rand = new Random();
                int randomIndex = rand.nextInt(gameResources.getPoses().size());
                gameResources.getPoses().get(randomIndex).descrOutput();
            }

            for (int i = 0; i < gameResources.getHumans().size(); i++) {
                if (gameResources.getHumans().get(i).getName().equals(num)) {
                    humanAction.say(gameResources.getHumans().get(i));
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
