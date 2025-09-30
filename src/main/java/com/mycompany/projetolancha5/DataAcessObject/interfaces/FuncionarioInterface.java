/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.projetolancha5.DataAcessObject.interfaces;

import com.mycompany.projetolancha5.modelos.Funcionario;
import java.util.List;

/**
 *
 * @author raul_
 */
public interface FuncionarioInterface {
    boolean inserir(Funcionario funcionario);
    boolean deletar(int id);
    boolean atualizar(int id);
    List<Funcionario> listar();
    Funcionario buscar(int id);
}
