package Tablas_Interfacez;


import TablasDAO.PuestosDAO;
import erp_recursos_humanos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author andre
 */

public class Puestos extends javax.swing.JFrame {

    PuestosDAO p ;
    Connection con;
    String us;
    public Puestos(Connection c, String u) throws SQLException {
        con = c;
        us = u;
        PuestosDAO tu = new PuestosDAO(con);
        p = tu;
        initComponents();
        
        this.setLocationRelativeTo(null);
        jTable.setModel(p.consultaDatos());
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCiudad = new javax.swing.JLabel();
        jLabelCiudad3 = new javax.swing.JLabel();
        jLabelEstatus = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jTextFieldNombre = new javax.swing.JTextField();
        jComboBoxEstatus = new javax.swing.JComboBox<>();
        jTextFieldBuscar = new javax.swing.JTextField();
        jLabelBuscar = new javax.swing.JLabel();
        jButtonAgregar = new javax.swing.JLabel();
        jLabelAgregar = new javax.swing.JLabel();
        jButtonModificar = new javax.swing.JLabel();
        jLabelModificar = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JLabel();
        jButton1 = new javax.swing.JLabel();
        jLabelCiudad1 = new javax.swing.JLabel();
        jTextFieldSalarioMaximo = new javax.swing.JTextField();
        jTextFieldSalarioMinimo = new javax.swing.JTextField();
        txtEliminar1 = new javax.swing.JLabel();
        jButtonEliminar = new javax.swing.JLabel();
        jLabelSombra = new javax.swing.JLabel();
        txtEliminar2 = new javax.swing.JLabel();
        jButtonLimpiar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCiudad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCiudad.setText("Salario Minimo: ");
        getContentPane().add(jLabelCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 140, 20));

