package aula08.ex2;

public class Carne extends Alimento{
    private VariedadeCarne variedade;

    public Carne(VariedadeCarne variedade, Double proteinas, Double calorias, Double peso) {
        super(proteinas, calorias, peso);
        this.variedade = variedade;
    }

    public VariedadeCarne getVariedade() {
        return this.variedade;
    }

    public void setVariedade(VariedadeCarne variedade) {
        this.variedade = variedade;
    }

    @Override
    public String toString() {
        return "Carne " + variedade + super.toString();
    }
}
