package aula10;
import java.util.*;
import java.io.*;

public class Ex4 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new FileReader("words.txt"));
        ArrayList<String> plusword = new ArrayList<> ();
        while(input.hasNext()){
            String word = input.next();
            System.out.println(word);
            if(word.length() > 2){
                plusword.add(word);
            }
        }
        System.out.println("Palavras com mais de 2 caracteres: " + plusword);

        System.out.println();
        System.out.println("Palavras terminadas em 's': ");
        for(String word: plusword) {
			if(word.toLowerCase().endsWith("s")) {
				System.out.println(word);
			}
		}

        for(String word: plusword) {
			for(char c: word.toCharArray()) {
				if(!Character.isLetter(c)) {
					plusword.remove(word);
				}
			}
		}
    }
}
