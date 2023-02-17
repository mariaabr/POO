package aula11;

public class Voo implements Comparable<Voo> {
    private String hora;
    private String voo;
    private String companhia;
    private String origem;
    private String atraso;
    private String obs;

    public Voo(String hora, String voo, String companhia, String origem, String atraso) {
        this.hora = hora;
        this.voo = voo;
        this.companhia = companhia;
        this.origem = origem;
        this.atraso = atraso;
        this.obs = horaPrevista(hora, atraso);
    }
    
    public String getHora() {
        return this.hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getVoo() {
        return this.voo;
    }

    public void setVoo(String voo) {
        this.voo = voo;
    }

    public String getCompanhia() {
        return this.companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public String getOrigem() {
        return this.origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getAtraso() {
        return this.atraso;
    }

    public void setAtraso(String atraso) {
        this.atraso = atraso;
    }

    public String getObs() {
        return this.obs;
    }

    public String horaPrevista(String h, String a) {
        String[] horas_hm = h.split(":");
        int h_m = 60*Integer.parseInt(horas_hm[0]) + Integer.parseInt(horas_hm[1]);
        String[] atraso_hm = a.split(":");
        int a_m = 60*Integer.parseInt(atraso_hm[0]) + Integer.parseInt(atraso_hm[1]);
        int hp_m = h_m + a_m;
        return String.format("%02d:%02d",hp_m/60,hp_m%60);
    }

    @Override
    public int compareTo(Voo voo) {
        return this.getCompanhia().compareToIgnoreCase(voo.getCompanhia());
    }

    @Override
    public String toString() {
        return String.format("%-15s\t%-15s\t%-30s\t%-25s\t%-15s\t%-15s\t",hora, voo, companhia, origem, atraso, obs);
    }
}
