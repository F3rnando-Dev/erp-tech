/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erptech.dao;

import com.erptech.connection.ConnectionFactory;
import com.erptech.model.CadastroFuncionarioModel;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public class CadastroFuncionarioDao {
    
    
    public void create(CadastroFuncionarioModel funcionario){
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("INSERT INTO cadastro_funcionario (matricula_funcionario, nome_funcionario, cargo_funcionario) VALUES (?, ?, ?)");
            stmt.setString(1, funcionario.getMatriculaDoFuncionario());
            stmt.setString(2, funcionario.getNomeDoFuncionario());
            stmt.setString(3, funcionario.getCargoDoFuncionario());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Funcionario salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar funcionário!\n"+ex);
        } finally{
            ConnectionFactory.closeConnection(conn,stmt);
            
            
        }
    }
    
}
