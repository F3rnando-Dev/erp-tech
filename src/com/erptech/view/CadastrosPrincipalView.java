/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.erptech.view;

import com.erptech.modulo.cadastros.view.CadastroFuncionarioView;
import com.erptech.modulo.cadastros.view.CadastroProdutoView;
import com.erptech.modulo.cadastros.view.CadastroUsuarioView;
import com.formdev.flatlaf.FlatDarkLaf;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author ferna
 */
public class CadastrosPrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form CadastroPrincipalView
     */
    public CadastrosPrincipalView() {
        ImageIcon icon = new ImageIcon("src/midia/logo-modulo-cadastro.png");
        setIconImage(icon.getImage());

        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuProdutos = new javax.swing.JMenu();
        itemProdutos = new javax.swing.JMenuItem();
        itemFuncionrios = new javax.swing.JMenuItem();
        itemUsuarios = new javax.swing.JMenuItem();
        menuFuncionarios = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        menuFiscal = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastros");
        setFocusableWindowState(false);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ferna\\OneDrive\\Documentos\\com\\erp-tech\\src\\midia\\logo-erptech.png")); // NOI18N
        jLabel1.setOpaque(true);

        btnVoltar.setIcon(new javax.swing.ImageIcon("C:\\Users\\ferna\\OneDrive\\Documentos\\com\\erp-tech\\src\\midia\\icon-botao-voltar.png")); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        menuProdutos.setText("Produtos");

        itemProdutos.setText("Produtos");
        itemProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProdutosActionPerformed(evt);
            }
        });
        menuProdutos.add(itemProdutos);

        itemFuncionrios.setText("Funcionários");
        itemFuncionrios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFuncionriosActionPerformed(evt);
            }
        });
        menuProdutos.add(itemFuncionrios);

        itemUsuarios.setText("Usuários");
        itemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUsuariosActionPerformed(evt);
            }
        });
        menuProdutos.add(itemUsuarios);

        menuBar.add(menuProdutos);

        menuFuncionarios.setText("Funcionários");

        jMenuItem1.setText("jMenuItem1");
        menuFuncionarios.add(jMenuItem1);

        jMenuItem4.setText("jMenuItem4");
        menuFuncionarios.add(jMenuItem4);

        jMenuItem5.setText("jMenuItem5");
        menuFuncionarios.add(jMenuItem5);

        jMenuItem6.setText("jMenuItem6");
        menuFuncionarios.add(jMenuItem6);

        jMenuItem9.setText("jMenuItem9");
        menuFuncionarios.add(jMenuItem9);

        jMenuItem11.setText("jMenuItem11");
        menuFuncionarios.add(jMenuItem11);

        menuBar.add(menuFuncionarios);

        menuFiscal.setText("Fiscal");

        jMenuItem12.setText("CFOP");
        menuFiscal.add(jMenuItem12);

        jMenuItem13.setText("NCM");
        menuFiscal.add(jMenuItem13);

        menuBar.add(menuFiscal);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(488, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed

        MenuPrincipalView menuPrincipalView = new MenuPrincipalView();
        menuPrincipalView.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnVoltarActionPerformed

    private void itemFuncionriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFuncionriosActionPerformed

        try {
            CadastroFuncionarioView funcionarioView = new CadastroFuncionarioView();
            funcionarioView.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CadastrosPrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_itemFuncionriosActionPerformed

    private void itemProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProdutosActionPerformed

        try {
            CadastroProdutoView produtosView = new CadastroProdutoView();
            produtosView.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CadastrosPrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemProdutosActionPerformed

    private void itemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUsuariosActionPerformed
        
        CadastroUsuarioView usuarioView = new CadastroUsuarioView();
        usuarioView.setVisible(true);
        
    }//GEN-LAST:event_itemUsuariosActionPerformed

    public static void main(String args[]) {
        FlatDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrosPrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JMenuItem itemFuncionrios;
    private javax.swing.JMenuItem itemProdutos;
    private javax.swing.JMenuItem itemUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuFiscal;
    private javax.swing.JMenu menuFuncionarios;
    private javax.swing.JMenu menuProdutos;
    // End of variables declaration//GEN-END:variables
}
