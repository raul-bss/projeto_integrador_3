package com.mycompany.projetolancha5.DataAcessObject.interfaces;

import com.mycompany.projetolancha5.modelos.Venda;
import com.mycompany.projetolancha5.modelos.VendaInfo;
import java.util.List;

public interface VendaInterface {
    Venda inserir(Venda venda,VendaInfo vendaInfo);
    boolean deletar(int id);
    boolean atualizar(int id);
    List<Venda> listar();
    Venda buscar(int id);
}
