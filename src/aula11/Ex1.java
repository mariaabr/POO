package aula11;
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> words = new ArrayList<String>();
        HashMap<String, HashMap<String, Integer>> dict = new HashMap<> ();
        Scanner input = new Scanner(new FileReader("major.txt", StandardCharsets.UTF_8));
        input.useDelimiter("[\\p{Punct}\\s]+");
        while (input.hasNext()) {
            String data = input.next();
            if(data.length() > 3) {
                words.add(data);
            }
        }
            for (int i = 0; i < words.size()-1; i++) {
                String here = words.get(i);
                String next = words.get(i+1);
                int count = 1;
                if (!dict.containsKey(here)) {
                    HashMap<String, Integer> value = new HashMap<>();
                    value.put(next, count);
                    dict.put(here, value);
                } else {
                    if (dict.get(here).containsKey(next)) {
                        dict.get(here).replace(next, dict.get(here).get(next), dict.get(here).get(next)+1);
                    } else {
                        count++;
                        dict.get(here).put(next,1);
                    }
                }

            }
        input.close();
        for(int i = 0; i < dict.size(); i++) {
            System.out.println(dict.entrySet().toArray()[i].toString()); 
        }

    }
}