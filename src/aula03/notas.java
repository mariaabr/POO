package aula03;
import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nota da componente prática: ");
        float notaP = sc.nextFloat();
        System.out.print("nota da componente teórica: ");
        float notaT = sc.nextFloat();
        if (((notaT >= 0) && (notaT <= 20)) && ((notaP >= 0) && (notaP <= 20))) {
            if ((notaP < 7.0) || (notaT < 7.0)) {
                System.out.println("66");
            }
            else {
                double notafinal = 0.4*notaT + 0.6*notaP;
                System.out.printf("a nota final do aluno é %.0f valores. %n", notafinal);
            }
        }
        sc.close();
    }
}