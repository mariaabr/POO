
package aula02;
import java.util.Scanner;

public class peso {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Qual é o teu nome? ");
        String nome= sc.nextLine();
        System.out.print("Que idade tens? ");
        int idade= sc.nextInt();
        System.out.print("Quanto pesas? ");
        double peso= sc.nextDouble();
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade + " anos");
        System.out.println("Peso: "+ peso + " Kgs.");
        sc.close();
    }
}