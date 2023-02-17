package aula08.ex1;

public class Motociclo extends Veiculo {
    private String tipo;
    
    public Motociclo(String matr, String marca, String modelo, int potencia, String tipo) {
        super(matr, marca, modelo, potencia);
        if(tipo.equals("desportivo") || tipo.equals("estrada")) {
            this.tipo = tipo;
        } else {
            System.out.println("tipo inválido!");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return "\nMotociclo -\n \tTipo = " + tipo + ",".concat(super.toString());
    }
    
}
