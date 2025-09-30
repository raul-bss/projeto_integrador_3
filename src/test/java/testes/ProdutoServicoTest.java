package testes;

import com.mycompany.projetolancha5.DataAcessObject.servico.ProdutoServico;
import com.mycompany.projetolancha5.modelos.Produto;
import com.mycompany.projetolancha5.modelos.ProdutoInfo;
import com.mycompany.projetolancha5.modelos.enums.CategoriaProduto;
import java.util.List;

// Importações do JUnit 5 (Jupiter)
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// A classe de teste DEVE ser pública para ser detectada corretamente pelo Maven Surefire/JUnit 5.
public class ProdutoServicoTest {
    
    private ProdutoServico produtoServico;

    // Usando @BeforeEach do JUnit 5 (jupiter)
    @BeforeEach
    void setUp() {
        // A instância do serviço é criada antes de cada teste.
        produtoServico = new ProdutoServico(); 
    }

    @Test // Usando @Test do JUnit 5 (jupiter)
    void deveInserirProdutoComSucesso() {
        Produto produto = new Produto();
        produto.setNome("Coxinha");
        produto.setValor(7.50);

        ProdutoInfo info = new ProdutoInfo();
        info.setCategoria(CategoriaProduto.SALGADO);
        info.setDescricao("Coxinha de frango com catupiry");
        produto.setInformacoes(info);

        boolean inserido = produtoServico.inserir(produto);
        assertTrue(inserido, "Produto deveria ser inserido com sucesso");
    }

    @Test
    void deveListarProdutos() {
        List<Produto> produtos = produtoServico.listar();
        assertNotNull(produtos);
        assertFalse(produtos.isEmpty(), "A lista de produtos não deveria estar vazia");
    }

    @Test
    void deveBuscarProdutoPorId() {

        Produto produto = produtoServico.buscar(1); 
        assertNotNull(produto);
        assertEquals(1, produto.getId(), "O ID do produto deve ser 1");
    }
}
