/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.erptech.view;

import com.erptech.dao.CadastroFuncionarioDao;
import com.erptech.model.CadastroFuncionarioModel;
import com.formdev.flatlaf.FlatDarkLaf;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ferna
 */
public class CadastroFuncionarioView extends javax.swing.JFrame {

    public CadastroFuncionarioView() throws SQLException {
        initComponents();
        listarNaTabela();
        setLocationRelativeTo(null);
    }

    public void listarNaTabela() throws SQLException {
        DefaultTableModel modeloTabela = (DefaultTableModel) tbFuncionario.getModel();
        modeloTabela.setNumRows(0);

        CadastroFuncionarioDao funcionarioDao = new CadastroFuncionarioDao();

        for (CadastroFuncionarioModel model : funcionarioDao.listarFuncionarios()) {

            modeloTabela.addRow(new Object[]{
                model.getMatriculaDoFuncionario(),
                model.getNomeDoFuncionario(),
                model.getCargoDoFuncionario()

            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMatricula = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        txtCargo = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JTextField();
        lblNome = new javax.swing.JTextField();
        lblCargo = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        tbFuncionarios = new javax.swing.JScrollPane();
        tbFuncionario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de funcionários");
        setName("viewCadastroFuncionario"); // NOI18N
        setPreferredSize(new java.awt.Dimension(900, 400));

        txtMatricula.setText("Matricula:");

        txtNome.setText("Nome:");

        txtCargo.setText("Cargo:");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Cadastrar");
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
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        tbFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Matricula", "Nome", "Cargo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbFuncionarioMouseClicked(evt);
            }
        });
        tbFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbFuncionarioKeyReleased(evt);
            }
        });
        tbFuncionarios.setViewportView(tbFuncionario);
        if (tbFuncionario.getColumnModel().getColumnCount() > 0) {
            tbFuncionario.getColumnModel().getColumn(1).setPreferredWidth(400);
            tbFuncionario.getColumnModel().getColumn(2).setPreferredWidth(400);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCargo)
                            .addComponent(txtNome)
                            .addComponent(txtMatricula))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome)
                            .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(330, Short.MAX_VALUE))))
            .addComponent(tbFuncionarios)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatricula)
                    .addComponent(lblMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCargo)
                    .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tbFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed

        lblMatricula.setText("");
        lblNome.setText("");
        lblCargo.setText("");

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        try {
            CadastroFuncionarioModel funcionario = new CadastroFuncionarioModel();
            CadastroFuncionarioDao funcionarioDao = new CadastroFuncionarioDao();
            funcionario.setMatriculaDoFuncionario(lblMatricula.getText());
            funcionario.setNomeDoFuncionario(lblNome.getText());
            funcionario.setCargoDoFuncionario(lblCargo.getText());

            funcionarioDao.cadastrarFuncionario(funcionario);

            JOptionPane.showMessageDialog(null, "Funcionario cadastrado!");

            lblMatricula.setText("");
            lblNome.setText("");
            lblCargo.setText("");

            listarNaTabela();
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar funcionario!" + exception);
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tbFuncionarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbFuncionarioKeyReleased

        if (tbFuncionario.getSelectedRow() != -1) {
            lblMatricula.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), 0).toString());
            lblNome.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), 1).toString());
            lblCargo.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), 2).toString());
        }

    }//GEN-LAST:event_tbFuncionarioKeyReleased

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed

        if (tbFuncionario.getSelectedRow() != -1) {
            try {
                CadastroFuncionarioModel funcionario = new CadastroFuncionarioModel();
                CadastroFuncionarioDao funcionarioDao = new CadastroFuncionarioDao();

                funcionario.setMatriculaDoFuncionario(lblMatricula.getText());
                funcionario.setNomeDoFuncionario(lblNome.getText());
                funcionario.setCargoDoFuncionario(lblCargo.getText());
                funcionario.setMatriculaDoFuncionario((String) tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), 0));

                funcionarioDao.AtualizarCadastroDeFuncionario(funcionario);

                JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso!");

                lblMatricula.setText("");
                lblNome.setText("");
                lblCargo.setText("");

                listarNaTabela();
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar cadastro de funcionario!" + exception);
            }
        }

    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void tbFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFuncionarioMouseClicked

        if (tbFuncionario.getSelectedRow() != -1) {
            lblMatricula.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), 0).toString());
            lblNome.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), 1).toString());
            lblCargo.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), 2).toString());
        }

    }//GEN-LAST:event_tbFuncionarioMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        if (tbFuncionario.getSelectedRow() != -1) {
            try {
                CadastroFuncionarioModel funcionario = new CadastroFuncionarioModel();
                CadastroFuncionarioDao funcionarioDao = new CadastroFuncionarioDao();
                
                funcionario.setMatriculaDoFuncionario((String) tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), 0));

                funcionarioDao.excluirCadastroDeFuncionario(funcionario);

                JOptionPane.showMessageDialog(null, "Cadastro "+funcionario.getMatriculaDoFuncionario()+" excluido com sucesso!");

                lblMatricula.setText("");
                lblNome.setText("");
                lblCargo.setText("");

                listarNaTabela();
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir cadastro de funcionario!" + exception);
            }

        }


    }//GEN-LAST:event_btnExcluirActionPerformed

    public static void main(String args[]) {
        FlatDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadastroFuncionarioView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CadastroFuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField lblCargo;
    private javax.swing.JTextField lblMatricula;
    private javax.swing.JTextField lblNome;
    private javax.swing.JTable tbFuncionario;
    private javax.swing.JScrollPane tbFuncionarios;
    private javax.swing.JLabel txtCargo;
    private javax.swing.JLabel txtMatricula;
    private javax.swing.JLabel txtNome;
    // End of variables declaration//GEN-END:variables
}
