package com.erptech.view;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author ferna
 */
public class MenuPrincipalView extends javax.swing.JFrame {

    
    
    public MenuPrincipalView() {
        ImageIcon icon = new ImageIcon("src/midia/logo-erptech.png");
        setIconImage(icon.getImage());
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnModuloCadastros = new javax.swing.JButton();
        btnModuloEstoque = new javax.swing.JButton();
        btnModuloQualidade = new javax.swing.JButton();
        btnModuloCompras = new javax.swing.JButton();
        btnModuloVendas = new javax.swing.JButton();
        btnModuloProducao = new javax.swing.JButton();
        btnModuloEntregas = new javax.swing.JButton();
        btnModuloFiscal = new javax.swing.JButton();
        btnModuloRelatórios = new javax.swing.JButton();
        btnModuloSuporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ERP TECH");
        setBackground(new java.awt.Color(102, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N

        btnModuloCadastros.setBackground(new java.awt.Color(51, 51, 51));
        btnModuloCadastros.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnModuloCadastros.setForeground(new java.awt.Color(204, 204, 204));
        btnModuloCadastros.setIcon(new javax.swing.ImageIcon("C:\\Users\\ferna\\OneDrive\\Documentos\\com\\erp-tech\\src\\midia\\logo-modulo-cadastro.png")); // NOI18N
        btnModuloCadastros.setText("Cadastros");
        btnModuloCadastros.setBorder(null);
        btnModuloCadastros.setBorderPainted(false);
        btnModuloCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloCadastrosActionPerformed(evt);
            }
        });

