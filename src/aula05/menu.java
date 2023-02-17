package aula05;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        // Date date = new Date(0, 0, 0);
        Scanner sc = new Scanner(System.in);
        int option;



        System.out.printf("%s %n %s %n %s %n %s %n %s %n %s %n %s %n", "Date operations:", "1 - create new date", "2 -show current date", "3 - increment date", "4 - decrement date", "0 - exit");
        option = sc.nextInt();
        switch (option) {
            case 1:
            // createdate( date);
            case 2:
            case 3:
            case 4:
            case 0: break;
            default:
                System.out.println("ERROOO!! a sua escolha não é válida!");
                System.out.printf("%s %n %s %n %s %n %s %n %s %n %s %n %s %n", "Date operations:", "1 - create new date (DD/MM/AAAA)", "2 -show current date", "3 - increment date", "4 - decrement date", "0 - exit");
        }
        sc.close();
    }
    public static void createdate(Date date, Scanner Scanner) {
        String create;
        do {
            System.out.println("Introduza uma data válida (DD/MM/AAAA): ");
            create = Scanner.nextLine();
            String[] createinfo = create.split("/");
            date.Datecreate(Integer.parseInt(createinfo[0]),Integer.parseInt(createinfo[1]),Integer.parseInt(createinfo[2]));
        } while (true);
    }

    // public static void 
}
