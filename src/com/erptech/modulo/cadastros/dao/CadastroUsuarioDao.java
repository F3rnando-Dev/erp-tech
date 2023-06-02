/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erptech.modulo.cadastros.dao;

import com.erptech.connection.ConnectionFactory;
import com.erptech.modulo.cadastros.model.CadastroFuncionarioModel;
import com.erptech.modulo.cadastros.model.CadastroUsuarioModel;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
            stmt = conn.prepareStatement("UPDATE erptech.cadastro_usuario SET credencial = ?, nome = ?, senha = ?,\n"
                    + "email = ?, observacao = ?, acesso_cadastros = ?, acesso_estoque = ?, \n"
                    + "acesso_qualidade = ?, acesso_compras = ?, acesso_vendas = ?, acesso_producao = ?, \n"
                    + "acesso_entregas = ?, acesso_fiscal = ?, acesso_relatorios = ?, acesso_suporte = ?\n"
                    + "WHERE credencial = ?;");
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

            stmt.setString(16, usuario.getCredencial());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            throw new SQLException("Erro: ", ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }
    
     public List<CadastroUsuarioModel> carregarUsuario(String credencial) throws SQLException {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<CadastroUsuarioModel> usuarioCarregado = new ArrayList<>();

        try {
            CadastroUsuarioModel usuario = new CadastroUsuarioModel();
            stmt = conn.prepareStatement("SELECT * FROM cadastro_usuario WHERE credencial = ?");
            stmt.setString(1, usuario.getCredencial());
            
            rs = stmt.executeQuery();

            while (rs.next()) {
                

                usuario.setCredencial(rs.getString("CREDENCIAL"));
                usuario.setNome(rs.getString("NOME"));
                usuario.setSenha(rs.getString("SENHA"));
                usuario.setConfirmarSenha(rs.getString("SENHA"));
                usuario.setEmail(rs.getString("EMAIL"));
                usuario.setObservacao(rs.getString("OBSERVACAO"));
                
                usuario.setAcessoCadastros(rs.getBoolean("ACESSO_CADASTROS"));
                usuario.setAcessoEstoque(rs.getBoolean("ACESSO_ESTOQUE"));
                usuario.setAcessoQualidade(rs.getBoolean("ACESSO_QUALIDADE"));
                usuario.setAcessoCompras(rs.getBoolean("ACESSO_COMPRAS"));
                usuario.setAcessoVendas(rs.getBoolean("ACESSO_VENAS"));
                usuario.setAcessoProducao(rs.getBoolean("ACESSO_PRODUCAO"));
                usuario.setAcessoEntregas(rs.getBoolean("ACESSO_ENTREGAS"));
                usuario.setAcessoFiscal(rs.getBoolean("ACESSO_FISCAL"));
                usuario.setAcessoRelatorios(rs.getBoolean("ACESSO_RELATORIOS"));
                usuario.setAcessoSuporte(rs.getBoolean("ACESSO_SUPORTE"));
               
                usuarioCarregado.add(usuario);
            }
        } catch (SQLException ex) {
            throw new SQLException(null, ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stmt, rs);

        }
        return usuarioCarregado;
    }
}
