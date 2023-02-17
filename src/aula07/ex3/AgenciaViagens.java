package aula07.ex3;

import java.util.*;

public class AgenciaViagens {
    private String nome;
    private String endereco;
    private ArrayList<Alojamento> alojamentos = new ArrayList<>();
    private ArrayList<Viatura> viaturas = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public AgenciaViagens(String nome, String endereco, ArrayList<Alojamento> alojamentos, ArrayList<Viatura> viaturas) {
        this.nome = nome;
        this.endereco = endereco;
        this.alojamentos = alojamentos;
        this.viaturas = viaturas;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Alojamento> getAlojamentos() {
        return this.alojamentos;
    }

    public void setAlojamentos(ArrayList<Alojamento> alojamentos) {
        this.alojamentos = alojamentos;
    }

    public List<Viatura> getViaturas() {
        return this.viaturas;
    }

    public void setViaturas(ArrayList<Viatura> viaturas) {
        this.viaturas = viaturas;
    }

    // funções da agência

    // 1 - Adicionar um apartamento
    public void adicionarApartamento() {
        System.out.println("Digite o código: ");
        String codigo = sc.nextLine();

        System.out.println("Digite o nome do alojamento: ");
        String nome = sc.nextLine();

        System.out.println("Digite o local: ");
        String local = sc.nextLine();

        System.out.println("Digite o preço por noite: ");
        Double pnoite = sc.nextDouble();

        System.out.println("Está disponível? (Sim/ não): ");
        String resposta = sc.next();
        boolean dispon = verificarDispon(resposta);

        Double aval = 0.0;
        do {
            System.out.println("Avaliação (1.0 - 5.0): ");
            aval = sc.nextDouble();
        } while (!validateAval(aval));

        System.out.println("Digite o nº de quartos do apartamento: ");
        int quartos = sc.nextInt();

        alojamentos.add(new Apartamento(codigo, nome, local, pnoite, dispon, aval, quartos));
    }

    // 2 - Adicionar um quarto
    public void adicionarQuarto() {
        System.out.println("Digite o código: ");
        String codigo = sc.nextLine();

        System.out.println("Digite o nome do alojamento: ");
        String nome = sc.nextLine();

        System.out.println("Digite o local: ");
        String local = sc.nextLine();

        System.out.println("Digite o preço por noite: ");
        Double pnoite = sc.nextDouble();

        System.out.println("Está disponível? (Sim/ não): ");
        String resposta = sc.next();
        boolean dispon = verificarDispon(resposta);

        Double aval = 0.0;
        do {
            System.out.println("Avaliação (1.0 - 5.0): ");
            aval = sc.nextDouble();
        } while (!validateAval(aval));

        System.out.println("Digite o tipo do quarto: ");
        System.out.println("SINGLE, DOUBLE, TWIN or TRIPLE");
        String tipo = sc.next();

        alojamentos.add(new Quarto(codigo, nome, local, pnoite, dispon, aval, tipo));
    }

    // 3 - Adicionar uma Viatura
    public void adicionarViatura() {
        System.out.println("Digite a classe: ");
        char classe = sc.next().charAt(0);

        System.out.println("Motorização: ");
        System.out.println("gasolina, diesel, híbrido, elétrico");
        String motor = sc.nextLine();

        viaturas.add(new Viatura(classe, motor));
    }

    // 4 - Ver Alojamentos
    public void verAlojamentos() {
        for(Alojamento a : alojamentos) {
            System.out.println(a.toString());
        }
    }

    // 5 - Ver Viaturas
    public void verViaturas() {
        for(Viatura v : viaturas) {
            System.out.println(v.toString());
        }
    }

    // 6 - Levantar uma Viatura
    public void levantarViatura() {
        System.out.println("Código: ");
        int codigo = sc.nextInt();

        if(viaturas.get(encontrarViatura(codigo)).isDisponivel()){
            viaturas.get(encontrarViatura(codigo)).setDisponivel(false);
            System.out.println("Carro levantado com sucesso!");

        }else{
            System.out.println("Carro indisponível!");
        }
    }

    // 7 - Reservar um alojamento
    public void reservarAlojamento() {
        System.out.println("Código: ");
        int codigo = sc.nextInt();
        if(alojamentos.get(encontrarAlojamento(codigo)).isDispon()){
            alojamentos.get(encontrarAlojamento(codigo)).setDispon(false);
            System.out.println("Alojamento reservado com sucesso!");
        }else{
            System.out.println("Alojamento indisponível!");
        }
    }


    // outras funções necessárias
    private boolean verificarDispon(String resposta) {
        return resposta.equals("Sim") || resposta.equals("sim");
    }

    private boolean validateAval(Double aval) {
        if( 1.0 <= aval && aval <= 5.0){
            return true;
        } else {
            System.out.println("Avaliação inválida, fora dos valores pretendidos!");
            return false;
        }
    }

    private int encontrarViatura(int codigo) {
        int i = 0;
        for (Viatura v : viaturas) {
            if (v.getCodigo() == codigo) {
                return i;
            }
            i++;
        }
        return i;
    }

    private int encontrarAlojamento(int codigo) {
        int i = 0;
        for (Alojamento a : alojamentos) {
            if (Integer.parseInt(a.getCodigo()) == codigo) {
                return i;
            }
            i++;
        }
        return i;
    }
}