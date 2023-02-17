package aula08.ex1;

public class Pesadomerc extends Veiculo {
    private int nquadro;
    private int peso;
    private int cargamax;

    public Pesadomerc(String matr, String marca, String modelo, int potencia, int nquadro, int peso, int cargamax) {
        super(matr, marca, modelo, potencia);
        this.nquadro = nquadro;
        this.peso = peso;
        this.cargamax = cargamax;
    }

    public  int getNquadro() {
        return nquadro;
    }

    public int getPeso() {
        return peso;
    }

    public int getCargamax() {
        return cargamax;
    }
}
