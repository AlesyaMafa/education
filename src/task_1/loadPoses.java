package task_1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class loadPoses {

    public static List<Poses> readDataFromFile() {
        ArrayList<Poses> posesDescr = new ArrayList<Poses>();
        FileInputStream fstream = null;
        try {
            fstream = new FileInputStream("education/data/Poses.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine = "";
            String[] tokens = strLine.split("|");
            //Read file line by line
            while ((strLine = br.readLine()) != null) {
                // Copy the content into the array
                tokens = strLine.split("|");
                posesDescr.add(new Poses(tokens[0], tokens[1], tokens[2]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fstream.close();
            } catch (Exception ignore) {
            }
        }
        return posesDescr;
    }

}



