package aula10;
import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        String str;
        Map<Character, HashSet<Integer>> map = new TreeMap<> ();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza uma string para avaliarmos os caracteres e as posições dos mesmos:");
        str = sc.nextLine();

        for(int i = 0; i < str.length(); i++){
            if(!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), new HashSet<Integer>());
            }
            if(map.containsKey(str.charAt(i))) {
                map.get(str.charAt(i)).add(i); 
            }
        }
        System.out.println(map);
        sc.close();
    }
}
