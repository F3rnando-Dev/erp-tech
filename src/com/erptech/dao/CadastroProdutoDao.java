/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erptech.dao;

import com.erptech.connection.ConnectionFactory;
import com.erptech.model.CadastroFuncionarioModel;
import com.erptech.model.CadastroProdutoModel;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ferna
 */
public class CadastroProdutoDao {

    public void cadastrarFuncionario(CadastroProdutoModel produto) throws SQLException {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement("INSERT INTO erptech.cadastro_produto (codigo_produto, descricao_produto,"
                    + " unidade_comercializacao_produto, preco_produto, quantidade_produto) VALUES (?, ?, ?, ?, ?);");
            stmt.setInt(1, produto.getCodigoDoProduto());
            stmt.setString(2, produto.getDescricaoDoProduto());
            stmt.setString(3, produto.getUnidadeDeComercializacaoDoProduto());
            stmt.setDouble(4, produto.getPrecoDoProduto());
            stmt.setInt(5, produto.getQuantidadeEmEstoqueDoProduto());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(null, ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }

    public List<CadastroFuncionarioModel> listarFuncionario() throws SQLException {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<CadastroFuncionarioModel> listaDeFuncionarios = new ArrayList<>();

        try {
            stmt = conn.prepareStatement("SELECT * FROM cadastro_funcionario");
            rs = stmt.executeQuery();

            while (rs.next()) {
                CadastroFuncionarioModel funcionario = new CadastroFuncionarioModel();

                funcionario.setMatriculaDoFuncionario(rs.getString("MATRICULA_FUNCIONARIO"));
                funcionario.setNomeDoFuncionario(rs.getString("NOME_FUNCIONARIO"));
                funcionario.setCargoDoFuncionario(rs.getString("CARGO_FUNCIONARIO"));

                listaDeFuncionarios.add(funcionario);
            }
        } catch (SQLException ex) {
            throw new SQLException(null, ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stmt, rs);

        }
        return listaDeFuncionarios;
    }

    public void excluirCadastroDeFuncionario(CadastroFuncionarioModel funcionario) throws SQLException {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement("DELETE FROM erptech.cadastro_funcionario WHERE matricula_funcionario = ?");
            stmt.setString(1, funcionario.getMatriculaDoFuncionario());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            throw new SQLException(null, ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }

    public void AtualizarCadastroDeFuncionario(CadastroFuncionarioModel funcionario) throws SQLException {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement("UPDATE erptech.cadastro_funcionario SET matricula_funcionario = ?, nome_funcionario = ?,"
                    + " cargo_funcionario = ? WHERE matricula_funcionario = ?");
            stmt.setString(1, funcionario.getMatriculaDoFuncionario());
            stmt.setString(2, funcionario.getNomeDoFuncionario());
            stmt.setString(3, funcionario.getCargoDoFuncionario());
            stmt.setString(4, funcionario.getMatriculaDoFuncionario());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            throw new SQLException(null, ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }

}
