package aula03;
import java.util.Random;

public class vbidimensional {    
    public static void main(String[] args) {
        Double[][] notas = new Double[16][2];
        Random rand = new Random();
        double notaP, notaT, notafinal;
        for(int i=0; i < notas.length; i++){
            notaT = rand.nextDouble() * 20;
            notaP = rand.nextDouble() * 20;

            notas[i][0]=(double) Math.round(notaP);
            notas[i][1]=(double) Math.round(notaT);
        }
        System.out.println(" Nota T Nota P Pauta ");
        for (int i = 0; i < notas.length; i ++) {
            if ((notas[i][0] < 7.0) || (notas[i][1] < 7.0)) {
                notafinal = 66;
            } else {
                notafinal = 0.4*notas[i][1] + 0.6*notas[i][0];
            }
            System.out.printf(" %4.1f %6.1f %7.1f \n", notas[i][1], notas[i][0], notafinal);
        }
    }
}
