/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erptech.modulo.cadastros.dao;

import com.erptech.connection.ConnectionFactory;
import com.erptech.modulo.cadastros.model.CadastroUsuarioModel;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author ferna
 */
public class CadastroUsuarioDao {

    public void cadastrarUsuario(CadastroUsuarioModel usuario) throws SQLException {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement("INSERT INTO erptech.cadastro_usuario (credencial, nome, senha, email, observacao,\n"
                    + " acesso_cadastros, acesso_estoque, acesso_qualidade, acesso_compras, acesso_vendas,\n"
                    + " acesso_producao, acesso_entregas, acesso_fiscal, acesso_relatorios, acesso_suporte) \n"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, usuario.getCredencial());
            stmt.setString(2, usuario.getNome());
            stmt.setString(3, usuario.getSenha());
            stmt.setString(4, usuario.getEmail());
            stmt.setString(5, usuario.getObservacao());
            stmt.setBoolean(6, usuario.isAcessoCadastros());
            stmt.setBoolean(7, usuario.isAcessoEstoque());
            stmt.setBoolean(8, usuario.isAcessoQualidade());
            stmt.setBoolean(9, usuario.isAcessoCompras());
            stmt.setBoolean(10, usuario.isAcessoVendas());
            stmt.setBoolean(11, usuario.isAcessoProducao());
            stmt.setBoolean(12, usuario.isAcessoEntregas());
            stmt.setBoolean(13, usuario.isAcessoFiscal());
            stmt.setBoolean(14, usuario.isAcessoRelatorios());
            stmt.setBoolean(15, usuario.isAcessoSuporte());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(null, ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }

    public void excluirCadastroDeUsuario(CadastroUsuarioModel usuario) throws SQLException {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement("DELETE FROM erptech.cadastro_usuario WHERE credencial = ?");
            stmt.setString(1, usuario.getCredencial());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            throw new SQLException(null, ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }

    public void AtualizarCadastroDeUsuario(CadastroUsuarioModel usuario) throws SQLException {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement("UPDATE erptech.cadastro_usuario SET credencial = ?, nome = ?, senha = ?,"
                    + " email = ?, observacao = ?, acesso_cadastros = ?, acesso_estoque = ?, acesso_qualidade = ?,"
                    + " acesso_producao = ?, acesso_entregas = ?, acesso_fiscal = ?, acesso_relatorios = ?, acesso_suporte = ?"
                    + "WHERE credencial = ?");
            stmt.setString(1, usuario.getCredencial());
            stmt.setString(2, usuario.getNome());
            stmt.setString(3, usuario.getSenha());
            stmt.setString(4, usuario.getEmail());
            stmt.setString(5, usuario.getObservacao());
            stmt.setBoolean(6, usuario.isAcessoCadastros());
            stmt.setBoolean(7, usuario.isAcessoEstoque());
            stmt.setBoolean(8, usuario.isAcessoQualidade());
            stmt.setBoolean(9, usuario.isAcessoCompras());
            stmt.setBoolean(10, usuario.isAcessoVendas());
            stmt.setBoolean(11, usuario.isAcessoProducao());
            stmt.setBoolean(12, usuario.isAcessoEntregas());
            stmt.setBoolean(13, usuario.isAcessoFiscal());
            stmt.setBoolean(14, usuario.isAcessoRelatorios());
            stmt.setBoolean(15, usuario.isAcessoSuporte());

            stmt.setString(7, usuario.getCredencial());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            throw new SQLException(null, ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }
}
