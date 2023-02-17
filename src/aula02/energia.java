package aula02;
import java.util.Scanner;

public class energia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual é a quantidade de água a aquecer? (kg) ");
        double agua = sc.nextDouble();
        System.out.print("Temperatura inicial? ");
        double tinicial = sc.nextDouble();
        System.out.print("Temperatura final? ");
        double tfinal = sc.nextDouble();
        double Q = agua* (tfinal - tinicial) * 4184;
        System.out.printf("A energia necessária para aquecer a água foi %.3f Joules %n", Q);
        sc.close();
    }   
}