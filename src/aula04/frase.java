package aula04;
import java.util.Scanner;
import java.lang.String;

public class frase {
    public static void main(String[] args) {
        String f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza uma frase: ");
        f = sc.nextLine();
        System.out.println(countDigits(f));
        System.out.println(countSpaces(f));
        System.out.println(onlyLowerCase(f));
        System.out.println(oneSpace(f));
        System.out.println(isPalindromo(f));
        sc.close();
    }

    static int countDigits(String f) {
        int count = 0;
        for (int i = 0; i < f.length(); i++) {
            if (Character.isDigit(f.charAt(i))) {
                count ++;
            }
        }
        return count;
    }

    static int countSpaces(String f) {
        int count = 0;
        for (char s : f.toCharArray()) {
            if ( s == ' ') {
                count ++;
            }
        }
        return count;
    }

    static Boolean onlyLowerCase(String f) {
        boolean value = true;
        char v[] = f.toCharArray();
        System.out.println(v);
        for(int i = 0; i < v.length; i++) {
            if (!Character.isLowerCase(v[i]) && v[i] != ' ') {
                value = false;
            }
        }
        return value;
    }

    static String oneSpace(String f) {
        String ones;
        ones = f.replaceAll("( )+", " ");
        return ones; 
    }

    static Boolean isPalindromo(String f) {
        int n = f.length();
        for ( int i = 0; i < n/2; i++ ) {
            if (f.charAt(i) != f.charAt(n - i - 1)) {
				return false;
			}
        }
        return true;

    }
}