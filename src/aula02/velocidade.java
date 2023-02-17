package aula02;
import java.util.Scanner;

public class velocidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Velocidade 1º viagem (m/s)? ");
        double v1 = sc.nextDouble();
        System.out.print("Distância 1º viagem(m)? ");
        double d1 = sc.nextDouble();
        System.out.print("Velocidade 2º viagem(m/s)? ");
        double v2 = sc.nextDouble();
        System.out.print("Distância 2º viagem(m)? ");
        double d2 = sc.nextDouble();
        double t1 = d1/v1;
        double t2 = d2/v2;
        double vmedia = (d1+d2)/(t2+t1);
        System.out.printf("A velocidade média da viagem foi %.3f m/s %n", vmedia);
        sc.close();
    }    
}