package Tablas_Interfacez;

import Paginacion.Paginacion;
import Reloj.Reloj;
import TablasDAO.DeduccionesDAO;
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

public class Deducciones extends javax.swing.JFrame {

    DeduccionesDAO t;
    Connection con;
    String us;
    int i = 0;
    int inicio = 0;
    int fin = 5;
    int limit;

    public Deducciones(Connection c, String u) throws SQLException {
        con = c;
        us = u;
        DeduccionesDAO tu = new DeduccionesDAO(con);
        t = tu;
        initComponents();
        Reloj h = new Reloj(lblReloj, u);
        h.start();
        this.setLocationRelativeTo(null);
        jTableD.setModel(t.consultaDatos(inicio, fin));
        Paginacion p = new Paginacion(con);
        limit = getLimit(Integer.parseInt(p.count("Deducciones")), fin);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabeDescripción = new javax.swing.JLabel();
        jLabelPorcentaje = new javax.swing.JLabel();
        jLabeEstatus = new javax.swing.JLabel();
        jComboBoxEstatus = new javax.swing.JComboBox<>();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jTextFieldPorcentaje = new javax.swing.JTextField();
        jLabelBuscar = new javax.swing.JLabel();
        lblReloj = new javax.swing.JLabel();
        lblRegresar = new javax.swing.JLabel();
        txtAgregar = new javax.swing.JLabel();
        jLabelAgregar = new javax.swing.JLabel();
        txtModficar = new javax.swing.JLabel();
        jLabelModificar = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JLabel();
        jLabelEliminar = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabelSombra = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableD = new javax.swing.JTable();
        jTextFieldBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Deducciones");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 240, 45));

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNombre.setText("Nombre");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 70, -1));

        jLabeDescripción.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabeDescripción.setText("Descripción");
        getContentPane().add(jLabeDescripción, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 110, -1));

        jLabelPorcentaje.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPorcentaje.setText("Porcentaje");
        getContentPane().add(jLabelPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 100, -1));

        jLabeEstatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabeEstatus.setText("Estatus");
        getContentPane().add(jLabeEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 110, -1));

        jComboBoxEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "I" }));
        getContentPane().add(jComboBoxEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 210, -1));

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 210, -1));
        getContentPane().add(jTextFieldDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 210, 103));

        jTextFieldPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPorcentajeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 210, -1));

        jLabelBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelBuscar.setText("Buscar:");
        getContentPane().add(jLabelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        lblReloj.setText("lorem");
        getContentPane().add(lblReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        lblRegresar.setBackground(new java.awt.Color(255, 255, 255));
        lblRegresar.setFont(new java.awt.Font("Humanst521 BT", 1, 14)); // NOI18N
        lblRegresar.setForeground(new java.awt.Color(255, 255, 255));
        lblRegresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRosa.png"))); // NOI18N
        lblRegresar.setText("Regresar");
        lblRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblRegresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresarMouseClicked(evt);
            }
        });
        getContentPane().add(lblRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 80, 30));

        txtAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAgregar.setForeground(new java.awt.Color(255, 255, 255));
        txtAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAgregar.setText("Agregar");
        getContentPane().add(txtAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 60, 30));

        jLabelAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonV.png"))); // NOI18N
        jLabelAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAgregarMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 80, -1));

        txtModficar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtModficar.setForeground(new java.awt.Color(255, 255, 255));
        txtModficar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtModficar.setText("Actualizar");
        txtModficar.setAlignmentY(-1.0F);
        getContentPane().add(txtModficar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 120, 30));

        jLabelModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonAzul.png"))); // NOI18N
        jLabelModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelModificarMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 80, -1));

        txtEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEliminar.setForeground(new java.awt.Color(255, 255, 255));
        txtEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEliminar.setText("Eliminar");
        txtEliminar.setAlignmentY(1.0F);
        getContentPane().add(txtEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 60, 30));

        jLabelEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRojo.png"))); // NOI18N
        jLabelEliminar.setAlignmentX(-0.1F);
        jLabelEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEliminarMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        btnSiguiente.setText(">");
        btnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiguienteMouseClicked(evt);
            }
        });
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 510, -1, -1));

        btnAtras.setText("<");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 510, -1, -1));

        jLabelSombra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/SombraLogin.png"))); // NOI18N
        getContentPane().add(jLabelSombra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 0, 470, 580));

        jTableD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableD);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 570, 370));
        getContentPane().add(jTextFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 500, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPorcentajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPorcentajeActionPerformed

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
        // TODO add your handling code here:
        MenuTablas m = new MenuTablas(con, us);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblRegresarMouseClicked

    private void jLabelAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAgregarMouseClicked
        if (jTextFieldNombre.getText().isEmpty() || jTextFieldDescripcion.getText().isEmpty() || jTextFieldPorcentaje.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: No dejes campos vacios");
        } else {
            int seleccionEstatus = jComboBoxEstatus.getSelectedIndex();
            t.insertarDatos(jTextFieldNombre.getText(), jTextFieldDescripcion.getText(), Float.parseFloat(jTextFieldPorcentaje.getText()), jComboBoxEstatus.getItemAt(seleccionEstatus));
            // Manda a llamar el metodo: limpiar()
            limpiar();
            // Manda a llamar el metodo: consultaDatos()
            jTableD.setModel(t.consultaDatos(inicio, fin));
        }
    }//GEN-LAST:event_jLabelAgregarMouseClicked

    private void jLabelModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelModificarMouseClicked
        // Manda llamar al metodo: actalizar();
        if (jTextFieldNombre.getText().isEmpty() || jTextFieldDescripcion.getText().isEmpty() || jTextFieldPorcentaje.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: Debes llenar todos los campos");
        } else {
            int seleccionEstatus = jComboBoxEstatus.getSelectedIndex();
            int fila = jTableD.getSelectedRow();
            String m = (String) jTableD.getValueAt(fila, 0);
            t.actualizar(jTextFieldNombre.getText(), jTextFieldDescripcion.getText(), Float.parseFloat(jTextFieldPorcentaje.getText()), jComboBoxEstatus.getItemAt(seleccionEstatus), m);
            // Manda a llamar el metodo: consultaDatos()
            jTableD.setModel(t.consultaDatos(inicio, fin));
            // Manda a llamar el metodo: limpiar()
            limpiar();
        }
    }//GEN-LAST:event_jLabelModificarMouseClicked

    private void jLabelEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEliminarMouseClicked
        if (jTextFieldNombre.getText().isEmpty() || jTextFieldDescripcion.getText().isEmpty() || jTextFieldPorcentaje.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: Debes de seleccionar el valor a eliminar");
        } else {
// Manda a llamar al metodo eliminar
            int filaSeleccionada = jTableD.getSelectedRow();
            String id = "" + jTableD.getValueAt(filaSeleccionada, 0);
            t.eliminar(id);
            // Manda a llamar el metodo: consultaDatos()
            jTableD.setModel(t.consultaDatos(inicio, fin));
            // Manda a llamar el metodo: limpiar()
            limpiar();
        }
    }//GEN-LAST:event_jLabelEliminarMouseClicked

    private void jTableDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDMouseClicked
        // Manda llamar al metodo: limpiar()
        limpiar();

        int fila = jTableD.rowAtPoint(evt.getPoint());
        jTextFieldNombre.setText(jTableD.getValueAt(fila, 1).toString());
        jTextFieldDescripcion.setText(jTableD.getValueAt(fila, 2).toString());
        jTextFieldPorcentaje.setText(jTableD.getValueAt(fila, 3).toString());
        jComboBoxEstatus.setSelectedItem(jTableD.getValueAt(fila, 4));
    }//GEN-LAST:event_jTableDMouseClicked

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        if (inicio == 0) {
            btnAtras.setEnabled(false);
        } else {
            btnSiguiente.setEnabled(true);
            inicio = inicio - 5;
            jTableD.setModel(t.consultaDatos(inicio, fin));
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseClicked

    }//GEN-LAST:event_btnSiguienteMouseClicked

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if (inicio == limit * 5) {
            btnSiguiente.setEnabled(false);
        } else {
            btnAtras.setEnabled(true);
            inicio = inicio + 5;
            jTableD.setModel(t.consultaDatos(inicio, fin));
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    public void limpiar() {
        jTextFieldNombre.setText("");
        jTextFieldDescripcion.setText("");
        jTextFieldPorcentaje.setText("");
        jComboBoxEstatus.setSelectedItem(null);
    }

    public void consultaIndividual(String valor) {
        String[] titulos = {"idDeduccion", "nombre, descripcion, porcentaje, estatus"};
        String[] registros = new String[6];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM Deducciones WHERE nombre LIKE '%" + valor + "%' AND estatus = 'A'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("idDeduccion");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("descripcion");
                registros[3] = rs.getString("porcentaje");
                registros[4] = rs.getString("estatus");
                model.addRow(registros);
            }
            jTableD.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }

    }

    public int getLimit(int n, int lim) {
        limit = (int) Math.ceil(n / lim);
        System.out.println(n + " " + limit);
        return limit;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> jComboBoxEstatus;
    private javax.swing.JLabel jLabeDescripción;
    private javax.swing.JLabel jLabeEstatus;
    private javax.swing.JLabel jLabelAgregar;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelEliminar;
    private javax.swing.JLabel jLabelModificar;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPorcentaje;
    private javax.swing.JLabel jLabelSombra;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableD;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldDescripcion;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPorcentaje;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JLabel txtAgregar;
    private javax.swing.JLabel txtEliminar;
    private javax.swing.JLabel txtModficar;
    // End of variables declaration//GEN-END:variables
}
