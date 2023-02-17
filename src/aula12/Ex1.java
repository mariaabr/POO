package aula12;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Ex1 {
    public static void main(String[] args) throws IOException{
        int Totalwords = 0;
        int Differentwords = 0;
        Scanner file = new Scanner(new FileReader("lua.txt", StandardCharsets.UTF_8));
        ArrayList<String> words = new ArrayList<String>();
        while (file.hasNextLine()){
            String line = file.nextLine().replaceAll("\\p{Punct}", "");
            String[] word = line.toLowerCase().split("\\s+");
            for (int i = 0; i < word.length; i++) {
                Totalwords++;
                if (!words.contains(word[i])){
                    words.add(word[i]);
                    Differentwords++;
                }
            }
        }
        System.out.println("Número Total de Palavras: " + Totalwords);
        System.out.println("Número de Diferentes Palavras: " + Differentwords);
    }
}
