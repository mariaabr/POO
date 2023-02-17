package aula04;
import java.util.Scanner;
import java.lang.String;

public class calendario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes, ano, diainicio;
        String[] nomes_mes = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        do {
            System.out.println("Introduza um mês válido: ");
            mes = sc.nextInt();
        } while ((mes < 1) || (mes > 12));
        do {
            System.out.println("Introduza um ano válido: ");
            ano = sc.nextInt();
        } while (ano < 0);
        do {
            System.out.println("Introduza o dia da semana em que o mês começa (ex.: 1 = seg)5");
            diainicio = sc.nextInt();
        } while ((diainicio < 1) || (diainicio > 7));
        print_results(nomes_mes, mes, ano, diainicio);
        sc.close();
    }

    static int calc_dias(int mes, int ano) {
        int dias;
        switch(mes){
            case 4:
            case 6:
            case 9:
            case 11: dias= 30;
            break;
            case 2:
            if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
                dias = 29;
            }
            else {
                dias = 28;
            }
            break;
            default: dias= 31;
        }
        return dias;
    }



    static void print_results(String[] nomes_mes, int mes, int ano, int diainicio) {
        System.out.printf(" " + " " + " " + "  " + "%s %d %n", nomes_mes[mes - 1], ano);
        System.out.println("Su Mo Tu We Th Fr Sa");
        int count = diainicio;
		
		int j = 0;
		
		while (j < diainicio) {
			System.out.print("   ");
			j++;
		}
        
		for (int i = 1; i <= calc_dias(mes, ano); i++) {

			if (count % 7 == 0) {
				System.out.print("\n");
			}
            System.out.printf("%02d ", i);

			count ++;
        }
    }
}