package aula11;

import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) throws IOException{
        
        ArrayList<ArrayList<String>> listaVoos = new ArrayList<>(); 
        List<String> linesvoos = Files.readAllLines(Paths.get("voos.txt"));
        List<String> linescomps = Files.readAllLines(Paths.get("companhias.txt"));
        ArrayList<Voo> voos = new ArrayList<>();
        HashMap<String, ArrayList<String>> atrasos = new HashMap<>();
        Map<String, Integer> atrasoslista = new HashMap<>();
        Map<String, Integer> chegadas = new TreeMap<>();
        // Map<String, Integer> chegadaslista = new HashMap<>();

        for (int i = 1; i < linesvoos.size(); i++){
            ArrayList<String> listav = new ArrayList<>();
            String[] info = linesvoos.get(i).split("[\t]");
            for(String inf : info){
                listav.add(inf);
            }
            if(info.length<4) {
			    listav.add("00:00");
			}
            listaVoos.add(listav);
        }

        TreeMap<String, String> listac = new TreeMap<>();
        for (int i = 0; i < linescomps.size(); i++){
            String[] info = linescomps.get(i).split("[\t]");
            listac.put(info[0], info[1]);
        }
        // System.out.println(listac);

        int count = 1;
        for(ArrayList<String> v: listaVoos){
            String comp = listac.get(v.get(1).substring(0, 2));
            String atraso = v.get(3);
            voos.add(new Voo(v.get(0), v.get(1), comp, v.get(2), v.get(3)));

            // map de atrasos
            if(!atrasos.containsKey(comp)) {
                atrasos.put(comp, new ArrayList<>());
            }
            if(atrasos.containsKey(comp)) {
                atrasos.get(comp).add(atraso.substring(3, 5));
            }

            // map de chagadas
            String origem = v.get(2);
            if(!chegadas.containsKey(origem)) {
                chegadas.put(origem, count);
            } else{
                chegadas.put(origem, chegadas.get(origem)+1);
            }
        }

        // System.out.println(atrasos.keySet());
        // System.out.println(atrasos);
        // System.out.println(chegadas.keySet());
        // System.out.println(chegadas);

        System.out.printf("%-15s\t%-15s\t%-30s\t%-25s\t%-15s\t%-15s\t \n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Previsto");
        printVoos(voos);

        //System.out.println(voos);

        // InfoPublico.txt file
        PrintWriter write = new PrintWriter(new File("InfoPublico.txt"));
        write.printf("%-15s\t%-15s\t%-30s\t%-25s\t%-15s\t%-15s\t \n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Previsto");
        for (Voo voo : voos) {
            write.println(voo);
        }
        write.close();

        // Média do atrasos por companhia + ordemcrescente de atraso médio
        ArrayList<String> a = new ArrayList<>();
        for(String c: atrasos.keySet()) {
            a = atrasos.get(c);
            int som = 0;
            for (int i = 0; i < a.size(); i++) {
                som = som + Integer.parseInt(a.get(i));
            }
            int avg = som / a.size();
            // System.out.println(a);
            // System.out.println(avg);
            atrasoslista.put(c, avg);
        }

        // System.out.println(atrasoslista);

        atrasoslista = ordenarValuescres(atrasoslista);

        // atrasos.txt file
        PrintWriter write2 = new PrintWriter(new File("atrasos.txt"));
        write2.printf("%-20s\t%-15s \n", "Companhia", "Atraso Médio");
        for (Map.Entry<String, Integer> atr : atrasoslista.entrySet()) {
            String key = atr.getKey();
            Integer value = atr.getValue();
            write2.printf("%-20s\t%-15s \n", key, value);
        }
        write2.close();

        chegadas = ordenarValuesdecr(chegadas);

        // cidades.txt file
        PrintWriter write3 = new PrintWriter(new File("cidades.txt"));
        write3.printf("%-20s\t%-15s \n", "Origem", "Voos");
        for (Map.Entry<String, Integer> ch : chegadas.entrySet()) {
            String key = ch.getKey();
            Integer value = ch.getValue();
            write3.printf("%-20s\t%-15s \n", key, value);
        }
        write3.close();
    }

    private static void printVoos(ArrayList<Voo> voos){
        for (Voo voo : voos) {
            System.out.println(voo);
        }
    }

    private static Map<String, Integer> ordenarValuescres(Map<String, Integer> atrasoslista){
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
	    atrasoslista.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
	
	  return sortedMap;
    }

    private static Map<String, Integer> ordenarValuesdecr(Map<String, Integer> atrasoslista){
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
	    atrasoslista.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
	
	  return sortedMap;
    }
}
