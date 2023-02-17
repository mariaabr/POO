package aula07.ex1;

public abstract class Forma {
    public String color;
    public abstract double area();
    public abstract double perimetro();

    public String getColor() {
		return color;
	}

  public static void setColor(String cor) {
  } 
  
  public static String print(String cor) {
    return String.format("Cor - %s", cor);
  }
}
