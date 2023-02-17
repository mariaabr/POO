package treinoPOO;

// import java.io.*;
import java.util.*;

public class Livro extends Produto {
    // private static final int IVA = 6;

    private String titulo;
    private Set<Autor> autores = new TreeSet<Autor>();

    public Livro(String titulo, Double preco, List<Autor> autores) {
        super("L", preco);
        this.titulo = titulo;
        this.autores = new TreeSet <Autor> (Autor :: compare);
        this.autores.addAll(autores);
    }

    public Livro(String titulo, Double preco) {
        super("L", preco);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Set<Autor> getLista() {
        return this.autores;
    }

    public void setAutores(Set<Autor> autores) {
        this.autores = autores;
    }

    public void add(Autor autor) { // void porque não dá return + é necessário acrescentar um autor à lista de autores
        this.autores.add(autor);
    }

    public int numeroAutores() {
        return autores.size();
    }

    public String getDescricao() {
        return this.getTitulo();
    }

    public Set<Autor> autores() {
        return autores;
    }

    @Override
    public double precoVendaAoPublico() { // preço base + IVA
        return this.getPreco() + this.getPreco()*(0.06);
    }

    @Override
    public String toString() {
        return "Livro [" + getTitulo() + " " + getLista() + "]";
    }
}