package aula02;
import java.util.Scanner;
public class graus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura em graus Celsius? ");
        double c = sc.nextDouble();
        double f = 1.8*c + 32;
        System.out.printf("Conversão para Fahrenheit %.3f %n", f);
        sc.close();
    }
}
