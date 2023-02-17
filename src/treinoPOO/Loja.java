package treinoPOO;

// import java.io.*;
import java.util.*;

public class Loja {
    private String nome;
    private String enderecoweb;
    private Set<Produto> stock = new TreeSet<Produto>(); // ordenados pelo código

    public Loja(String nome, String enderecoweb) {
        this.nome = nome;
        this.enderecoweb = enderecoweb;
        this.stock = new TreeSet<Produto>(Produto :: compare);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnderecoweb() {
        return this.enderecoweb;
    }

    public void setEnderecoweb(String enderecoweb) {
        this.enderecoweb = enderecoweb;
    }

    public Set<Produto> getStock() {
        return this.stock;
    }

    public void setStock(Set<Produto> stock) {
        this.stock = stock;
    }

    public int totalItems() {
        int total = 0;
        for (Produto p : stock) {
            total += p.getStock();
        }
        return total;
    }

    public void add(Produto produto) {
        stock.add(produto);
    }

    @Override
    public String toString() {
        String write = "Loja" + nome + "\n";
        write += "\n";

        write += String.format("%-6s\t%-25s\t%-5s\t%-5s\t \n", "Código", "Produto", "Em stock", "PVP");

        for (Produto produto : stock) {
            write += String.format("%-6s\t%-25s\t%-15d\t%-7.2f\t \n", produto.getCodigo(), produto.getDescricao(), produto.getStock(), produto.precoVendaAoPublico());
        }

        return write;
    }

    public Produto getProdutoPelaDescricao(String descricao) {
        for (Produto produto : stock) {
            if (produto.getDescricao().equals(descricao)) {
                return produto;
            }
        }
        return null;
    }

    public void reorder() {
		TreeSet<Produto> temp = new TreeSet<Produto>(Produto::compareDescs);
		temp.addAll(this.stock);
		this.stock = temp;
	}
}
