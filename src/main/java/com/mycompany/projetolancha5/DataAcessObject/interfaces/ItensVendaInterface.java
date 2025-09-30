/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.projetolancha5.DataAcessObject.interfaces;

import com.mycompany.projetolancha5.modelos.Carrinho;
import java.util.List;

/**
 *
 * @author raul_
 */
public interface ItensVendaInterface {
    boolean inserir(Double subTotal, int quantidade, int vendaId, int produtoId);
    boolean deletar(int id);
    boolean atualizar(int id);
    List<Carrinho> listar();
    Carrinho buscar(int id);
}
