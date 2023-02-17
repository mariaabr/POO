package aula03;
import java.util.Scanner;

public class countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("contagem decrescente a partir de que número? ");
        int N = sc.nextInt();
        int count = N;
        while (count > -1) {
        System.out.println(count);
        count -= 1;
        }
        System.out.println("Go!");
        sc.close();
    }    
}
