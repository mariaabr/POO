package aula07.ex3;

import java.util.Scanner;
import java.util.*;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        AgenciaViagens agencia = new AgenciaViagens("Agencia", "Rua", new ArrayList<Alojamento>(), new ArrayList<Viatura>());

        do {
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1 - Adicionar um apartamento");
            System.out.println("2 - Adicionar um quarto");
            System.out.println("3 - Adicionar uma viatura");
            System.out.println("4 - Ver Alojamentos");
            System.out.println("5 - Ver viaturas");
            System.out.println("6 - Levantar uma viatura");
            System.out.println("7 - Reservar um alojamento");
            System.out.println("0 - Sair");
            n = sc.nextInt();

            switch(n) {
                case 0: 
                    System.out.println(" ok! ");
                    break;
                case 1:
                    agencia.adicionarApartamento();
                    break;
                case 2:
                    agencia.adicionarQuarto();
                    break;
                case 3:
                    agencia.adicionarViatura();
                    break;
                case 4:
                    agencia.verAlojamentos();
                    break;
                case 5:
                    agencia.verViaturas();
                    break;
                case 6:
                    agencia.levantarViatura();
                    break;
                case 7:
                    agencia.reservarAlojamento();
                    break;
                default:
                    System.out.println();
                    System.out.println("Operação indesponível!");
            }
        } while (n != 0);
        sc.close();
    }
}
