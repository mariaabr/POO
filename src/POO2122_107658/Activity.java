package POO2122_1907658;;

public class Activity implements Comparable <Activity> {
    private int participantes;
    private int preco;

    // private int precoSport = 25;
    // private int precoCulture = 20;
    // private int precoCatering = 30;

    public Activity( int participantes, int preco ) {
        this.participantes = participantes;
        this.preco = preco;
    }

    public int getParticipantes() {
        return this.participantes;
    }

    public void setParticipantes(int participantes) {
        this.participantes = participantes;
    }

    public int getPreco() {

        return this.preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Activity a) {
        return this.participantes;
    }
}
