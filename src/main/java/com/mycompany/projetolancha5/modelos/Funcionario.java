package com.mycompany.projetolancha5.modelos;

import com.mycompany.projetolancha5.modelos.enums.Cargo;

public class Funcionario {
    private int id;
    private String nome;
    private Cargo cargo;
    private String cep;
    private String cidade;
    private String dataCadastro;
    private String celular;
    private Usuario usuario;

    public Funcionario() {
    }

    public Funcionario(String nome, Cargo cargo, String cep, String cidade, String dataCadastro, String celular) {
        this.nome = nome;
        this.cargo = cargo;
        this.cep = cep;
        this.cidade = cidade;
        this.dataCadastro = dataCadastro;
        this.celular = celular;
    }

    public Funcionario(String nome, Cargo cargo, String cep, String cidade, String dataCadastro, String celular, Usuario usuario) {
        this.nome = nome;
        this.cargo = cargo;
        this.cep = cep;
        this.cidade = cidade;
        this.dataCadastro = dataCadastro;
        this.celular = celular;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
    
}
