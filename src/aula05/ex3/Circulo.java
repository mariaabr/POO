package aula05.ex3;
import aula07.ex1.Forma;

public class Circulo extends Forma{
    private Meio centro;
    private double raio;
    
    public Circulo(Meio c, double r) {
            centro = c;
            raio = r;
    }
    
    public Meio getCentro() {
        return centro;
    }

    public double getRaio() {
        return raio;
    }

    public String toString()	{
        return String.format("CENTRO - %s  RAIO - %s", centro.toString(), raio);
    }
    
    public double area () {
        return Math.PI * Math.pow(raio, 2);
    }
    
    public double perimetro () {
        return 2 * Math.PI * raio;
    }
    
    private double distanciaRaios (Circulo c2) {
        return Math.sqrt(Math.pow(centro.getX() + c2.getCentro().getX(), 2) + Math.pow(centro.getY() + c2.getCentro().getY(), 2));
    }
    
    public boolean interseta (Circulo c2) {
        return Math.abs(this.raio - c2.getRaio()) <= distanciaRaios(c2) && distanciaRaios(c2) <= (this.raio + c2.getRaio()) ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
 
        if (!(o instanceof Circulo)) {
            return false;
        }

        Circulo c = (Circulo) o;

        return Double.compare(raio, c.raio) == 0;
    }
}
