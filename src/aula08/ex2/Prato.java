package aula08.ex2;

import java.util.*;

public class Prato {
    private String nome;
    private ArrayList<Alimento> alimentos = new ArrayList<>();

    public Prato(String nome) {
        this.nome = nome;
    }

    // De onde é que isto surgiu?
    public boolean addIngrediente(Alimento alimento) {
        alimentos.add(alimento);
        return true;
    }

    @Override
    public String toString() {
        return "Prato " + nome + ", composto por " + alimentos.size() + " Ingredientes";
    }
}
