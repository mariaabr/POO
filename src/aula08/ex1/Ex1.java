package aula08.ex1;
import java.util.Scanner;
// import java.util.ArrayList;

public class Ex1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int km, n, i = 0; 

        String[] veiculoMaxDist = new String[3];

        Veiculo[] veiculos = new Veiculo[7];

        veiculos[1] = new Motociclo("00-AA-00", "Vespa", "Model t", 60, "desportivo").setMatr("00-AA-00");
        veiculos[1] = new Automovelig("00-BB-00", "Mercedes", "E", 2000, 100, 250).setMatr("00-BB-00");
        veiculos[2] = new Taxi("00-FF-54", "Nissan", "FX",1400 ,201,100,450).setMatr("00-FF-54");
        veiculos[3] = new Pesadopass("00-00-CC", "Ferrari", "F-40", 1500 ,200,1000, 50).setMatr("00-00-CC");
        veiculos[4] = new Pesadomerc("90-EA-54", "Toyota", "Y",700 ,202,3000,500).setMatr("90-EA-54");
        veiculos[5] = new Autoligele("DD-00-00", "Tesla", "Model y", 980 ,101,300, 560).setMatr("DD-00-00");
        veiculos[6] = new Pesadopassele("00-00-EE", "NiKola", "Tre", 653 ,201,2500, 50,400).setMatr("00-00-EE");


        Empresa empresa = new Empresa("Empresa Car", "2800-340", veiculos, "car@gmail.com").setEmail("car@gmail.com");

        boolean sair = false;
        while (!sair){
            System.out.println("Menu: ");
            System.out.println("1 - Adicionar um trajeto?");
            System.out.println("2 - Carregar um automóvel? ");
            System.out.println("3 - Ver Veiculos");
            System.out.println("0 - sair  ");
            n = sc.nextInt();
            switch(n){
                case 0:
                    sair = true;
                break;
                case 1:
                    System.out.println("1 - Motociclo");
                    System.out.println("2 - Automóvel Ligeiro");
                    System.out.println("6 - Taxi");
                    System.out.println("3 - Pesado Passageiros");
                    System.out.println("7 - Pesado Mercadorias");
                    System.out.println("4 - Automóvel Ligeiro Elétrico");
                    System.out.println("5 - Pesado de Passageiros Elétrico");
                    int x = sc.nextInt();
                    switch(x){
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            i=1;
                            System.out.println("Insira 0 para parar.");
                            do{
                                System.out.println("Quilómetros percorridos na " + i++ + " viagem: ");
                                km = sc.nextInt();
                                if(km != 0){
                                    veiculos[x-1].trajeto(km);
                                }
                            } while(km!=0);
                        break;
                    }
                break;
                case 2:
                    System.out.println("1 - Automóvel Ligeiro Elétrico ");
                    System.out.println("2 - Pesado de Passageiros Elétrico");
                    int p = sc.nextInt();
                    switch(p){
                        case 1:  
                            System.out.println("Até que percentagem deseja carregar? ");
                            int carrega = sc.nextInt();
                            ((Autoligele)veiculos[3]).carregar(carrega);
                        break;
                        case 2:  
                            System.out.println("Até que percentagem deseja carregar? ");
                            carrega = sc.nextInt();
                            ((Pesadopassele)veiculos[4]).carregar(carrega);
                        break;
                    }
                break;
                case 3:
                    System.out.println(empresa.toString());
                break;
                default:
                    System.out.println("    ");
                    System.out.println("Invalid option!");
                break;
            }
        }
       
        veiculoMaxDist = empresa.compararDistancia();

        System.out.println("A viatura com mais quilómetros percorridos é de matrícula " + veiculoMaxDist[0] + " que percorreu " + veiculoMaxDist[2] + "km.");
        
        sc.close();
    }

}
