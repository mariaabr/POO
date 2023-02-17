package aula08.ex2;

public class Ementa {
    private String nome;
    private String local;
    // private -> lista de pratos;
    private Prato[] pratos = new Prato[7];

    public Ementa(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Prato[] getPratos() {
        return this.pratos;
    }

    public void setPratos(Prato[]pratos) {
        this.pratos = pratos;
    }

    public void addPrato(Prato prato, DiaSemana dia) {
        int index = dia.ordinal();
        pratos[index] = prato;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < 7; i++) {
            res += pratos[i] + ", dia " + DiaSemana.values()[i] + "\n";
        }
        return res;
    }
}
