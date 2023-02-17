package aula07.ex1;

public class Retangulo extends Forma {
    private double comprimento, altura;
	
	public Retangulo(double c, double h) {
		comprimento = c;
		altura = h;
	}

	public double getComprimento() {
		return comprimento;
	}

	public double getAltura() {
		return altura;
	}
	
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String toString() {
		return "Retangulo [comprimento=" + comprimento + ", altura=" + altura + "]";
	}
	
	public double perimetro () {
		return 2 * comprimento + 2 * altura;
	}

	public double area () {
		return comprimento * altura;
	}

	@Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
 
        if (!(o instanceof Retangulo)) {
            return false;
        }

        Retangulo r = (Retangulo) o;
        
        return Double.compare(comprimento, r.comprimento) == 0 && Double.compare(altura, r.altura) == 0
            && color.equalsIgnoreCase(r.color);
    }
}