        btnModuloEstoque.setBackground(new java.awt.Color(51, 51, 51));
        btnModuloEstoque.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnModuloEstoque.setForeground(new java.awt.Color(204, 204, 204));
        btnModuloEstoque.setIcon(new javax.swing.ImageIcon("C:\\Users\\ferna\\OneDrive\\Documentos\\com\\erp-tech\\src\\midia\\logo-modulo-estoque.png")); // NOI18N
        btnModuloEstoque.setText("Estoque");
        btnModuloEstoque.setBorder(null);
        btnModuloEstoque.setBorderPainted(false);
        btnModuloEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloEstoqueActionPerformed(evt);
            }
        });

        btnModuloQualidade.setBackground(new java.awt.Color(51, 51, 51));
        btnModuloQualidade.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnModuloQualidade.setForeground(new java.awt.Color(204, 204, 204));
        btnModuloQualidade.setIcon(new javax.swing.ImageIcon("C:\\Users\\ferna\\OneDrive\\Documentos\\com\\erp-tech\\src\\midia\\logo-modulo-controle-de-qualidade.png")); // NOI18N
        btnModuloQualidade.setText("Qualidade");
        btnModuloQualidade.setToolTipText("");
        btnModuloQualidade.setBorder(null);
        btnModuloQualidade.setBorderPainted(false);
        btnModuloQualidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloQualidadeActionPerformed(evt);
            }
        });

        btnModuloCompras.setBackground(new java.awt.Color(51, 51, 51));
        btnModuloCompras.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnModuloCompras.setForeground(new java.awt.Color(204, 204, 204));
        btnModuloCompras.setIcon(new javax.swing.ImageIcon("C:\\Users\\ferna\\OneDrive\\Documentos\\com\\erp-tech\\src\\midia\\logo-modulo-compras.png")); // NOI18N
        btnModuloCompras.setText("Compras");
        btnModuloCompras.setBorder(null);
        btnModuloCompras.setBorderPainted(false);
        btnModuloCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloComprasActionPerformed(evt);
            }
        });

        btnModuloVendas.setBackground(new java.awt.Color(51, 51, 51));
        btnModuloVendas.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnModuloVendas.setForeground(new java.awt.Color(204, 204, 204));
        btnModuloVendas.setIcon(new javax.swing.ImageIcon("C:\\Users\\ferna\\OneDrive\\Documentos\\com\\erp-tech\\src\\midia\\logo-modulo-vendas.png")); // NOI18N
        btnModuloVendas.setText("  Vendas");
        btnModuloVendas.setBorder(null);
        btnModuloVendas.setBorderPainted(false);
        btnModuloVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloVendasActionPerformed(evt);
            }
        });

        btnModuloProducao.setBackground(new java.awt.Color(51, 51, 51));
        btnModuloProducao.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnModuloProducao.setForeground(new java.awt.Color(204, 204, 204));
        btnModuloProducao.setIcon(new javax.swing.ImageIcon("C:\\Users\\ferna\\OneDrive\\Documentos\\com\\erp-tech\\src\\midia\\logo-modulo-producao.png")); // NOI18N
        btnModuloProducao.setText("Produção");
        btnModuloProducao.setBorder(null);
        btnModuloProducao.setBorderPainted(false);
        btnModuloProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloProducaoActionPerformed(evt);
            }
        });

        btnModuloEntregas.setBackground(new java.awt.Color(51, 51, 51));
        btnModuloEntregas.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnModuloEntregas.setForeground(new java.awt.Color(204, 204, 204));
        btnModuloEntregas.setIcon(new javax.swing.ImageIcon("C:\\Users\\ferna\\OneDrive\\Documentos\\com\\erp-tech\\src\\midia\\logo-modulo-entregas.png")); // NOI18N
        btnModuloEntregas.setText("  Entregas");
        btnModuloEntregas.setBorder(null);
        btnModuloEntregas.setBorderPainted(false);
        btnModuloEntregas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloEntregasActionPerformed(evt);
            }
        });

        btnModuloFiscal.setBackground(new java.awt.Color(51, 51, 51));
        btnModuloFiscal.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnModuloFiscal.setForeground(new java.awt.Color(204, 204, 204));
        btnModuloFiscal.setIcon(new javax.swing.ImageIcon("C:\\Users\\ferna\\OneDrive\\Documentos\\com\\erp-tech\\src\\midia\\logo-modulo-fiscal.png")); // NOI18N
        btnModuloFiscal.setText("Fiscal");
        btnModuloFiscal.setBorder(null);
        btnModuloFiscal.setBorderPainted(false);
        btnModuloFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloFiscalActionPerformed(evt);
            }
        });

        btnModuloRelatórios.setBackground(new java.awt.Color(51, 51, 51));
        btnModuloRelatórios.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnModuloRelatórios.setForeground(new java.awt.Color(204, 204, 204));
        btnModuloRelatórios.setIcon(new javax.swing.ImageIcon("C:\\Users\\ferna\\OneDrive\\Documentos\\com\\erp-tech\\src\\midia\\logo-modulo-relatorios.png")); // NOI18N
        btnModuloRelatórios.setText("Relatórios");
        btnModuloRelatórios.setBorder(null);
        btnModuloRelatórios.setBorderPainted(false);
        btnModuloRelatórios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloRelatóriosActionPerformed(evt);
            }
        });

        btnModuloSuporte.setBackground(new java.awt.Color(51, 51, 51));
        btnModuloSuporte.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnModuloSuporte.setForeground(new java.awt.Color(204, 204, 204));
        btnModuloSuporte.setIcon(new javax.swing.ImageIcon("C:\\Users\\ferna\\OneDrive\\Documentos\\com\\erp-tech\\src\\midia\\logo-modulo-suporte.png")); // NOI18N
        btnModuloSuporte.setText("Suporte");
        btnModuloSuporte.setBorder(null);
        btnModuloSuporte.setBorderPainted(false);
        btnModuloSuporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloSuporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnModuloCadastros, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                    .addComponent(btnModuloProducao, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnModuloEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModuloEntregas, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnModuloQualidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModuloFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnModuloCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModuloRelatórios, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnModuloVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModuloSuporte, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnModuloCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModuloProducao, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModuloEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModuloQualidade, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModuloEntregas, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModuloFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModuloCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModuloVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnModuloRelatórios, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                    .addComponent(btnModuloSuporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModuloProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloProducaoActionPerformed
        
        ProducaoPrincipalView producaoPrincipalView = new ProducaoPrincipalView();
        producaoPrincipalView.setVisible(true);
        
    }//GEN-LAST:event_btnModuloProducaoActionPerformed

    private void btnModuloCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloCadastrosActionPerformed

        CadastrosPrincipalView cadastroPrincipalView = new CadastrosPrincipalView();
        cadastroPrincipalView.setVisible(true);

    }//GEN-LAST:event_btnModuloCadastrosActionPerformed

    private void btnModuloEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloEstoqueActionPerformed
        
        EstoquePrincipalView estoquePrincipalView = new EstoquePrincipalView();
        estoquePrincipalView.setVisible(true);
        
    }//GEN-LAST:event_btnModuloEstoqueActionPerformed

    private void btnModuloEntregasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloEntregasActionPerformed
        
        EntregasPrincipalView entregasPrincipalView = new EntregasPrincipalView();
        entregasPrincipalView.setVisible(true);
        
    }//GEN-LAST:event_btnModuloEntregasActionPerformed

    private void btnModuloQualidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloQualidadeActionPerformed
        
        QualidadePrincipalView qualidadePrincipalView = new QualidadePrincipalView();
        qualidadePrincipalView.setVisible(true);
        
    }//GEN-LAST:event_btnModuloQualidadeActionPerformed

    private void btnModuloFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloFiscalActionPerformed
        
        FiscalPrincipalView fiscalPrincipalView = new FiscalPrincipalView();
        fiscalPrincipalView.setVisible(true);
        
    }//GEN-LAST:event_btnModuloFiscalActionPerformed

    private void btnModuloComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloComprasActionPerformed
        
        ComprasPrincipalView comprasPrincipalView = new ComprasPrincipalView();
        comprasPrincipalView.setVisible(true);
        
    }//GEN-LAST:event_btnModuloComprasActionPerformed

    private void btnModuloRelatóriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloRelatóriosActionPerformed
        
        RelatoriosPrincipalView relatorioPrincipalView = new RelatoriosPrincipalView();
        relatorioPrincipalView.setVisible(true);
        
    }//GEN-LAST:event_btnModuloRelatóriosActionPerformed

    private void btnModuloVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloVendasActionPerformed
        
        VendasPrincipalView vendasPrincipalView = new VendasPrincipalView();
        vendasPrincipalView.setVisible(true);
        
    }//GEN-LAST:event_btnModuloVendasActionPerformed

    private void btnModuloSuporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloSuporteActionPerformed
        
        SuportePrincipalView suportePrincipalView = new SuportePrincipalView();
        suportePrincipalView.setVisible(true);
        
        
    }//GEN-LAST:event_btnModuloSuporteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModuloCadastros;
    private javax.swing.JButton btnModuloCompras;
    private javax.swing.JButton btnModuloEntregas;
    private javax.swing.JButton btnModuloEstoque;
    private javax.swing.JButton btnModuloFiscal;
    private javax.swing.JButton btnModuloProducao;
    private javax.swing.JButton btnModuloQualidade;
    private javax.swing.JButton btnModuloRelatórios;
    private javax.swing.JButton btnModuloSuporte;
    private javax.swing.JButton btnModuloVendas;
    // End of variables declaration//GEN-END:variables
}
