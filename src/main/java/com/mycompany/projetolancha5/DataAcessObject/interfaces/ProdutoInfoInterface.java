/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetolancha5.DataAcessObject.interfaces;

import com.mycompany.projetolancha5.modelos.ProdutoInfo;
import java.util.List;

/**
 *
 * @author raul_
 */
public interface ProdutoInfoInterface {
    boolean inserir(ProdutoInfo produtoInfo);
    boolean deletar(int id);
    boolean atualizar(int id);
    List<ProdutoInfo> listar();
    ProdutoInfo buscar(int id);
}
