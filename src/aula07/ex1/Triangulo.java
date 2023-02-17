package aula07.ex1;

public class Triangulo extends Forma {
    private double lado1, lado2, lado3;
	
	public Triangulo (double l1, double l2, double l3) {
		lado1 = l1;
		lado2 = l2;
		lado3 = l3;
	}

	public double getLado1() {
		return lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public double getLado3() {
		return lado3;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	
	public String toString()	{
		return String.format ("Lado1 - %s, Lado2 - %s, Lado3 - %s", lado1, lado2, lado3);
	}
	
	public double perimetro () {
		return lado1 + lado2 + lado3;
	}
	
	public double area() {
		double s = perimetro() / 2;
		return Math.sqrt(s * (s-lado1) * (s-lado2) * (s-lado3));
	}

	@Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
 
        if (!(o instanceof Triangulo)) {
            return false;
        }

        Triangulo t = (Triangulo) o;
        
        return Double.compare(lado1, t.lado1) == 0 && Double.compare(lado2, t.lado2) == 0 && Double.compare(lado3, t.lado3) == 0
            && color.equalsIgnoreCase(t.color);
    }
}
