package aula08.ex2;

public class PratoDieta extends Prato {
    private Double maxCalorias;

    public PratoDieta(String nome, Double maxCalorias) {
        super(nome);
        this.maxCalorias = maxCalorias;
    }

    @Override
    public String toString() {
        return super.toString() + " - Dieta (" + maxCalorias + " Calorias)";
    }
}