        jLabelCiudad3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCiudad3.setText("Nombre:");
        getContentPane().add(jLabelCiudad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, -1));

        jLabelEstatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEstatus.setText("Estatus");
        getContentPane().add(jLabelEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 253, 70, -1));

        jLabelEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEstado.setText("Salario Maximo:");
        getContentPane().add(jLabelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 193, 130, -1));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Puestos");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 205, 45));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 388, 210));

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 190, -1));

        jComboBoxEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "I" }));
        getContentPane().add(jComboBoxEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 190, -1));

        jTextFieldBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 82, 326, 30));

        jLabelBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelBuscar.setText("Buscar:");
        getContentPane().add(jLabelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 83, -1, -1));

        jButtonAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jButtonAgregar.setText("Agregar");
        getContentPane().add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 60, 30));

        jLabelAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonV.png"))); // NOI18N
        jLabelAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAgregarMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 312, 80, -1));

        jButtonModificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonModificar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jButtonModificar.setText("Actualizar");
        jButtonModificar.setAlignmentY(-1.0F);
        getContentPane().add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 110, 30));

        jLabelModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonAzul.png"))); // NOI18N
        jLabelModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelModificarMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 312, 80, -1));

        txtEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEliminar.setForeground(new java.awt.Color(255, 255, 255));
        txtEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEliminar.setText("Regresar");
        txtEliminar.setAlignmentY(1.0F);
        getContentPane().add(txtEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 30));

        jButton1.setBackground(new java.awt.Color(255, 0, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRosa.png"))); // NOI18N
        jButton1.setAlignmentX(-0.1F);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        jLabelCiudad1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCiudad1.setText("Nombre:");
        getContentPane().add(jLabelCiudad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, -1));

        jTextFieldSalarioMaximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalarioMaximoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSalarioMaximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 140, -1));

        jTextFieldSalarioMinimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalarioMinimoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSalarioMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 140, -1));

        txtEliminar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEliminar1.setForeground(new java.awt.Color(255, 255, 255));
        txtEliminar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEliminar1.setText("Eliminar");
        txtEliminar1.setAlignmentY(1.0F);
        getContentPane().add(txtEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 60, 30));

        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRojo.png"))); // NOI18N
        jButtonEliminar.setAlignmentX(-0.1F);
        jButtonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEliminarMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        jLabelSombra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Sombra2.png"))); // NOI18N
        getContentPane().add(jLabelSombra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        txtEliminar2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEliminar2.setForeground(new java.awt.Color(255, 255, 255));
        txtEliminar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEliminar2.setText("Limpiar");
        txtEliminar2.setAlignmentY(1.0F);
        getContentPane().add(txtEliminar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 60, 30));

        jButtonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonV.png"))); // NOI18N
        jButtonLimpiar.setAlignmentX(-0.1F);
        jButtonLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLimpiarMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // Manda llamar al metodo: limpiar()
        limpiar();

        int fila = jTable.rowAtPoint(evt.getPoint());

        jTextFieldNombre.setText(jTable.getValueAt(fila, 1).toString());
        jTextFieldSalarioMinimo.setText(jTable.getValueAt(fila, 2).toString());
        jTextFieldSalarioMaximo.setText(jTable.getValueAt(fila, 3).toString());
        jComboBoxEstatus.setSelectedItem(jTable.getValueAt(fila, 4));
    }//GEN-LAST:event_jTableMouseClicked

    private void jTextFieldBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarKeyReleased
        // Manda a llamar al metodo: consultaIndividual()
        consultaIndividual(jTextFieldBuscar.getText());
    }//GEN-LAST:event_jTextFieldBuscarKeyReleased

    private void jLabelAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAgregarMouseClicked
        float max, min;
        min=Float.parseFloat(jTextFieldSalarioMinimo.getText());
        max=Float.parseFloat(jTextFieldSalarioMaximo.getText());
        if(min< max){
                int seleccionEstatus = jComboBoxEstatus.getSelectedIndex();
                p.insertarDatos(jTextFieldNombre.getText(), jComboBoxEstatus.getItemAt(seleccionEstatus), Float.parseFloat(jTextFieldSalarioMinimo.getText()), Float.parseFloat(jTextFieldSalarioMaximo.getText()));
                // Manda a llamar el metodo: limpiar()
                limpiar();
                // Manda a llamar el metodo: consultaDatos()
                jTable.setModel(p.consultaDatos());
        }else{
              JOptionPane.showMessageDialog(null, "Ingresa catidades validas");
            }
        
    }//GEN-LAST:event_jLabelAgregarMouseClicked

    private void jLabelModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelModificarMouseClicked
        float max, min;
        min=Float.parseFloat(jTextFieldSalarioMinimo.getText());
        max=Float.parseFloat(jTextFieldSalarioMaximo.getText());
        if(min< max){
                // Manda llamar al metodo: actalizar();
                int seleccionEstatus = jComboBoxEstatus.getSelectedIndex();
                int fila = jTable.getSelectedRow();
                String m = (String) jTable.getValueAt(fila, 0);
                p.actualizar(jTextFieldNombre.getText(), Float.parseFloat(jTextFieldSalarioMinimo.getText()), Float.parseFloat(jTextFieldSalarioMaximo.getText()), jComboBoxEstatus.getItemAt(seleccionEstatus),m);
                // Manda a llamar el metodo: consultaDatos()
                jTable.setModel(p.consultaDatos());
                // Manda a llamar el metodo: limpiar()
                limpiar();
        }else{
              JOptionPane.showMessageDialog(null, "Ingresa catidades validas");
            }
    }//GEN-LAST:event_jLabelModificarMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        MenuTablas m = new MenuTablas(con, us);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextFieldSalarioMinimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSalarioMinimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSalarioMinimoActionPerformed

    private void jTextFieldSalarioMaximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSalarioMaximoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSalarioMaximoActionPerformed

    private void jButtonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarMouseClicked
        // Manda a llamar al metodo eliminar
        int filaSeleccionada = jTable.getSelectedRow();
        String id = "" + jTable.getValueAt(filaSeleccionada, 0);
        p.eliminar(id);
        // Manda a llamar el metodo: consultaDatos()        
        jTable.setModel(p.consultaDatos());
        // Manda a llamar el metodo: limpiar()
        limpiar();
    }//GEN-LAST:event_jButtonEliminarMouseClicked

    private void jButtonLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLimpiarMouseClicked
        limpiar();
    }//GEN-LAST:event_jButtonLimpiarMouseClicked

    public void limpiar(){
        jTextFieldNombre.setText("");
        jTextFieldSalarioMinimo.setText("");
        jTextFieldSalarioMaximo.setText("");
        jComboBoxEstatus.setSelectedItem(null);
    }
    
        public void consultaIndividual(String valor) {
        String[] titulos = {"idPuesto", "nombre", "salarioMinimo", "SalarioMaximo", "estatus"};
        String[] registros = new String[6];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM Puestos WHERE nombre LIKE '%"+valor+"%' AND estatus = 'A'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("idPuesto");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("salarioMinimo");
                registros[3] = rs.getString("salarioMaximo");
                registros[4] = rs.getString("estatus");
                model.addRow(registros);
            }
            jTable.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }

    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jButton1;
    private javax.swing.JLabel jButtonAgregar;
    private javax.swing.JLabel jButtonEliminar;
    private javax.swing.JLabel jButtonLimpiar;
    private javax.swing.JLabel jButtonModificar;
    private javax.swing.JComboBox<String> jComboBoxEstatus;
    private javax.swing.JLabel jLabelAgregar;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelCiudad1;
    private javax.swing.JLabel jLabelCiudad3;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelEstatus;
    private javax.swing.JLabel jLabelModificar;
    private javax.swing.JLabel jLabelSombra;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldSalarioMaximo;
    private javax.swing.JTextField jTextFieldSalarioMinimo;
    private javax.swing.JLabel txtEliminar;
    private javax.swing.JLabel txtEliminar1;
    private javax.swing.JLabel txtEliminar2;
    // End of variables declaration//GEN-END:variables
}
