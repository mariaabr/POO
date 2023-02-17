package aula03;
import java.util.Scanner;
import java.util.Random;

public class joguinho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int max = 101;
        int num;
        String resp;
        int count = 0;
        
        do {
            int random = rand.nextInt(max);
                do {
                    System.out.println("Tente adivinhar o número random (1-100): ");
                    num = sc.nextInt();
                    if ( num < random) {
                        System.out.println("estava quase... mas a sua tentativa foi demasiado baixa!");
                    }
                    else if ( num > random ){
                        System.out.println("A sua tentativa foi demasiado alta!");
                    }
                    count += 1;
                } while ( num != random);
                System.out.println("Parabéns!!! Acertou no número random. :))");
                System.out.printf("Adivinhou o número mistério em apenas %d tentativas. %n", count);
                System.out.println("Pretende continuar? Prima (S)im");
                resp = sc.next();
            } while ( resp.equals("S") || resp.equals("Sim"));
        sc.close();
    }
}