package aula04;
import java.lang.String;
import java.util.Arrays;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza uma String: ");
        s = sc.nextLine();
        System.out.println(minusculas(s));
        System.out.println(last(s));
        System.out.println(first3(s));

        System.out.println(contains(s));
        System.out.println(matches(s));

        String[] split = s.split("\\s");
        System.out.println(Arrays.toString(split));
        sc.close();
    }

    static String minusculas(String s) {
        return s.toLowerCase();
    }

    static String last(String s) {
        return s.substring(s.length() - 1);
    }

    static String first3(String s) {
        return s.substring(0, 3);
    }

    static Boolean contains(String s) {
        return s.contains("ar");
    }
    
    static Boolean matches(String s) {
        return s.matches("\\[a-z]"); 
    }
}