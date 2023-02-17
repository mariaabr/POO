package aula05.ex3;

public class Formulasgeometricas {
    public static void main(String[] args) {
		// Circulo
		Circulo c1 = new Circulo(new Meio(3, 5), 6);
		Circulo c2 = new Circulo(new Meio(0, 0), 10);

		System.out.println("CIRCULOS:");

		System.out.println(c1.toString());
		System.out.printf("Area de C1: %.2f \n", c1.area());
		System.out.printf("Perímetro de C1: %.2f \n", c1.perimetro());

		System.out.println(c2.toString());
		System.out.printf("Area de C2: %.2f \n", c2.area());
		System.out.printf("Perímetro de C2: %.2f \n", c2.perimetro());

		System.out.println("Insersetam? " + (c1.interseta(c2) ? "Sim" : "Năo"));

		// Triangulo
		System.out.println("Triangulo:");

		Triangulo t = new Triangulo(6, 4, 5);

		System.out.printf("Perímetro: %.2f\n", t.perimetro());

		System.out.printf("Area: %.2f\n", t.area());

		// Retangulo
		System.out.println("Retângulo");

		Retangulo r = new Retangulo(12, 5);
		
		System.out.println(r.toString());
		
		System.out.printf("Perímetro: %.2f\n", r.perimetro());

		System.out.printf("Area: %.2f\n", r.area());
	}
}
