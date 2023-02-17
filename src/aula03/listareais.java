package aula03;
import java.util.Scanner;
import java.util.ArrayList;

public class listareais {
    public static void main(String[] args) {
        // lst = [] (como é que eu sei que tamanho vetor vai ter?) --> usar arraylist que são parecidas com python
        ArrayList<Double> lst = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);
        System.out.print("introduza um número: ");
        double n1 = sc.nextDouble();
        double soma = 0;
        double maior = n1;
        double menor = n1;
        double n = 0;
        while ( n != n1 ) {
            System.out.print("introduza um número: ");
            n = sc.nextDouble();
            lst.add(n);


            maior = maior (n, maior);
            menor = menor (n, menor);
            soma += n;
        }
        int total = (lst.size());
        double media = soma/total;

        System.out.printf("Valor máximo: %.1f %n", maior);
        System.out.printf("Valor mínimo: %.1f %n", menor);
        System.out.printf("Média: %.1f %n", media);
        System.out.println("Número total de números: " + total);
        sc.close();
    }

    static double maior ( double n, double maior) {
        if ( n < maior) {
            return maior;
        }
        else {
            return n;
        }
    }

    static double menor ( double n, double menor) {
        if ( n < menor) {
            return n;
        }
        else {
            return menor;
        }
    }
}
