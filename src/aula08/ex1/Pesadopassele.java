package aula08.ex1;

public class Pesadopassele extends Pesadopass implements VeiculoEletrico {
    private int autonomia;
    private int autonomiaRest;

    public Pesadopassele(String matr, String marca, String modelo, int potencia, int numQuadro, int peso, int maxpassa, int autonomia) {
        super(matr, marca, modelo, potencia, numQuadro, peso, maxpassa);
        this.autonomia = autonomia;
        this.autonomiaRest = autonomia;  
    }

    public void trajeto(int quilometros) {
        super.trajeto(quilometros);
        autonomiaRest -= quilometros;
    }

    @Override
    public int autonomia() {
        return autonomiaRest;
    }

    @Override
    public void carregar(int percentagem) {
        double carregamento = percentagem * autonomia / 100;
        
        if(carregamento > autonomiaRest){
            autonomiaRest = (int) carregamento;
        }else{
            System.out.println("O automóvel tem mais do que " + percentagem + "% de autonomia"); 
        }        
    }
    
}
