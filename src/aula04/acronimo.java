package aula04;
import java.util.Scanner;
import java.lang.String;

public class acronimo {
    public static void main(String[] args) {
        String a;
        String[] wordspl;
        String acr = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza um nome: ");
        a = sc.nextLine();

        if (a.contains(" ")) {
            wordspl = a.split(" ");
            for (int i = 0; i < wordspl.length; i++) {
                // System.out.println(wordspl[i]);
                if(wordspl[i].length() >= 3) {
                    for ( int j = 0; j < wordspl[i].length(); j ++) {
                        char ac = wordspl[i].charAt(j);
                        // System.out.println(ac);
                        if(Character.isUpperCase(ac)) {
                            acr += ac;
                        }
                    }
                    // System.out.println(acr);
                }
            }
        }
        System.out.println(acr);
    sc.close();
    }
}


















// char ac[] = a.toCharArray();
        // System.out.println(ac);
        // String acr = new String();
        // for (int i = 0; i < ac.length(); i++) {
        //     if ((Character.isUpperCase(a.charAt(i)))) {
        //         acr += a.charAt(i);
        //     }
        // }