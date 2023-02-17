package aula02;
import java.util.Scanner;

public class investimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual é o montante investido? ");
        double montante = sc.nextDouble();
        System.out.print("Qual é a taxa de juros? ");
        double taxaj = sc.nextDouble();
        double mes1 = montante + (taxaj/100)*montante;
        double mes2 = mes1 + (taxaj/100)*mes1;
        double mes3 = mes2 + (taxaj/100)*mes2;
        System.out.printf("Ao final de 3 meses o valor é de %.2f %n", mes3);
        sc.close();
    }
}
