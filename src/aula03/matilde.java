package aula03;
// import java.util.Random;

public class matilde {
    public static void main(String[] args) {
        double[] nota_t = {11.3, 16.7, 7.8, 10.6, 16.9, 1.9, 17.6, 0.7, 8.7, 19.2, 17.5, 11.6, 7.2, 1.9, 19.3, 0};
        double[] nota_p = {9.3, 5.1, 18.9, 15.9, 5.9, 12.7, 4.8, 12.1, 8.6, 1.4, 3.4, 11.4, 8.5, 1.4, 14.9, 12.1};
        System.out.println("NotaT NotaP Pauta");
        for(int i=0; i<nota_t.length; i++ ) {
            System.out.printf("%4.1f %5.1f %5d \n", nota_t[i], nota_p[i],calc(nota_t[i], nota_p[i]));
        }
    }
    public static int calc(double nota_t, double nota_p) {
        if (nota_t < 7 || nota_p < 7) {
            return 66;
        }
        else{
            return (int)Math.round(0.4*nota_t+0.6*nota_p);
        }
    }
}
