package aula07.ex3;

public class Quarto extends Alojamento{
    private String tipo;

    public Quarto(String codigo, String nome, String local, Double pnoite, boolean dispon, Double aval, String tipo) {
        super(codigo, nome, local, pnoite, dispon, aval);
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + ", tipo de quarto: " + tipo;
    }
}