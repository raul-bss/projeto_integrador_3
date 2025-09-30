package com.mycompany.projetolancha5.DataAcessObject.interfaces;

import com.mycompany.projetolancha5.modelos.VendaInfo;
import java.util.List;

public interface VendaInfoInterface {
    boolean inserir(VendaInfo vendaInfo);
    boolean deletar(int id);
    boolean atualizar(int id);
    List<VendaInfo> listar();
    VendaInfo buscar(int id);
}
