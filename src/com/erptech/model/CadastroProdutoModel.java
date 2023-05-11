/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erptech.model;

import java.util.ArrayList;

/**
 *
 * @author ferna
 */
public class CadastroProdutoModel {
    
    private int codigoDoProduto;
    private String descricaoDoProduto;
    private double PrecoDoProduto;
    private int QuantidadeEmEstoqueDoProduto;
    private String UnidadeDeComercializacaoDoProduto;
    
    
    public CadastroProdutoModel(){
        
    }

    public CadastroProdutoModel(int codigoDoProduto, String descricaoDoProduto, double PrecoDoProduto, int QuantidadeEmEstoqueDoProduto, String UnidadeDeComercializacaoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
        this.descricaoDoProduto = descricaoDoProduto;
        this.PrecoDoProduto = PrecoDoProduto;
        this.QuantidadeEmEstoqueDoProduto = QuantidadeEmEstoqueDoProduto;
        this.UnidadeDeComercializacaoDoProduto = UnidadeDeComercializacaoDoProduto;
    }

    public int getCodigoDoProduto() {
        return codigoDoProduto;
    }

    public void setCodigoDoProduto(int codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }

    public String getDescricaoDoProduto() {
        return descricaoDoProduto;
    }

    public void setDescricaoDoProduto(String descricaoDoProduto) {
        this.descricaoDoProduto = descricaoDoProduto;
    }

    public double getPrecoDoProduto() {
        return PrecoDoProduto;
    }

    public void setPrecoDoProduto(double PrecoDoProduto) {
        this.PrecoDoProduto = PrecoDoProduto;
    }

    public int getQuantidadeEmEstoqueDoProduto() {
        return QuantidadeEmEstoqueDoProduto;
    }

    public void setQuantidadeEmEstoqueDoProduto(int QuantidadeEmEstoqueDoProduto) {
        this.QuantidadeEmEstoqueDoProduto = QuantidadeEmEstoqueDoProduto;
    }

    public String getUnidadeDeComercializacaoDoProduto() {
        return UnidadeDeComercializacaoDoProduto;
    }

    public void setUnidadeDeComercializacaoDoProduto(String UnidadeDeComercializacaoDoProduto) {
        this.UnidadeDeComercializacaoDoProduto = UnidadeDeComercializacaoDoProduto;
    }

    @Override
    public String toString() {
        return "CadastroProdutoModel{" + "codigoDoProduto=" + codigoDoProduto + ", descricaoDoProduto=" + descricaoDoProduto + ", PrecoDoProduto=" + PrecoDoProduto + ", QuantidadeEmEstoqueDoProduto=" + QuantidadeEmEstoqueDoProduto + ", UnidadeDeComercializacaoDoProduto=" + UnidadeDeComercializacaoDoProduto + '}';
    }
    
    public ArrayList<CadastroProdutoModel> getProdutos(){
        ArrayList<CadastroProdutoModel> listaDeProdutos = new ArrayList();
        return listaDeProdutos;
    }
}
