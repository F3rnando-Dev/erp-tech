/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erptech.modulo.cadastros.model;

/**
 *
 * @author ferna
 */
public class CadastroUsuarioModel {
 
    private String credencial; 
    private String nome; 
    private String senha; 
    private String confirmarSenha; 
    private String email; 
    private String descricao;
    
    private boolean acessoCadastros;
    private boolean acessoEstoque;
    private boolean acessoQualidade;
    private boolean acessoCompras;
    private boolean acessoVendas;
    private boolean acessoProdução;
    private boolean acessoEntregas;
    private boolean acessoFiscal;
    private boolean acessoRelatorios;
    private boolean acessoSuporte;

    public CadastroUsuarioModel(String credencial, String nome, String senha, String confirmarSenha, String email, String descricao, boolean acessoCadastros, boolean acessoEstoque, boolean acessoQualidade, boolean acessoCompras, boolean acessoVendas, boolean acessoProdução, boolean acessoEntregas, boolean acessoFiscal, boolean acessoRelatorios, boolean acessoSuporte) {
        this.credencial = credencial;
        this.nome = nome;
        this.senha = senha;
        this.confirmarSenha = confirmarSenha;
        this.email = email;
        this.descricao = descricao;
        this.acessoCadastros = acessoCadastros;
        this.acessoEstoque = acessoEstoque;
        this.acessoQualidade = acessoQualidade;
        this.acessoCompras = acessoCompras;
        this.acessoVendas = acessoVendas;
        this.acessoProdução = acessoProdução;
        this.acessoEntregas = acessoEntregas;
        this.acessoFiscal = acessoFiscal;
        this.acessoRelatorios = acessoRelatorios;
        this.acessoSuporte = acessoSuporte;
    }

    public String getCredencial() {
        return credencial;
    }

    public void setCredencial(String credencial) {
        this.credencial = credencial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmarSenha() {
        return confirmarSenha;
    }

    public void setConfirmarSenha(String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isAcessoCadastros() {
        return acessoCadastros;
    }

    public void setAcessoCadastros(boolean acessoCadastros) {
        this.acessoCadastros = acessoCadastros;
    }

    public boolean isAcessoEstoque() {
        return acessoEstoque;
    }

    public void setAcessoEstoque(boolean acessoEstoque) {
        this.acessoEstoque = acessoEstoque;
    }

    public boolean isAcessoQualidade() {
        return acessoQualidade;
    }

    public void setAcessoQualidade(boolean acessoQualidade) {
        this.acessoQualidade = acessoQualidade;
    }

    public boolean isAcessoCompras() {
        return acessoCompras;
    }

    public void setAcessoCompras(boolean acessoCompras) {
        this.acessoCompras = acessoCompras;
    }

    public boolean isAcessoVendas() {
        return acessoVendas;
    }

    public void setAcessoVendas(boolean acessoVendas) {
        this.acessoVendas = acessoVendas;
    }

    public boolean isAcessoProdução() {
        return acessoProdução;
    }

    public void setAcessoProdução(boolean acessoProdução) {
        this.acessoProdução = acessoProdução;
    }

    public boolean isAcessoEntregas() {
        return acessoEntregas;
    }

    public void setAcessoEntregas(boolean acessoEntregas) {
        this.acessoEntregas = acessoEntregas;
    }

    public boolean isAcessoFiscal() {
        return acessoFiscal;
    }

    public void setAcessoFiscal(boolean acessoFiscal) {
        this.acessoFiscal = acessoFiscal;
    }

    public boolean isAcessoRelatorios() {
        return acessoRelatorios;
    }

    public void setAcessoRelatorios(boolean acessoRelatorios) {
        this.acessoRelatorios = acessoRelatorios;
    }

    public boolean isAcessoSuporte() {
        return acessoSuporte;
    }

    public void setAcessoSuporte(boolean acessoSuporte) {
        this.acessoSuporte = acessoSuporte;
    }

    @Override
    public String toString() {
        return "CadastroUsuarioModel{" + "credencial=" + credencial + ", nome=" + nome + ", senha=" + senha + ", confirmarSenha=" + confirmarSenha + ", email=" + email + ", descricao=" + descricao + ", acessoCadastros=" + acessoCadastros + ", acessoEstoque=" + acessoEstoque + ", acessoQualidade=" + acessoQualidade + ", acessoCompras=" + acessoCompras + ", acessoVendas=" + acessoVendas + ", acessoProdu\u00e7\u00e3o=" + acessoProdução + ", acessoEntregas=" + acessoEntregas + ", acessoFiscal=" + acessoFiscal + ", acessoRelatorios=" + acessoRelatorios + ", acessoSuporte=" + acessoSuporte + '}';
    }
    
    
    
    
}
