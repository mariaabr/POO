package aula08.ex1;

public class Taxi extends Veiculo {
    private int nquadro;
    private int capacidadebag;
    private int numlicen;

    public Taxi(String matr, String marca, String modelo, int potencia, int nquadro, int capacidadebag, int numlicen) {
        super(matr, marca, modelo, potencia);
        this.nquadro = nquadro;
        this.capacidadebag = capacidadebag;
        this.numlicen = numlicen;
    }

    public int getNquadro() {
        return nquadro;
    }

    public int getCapacidadebag() {
        return capacidadebag;
    }

    public int getNumlicen() {
        return numlicen;
    }

    
}
