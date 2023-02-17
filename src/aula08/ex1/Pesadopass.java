package aula08.ex1;

public class Pesadopass extends Veiculo{
    private int nquadro;
    private int peso;
    private int maxpass;

    public Pesadopass(String matr, String marca, String modelo, int potencia, int nquadro, int peso, int maxpass) {
        super(matr, marca, modelo, potencia);
        this.nquadro = nquadro;
        this.peso = peso;
        this.maxpass = maxpass;
    }

    public int getNquadro() {
        return nquadro;
    }

    public int getPeso() {
        return peso;
    }

    public int getMaxpass() {
        return maxpass;
    }
}