package aula03;
import java.util.Scanner;
import java.lang.String;

public class anos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias;
        String data;
        String[] dataspl;
        int[] mesano = new int[2];
        do {
            System.out.print("Introduza uma data do género mm/aaaa: ");
            data = sc.next();

            if (data.contains("/")) {
                dataspl = data.split("/");
                if (dataspl.length == 2) {
                    for ( int i = 0; i < 2; i ++) {
                        mesano[i] = Integer.parseInt(dataspl[i]);
                    }
                }
            }
        } while ((mesano.length != 2) || (mesano[0] < 1) || (mesano[0] > 12));
        switch(mesano[0]){
            case 4:
            case 6:
            case 9:
            case 11: dias= 30;
            break;
            case 2:
            if ( (mesano[1] % 4 == 0) && (mesano[1] % 100 != 0) || (mesano[1] % 400 == 0)) {
                dias = 29;
            }
            else {
                dias = 28;
            }
            break;
            default: dias= 31;
        }
        System.out.printf("O mês %d de %d tem %d dias. %n", mesano[0], mesano[1], dias);
        sc.close();
    }
}