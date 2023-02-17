package aula07.ex3;

public class Alojamento {
    private String codigo;
    private String nome;
    private String local;
    private Double pnoite;
    private boolean dispon;
    private Double aval;

    public Alojamento(String codigo, String nome, String local, Double pnoite, boolean dispon, Double aval) {
        this.codigo = codigo;
        this.nome = nome;
        this.local = local;
        this.pnoite = pnoite;
        this.dispon = dispon;
        this.aval = aval;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public Double getPnoite() {
        return this.pnoite;
    }

    public void setPnoite(Double pnoite) {
        this.pnoite = pnoite;
    }

    public boolean isDispon() {
        return this.dispon;
    }

    public boolean getDispon() {
        return this.dispon;
    }

    public void setDispon(boolean dispon) {
        this.dispon = dispon;
    }

    public Double getAval() {
        return this.aval;
    }

    public void setAval(Double aval) {
        this.aval = aval;
    }
    
    public void checkIn(String codigo){
        if (this.codigo.equals(codigo)) {
            this.dispon = false;
        }
    }

    public void checkOut(String codigo){
        if (this.codigo.equals(codigo)) {
            this.dispon = true;
        }
    }

    @Override
    public String toString() {
        return "Alojamento [código = " + codigo + ", nome = " + nome + ", local = " + local + ", preço por noite = " + pnoite + ", disponibilidade = " + dispon + ", avaliação = " + aval + "]";
    }
}