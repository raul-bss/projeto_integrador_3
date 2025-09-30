package com.mycompany.projetolancha5.modelos;

import com.mycompany.projetolancha5.modelos.enums.TipoConta;
import java.util.List;

public class Usuario {
    private int id;
    private String login;
    private String senha;
    private String email;
    private TipoConta tipoConta;
    private Funcionario funcionario;
    private List<Venda> vendas;

    public Usuario() {
    }

    public Usuario(String login, String senha, String email, TipoConta tipoConta) {
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.tipoConta = tipoConta;
    }

    public Usuario(String login, String senha, String email, TipoConta tipoConta, Funcionario funcionario, List<Venda> vendas) {
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.tipoConta = tipoConta;
        this.funcionario = funcionario;
        this.vendas = vendas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public List<Venda> getVendas() {
        return vendas;
    }


    
    
}
