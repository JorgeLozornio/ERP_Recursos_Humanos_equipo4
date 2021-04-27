
package Tablas_Interfacez;

import Reloj.Reloj;
import TablasDAO.percepcionesDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author napoleon
 */
public class Percepciones extends javax.swing.JFrame {

    percepcionesDAO t;
    Connection con;
    String us;

    public Percepciones(Connection c, String u) throws SQLException {
        con = c;
        us = u;
        percepcionesDAO tu = new percepcionesDAO(con);
        t = tu;
        initComponents();
        Reloj h = new Reloj(lblReloj, u);
        h.start();
        this.setLocationRelativeTo(null);
        tableP.setModel(t.mostrarDat());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableP = new javax.swing.JTable();
        txBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblReloj = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txNombre = new javax.swing.JTextField();
        txDescripcion = new javax.swing.JTextField();
        txDiaspagar = new javax.swing.JTextField();
        jEstatus = new javax.swing.JComboBox<>();
        jRegrasar = new javax.swing.JLabel();
        jAgregar = new javax.swing.JLabel();
        jActualizar = new javax.swing.JLabel();
        jElimianar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelSombra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdPercepciones", "Nombre", "Descripcion", "Dias a pagar", "Estatus"
            }
        ));
        tableP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableP);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 460, 243));

        txBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 280, 29));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Buscar: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        lblReloj.setText("lorem");
        getContentPane().add(lblReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Percepciones");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 19, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Descripcion:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Dias a Pagar:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Estatus:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));
        getContentPane().add(txNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 240, -1));
        getContentPane().add(txDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 240, 155));
        getContentPane().add(txDiaspagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 240, -1));

        jEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "I" }));
        getContentPane().add(jEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 145, -1));

        jRegrasar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRegrasar.setText("Regresar");
        jRegrasar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRegrasarMouseClicked(evt);
            }
        });
        getContentPane().add(jRegrasar, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 415, 60, 20));

        jAgregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jAgregar.setText("Agregar");
        jAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAgregarMouseClicked(evt);
            }
        });
        getContentPane().add(jAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 70, 30));

        jActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jActualizar.setText("Actualizar");
        jActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jActualizarMouseClicked(evt);
            }
        });
        getContentPane().add(jActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, -1, 30));

        jElimianar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jElimianar.setForeground(new java.awt.Color(255, 255, 255));
        jElimianar.setText("Eliminar");
        jElimianar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jElimianarMouseClicked(evt);
            }
        });
        getContentPane().add(jElimianar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\napoleon\\Documents\\GitHub\\ERP_Recursos_Humanos_equipo4\\ERP_Recursos_Humanos\\src\\assets\\fondoBotonV.png")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\napoleon\\Documents\\GitHub\\ERP_Recursos_Humanos_equipo4\\ERP_Recursos_Humanos\\src\\assets\\fondoBotonRojo.png")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\napoleon\\Documents\\GitHub\\ERP_Recursos_Humanos_equipo4\\ERP_Recursos_Humanos\\src\\assets\\fondoBotonAzul.png")); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\napoleon\\Documents\\GitHub\\ERP_Recursos_Humanos_equipo4\\ERP_Recursos_Humanos\\src\\assets\\fondoBotonRosa.png")); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, -1));

        jLabelSombra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/SombraLogin.png"))); // NOI18N
        getContentPane().add(jLabelSombra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 0, 470, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAgregarMouseClicked
        if (txNombre.getText().isEmpty() && txDescripcion.getText().isEmpty() && txDiaspagar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: campos vacios");
        } else {
            int seleccionEstatus = jEstatus.getSelectedIndex();
            t.insertar(txNombre.getText(), txDescripcion.getText(), (int) Float.parseFloat(txDiaspagar.getText()), jEstatus.getItemAt(seleccionEstatus));
            limpiar();
            tableP.setModel(t.mostrarDat());
        }
    }//GEN-LAST:event_jAgregarMouseClicked

    private void jRegrasarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRegrasarMouseClicked
        MenuTablas m = new MenuTablas(con, us);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jRegrasarMouseClicked

    private void jActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jActualizarMouseClicked
        int seleccionEstatus = jEstatus.getSelectedIndex();
        int fila = tableP.getSelectedRow();
        String m = (String) tableP.getValueAt(fila, 0);
        t.actualizar(txNombre.getText(), txDescripcion.getText(), txDiaspagar.getX(), jEstatus.getItemAt(seleccionEstatus), m);
        tableP.setModel(t.mostrarDat());
        limpiar();
    }//GEN-LAST:event_jActualizarMouseClicked

    private void jElimianarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jElimianarMouseClicked
        int filaSeleccionada = tableP.getSelectedRow();
        String id = "" + tableP.getValueAt(filaSeleccionada, 0);
        t.eliminar(id);
        tableP.setModel(t.mostrarDat());
        limpiar();
    }//GEN-LAST:event_jElimianarMouseClicked

    private void txBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txBuscarKeyReleased
        consultaIndividual(txBuscar.getText());
    }//GEN-LAST:event_txBuscarKeyReleased

    private void tablePMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePMouseClicked
         limpiar();
        int fila=tableP.rowAtPoint(evt.getPoint());
        txNombre.setText(tableP.getValueAt(fila, 1).toString());
        txDescripcion.setText(tableP.getValueAt(fila, 2).toString());
        txDiaspagar.setText(tableP.getValueAt(fila, 3).toString());
        jEstatus.setSelectedItem(tableP.getValueAt(fila,4));
    }//GEN-LAST:event_tablePMouseClicked

    public void limpiar() {
        txNombre.setText("");
        txDiaspagar.setText("");
        txDescripcion.setText("");
    }

    public void consultaIndividual(String valor) {
        String[] titulos = {"idPercepcion", "nombre, descripcion, diasPagar, estatus"};
        String[] registros = new String[6];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM Percepciones WHERE nombre LIKE '%" + valor + "%' AND estatus = 'A'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("idPercepcion");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("descripcion");
                registros[3] = rs.getString("diasPagar");
                registros[4] = rs.getString("estatus");
                model.addRow(registros);
            }
            tableP.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: ");
        }

    }
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
            java.util.logging.Logger.getLogger(Percepciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Percepciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Percepciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Percepciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jActualizar;
    private javax.swing.JLabel jAgregar;
    private javax.swing.JLabel jElimianar;
    private javax.swing.JComboBox<String> jEstatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelSombra;
    private javax.swing.JLabel jRegrasar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JTable tableP;
    private javax.swing.JTextField txBuscar;
    private javax.swing.JTextField txDescripcion;
    private javax.swing.JTextField txDiaspagar;
    private javax.swing.JTextField txNombre;
    // End of variables declaration//GEN-END:variables
}