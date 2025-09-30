/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.projetolancha5.DataAcessObject.interfaces;

import com.mycompany.projetolancha5.modelos.Produto;
import java.util.List;

/**
 *
 * @author raul_
 */
public interface ProdutoInterface {
    boolean inserir(Produto produto);
    boolean deletar(int id);
    boolean atualizar(Produto produto);
    List<Produto> listar();
    Produto buscar(int id);
}
