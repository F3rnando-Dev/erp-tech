/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erptech.controller;

import com.erptech.model.CadastroFuncionarioModel;
import java.util.ArrayList;


/**
 *
 * @author ferna
 */
public class CadastroFuncionarioController {
    public static boolean salvarAluno(String matricula, String nome, String cargo){
        CadastroFuncionarioModel funcionarioModel = new CadastroFuncionarioModel(matricula, nome, cargo);
        return funcionarioModel.persistirNoBanco();
    }
    
    public static ArrayList<String[]> getFuncionarios(){
        ArrayList<String[]> funcionarios = new ArrayList<>();
        
        
        
        return funcionarios;
    }
}
