package Tablas_Interfacez;

import TablasDAO.CiudadesDAO;
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

public class Ciudades extends javax.swing.JFrame {
    CiudadesDAO t ;
    Connection con;

    public Ciudades(Connection c) throws SQLException {
        con = c;
        CiudadesDAO tu = new CiudadesDAO(con);
        t = tu;
        initComponents();
        this.setLocationRelativeTo(null);
        jTable.setModel(t.consultaDatos());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCiudad = new javax.swing.JLabel();
        jLabelEstatus = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jLabelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jTextFieldCiudad = new javax.swing.JTextField();
        jComboBoxEstatus = new javax.swing.JComboBox<>();
        jTextFieldBuscar = new javax.swing.JTextField();
        jLabelBuscar = new javax.swing.JLabel();
        txtAgregar = new javax.swing.JLabel();
        jLabelAgregar = new javax.swing.JLabel();
        txtModficar = new javax.swing.JLabel();
        jLabelModificar = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JLabel();
        jLabelEliminar = new javax.swing.JLabel();
        jLabelSombra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCiudad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCiudad.setText("Ciudad");
        getContentPane().add(jLabelCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 136, 70, -1));

        jLabelEstatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEstatus.setText("Estatus");
        getContentPane().add(jLabelEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 253, 70, -1));

        jLabelEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEstado.setText("Estado");
        getContentPane().add(jLabelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 193, 80, -1));

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Chiapas", "Chihuahua", "Coahuila de Zaragoza", "Colima", "Durango", "Estado de México", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Michoacán de Ocampo", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz de Ignacio de la Llave", "Yucatán", "Zacatecas" }));
        getContentPane().add(jComboBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 190, -1));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Ciudades");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 205, 45));

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

        jTextFieldCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCiudadActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 190, -1));

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

        txtAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAgregar.setForeground(new java.awt.Color(255, 255, 255));
        txtAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAgregar.setText("Agregar");
        getContentPane().add(txtAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 60, 30));

        jLabelAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonV.png"))); // NOI18N
        jLabelAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAgregarMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 312, 80, -1));

        txtModficar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtModficar.setForeground(new java.awt.Color(255, 255, 255));
        txtModficar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtModficar.setText("Actualizar");
        txtModficar.setAlignmentY(-1.0F);
        getContentPane().add(txtModficar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 110, 30));

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
        txtEliminar.setText("Eliminar");
        txtEliminar.setAlignmentY(1.0F);
        getContentPane().add(txtEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 60, 30));

        jLabelEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRojo.png"))); // NOI18N
        jLabelEliminar.setAlignmentX(-0.1F);
        jLabelEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEliminarMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        jLabelSombra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Sombra2.png"))); // NOI18N
        getContentPane().add(jLabelSombra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCiudadActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // Manda llamar al metodo: limpiar()
        limpiar();

        int fila = jTable.rowAtPoint(evt.getPoint());

        jTextFieldCiudad.setText(jTable.getValueAt(fila, 1).toString());
        jComboBoxEstado.setSelectedItem(jTable.getValueAt(fila, 2));
        jComboBoxEstatus.setSelectedItem(jTable.getValueAt(fila, 3));
    }//GEN-LAST:event_jTableMouseClicked

    private void jTextFieldBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarKeyReleased
        // Manda a llamar al metodo: consultaIndividual()
        consultaIndividual(jTextFieldBuscar.getText());
    }//GEN-LAST:event_jTextFieldBuscarKeyReleased

    private void jLabelAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAgregarMouseClicked
        int seleccionEstatus = jComboBoxEstatus.getSelectedIndex();
        t.insertarDatos(jTextFieldCiudad.getText(), jComboBoxEstado.getSelectedIndex(), jComboBoxEstatus.getItemAt(seleccionEstatus));
        // Manda a llamar el metodo: limpiar()
        limpiar();
        // Manda a llamar el metodo: consultaDatos()
        jTable.setModel(t.consultaDatos());
    }//GEN-LAST:event_jLabelAgregarMouseClicked

    private void jLabelModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelModificarMouseClicked
        // Manda llamar al metodo: actalizar();
        int seleccionEstatus = jComboBoxEstatus.getSelectedIndex();
        int fila = jTable.getSelectedRow();
        String m = (String) jTable.getValueAt(fila, 0);
        t.actualizar(jTextFieldCiudad.getText(), jComboBoxEstado.getSelectedIndex(), jComboBoxEstatus.getItemAt(seleccionEstatus), m);
        // Manda a llamar el metodo: consultaDatos()
        jTable.setModel(t.consultaDatos());
        // Manda a llamar el metodo: limpiar()
        limpiar();
    }//GEN-LAST:event_jLabelModificarMouseClicked

    private void jLabelEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEliminarMouseClicked
        // Manda a llamar al metodo eliminar
        int filaSeleccionada = jTable.getSelectedRow();
        String id = "" + jTable.getValueAt(filaSeleccionada, 0);
        t.eliminar(id);
        // Manda a llamar el metodo: consultaDatos()        
        jTable.setModel(t.consultaDatos());
        // Manda a llamar el metodo: limpiar()
        limpiar();
    }//GEN-LAST:event_jLabelEliminarMouseClicked

    public void limpiar() {
        jTextFieldCiudad.setText("");
        jComboBoxEstado.setSelectedItem(null);
        jComboBoxEstatus.setSelectedItem(null);
    }
    
        public void consultaIndividual(String valor) {
        String[] titulos = {"idCiudad", "nombre", "idEstado", "estatus"};
        String[] registros = new String[5];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM RHCiudades WHERE nombre LIKE '%"+valor+"%'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("idCiudad");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("idEstado");
                registros[3] = rs.getString("estatus");
                model.addRow(registros);
            }
            jTable.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }

    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JComboBox<String> jComboBoxEstatus;
    private javax.swing.JLabel jLabelAgregar;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelEliminar;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelEstatus;
    private javax.swing.JLabel jLabelModificar;
    private javax.swing.JLabel jLabelSombra;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JLabel txtAgregar;
    private javax.swing.JLabel txtEliminar;
    private javax.swing.JLabel txtModficar;
    // End of variables declaration//GEN-END:variables
}
