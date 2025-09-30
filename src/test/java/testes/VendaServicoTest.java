package testes;

import com.mycompany.projetolancha5.DataAcessObject.servico.VendaServico;
import com.mycompany.projetolancha5.modelos.*;
import com.mycompany.projetolancha5.modelos.enums.*;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class VendaServicoTest {
    private VendaServico vendaServico;

    @BeforeEach
    void setUp() {
        vendaServico = new VendaServico();
    }

    @Test
    void deveInserirVendaComInfo() {
        Venda venda = new Venda();
        venda.setTotal(50.0);
        venda.setTroco(0.0);
        venda.setStatus(Status.APROVADA);
        venda.setCategoriaVenda(CategoriaVenda.ENTREGA);
        venda.setData("2025-09-30");
        venda.setValorEntrega(5.0);
        venda.setDesconto(0.0);

        Usuario usuario = new Usuario();
        usuario.setId(1); 
        venda.setUsuario(usuario);

        VendaInfo info = new VendaInfo();
        info.setTransacao(TipoTransacao.PIX);
        info.setData("2025-09-30");
        info.setHorario("12:30");
        info.setEndereço("Rua Teste, 123");
        info.setNomeCliente("Cliente Teste");

        Venda inserida = vendaServico.inserir(venda, info);

        assertNotNull(inserida, "O objeto de Venda inserida não deve ser nulo");
        assertNotNull(inserida.getId(), "Venda deveria ter sido inserida com ID gerado");
    }

    @Test
    void deveListarVendas() {
        
        List<Venda> vendas = vendaServico.listar();
        assertNotNull(vendas);
        assertFalse(vendas.isEmpty(), "A lista de vendas não deveria estar vazia");
    }

    @Test
    void deveBuscarVendaPorId() {
        
        Venda venda = vendaServico.buscar(1); 
        assertNotNull(venda);
        assertEquals(1, venda.getId(), "O ID da venda buscada deve ser 1");
    }
}
