package aula03;
import java.util.Scanner;

public class investimento2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double montante, taxaj;
        do {
            System.out.print("Qual é o montante investido? ");
            montante = sc.nextDouble();
        } while ((montante < 0) || (montante % 1000 != 0));
        do {
            System.out.print("Qual é a taxa de juros?  ");
            taxaj = sc.nextDouble();
        } while ((taxaj < 0) || (taxaj > 5));
            for ( int i = 1; i <= 12; i++) {
                montante += (montante*(taxaj/100));
                System.out.printf("Valor mensal do investimento no mês: %.2f %n", montante); 
            }
        sc.close();
    }
}
