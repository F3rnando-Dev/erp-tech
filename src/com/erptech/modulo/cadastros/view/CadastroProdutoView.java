/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.erptech.modulo.cadastros.view;

import com.erptech.modulo.cadastros.dao.CadastroProdutoDao;
import com.erptech.modulo.cadastros.model.CadastroProdutoModel;
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
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
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
        tbProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProdutosMouseClicked(evt);
            }
        });
        tbProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbProdutosKeyReleased(evt);
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

        int codigo = Integer.parseInt(lblCodigo.getText());
        double preco = Double.parseDouble(lblPreco.getText());
        int quantidade = Integer.parseInt(lblEstoque.getText());
        String unidadeComerc = (String) cbxUnComerc.getSelectedItem();
        
        try {
            CadastroProdutoModel produto = new CadastroProdutoModel();
            CadastroProdutoDao produtoDao = new CadastroProdutoDao();
            produto.setCodigoDoProduto(codigo);
            produto.setDescricaoDoProduto(lblDescricao.getText());
            produto.setUnidadeDeComercializacaoDoProduto(unidadeComerc);
            produto.setPrecoDoProduto(preco);
            produto.setQuantidadeEmEstoqueDoProduto(quantidade);

            produtoDao.cadastrarProduto(produto);

            JOptionPane.showMessageDialog(null, "Produto cadastrado!");

            lblCodigo.setText("");
            lblDescricao.setText("");
            lblPreco.setText("");
            lblEstoque.setText("");
            cbxUnComerc.setSelectedIndex(0);

            listarNaTabela();
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar produto!" + exception);
        }


    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        if (tbProdutos.getSelectedRow() != -1) {
            try {
                CadastroProdutoModel produto = new CadastroProdutoModel();
                CadastroProdutoDao produtoDao = new CadastroProdutoDao();
                
                produto.setCodigoDoProduto((int) tbProdutos.getValueAt(tbProdutos.getSelectedRow(), 0));

                produtoDao.excluirCadastroDeProduto(produto);

                JOptionPane.showMessageDialog(null, "Produto excluido com sucesso!");

                lblCodigo.setText("");
                lblDescricao.setText("");
                cbxUnComerc.setSelectedIndex(0);
                lblPreco.setText("");
                lblEstoque.setText("");

                listarNaTabela();
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir cadastro de produto!" + exception);
            }

        }
        
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tbProdutosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbProdutosKeyReleased
        
        if (tbProdutos.getSelectedRow() != -1) {
            lblCodigo.setText(tbProdutos.getValueAt(tbProdutos.getSelectedRow(), 0).toString());
            lblDescricao.setText(tbProdutos.getValueAt(tbProdutos.getSelectedRow(), 1).toString());
            cbxUnComerc.setSelectedItem(tbProdutos.getValueAt(tbProdutos.getSelectedRow(), 2).toString());
            lblPreco.setText(tbProdutos.getValueAt(tbProdutos.getSelectedRow(), 3).toString());
            lblEstoque.setText(tbProdutos.getValueAt(tbProdutos.getSelectedRow(), 4).toString());
        }
              
    }//GEN-LAST:event_tbProdutosKeyReleased

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        
        int codigo = Integer.parseInt(lblCodigo.getText());
        double preco = Double.parseDouble(lblPreco.getText());
        int quantidade = Integer.parseInt(lblEstoque.getText());
        
        if (tbProdutos.getSelectedRow() != -1) {
            try {
                CadastroProdutoModel produto = new CadastroProdutoModel();
                CadastroProdutoDao produtoDao = new CadastroProdutoDao();

                produto.setCodigoDoProduto(codigo);
                produto.setDescricaoDoProduto(lblDescricao.getText());
                produto.setUnidadeDeComercializacaoDoProduto((String) cbxUnComerc.getSelectedItem());
                produto.setPrecoDoProduto(preco);
                produto.setQuantidadeEmEstoqueDoProduto(quantidade);
                produto.setCodigoDoProduto(codigo);

                produtoDao.AtualizarCadastroDeProduto(produto);

                JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso!");

                lblCodigo.setText("");
                lblDescricao.setText("");
                cbxUnComerc.setSelectedIndex(0);
                lblPreco.setText("");
                lblEstoque.setText("");

                listarNaTabela();
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar cadastro de produto!" + exception);
            }
        }
        
        

        
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void tbProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdutosMouseClicked
        
        if (tbProdutos.getSelectedRow() != -1) {
            lblCodigo.setText(tbProdutos.getValueAt(tbProdutos.getSelectedRow(), 0).toString());
            lblDescricao.setText(tbProdutos.getValueAt(tbProdutos.getSelectedRow(), 1).toString());
            cbxUnComerc.setSelectedItem(tbProdutos.getValueAt(tbProdutos.getSelectedRow(), 2).toString());
            lblPreco.setText(tbProdutos.getValueAt(tbProdutos.getSelectedRow(), 3).toString());
            lblEstoque.setText(tbProdutos.getValueAt(tbProdutos.getSelectedRow(), 4).toString());
        }
        
    }//GEN-LAST:event_tbProdutosMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatDarkLaf.setup();
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
