package aula07.ex1;

public class Meio {
    private double x;
    private double y;

    public Meio(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString()	{
        return String.format ("(%.2f, %.2f)", x, y);
    }
    
    public boolean equals (Meio p1) {
        return (this.x == p1.x && this.y == p1.y);
    }
}
