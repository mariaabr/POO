package aula07.ex3;

public class Apartamento extends Alojamento{
    private int quartos;

    public Apartamento(String codigo, String nome, String local, Double pnoite, boolean dispon, Double aval, int quartos) {
        super(codigo, nome, local, pnoite, dispon, aval);
        this.quartos = quartos;
    }

    public int getQuartos() {
        return this.quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    @Override
    public String toString() {
        return super.toString() + ", nº de quartos: " + quartos;
    }
}
