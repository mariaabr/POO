package aula02;
import java.util.Scanner;
import java.lang.Math;

public class triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("cateto A? ");
        double a = sc.nextDouble();
        System.out.print("cateto B? ");
        double b = sc.nextDouble();
        double hipotenusa = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));
        double angulo = Math.toDegrees(Math.acos(a/hipotenusa));
        System.out.printf("A hipotenusa do triângulo é %.3f e o valor do ângulo entre A e a hipotenusa é %.3f.", hipotenusa, angulo);
        sc.close();
    }
}
