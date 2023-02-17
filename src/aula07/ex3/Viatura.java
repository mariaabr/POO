package aula07.ex3;

public class Viatura {
    private int codigo;
    private char classe;
    private String motor;
    private static int count = 0;

    public Viatura(char classe, String motor) {
        this.classe = classe;
        this.motor = motor;
        codigo = count++;
    }

    public char getClasse() {
        return this.classe;
    }

    public void setClasse(char classe) {
        this.classe = classe;
    }

    public String getMotor() {
        return this.motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Viatura.count = count;
    }

    public boolean isDisponivel() {
        return false;
    }

    public void setDisponivel(boolean b) {
    }

    @Override
    public String toString() {
        return "Viatura [classe = " + classe + ", motorização = " + motor;
    }
}