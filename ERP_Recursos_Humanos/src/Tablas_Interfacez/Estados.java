/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas_Interfacez;

import TablasDAO.EstadosDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author napoleon
 */
public class Estados extends javax.swing.JFrame {
    EstadosDAO t ;
    Connection con;
    
    public Estados(Connection c) throws SQLException{
        con=c;
        EstadosDAO tu = new EstadosDAO(con);
        t=tu;
        initComponents();
        this.setLocationRelativeTo(null);
        Table1.setModel(t.mostrarDat());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldbusca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jLabelagre = new javax.swing.JLabel();
        jLabelelimi = new javax.swing.JLabel();
        jLabelactu = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        texnombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        texsiglas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        boxestatus = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        regle = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelSombra = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLabel1.setText("ESTADOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Buscar:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jTextFieldbusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldbuscaKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldbusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 275, -1));

        Table1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdEstados", "Nombre", "Siglas", "Estatus"
            }
        ));
        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 520, 210));

        jLabelagre.setBackground(new java.awt.Color(102, 255, 102));
        jLabelagre.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabelagre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelagre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelagre.setText("Agregar");
        jLabelagre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelagreMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelagre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 80, 30));

        jLabelelimi.setBackground(new java.awt.Color(255, 51, 51));
        jLabelelimi.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabelelimi.setForeground(new java.awt.Color(255, 255, 255));
        jLabelelimi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelelimi.setText("Eliminar");
        jLabelelimi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelelimiMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelelimi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 81, 30));

        jLabelactu.setBackground(new java.awt.Color(102, 255, 255));
        jLabelactu.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabelactu.setForeground(new java.awt.Color(255, 255, 255));
        jLabelactu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelactu.setText("Actualizar");
        jLabelactu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelactuMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelactu, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 80, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        getContentPane().add(texnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 162, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Siglas:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        texsiglas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texsiglasActionPerformed(evt);
            }
        });
        getContentPane().add(texsiglas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 127, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Estatus:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        boxestatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "I" }));
        getContentPane().add(boxestatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 61, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonV.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRojo.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonAzul.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        regle.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        regle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regle.setText("Regresar");
        regle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regleMouseClicked(evt);
            }
        });
        getContentPane().add(regle, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 296, 60, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRosa.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 80, -1));

        jLabelSombra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Sombra2.png"))); // NOI18N
        getContentPane().add(jLabelSombra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -40, -1, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table1MouseClicked
        // 
        limpiar();
        int fila=Table1.rowAtPoint(evt.getPoint());
        texnombre.setText(Table1.getValueAt(fila, 1).toString());
        texsiglas.setText(Table1.getValueAt(fila, 2).toString());
        boxestatus.setSelectedItem(Table1.getValueAt(fila,3));
    }//GEN-LAST:event_Table1MouseClicked

    private void jLabelactuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelactuMouseClicked
        // 
        int seleccionEs=boxestatus.getSelectedIndex();
        int fila=Table1.getSelectedRow();
        String m=(String) Table1.getValueAt(fila, 0);
        t.actualizar(texnombre.getText(), texsiglas.getText(), boxestatus.getItemAt(seleccionEs), m);
        
        Table1.setModel(t.mostrarDat());
        
        limpiar();
    }//GEN-LAST:event_jLabelactuMouseClicked

    private void jLabelelimiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelelimiMouseClicked
        int filaSele = Table1.getSelectedRow();
        String id = "" + Table1.getValueAt(filaSele, 0);
        t.eliminar(id);
        Table1.setModel(t.mostrarDat());
        
        limpiar();
// TODO add your handling code here:
    }//GEN-LAST:event_jLabelelimiMouseClicked

    private void jLabelagreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelagreMouseClicked

        // TODO add your handling code here:
        int seleccionEs=boxestatus.getSelectedIndex();
        t.insertar(texnombre.getText(), texsiglas.getText(), boxestatus.getItemAt(seleccionEs));
        limpiar();
        Table1.setModel(t.mostrarDat());
    }//GEN-LAST:event_jLabelagreMouseClicked

    private void jTextFieldbuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldbuscaKeyReleased

        // TODO add your handling code here:
        Busca(jTextFieldbusca.getText());
    }//GEN-LAST:event_jTextFieldbuscaKeyReleased

    private void texsiglasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texsiglasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texsiglasActionPerformed

    private void regleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regleMouseClicked
        // TODO add your handling code here:
          MenuTablas m = new MenuTablas(con);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regleMouseClicked
    public void limpiar() {
        texnombre.setText("");
        texsiglas.setText("");
        boxestatus.setSelectedItem(null);
    }
    
    public void Busca(String valor) {
        String[] titulos = {"idEstado", "nombre", "siglas", "estatus"};
        String[] registros = new String[5];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String SQL = "select * from Estados WHERE nombre LIKE '%"+valor+"%' AND estatus = 'A'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("idEstados");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("Siglas");
                registros[3] = rs.getString("estatus");
                model.addRow(registros);
            }
            Table1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }

    }
    
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
            java.util.logging.Logger.getLogger(Estados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JComboBox<String> boxestatus;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelSombra;
    private javax.swing.JLabel jLabelactu;
    private javax.swing.JLabel jLabelagre;
    private javax.swing.JLabel jLabelelimi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldbusca;
    private javax.swing.JLabel regle;
    private javax.swing.JTextField texnombre;
    private javax.swing.JTextField texsiglas;
    // End of variables declaration//GEN-END:variables
}
