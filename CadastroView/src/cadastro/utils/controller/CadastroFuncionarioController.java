/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro.utils.controller;

import cadastro.utils.model.CadastroFuncionarioModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ferna
 */
public class CadastroFuncionarioController extends AbstractTableModel{
    
    private List<CadastroFuncionarioModel> linhas;
    private String colunas[] = new String[]{"Matrícula", "Nome", "Cargo"};

    public CadastroFuncionarioController() {
        //linhas = new ArrayList<CadastroFuncionarioModel>;
    }

    public CadastroFuncionarioController(List<CadastroFuncionarioModel> lista) {
        linhas = new ArrayList<CadastroFuncionarioModel>(lista);
    }
    
    
    
    
    
    
    

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
