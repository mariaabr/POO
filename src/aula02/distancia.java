package aula02;
import java.util.Scanner;
import java.lang.Math;

public class distancia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("coordenada x1? ");
        double x1 = sc.nextDouble();
        System.out.print("coordenada y1? ");
        double y1 = sc.nextDouble();
        System.out.print("coordenada x2? ");
        double x2 = sc.nextDouble();
        System.out.print("coordenada y2? ");
        double y2 = sc.nextDouble();
        double distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2,2));
        System.out.printf("A distância entre os dois pontos é %.3f %n", distancia, distancia);
        sc.close();
    }
}
