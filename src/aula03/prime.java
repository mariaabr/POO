package aula03;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean value = true;
        do {
            System.out.print("introduza um n para verificar se é primo: ");
            n = sc.nextInt();
        } while ( n < 0 );
        if ( n == 1 ) {
            value = false;
        }
        else if ( n == 2 ) {
            value = true;
        }
        else if ( n % 2 == 0) {
            value = false;
        }
        else {
            for ( int i = 3; i < n/2; i++ ) {
                if (n % i == 0) {
                    value = false;
                }
            }
        }
        System.out.println(value);  
        sc.close();
    }
}