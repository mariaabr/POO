package aula02;
import java.util.Scanner;

public class kmtomiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Distância em km? ");
        double km = sc.nextDouble();
        double milhas = km / 1.609;
        System.out.printf("Conversão para milhas: %.3f %n", milhas);
        sc.close();
    }
}
