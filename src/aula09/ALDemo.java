package aula09;
import aula05.Date;
import aula06.ex1.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.TreeSet;

public class ALDemo {
    public static void main (String[] args) {
        ArrayList<Integer> c1 = new ArrayList<> ();

        for(int i= 10; i<= 100; i+=10)
            c1.add(i);

        System.out.println("Size: "+ c1.size());
        for(int i= 0; i< c1.size(); i++)
            System.out.println("Elemento: "+ c1.get(i));

        ArrayList<String> c2 = new ArrayList<> ();
        // LinkedList<String> food = new LinkedList<> ();

        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");

        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);

        c2.remove("Frio");
        c2.remove(0);

        System.out.println(c2);

        // outros métodos
        System.out.println(c2.contains("Vento"));
        System.out.println(c2.contains("Nevoeiro"));
        c2.add("Nevoeiro");

        System.out.println(c2.indexOf("Vento"));
        System.out.println(c2.indexOf("Nevoeiro"));

        c2.add("Batata");
        c2.add("Chouriço");
        c2.add("Bacalhau");
        System.out.println(c2);
        System.out.println(c2.lastIndexOf("Chouriço"));
        System.out.println(c2.lastIndexOf("Leite"));

        c2.set(4, "Sumo de laranja");
        System.out.println(c2);

        // food = c2.subList(3,6);
        System.out.println(c2.subList(3,6));

        Set<Pessoa> c3 = new HashSet<> ();

        Pessoa p1 = new Pessoa("Carolina Figueiredo", 12345678, new Date(12, 06, 2002));
        Pessoa p2 = new Pessoa("Diana Freixo", 46345772, new Date(25, 03, 2000));
        Pessoa p3 = new Pessoa("Pedro Oliverira", 84793761, new Date(03, 01, 1997));
        Pessoa p4 = new Pessoa("João Silva", 55849382, new Date(14, 05, 2003));
        Pessoa p5 = new Pessoa("Rui Magalhães", 95733492, new Date(07, 01, 2001));

        c3.add(p1);
        c3.add(p2);
        c3.add(p3);
        c3.add(p4);
        c3.add(p5);
        c3.add(p2);
        c3.add(p2);

        Iterator<Pessoa> i = c3.iterator();
        while(i.hasNext()) {
            System.out.println();
            System.out.println(i.next());
        }

        Set<Date> c4 = new TreeSet<> ();

        Date d1 = new Date(05, 04, 2020);
        Date d2 = new Date(28, 11, 2021);
        Date d3 = new Date(17, 07, 2003);
        Date d4 = new Date(22, 10, 2001);
        Date d5 = new Date(31, 01, 2020);

        c4.add(d1);
        c4.add(d2);
        c4.add(d3);
        c4.add(d4);
        c4.add(d5);

        Iterator<Date> j = c4.iterator();
        while(i.hasNext()) {
            System.out.println();
            System.out.println(j.next());
        }

    }
}