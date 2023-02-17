package treinoPOO;

// import java.io.*;
// import java.util.*;

public abstract class Produto implements PVP {
    private String codigo;
    private static int ncodigo = 1000; // letra maiúscula, 1ª letra do produto + nº inteiro par diferente para cada produto (forma sequencial): Livro -> L1000
    private int quantidade;
    private Double preco; // preço base sem impostos, em Euros

    public Produto(String letra, Double preco) {
        this.codigo = letra + String.valueOf(ncodigo);
        ncodigo += 2;
        
        this.quantidade = 1;
        this.preco = preco;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void addStock(int quantidade) {
        this.quantidade += quantidade;
    }

    public int getStock() {
        return this.quantidade;
    }

    public void setStock(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean vender(int quantidade){
        if (getStock() >= quantidade) {
            this.quantidade = getStock();
            this.quantidade -= quantidade;
            return true;
        } else {
            return false;
        }
    }

    public int compare (Produto produto) {
        return this.codigo.compareTo(produto.codigo);
    }


    @Override
    public String toString() {
        return "[" + getCodigo() + getDescricao() + "]";
    }

    public abstract double precoVendaAoPublico();

    public abstract String getDescricao();

    public int compareDescs(Produto p) {
		return this.getDescricao().compareTo(p.getDescricao());
	}
}
