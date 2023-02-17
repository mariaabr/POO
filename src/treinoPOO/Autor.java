package treinoPOO;

// import java.io.*;
// import java.util.*;

public class Autor implements Comparable <Autor> {
    private String nome;
    private int ano;

    public Autor(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int compare(Autor autor) {
        return this.nome.compareTo(autor.nome);
    }

    @Override
    public int compareTo(Autor o) {
        // TODO Auto-generated method stub
        return this.ano;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", ano='" + getAno() + "'" +
            "}";
    }
}
