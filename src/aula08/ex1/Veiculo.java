package aula08.ex1;

public class Veiculo implements KmPercorridosInterface{
    
    private String matr;
    private String marca;
    private String modelo;
    private int potencia;
    private int ultrajeto = 0;
    private int kmtotal = 0;

    public Veiculo(String matr, String marca, String modelo, int potencia) {
        this.matr = matr;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;

    }

    public String getMatr() {
        return matr;
    }

    public Veiculo setMatr(String matr) {
        if(matr.matches("([0-9]{2}-[0-9]{2}-[A-Z]{2})|([0-9]{2}-[A-Z]{2}-[0-9]{2})|([A-Z]{2}-[0-9]{2}-[0-9]{2})")){
            this.matr = matr;
        }else{
            System.out.println("Matrícula Inválida");
        }
        return this;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    @Override
    public void trajeto(int quilometros) {
        ultrajeto = quilometros;
        kmtotal += ultrajeto;
    }

    @Override
    public int ultimoTrajeto() {
        return ultrajeto;
    }

    @Override
    public int distanciaTotal() {
        return kmtotal;
    } 
}