package aula08.ex1;

public class Automovelig extends Veiculo {
    private int nquadro;
    private int capacidadebag;

    public Automovelig(String matr, String marca, String modelo, int potencia, int nquadro, int capacidadebag) {
        super(matr, marca, modelo, potencia);
        this.nquadro = nquadro;
        this.capacidadebag = capacidadebag;
    }

    public int getNquadro() {
        return nquadro;
    }

    public int getCapacidadebag() {
        return capacidadebag;
    }
}
