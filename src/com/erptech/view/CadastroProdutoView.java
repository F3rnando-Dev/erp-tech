/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.erptech.view;

import com.erptech.dao.CadastroProdutoDao;
import com.erptech.model.CadastroProdutoModel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ferna
 */
public class CadastroProdutoView extends javax.swing.JFrame {

    /**
     * Creates new form CadastroProdutoView
     */
    public CadastroProdutoView() throws SQLException {
        initComponents();
        listarNaTabela();
        setLocationRelativeTo(null);
    }

    public void listarNaTabela() throws SQLException {
        DefaultTableModel modeloTabela = (DefaultTableModel) tbProdutos.getModel();
        modeloTabela.setNumRows(0);

        CadastroProdutoDao produtoDao = new CadastroProdutoDao();

        for (CadastroProdutoModel model : produtoDao.listarProdutos()) {

            modeloTabela.addRow(new Object[]{
                model.getCodigoDoProduto(),
                model.getDescricaoDoProduto(),
                model.getUnidadeDeComercializacaoDoProduto(),
                model.getPrecoDoProduto(),
                model.getQuantidadeEmEstoqueDoProduto()

            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodigo = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JLabel();
        txtPreco = new javax.swing.JLabel();
        txtEstoque = new javax.swing.JLabel();
        txtUnComerc = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JTextField();
        lblPreco = new javax.swing.JTextField();
        lblEstoque = new javax.swing.JTextField();
        cbxUnComerc = new javax.swing.JComboBox<>();
        btnNovo = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de produtos");

        txtCodigo.setText("Código:");

        txtDescricao.setText("Descrição:");

        txtPreco.setText("Preço:");

        txtEstoque.setText("Estoque:");

        txtUnComerc.setText("Unidade de Comercialização:");

        cbxUnComerc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione uma opção>", "Unidade", "Dezena", "Duzia", "Centena" }));
        cbxUnComerc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUnComercActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setMaximumSize(new java.awt.Dimension(72, 23));
        btnCadastrar.setMinimumSize(new java.awt.Dimension(72, 23));
        btnCadastrar.setPreferredSize(new java.awt.Dimension(72, 23));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.setMaximumSize(new java.awt.Dimension(72, 23));
        btnAtualizar.setMinimumSize(new java.awt.Dimension(72, 23));
        btnAtualizar.setPreferredSize(new java.awt.Dimension(72, 23));

        btnExcluir.setText("Excluir");

        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Un. Comerc.", "Preço", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbProdutos);
        if (tbProdutos.getColumnModel().getColumnCount() > 0) {
            tbProdutos.getColumnModel().getColumn(1).setPreferredWidth(650);
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
                            .addComponent(txtCodigo)
                            .addComponent(txtDescricao)
                            .addComponent(txtPreco)
                            .addComponent(txtEstoque))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDescricao)
                            .addComponent(lblCodigo)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxUnComerc, 0, 1, Short.MAX_VALUE)
                                    .addComponent(txtUnComerc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(300, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricao)
                    .addComponent(lblDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPreco)
                    .addComponent(lblPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUnComerc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEstoque)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxUnComerc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(221, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 226, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxUnComercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUnComercActionPerformed


    }//GEN-LAST:event_cbxUnComercActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed

        lblCodigo.setText("");
        lblDescricao.setText("");
        lblPreco.setText("");
        lblEstoque.setText("");
        cbxUnComerc.setSelectedIndex(0);

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        try {
            CadastroProdutoModel produto = new CadastroProdutoModel();
            CadastroProdutoDao produtoDao = new CadastroProdutoDao();
            produto.setCodigoDoProduto(lblCodigo.getSelectionStart());
            produto.setDescricaoDoProduto(lblDescricao.getText());
            produto.setUnidadeDeComercializacaoDoProduto(cbxUnComerc.getItemAt(1));
            produto.setPrecoDoProduto(lblPreco.getSelectionStart());
            produto.setQuantidadeEmEstoqueDoProduto(lblEstoque.getSelectionStart());

            produtoDao.cadastrarProduto(produto);

            JOptionPane.showMessageDialog(null, "Produto cadastrado!");

            lblCodigo.setText("");
            lblDescricao.setText("");
            lblPreco.setText("");
            lblEstoque.setText("");
            cbxUnComerc.setSelectedIndex(0);

            listarNaTabela();
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar funcionario!" + exception);
            System.out.println(exception);
        }


    }//GEN-LAST:event_btnCadastrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadastroProdutoView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CadastroProdutoView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JComboBox<String> cbxUnComerc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lblCodigo;
    private javax.swing.JTextField lblDescricao;
    private javax.swing.JTextField lblEstoque;
    private javax.swing.JTextField lblPreco;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JLabel txtDescricao;
    private javax.swing.JLabel txtEstoque;
    private javax.swing.JLabel txtPreco;
    private javax.swing.JLabel txtUnComerc;
    // End of variables declaration//GEN-END:variables
}
