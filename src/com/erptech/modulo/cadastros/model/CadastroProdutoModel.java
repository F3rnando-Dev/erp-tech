/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erptech.modulo.cadastros.model;

import java.util.ArrayList;

/**
 *
 * @author ferna
 */
public class CadastroProdutoModel {
    
    private int codigoDoProduto;
    private String marcaDoProduto;
    private String descricaoDoProduto;
    private String UnidadeDeComercializacaoDoProduto;
    private double PrecoDoProduto;
    private int QuantidadeEmEstoqueDoProduto;
    
    
    
    public CadastroProdutoModel(){
        
    }

    public CadastroProdutoModel(int codigoDoProduto, String descricaoDoProduto, String marcaDoProduto, double PrecoDoProduto, int QuantidadeEmEstoqueDoProduto, String UnidadeDeComercializacaoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
        this.marcaDoProduto = marcaDoProduto;
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

    public String getMarcaDoProduto() {
        return marcaDoProduto;
    }

    public void setMarcaDoProduto(String marcaDoProduto) {
        this.marcaDoProduto = marcaDoProduto;
    }

    @Override
    public String toString() {
        return "CadastroProdutoModel{" + "codigoDoProduto=" + codigoDoProduto + ", marcaDoProduto=" + marcaDoProduto + ", descricaoDoProduto=" + descricaoDoProduto + ", UnidadeDeComercializacaoDoProduto=" + UnidadeDeComercializacaoDoProduto + ", PrecoDoProduto=" + PrecoDoProduto + ", QuantidadeEmEstoqueDoProduto=" + QuantidadeEmEstoqueDoProduto + '}';
    }
    
    public ArrayList<CadastroProdutoModel> getProdutos(){
        ArrayList<CadastroProdutoModel> listaDeProdutos = new ArrayList();
        return listaDeProdutos;
    }
}
