package ifpi.edu.br.api_produto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoControle {

    List<Produto> produtos = new ArrayList<>();

    public ProdutoControle() {
        produtos.add(new Produto(1L, "garrafa", "uso pessoal", 100.67, "Boa", true));
        produtos.add(new Produto(2L, "caderno", "material escolar", 25.90, "Ótimo", true));
        produtos.add(new Produto(3L, "caneta", "caneta azul", 3.50, "Boa", true));
        produtos.add(new Produto(4L, "mochila", "mochila escolar", 120.00, "Muito boa", true));
        produtos.add(new Produto(5L, "fone", "fone de ouvido", 89.90, "Bom", false));
        produtos.add(new Produto(6L, "mouse", "mouse sem fio", 75.50, "Ótimo", true));
        produtos.add(new Produto(7L, "teclado", "teclado USB", 110.00, "Bom", true));
    }
    @GetMapping
    public List<Produto> listar(){
        return produtos;
    }

    @GetMapping("/destaque")
    public List<Produto> destaque(){
        return produtos.stream().filter(produto -> Boolean.TRUE.equals(produto.getDestaque())).toList();
    }

    @GetMapping("/{id}")
    public Produto listarid(@PathVariable Long id){
        return produtos.stream().filter(produto -> produto.id.equals(id)).findFirst().orElse(null);
    }

}
