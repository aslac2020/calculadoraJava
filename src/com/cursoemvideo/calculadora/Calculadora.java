/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursoemvideo.calculadora;

import java.text.DecimalFormat;

/**
 *
 * @author andre
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
        painCalc.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtValor = new javax.swing.JSpinner();
        btnCalcular = new javax.swing.JButton();
        painCalc = new javax.swing.JPanel();
        labelRest = new javax.swing.JLabel();
        lblRest = new javax.swing.JLabel();
        labelElev = new javax.swing.JLabel();
        lblCub = new javax.swing.JLabel();
        labelRaiz = new javax.swing.JLabel();
        lblRaiz = new javax.swing.JLabel();
        labelCubic = new javax.swing.JLabel();
        lblRaizCu = new javax.swing.JLabel();
        labelValorAbs = new javax.swing.JLabel();
        lblAbs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calc.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Super Calculadora");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Informe um valor:");

        txtValor.setModel(new javax.swing.SpinnerNumberModel(1, -50, 50, 1));

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconc.png"))); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        labelRest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelRest.setText("Resto da Divis??o por 2");

        lblRest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRest.setForeground(new java.awt.Color(0, 0, 255));
        lblRest.setText("0");

        labelElev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelElev.setText("Elevado ao Cubo");

        lblCub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCub.setForeground(new java.awt.Color(0, 0, 255));
        lblCub.setText("0");

        labelRaiz.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelRaiz.setText("Raiz Quadrada");

        lblRaiz.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRaiz.setForeground(new java.awt.Color(0, 0, 255));
        lblRaiz.setText("0");

        labelCubic.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelCubic.setText("Raiz C??bica");

        lblRaizCu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRaizCu.setForeground(new java.awt.Color(0, 0, 255));
        lblRaizCu.setText("0");

        labelValorAbs.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelValorAbs.setText("Valor Absoluto");

        lblAbs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAbs.setForeground(new java.awt.Color(0, 0, 255));
        lblAbs.setText("0");

        javax.swing.GroupLayout painCalcLayout = new javax.swing.GroupLayout(painCalc);
        painCalc.setLayout(painCalcLayout);
        painCalcLayout.setHorizontalGroup(
            painCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painCalcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painCalcLayout.createSequentialGroup()
                        .addComponent(labelValorAbs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAbs))
                    .addGroup(painCalcLayout.createSequentialGroup()
                        .addComponent(labelCubic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRaizCu))
                    .addGroup(painCalcLayout.createSequentialGroup()
                        .addComponent(labelRaiz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRaiz))
                    .addGroup(painCalcLayout.createSequentialGroup()
                        .addComponent(labelRest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(lblRest))
                    .addGroup(painCalcLayout.createSequentialGroup()
                        .addComponent(labelElev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCub)))
                .addGap(26, 26, 26))
        );
        painCalcLayout.setVerticalGroup(
            painCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painCalcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRest)
                    .addComponent(lblRest))
                .addGap(18, 18, 18)
                .addGroup(painCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelElev)
                    .addComponent(lblCub))
                .addGap(18, 18, 18)
                .addGroup(painCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRaiz)
                    .addComponent(lblRaiz))
                .addGap(18, 18, 18)
                .addGroup(painCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCubic)
                    .addComponent(lblRaizCu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(painCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelValorAbs)
                    .addComponent(lblAbs)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painCalc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painCalc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        painCalc.setVisible(true);
        int valor = Integer.parseInt(txtValor.getValue().toString());
        int rest = valor % 2;
        lblRest.setText(Integer.toString(rest));
        double elev = Math.pow(valor, 3);
        lblCub.setText(String.format("%.2f", elev));
        double raizq = Math.sqrt(valor);
        lblRaiz.setText(String.format("%.2f", raizq));
        double raizc = Math.cbrt(valor);
        lblRaizCu.setText(String.format("%.2f", raizc));
        int abs = Math.abs(valor);
        lblAbs.setText(Integer.toString(abs));
        
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelCubic;
    private javax.swing.JLabel labelElev;
    private javax.swing.JLabel labelRaiz;
    private javax.swing.JLabel labelRest;
    private javax.swing.JLabel labelValorAbs;
    private javax.swing.JLabel lblAbs;
    private javax.swing.JLabel lblCub;
    private javax.swing.JLabel lblRaiz;
    private javax.swing.JLabel lblRaizCu;
    private javax.swing.JLabel lblRest;
    private javax.swing.JPanel painCalc;
    private javax.swing.JSpinner txtValor;
    // End of variables declaration//GEN-END:variables


}
