package treinoPOO;

// import java.io.*;
import java.util.*;

public class Telemovel extends Produto {
    // private static final int IVA = 23;

    private String marca;
    private String modelo;
    private Set<String> notas = new HashSet<>();
    
    public Telemovel(String marca, String modelo, Set<String> notas, Double preco) {
        super("T", preco);
        this.marca = marca;
        this.modelo = modelo;
        this.notas = notas;
    }

    public Telemovel(String marca, String modelo, Double preco) {
        super("T", preco);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Set<String> getNotas() {
        return this.notas;
    }

    public void setNotas(Set<String> notas) {
        this.notas = notas;
    }

    @Override
    public double precoVendaAoPublico() { // preço base + IVA
        return this.getPreco() + this.getPreco()*(0.23);
    }

    public String getDescricao() {
        return this.getMarca().toUpperCase() + "/" + this.getModelo();
    }

    public void addNota(String nota) {
        notas.add(nota);
    }

    @Override
    public String toString() {
        return "Telemóvel [" + getMarca() + " " + getModelo() + " " + getNotas() + "]";
    }
}
