package aula02;
import java.util.Scanner;

public class tempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tempo a converter para horas (s)? ");
        int s = sc.nextInt();
        int horas = s / 3600;
        s = s % 3600;
        int minutos = s / 60;
        s = s % 60;
        System.out.printf("%02d:%02d:%02d %n",horas, minutos, s);
        sc.close();
    }
}