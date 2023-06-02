/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.erptech.modulo.cadastros.view;

import com.erptech.modulo.cadastros.dao.CadastroFuncionarioDao;
import com.erptech.modulo.cadastros.dao.CadastroUsuarioDao;
import com.erptech.modulo.cadastros.model.CadastroUsuarioModel;
import com.erptech.view.MenuPrincipalView;
import com.formdev.flatlaf.FlatDarkLaf;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public class CadastroUsuarioView extends javax.swing.JFrame {

    public CadastroUsuarioView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar = new javax.swing.JButton();
        txtCredencial = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        txtSenha = new javax.swing.JLabel();
        txtConfirme = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JLabel();
        txtAcessos = new javax.swing.JLabel();
        lblCredencial = new javax.swing.JTextField();
        lblNome = new javax.swing.JTextField();
        lblEmail = new javax.swing.JTextField();
        lblObservacao = new javax.swing.JTextField();
        lblSenha = new javax.swing.JPasswordField();
        lblConfirme = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        ckbCadastros = new javax.swing.JCheckBox();
        ckbEstoque = new javax.swing.JCheckBox();
        ckbQualidade = new javax.swing.JCheckBox();
        ckbCompras = new javax.swing.JCheckBox();
        ckbVendas = new javax.swing.JCheckBox();
        ckbProducao = new javax.swing.JCheckBox();
        ckbEntregas = new javax.swing.JCheckBox();
        ckbFiscal = new javax.swing.JCheckBox();
        ckbRelatorios = new javax.swing.JCheckBox();
        ckbSuporte = new javax.swing.JCheckBox();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de usuários");
        setPreferredSize(new java.awt.Dimension(900, 427));

        btnVoltar.setIcon(new javax.swing.ImageIcon("C:\\Users\\ferna\\OneDrive\\Documentos\\com\\erp-tech\\src\\midia\\icon-botao-voltar.png")); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        txtCredencial.setText("Credencial:");

        txtNome.setText("Nome:");

        txtSenha.setText("Senha:");

        txtConfirme.setText("Confirme:");

        txtEmail.setText("Email:");

        txtDescricao.setText("Descrição:");

        txtAcessos.setText("Acessos");

        ckbCadastros.setText("Cadastros");

        ckbEstoque.setText("Estoque");

        ckbQualidade.setText("Qualidade");

        ckbCompras.setText("Compras");

        ckbVendas.setText("Vendas");

        ckbProducao.setText("Produção");

        ckbEntregas.setText("Entregas");

        ckbFiscal.setText("Fiscal");

        ckbRelatorios.setText("Relatórios");

        ckbSuporte.setText("Suporte");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ferna\\OneDrive\\Documentos\\com\\erp-tech\\src\\midia\\refresh-button-icon.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtAcessos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCredencial)
                                    .addComponent(txtNome)
                                    .addComponent(txtSenha))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCredencial)
                                    .addComponent(lblNome)
                                    .addComponent(lblSenha))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(txtDescricao))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtEmail)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ckbCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ckbEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ckbQualidade, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ckbCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ckbVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(102, 102, 102)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ckbProducao, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ckbEntregas, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ckbFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ckbRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ckbSuporte, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 32, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtConfirme)
                        .addGap(24, 24, 24)
                        .addComponent(lblConfirme)
                        .addGap(405, 405, 405))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCredencial)
                        .addComponent(lblCredencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmail)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescricao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSenha)
                            .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtConfirme)
                            .addComponent(lblConfirme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAcessos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ckbCadastros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ckbEstoque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ckbQualidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ckbCompras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ckbVendas))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ckbProducao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ckbEntregas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ckbFiscal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ckbRelatorios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ckbSuporte)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed

        dispose();
        MenuPrincipalView menuPrincipalView = new MenuPrincipalView();
        menuPrincipalView.setVisible(true);

    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        lblCredencial.setText("");
        lblNome.setText("");
        lblSenha.setText("");
        lblConfirme.setText("");
        lblObservacao.setText("");
        lblEmail.setText("");
        ckbCadastros.setSelected(false);
        ckbCompras.setSelected(false);
        ckbEntregas.setSelected(false);
        ckbEstoque.setSelected(false);
        ckbFiscal.setSelected(false);
        ckbProducao.setSelected(false);
        ckbQualidade.setSelected(false);
        ckbRelatorios.setSelected(false);
        ckbSuporte.setSelected(false);
        ckbVendas.setSelected(false);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            CadastroUsuarioModel usuario = new CadastroUsuarioModel();
            CadastroUsuarioDao usuarioDao = new CadastroUsuarioDao();
            usuario.setCredencial(lblCredencial.getText());
            usuario.setNome(lblNome.getText());
            usuario.setSenha(lblSenha.getText());
            usuario.setConfirmarSenha(lblConfirme.getText());
            usuario.setEmail(lblEmail.getText());
            usuario.setObservacao(lblObservacao.getText());

            usuario.setAcessoCadastros(ckbCadastros.isSelected());
            usuario.setAcessoCompras(ckbCompras.isSelected());
            usuario.setAcessoEntregas(ckbEntregas.isSelected());
            usuario.setAcessoEstoque(ckbEstoque.isSelected());
            usuario.setAcessoFiscal(ckbFiscal.isSelected());
            usuario.setAcessoProducao(ckbProducao.isSelected());
            usuario.setAcessoQualidade(ckbQualidade.isSelected());
            usuario.setAcessoRelatorios(ckbRelatorios.isSelected());
            usuario.setAcessoSuporte(ckbSuporte.isSelected());
            usuario.setAcessoVendas(ckbVendas.isSelected());

            if (usuario.getSenha().equals(usuario.getConfirmarSenha())) {
                usuarioDao.cadastrarUsuario(usuario);

                JOptionPane.showMessageDialog(null, "Usuario cadastrado!");

            } else {
                JOptionPane.showMessageDialog(null, "Senhas divergentes!!");
            }

        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuario!" + exception);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed

        try {
            CadastroUsuarioModel usuario = new CadastroUsuarioModel();
            CadastroUsuarioDao usuarioDao = new CadastroUsuarioDao();

            usuario.setCredencial(lblCredencial.getText());
            usuario.setNome(lblNome.getText());
            usuario.setSenha(lblSenha.getText());
            usuario.setConfirmarSenha(lblConfirme.getText());
            usuario.setEmail(lblEmail.getText());
            usuario.setObservacao(lblObservacao.getText());

            usuario.setAcessoCadastros(ckbCadastros.isSelected());
            usuario.setAcessoCompras(ckbCompras.isSelected());
            usuario.setAcessoEntregas(ckbEntregas.isSelected());
            usuario.setAcessoEstoque(ckbEstoque.isSelected());
            usuario.setAcessoFiscal(ckbFiscal.isSelected());
            usuario.setAcessoProducao(ckbProducao.isSelected());
            usuario.setAcessoQualidade(ckbQualidade.isSelected());
            usuario.setAcessoRelatorios(ckbRelatorios.isSelected());
            usuario.setAcessoSuporte(ckbSuporte.isSelected());
            usuario.setAcessoVendas(ckbVendas.isSelected());

            if (usuario.getSenha().equals(usuario.getConfirmarSenha())) {
                usuarioDao.AtualizarCadastroDeUsuario(usuario);

                JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso!");

            } else {
                JOptionPane.showMessageDialog(null, "Senhas divergentes!!");
            }

        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar cadastro de usuario!" + exception);
        }

    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        List<CadastroUsuarioModel> registroDaCredencial = new ArrayList<>();
        try {
            CadastroUsuarioDao usuarioDao = new CadastroUsuarioDao();
            registroDaCredencial = usuarioDao.carregarUsuario(lblCredencial.getText());

            lblNome.setText(registroDaCredencial.get(0).getNome());
            lblSenha.setText(registroDaCredencial.get(0).getSenha());
            lblConfirme.setText(registroDaCredencial.get(0).getSenha());
            lblEmail.setText(registroDaCredencial.get(0).getEmail());
            lblObservacao.setText(registroDaCredencial.get(0).getObservacao());

            ckbCadastros.setSelected(registroDaCredencial.get(0).isAcessoCadastros());
            ckbCompras.setSelected(registroDaCredencial.get(0).isAcessoCompras());
            ckbEntregas.setSelected(registroDaCredencial.get(0).isAcessoEntregas());
            ckbEstoque.setSelected(registroDaCredencial.get(0).isAcessoEstoque());
            ckbFiscal.setSelected(registroDaCredencial.get(0).isAcessoFiscal());
            ckbProducao.setSelected(registroDaCredencial.get(0).isAcessoProducao());
            ckbQualidade.setSelected(registroDaCredencial.get(0).isAcessoQualidade());
            ckbRelatorios.setSelected(registroDaCredencial.get(0).isAcessoRelatorios());
            ckbSuporte.setSelected(registroDaCredencial.get(0).isAcessoSuporte());
            ckbVendas.setSelected(registroDaCredencial.get(0).isAcessoVendas());

        } catch (SQLException ex) {
            Logger.getLogger(CadastroUsuarioView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuarioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox ckbCadastros;
    private javax.swing.JCheckBox ckbCompras;
    private javax.swing.JCheckBox ckbEntregas;
    private javax.swing.JCheckBox ckbEstoque;
    private javax.swing.JCheckBox ckbFiscal;
    private javax.swing.JCheckBox ckbProducao;
    private javax.swing.JCheckBox ckbQualidade;
    private javax.swing.JCheckBox ckbRelatorios;
    private javax.swing.JCheckBox ckbSuporte;
    private javax.swing.JCheckBox ckbVendas;
    private javax.swing.JButton jButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField lblConfirme;
    private javax.swing.JTextField lblCredencial;
    private javax.swing.JTextField lblEmail;
    private javax.swing.JTextField lblNome;
    private javax.swing.JTextField lblObservacao;
    private javax.swing.JPasswordField lblSenha;
    private javax.swing.JLabel txtAcessos;
    private javax.swing.JLabel txtConfirme;
    private javax.swing.JLabel txtCredencial;
    private javax.swing.JLabel txtDescricao;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtSenha;
    // End of variables declaration//GEN-END:variables
}
