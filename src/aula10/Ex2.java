package aula10;
import java.util.*;
import java.lang.String;

public class Ex2 {
    public static void main(String[] args){
        Map<String, HashSet<String>> map = new TreeMap<> ();
        Scanner sc = new Scanner(System.in);
        int option = 0;

        HashSet<String> a = new HashSet<> ();
        a.add(" Que tem a cor da neve");
        a.add(" Descorado, pálido");
        a.add(" Cor de leite");
        HashSet<String> b = new HashSet<> ();
        b.add(" Que tem a cor do sol");
        HashSet<String> c = new HashSet<> ();
        c.add(" Que tem a cor das ervas");
        HashSet<String> d = new HashSet<> ();
        d.add(" Que tem a cor do céu");
        d.add(" Tinta ou cor azul extraída do lápis-lazúli");
        HashSet<String> e = new HashSet<> ();
        e.add( " Que tem a cor das amoras");
        HashSet<String> f = new HashSet<> ();
        f.add( " Que tem a cor do sangue");
        f.add(" Que tem carácter malicioso ou faz alusões sexuais");
        f.add(" Árvore de São Tomé.");

        map.put("branco", a);
        map.put("amarelo", b);
        map.put("verde", c);
        map.put("azul", d);
        map.put("roxo", e);
        map.put("vermelho", f);


        String MENU = "(1) Adicionar termo\n"
				+ "(2) Adicionar defenição\n"
				+ "(3) Imprimir termos e definições\n"
				+ "(4) Imprimir defenição \n"
				+ "(5) Terminar ";

        while(option!=5) {
            System.out.println();
            System.out.println(MENU);
            option = Integer.parseInt(sc.nextLine());
            System.out.println();
            
            switch(option) {

                case 1:
                    // inserir um termo
                    System.out.println("Insira um termo");
                    String novotermo = sc.nextLine();
                    if (map.containsKey(novotermo)) {
                        System.out.println("o termo já existe!");
                    } else {
                        map.put(novotermo, new HashSet<String>());
                    }
                    break;

                case 2:
                    // adicionar uma definição
                    System.out.println("A que termo pretende adicionar uma definição?");
                    System.out.println();
                    System.out.println(map.keySet().toString());
                    String termo = sc.nextLine();
                    if (map.containsKey(termo)) {
                        System.out.println("Qual é a definição a adicionar?");
                        String defin = sc.nextLine();
                        map.get(termo).add(defin); 
                    }
                    break;


                case 3:
                    // imprimir o mapa
                    System.out.println("Termos e definições:");
                    System.out.println(map.entrySet().toString());
                    System.out.println("-----------------------");
                    System.out.println();
                    System.out.println("Termos:");
                    System.out.println(map.keySet().toString());
                    System.out.println("------------------------");
                    System.out.println();
                    System.out.println("Definições:");
                    System.out.println(map.values().toString());
                    break;

                case 4:
                    // print de definição random
                    System.out.println("Quer uma definição de que termo?");
                    System.out.println();
                    System.out.println(map.keySet().toString());
                    String gettermo = sc.nextLine();
                    if(map.containsKey(gettermo)) {
                        System.out.println(Random(map.get(gettermo)));
                    } else {
                        System.out.println("Não existe esse termo!");
                    }
                    break;

                case 5:
                System.out.println("Programa terminado!");
				break;
            }
        }
        sc.close();
 }

    public static String Random(HashSet<String> set) {
        int def = new Random().nextInt(set.size());
        int i = 0;
        for(String str : set){
            if (i == def)
                return str;
            i++;
        }
        return "Sem defenições disponiveis";
    }
}