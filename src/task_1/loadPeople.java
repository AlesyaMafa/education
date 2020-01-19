package task_1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class loadPeople {

    public static List<Human> readDataFromFile() {
        ArrayList<Human> people = new ArrayList<Human>();
        FileInputStream fstream = null;
        try {
            fstream = new FileInputStream("education/data/People.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine = "";
            String[] tokens = strLine.split("|");
            //Read file line by line
            while ((strLine = br.readLine()) != null) {
                // Copy the content into the array
                tokens = strLine.split("|");
                people.add(new Woman(tokens[0], Integer.valueOf(tokens[1]), Integer.valueOf(tokens[2]), tokens[3], tokens[4], Integer.valueOf(tokens[5])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fstream.close();
            } catch (Exception ignore) {
            }
        }
        return people;
    }

}
