package aula08.ex1;
// import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Empresa {
    // private ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
    private Veiculo[] veiculos = new Veiculo[7];
    private String nome;
    private String codpostal;
    private String email;

    public Empresa(String nome, String codpostal, Veiculo[] veiculos, String email) {
        this.nome = nome;
        this.codpostal = codpostal;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCodpostal() {
        return codpostal;
    }

    public String getEmail() {
        return email;
    }

    public Empresa setEmail(String email){
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                this.email = email;
            }else{
                System.out.println("Email Inválido!");
            }
        }
        return this;
    } 

    // public void addVeiculo(Veiculo v) {
	// 	this.veiculos.add(v);
	// }
	
	public Veiculo getVeiculo(String matr) {
		for (Veiculo v : veiculos) {
			if(v.getMatr() == matr) {
				return v;
			}
		}
		return null;
	}

    public String[] compararDistancia(){
        int max = 0;
        String matricula = "";
        String marca = "";
        String[] veiculoMaxDist = new String[3];

        for(int i = 0; i < veiculos.length; i++){
            if(veiculos[i].distanciaTotal() >= max){
                max = veiculos[i].distanciaTotal();
            }

            if(max == veiculos[i].distanciaTotal()){
                matricula = veiculos[i].getMatr();
                marca = veiculos[i].getMarca();
            }
        }
        veiculoMaxDist[0] = matricula;
        veiculoMaxDist[1] = marca;
        veiculoMaxDist[2] = Integer.toString(max);

        return veiculoMaxDist;
    }

    public String printViaturas(){
        String s = "";
        for(int i=0; i< veiculos.length; i++){
            s += veiculos[i].toString() + "\n";
        }
        return s;
    }

    @Override
    public String toString() {
        return printViaturas();
    }
}