/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas_Interfacez;

import Interfaz.Login;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lozy
 */
public class MenuTablas extends javax.swing.JFrame {

    Connection con;
    
    public MenuTablas(Connection c) {
        initComponents();
        con = c;
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCiudades = new javax.swing.JButton();
        btnTurnos = new javax.swing.JButton();
        btnestados = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("MENU");

        btnCiudades.setText("Ciudades");
        btnCiudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCiudadesActionPerformed(evt);
            }
        });

        btnTurnos.setText("Turnos");
        btnTurnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTurnosActionPerformed(evt);
            }
        });

        btnestados.setText("Estados");
        btnestados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnestadosActionPerformed(evt);
            }
        });

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/BotonLogin.png"))); // NOI18N
        btnLogin.setBorder(null);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCiudades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTurnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnestados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)))
                .addContainerGap(763, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnestados)
                .addGap(9, 9, 9)
                .addComponent(btnCiudades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTurnos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogin)
                .addContainerGap(246, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCiudadesActionPerformed
        Ciudades c = null;
        try {
            c = new Ciudades(con);
        } catch (SQLException ex) {
            Logger.getLogger(MenuTablas.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnCiudadesActionPerformed

    private void btnTurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTurnosActionPerformed
        Turnos t = null;
        try {
            t = new Turnos(con);
        } catch (SQLException ex) {
            Logger.getLogger(MenuTablas.class.getName()).log(Level.SEVERE, null, ex);
        }
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTurnosActionPerformed

    private void btnestadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnestadosActionPerformed
   Estados e = new Estados();
        e.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnestadosActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        Login l = new Login();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLoginActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCiudades;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnTurnos;
    private javax.swing.JButton btnestados;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
