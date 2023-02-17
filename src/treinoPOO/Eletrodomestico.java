package treinoPOO;

// import java.io.*;
// import java.util.*;

public class Eletrodomestico extends Produto {
    // private static final int IVA = 23;

    private String tipo;
    private String marca;
    private String modelo;
    private ClasseEnergetica classe;
    private Double potencia;

    public Eletrodomestico(String tipo, String marca, String modelo, Double potencia, Double preco) {
        super("E", preco);
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public Eletrodomestico(String tipo, String marca, String modelo, Double preco) {
        super("E", preco);
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public ClasseEnergetica getClasse() {
        return this.classe;
    }

    public void setClasse(ClasseEnergetica classe) {
        this.classe = classe;
    }

    public Double getPotencia() {
        return this.potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }

    @Override
    public double precoVendaAoPublico() { // preço base + IVA
        return this.getPreco() + getPreco()*(0.23);
    }

    public String getDescricao() {
        return this.getTipo() + ":" + this.getMarca() + "/" + this.getModelo();
    }

    @Override
    public String toString() {
        return "Eletrodoméstico [" + getTipo() + " " + getMarca() + " " + getModelo() + " " + getClasse() + " " + getPotencia() + "W" + "]";
    }
}
