package aula06.ex1;
import aula05.Date;


public class Aluno extends Pessoa {
    private int NMec;
    private static int count = 100;

    public Aluno (String nome, int cc, Date dataNasc, Date idataInsc) {
        super(nome, cc, dataNasc);
        // Date dataIns = idataInsc;
        this.NMec = count ++;
    }

    public Aluno (String nome, int cc, Date dataNasc){
        super(nome, cc, dataNasc);
        // java.util.Date dataIns = new java.util.Date();
        this.NMec = count ++;
    }
    
    public int getNMec() {
        return NMec;
    }

    public void setNMec(int NMec) {
        this.NMec = NMec;
    }

    public String toString() {
		return this.getNome() + ", NMec: " + this.getNMec();
	}
    
}
