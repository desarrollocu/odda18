/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Vista.config.ConfigurarAreas;
import Vista.login.LoginCliente;
import Vista.login.LoginTrabajador;
import Vista.monitor.MonitorAreas;

/**
 *
 * @author Fabi
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLoginTrabajador = new javax.swing.JButton();
        btnLoginCliente = new javax.swing.JButton();
        btnMonitorAreas = new javax.swing.JButton();
        btnAplicacionClientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLoginTrabajador.setText("Login trabajador");
        btnLoginTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginTrabajadorActionPerformed(evt);
            }
        });

        btnLoginCliente.setText("Login cliente");
        btnLoginCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginClienteActionPerformed(evt);
            }
        });

        btnMonitorAreas.setText("Monitor Areas");
        btnMonitorAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonitorAreasActionPerformed(evt);
            }
        });

        btnAplicacionClientes.setText("Aplicación Clientes");
        btnAplicacionClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicacionClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLoginCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(btnLoginTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMonitorAreas, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(btnAplicacionClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLoginTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(btnAplicacionClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLoginCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(btnMonitorAreas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginTrabajadorActionPerformed
        new LoginTrabajador().setVisible(true);
    }//GEN-LAST:event_btnLoginTrabajadorActionPerformed

    private void btnLoginClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginClienteActionPerformed
        //new LoginCliente().setVisible(true);
    }//GEN-LAST:event_btnLoginClienteActionPerformed

    private void btnMonitorAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonitorAreasActionPerformed
        new MonitorAreas().setVisible(true);
    }//GEN-LAST:event_btnMonitorAreasActionPerformed

    private void btnAplicacionClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicacionClientesActionPerformed
        new ConfigurarAreas().setVisible(true);
    }//GEN-LAST:event_btnAplicacionClientesActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicacionClientes;
    private javax.swing.JButton btnLoginCliente;
    private javax.swing.JButton btnLoginTrabajador;
    private javax.swing.JButton btnMonitorAreas;
    // End of variables declaration//GEN-END:variables
}