package task_1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PeopleDemo {
    public static void main(String[] args) {
        Boolean flag = false;
        Scanner in = new Scanner(System.in);
        ArrayList<Human> people = new ArrayList<Human>();
        ArrayList<Poses> posesDescr = new ArrayList<Poses>();
        people.add(new Woman("Ann", 160, 50, "(.)(.)", "to show my boobs!;)", 2));
        people.add(new Woman("Kate", 156, 55, "Where is the money!?", "rich men $$$", 1));
        people.add(new Woman("Sara", 170, 60, "I was offended :(", "sweets", 2));
        people.add(new Man("Adam", 180, 90, "I am strong!", "protein and exercise!", 15));
        people.add(new Man("Karl", 176, 65, "I am geek", "Minecraft and WoW!", 16));
        people.add(new Man("Tom", 190, 85, "I am rich", "OOP and Java!", 17));
        posesDescr.add(new Poses("Corkscrew", "Near the edge of a bed or bench, rest on the hip and forearm of one side and press your thighs together. Your partner stands and straddles you, entering from behind.", "Keeping your legs pressed together during this sex position allows for a tighter hold on him as he thrusts."));
        posesDescr.add(new Poses("Pretzel Dip", "Lie on your right side; your partner kneels, straddling your right leg and curling your left leg around his left side.", "With this sex position, you get the deeper penetration of doggy style while still being able to make that important eye contact."));
        posesDescr.add(new Poses("Flatiron", "Lie facedown on the bed, legs straight, hips slightly raised.", "This sex position creates a snug fit, so your partner's penis will seem even larger."));
        posesDescr.add(new Poses("Wheelbarrow", "Get on your hands and feet and have him pick you up by the pelvis. Then grip his waist with your thighs.", "Aside from being a fabulous arm workout for you, this male-dominant sex position allows him deeper penetration."));
        posesDescr.add(new Poses("Magic Mountain", "Your partner sits, legs bent, leaning back on his hands and forearms. You do the same and then inch toward him until you make contact.", "You’ll both feel really connected looking at each other. Increase your stimulation by grinding your clitoris against his pelvis."));
        posesDescr.add(new Poses("The Seashell", "Lie back with your legs raised all the way up and your ankles crossed behind your own head. He enters you from a missionary position.", "Your hands are free to work your clitoris. As you should."));

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
