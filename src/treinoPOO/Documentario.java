package treinoPOO;

// import java.io.*;
// import java.util.*;

public class Documentario extends Produto {
    // private static final int IVA = 23;

    private String titulo;
    private int ano;
    private int duracao; // em minutos

    public Documentario(String titulo, int ano, int duracao, Double preco) {
        super("D", preco);
        this.titulo = titulo;
        this.ano = ano;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public double precoVendaAoPublico() { // preço base + IVA
        return this.getPreco() + this.getPreco()*(0.23);
    }

    public String getDescricao() {
        return this.getTitulo();
    }

    @Override
    public String toString() {
        return "Documentário [" + getTitulo() + " " + getAno() + " " + getDuracao() + "]";
    }
}
