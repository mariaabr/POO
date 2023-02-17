package POO2122_1907658;

public class Client {
    private String nome;
    private String local;

    public Client(String nome, String local) {
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
}
