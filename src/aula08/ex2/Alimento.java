package aula08.ex2;

public class Alimento {
    private Double proteinas;
    private Double calorias;
    private Double peso;

    public Alimento(Double proteinas, Double calorias, Double peso) {
        this.proteinas = proteinas;
        this.calorias = calorias;
        this.peso = peso;
    }

    public Double getProteinas() {
        return this.proteinas;
    }

    public void setProteinas(Double proteinas) {
        this.proteinas = proteinas;
    }

    public Double getCalorias() {
        return this.calorias;
    }

    public void setCalorias(Double calorias) {
        this.calorias = calorias;
    }

    public Double getPeso() {
        return this.peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return ", Proteinas " + proteinas + ", calorias " + calorias + ", Peso " + peso;
    }
}
