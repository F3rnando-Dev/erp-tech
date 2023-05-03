/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro.utils.controller;

import cadastro.utils.model.CadastroFuncionarioModel;


/**
 *
 * @author ferna
 */
public class CadastroFuncionarioController {
    public static boolean salvarAluno(String matricula, String nome, String cargo){
        
        CadastroFuncionarioModel funcionarioModel = new CadastroFuncionarioModel(matricula, nome, cargo);
         return funcionarioModel.persistirNoBanco();
        
        
        
    }
}
