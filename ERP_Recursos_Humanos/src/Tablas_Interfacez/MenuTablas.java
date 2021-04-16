/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas_Interfacez;

import Interfaz.Login;
import Interfaz.Menu;
import Reloj.Reloj;
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
    String us;
    
    public MenuTablas(Connection c, String u) {
        initComponents();
        Reloj h = new Reloj(lblReloj, u);
        h.start();
        con = c;
        us = u;        
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCiudades = new javax.swing.JButton();
        btnTurnos = new javax.swing.JButton();
        btnestados = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnPuestos = new javax.swing.JButton();
        btnDepartamentos = new javax.swing.JButton();
        lblReloj = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1080, 600));
        setMinimumSize(new java.awt.Dimension(1080, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1080, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Humanst521 BT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Regresar");
        jLabel2.setMaximumSize(new java.awt.Dimension(1080, 600));
        jLabel2.setMinimumSize(new java.awt.Dimension(1080, 600));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 480, 140, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("MENU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        btnCiudades.setText("Ciudades");
        btnCiudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCiudadesActionPerformed(evt);
            }
        });
        getContentPane().add(btnCiudades, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 189, -1));

        btnTurnos.setText("Turnos");
        btnTurnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTurnosActionPerformed(evt);
            }
        });
        getContentPane().add(btnTurnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 189, -1));

        btnestados.setText("Estados");
        btnestados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnestadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnestados, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 189, -1));

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/BotonLogin.png"))); // NOI18N
        btnLogin.setBorder(null);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, -1, -1));

        btnPuestos.setText("Puestos");
        btnPuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuestosActionPerformed(evt);
            }
        });
        getContentPane().add(btnPuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 189, -1));

        btnDepartamentos.setText("Departamentos");
        btnDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepartamentosActionPerformed(evt);
            }
        });
        getContentPane().add(btnDepartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 189, -1));

        lblReloj.setFont(new java.awt.Font("Humanst521 BT", 1, 14)); // NOI18N
        lblReloj.setForeground(new java.awt.Color(255, 255, 255));
        lblReloj.setText("lorem");
        getContentPane().add(lblReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/MenuPanel.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -30, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/FondoMenu.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            t = new Turnos(con, us);
        } catch (SQLException ex) {
            Logger.getLogger(MenuTablas.class.getName()).log(Level.SEVERE, null, ex);
        }
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTurnosActionPerformed

    private void btnestadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnestadosActionPerformed
   Estados t = null;
        try {
            t = new Estados(con);
        } catch (SQLException ex) {
            Logger.getLogger(MenuTablas.class.getName()).log(Level.SEVERE, null, ex);
        }
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnestadosActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
  
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnPuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuestosActionPerformed
        Puestos t = null;
        try{
            t = new Puestos(con);
        } catch(SQLException ex){
            Logger.getLogger(MenuTablas.class.getName()).log(Level.SEVERE, null, ex);
        }
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPuestosActionPerformed

    private void btnDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepartamentosActionPerformed
        Departamentos t = null;
        try{
            t = new Departamentos(con);
        } catch(SQLException ex ){
            Logger.getLogger(MenuTablas.class.getName()).log(Level.SEVERE, null, ex);
        }
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDepartamentosActionPerformed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        Menu m = new Menu(con, us);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLoginMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCiudades;
    private javax.swing.JButton btnDepartamentos;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnPuestos;
    private javax.swing.JButton btnTurnos;
    private javax.swing.JButton btnestados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblReloj;
    // End of variables declaration//GEN-END:variables
}
