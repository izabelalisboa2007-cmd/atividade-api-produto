package ifpi.edu.br.api_produto;

public class Produto {
    Long id;
    String nome;
    String categoria;
    Double preco;
    String descricao;
    Boolean destaque;

    public Produto(long id, String nome, String categoria, Double preco, String descricao, Boolean destaque) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.descricao = descricao;
        this.destaque = destaque;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public Double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean getDestaque() {
        return destaque;
    }
}
