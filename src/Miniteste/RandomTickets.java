package Miniteste;

import java.util.*;
import java.io.FileNotFoundException;
import java.io.*;
import java.lang.String;

public class RandomTickets {
    ArrayList<String> lines = new ArrayList<String>();
    public RandomTickets( String caminhoficheiro) throws FileNotFoundException {
        updateFestivals(caminhoficheiro);
    }
    private void updateFestivals(String caminhoficheiro) throws FileNotFoundException{
        Scanner file = new Scanner(new FileReader(caminhoficheiro));
        while (file.hasNextLine()){
            String line = file.nextLine();
            String[] info = line.split("\\t");
            System.out.println(info);
            // lines.add(line);
            // for( int i = 0; i < lines.size(); i++){
            
            // }
        }
        file.close();
    }
}
