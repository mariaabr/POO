package aula08.ex2;

public class Peixe extends Alimento{
    private TipoPeixe tipo;

    public Peixe(TipoPeixe tipo, Double proteinas, Double calorias, Double peso) {
        super(proteinas, calorias, peso);
        this.tipo = tipo;
    }

    public TipoPeixe getTipo() {
        return this.tipo;
    }

    public void setTipo(TipoPeixe tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Peixe " + tipo + super.toString();
    }
}
