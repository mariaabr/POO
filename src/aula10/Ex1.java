package aula10;
import java.util.*;

public class Ex1 {
    public static void main(String[] args){
        Map<String, String> map1 = new HashMap<> ();

        map1.put("branco", " Que tem a cor da neve");
        map1.put("amarelo", " Que tem a cor do sol");
        map1.put("verde", " Que tem a cor das ervas");
        map1.put("azul", " Que tem a cor do céu");
        map1.put("roxo", " Que tem a cor das amoras");
        map1.put("vermelho", " Que tem a cor do sangue");
        System.out.println(map1);
        System.out.println();

        map1.replace("vermelho", " Que tem a cor do sangue", "Que tem a cor das maçãs");
        System.out.println(map1);
        System.out.println("azul =" + map1.get("azul") + " que reflete na água");
        System.out.println();

        map1.remove("roxo");
        System.out.println(map1);
        System.out.println();

        System.out.println(map1.entrySet().toString());
        System.out.println(map1.keySet().toString());
        System.out.println(map1.values().toString());
    }
}
