package Tablas_Interfacez;

import Paginacion.Paginacion;
import Reloj.Reloj;
import TablasDAO.AusenciasJustificadasDAO;
import erp_recursos_humanos.Conexion;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo_AusenciasJustificadas;
import java.util.Date;
import javax.swing.JFileChooser;

/**
 *
 * @author andre
 */
public class AusenciasJustificadas extends javax.swing.JFrame {

    AusenciasJustificadasDAO p;
    Connection con;
    String us;
    int aE[];
    int i = 0;
    int inicio = 0;
    int fin = 5;
    int limit;
    Date fecha = new Date();
    String strDateFormat = ("yyyy/MM/dd");
    SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);

    public AusenciasJustificadas(Connection c, String u) throws SQLException {
        con = c;
        us = u;
        AusenciasJustificadasDAO tu = new AusenciasJustificadasDAO(con);
        p = tu;
        initComponents();
        Reloj h = new Reloj(lblReloj, u);
        h.start();
        this.setLocationRelativeTo(null);
        jTable.setModel(p.consultaDatos(inicio, fin));
        Paginacion p = new Paginacion(con);
        limit = getLimit(Integer.parseInt(p.count("AusenciasJustificadas")), fin);
        llenarComboEmpleado();
        llenarComboAutorizo();
    }

    public void llenarComboEmpleado() {
        p.llenarCombo(cbEmpleado, 1);
        int num = cbEmpleado.getItemCount();
        aE = new int[num];
        p.llenarArreglo(aE, 1, num);
    }
    
    public void llenarComboAutorizo() {
        p.llenarCombo(cbAutorizo, 1);
        int num = cbAutorizo.getItemCount();
        aE = new int[num];
        p.llenarArreglo(aE, 1, num);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelInicio = new javax.swing.JLabel();
        jLabelEmpleado = new javax.swing.JLabel();
        jLabelMotivo = new javax.swing.JLabel();
        jLabelFin = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnAtras2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jComboBoxEstatus = new javax.swing.JComboBox<>();
        jTextFieldBuscar = new javax.swing.JTextField();
        jLabelBuscar = new javax.swing.JLabel();
        jButtonAgregar = new javax.swing.JLabel();
        lblReloj = new javax.swing.JLabel();
        jLabelAgregar = new javax.swing.JLabel();
        jButtonModificar = new javax.swing.JLabel();
        jLabelModificar = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JLabel();
        txtEliminar2 = new javax.swing.JLabel();
        txtEliminar1 = new javax.swing.JLabel();
        jButtonEliminar = new javax.swing.JLabel();
        Regresar = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jLabelAutorizo = new javax.swing.JLabel();
        jTextFieldTipo = new javax.swing.JTextField();
        fechaInicio = new com.toedter.calendar.JDateChooser();
        fechaFin = new com.toedter.calendar.JDateChooser();
        cbEmpleado = new javax.swing.JComboBox();
        cbAutorizo = new javax.swing.JComboBox();
        Buscar = new javax.swing.JLabel();
        jLabelEstatus = new javax.swing.JLabel();
        jTextFieldMotivo = new javax.swing.JTextField();
        txfEvidencia = new javax.swing.JTextField();
        jLabelEvidencia = new javax.swing.JLabel();
        jLabelSombra = new javax.swing.JLabel();
        jButtonLimpiar = new javax.swing.JLabel();
        cbEmpleado2 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelInicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelInicio.setText("Inicio:");
        getContentPane().add(jLabelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 140, 20));

        jLabelEmpleado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEmpleado.setText("Empleado:");
        getContentPane().add(jLabelEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 90, -1));

        jLabelMotivo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelMotivo.setText("Motivo:");
        getContentPane().add(jLabelMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 120, -1));

        jLabelFin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFin.setText("Fin:");
        getContentPane().add(jLabelFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 130, -1));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Ausencias Justificadas");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 540, 45));

        btnSiguiente.setText(">");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, -1, -1));

        btnAtras2.setText("<");
        btnAtras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtras2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, -1, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 388, 330));

        jComboBoxEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "I" }));
        getContentPane().add(jComboBoxEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 160, -1));

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
        getContentPane().add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 60, 30));

        lblReloj.setText("lorem");
        getContentPane().add(lblReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabelAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonV.png"))); // NOI18N
        jLabelAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAgregarMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 80, -1));

        jButtonModificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonModificar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jButtonModificar.setText("Actualizar");
        jButtonModificar.setAlignmentY(-1.0F);
        getContentPane().add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 100, 30));

        jLabelModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonAzul.png"))); // NOI18N
        jLabelModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelModificarMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 80, -1));

        txtEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEliminar.setForeground(new java.awt.Color(255, 255, 255));
        txtEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEliminar.setText("Regresar");
        txtEliminar.setAlignmentY(1.0F);
        getContentPane().add(txtEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 30));

        txtEliminar2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEliminar2.setForeground(new java.awt.Color(255, 255, 255));
        txtEliminar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEliminar2.setText("Limpiar");
        txtEliminar2.setAlignmentY(1.0F);
        getContentPane().add(txtEliminar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 60, 30));

        txtEliminar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEliminar1.setForeground(new java.awt.Color(255, 255, 255));
        txtEliminar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEliminar1.setText("Eliminar");
        txtEliminar1.setAlignmentY(1.0F);
        getContentPane().add(txtEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 60, 30));

        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRojo.png"))); // NOI18N
        jButtonEliminar.setAlignmentX(-0.1F);
        jButtonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEliminarMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, -1, -1));

        Regresar.setBackground(new java.awt.Color(255, 0, 204));
        Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRosa.png"))); // NOI18N
        Regresar.setAlignmentX(-0.1F);
        Regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegresarMouseClicked(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        jLabelTipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTipo.setText("Tipo:");
        getContentPane().add(jLabelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 130, -1));

        jLabelAutorizo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelAutorizo.setText("Autorizo:");
        getContentPane().add(jLabelAutorizo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 130, -1));

        jTextFieldTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTipoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 160, -1));

        fechaInicio.setDateFormatString("yyyy/MM/dd");
        getContentPane().add(fechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 160, -1));

        fechaFin.setDateFormatString("yyyy/MM/dd");
        getContentPane().add(fechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 160, -1));

        getContentPane().add(cbEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 180, -1));

        getContentPane().add(cbAutorizo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 180, -1));

        Buscar.setBackground(new java.awt.Color(255, 255, 255));
        Buscar.setFont(new java.awt.Font("Humanst521 BT", 1, 14)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonAzul.png"))); // NOI18N
        Buscar.setText("...");
        Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Buscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarMouseClicked(evt);
            }
        });
        getContentPane().add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 20, 20));

        jLabelEstatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEstatus.setText("Estatus:");
        getContentPane().add(jLabelEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 130, -1));

        jTextFieldMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMotivoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 160, -1));

        txfEvidencia.setEditable(false);
        getContentPane().add(txfEvidencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 130, -1));

        jLabelEvidencia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEvidencia.setText("Evidencia:");
        getContentPane().add(jLabelEvidencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 130, -1));

        jLabelSombra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Sombra2.png"))); // NOI18N
        getContentPane().add(jLabelSombra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jButtonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonV.png"))); // NOI18N
        jButtonLimpiar.setAlignmentX(-0.1F);
        jButtonLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLimpiarMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, -1, -1));

        getContentPane().add(cbEmpleado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 180, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // Manda llamar al metodo: limpiar()
        limpiar();
        
        Integer idDE = Integer.parseInt(jTable.getValueAt(jTable.getSelectedRow(), 0).toString());
        AusenciasJustificadasDAO DAO = new AusenciasJustificadasDAO (this.con);
        Modelo_AusenciasJustificadas ausencias = new Modelo_AusenciasJustificadas();
        ausencias = DAO.consultaId(idDE);
        limpiar();
        
        cbEmpleado.setSelectedItem(ausencias.getidEmpleadoSolicita());
        jTextFieldTipo.setText(ausencias.getTipo());
        fechaInicio.setDate(ausencias.getFechaInicio());
        fechaFin.setDate(ausencias.getFechaFin());
        txfEvidencia.setText(ausencias.getEvidencia());
        jComboBoxEstatus.setSelectedItem(ausencias.getEstatus());
        cbEmpleado.setSelectedIndex(ausencias.getidEmpleadoSolicita()-1);
        cbAutorizo.setSelectedIndex(ausencias.getidEmpleadoAutoriza()-1);
        jTextFieldMotivo.setText(ausencias.getMotivo());
    }//GEN-LAST:event_jTableMouseClicked
    
    private void jTextFieldBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarKeyReleased
        // Manda a llamar al metodo: consultaIndividual()
        consultaIndividual(jTextFieldBuscar.getText());
    }//GEN-LAST:event_jTextFieldBuscarKeyReleased

    private void jLabelAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAgregarMouseClicked
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy/MM/dd");
        String fi = dFormat.format(fechaInicio.getDate());
        String ff = dFormat.format(fechaFin.getDate());
        if (fi.compareTo(ff) < 0 && !(cbEmpleado.getSelectedIndex() == -1)) {
            int seleccionEstatus = jComboBoxEstatus.getSelectedIndex();
            int Empleado = cbEmpleado.getSelectedIndex();
            int Autorizo = cbAutorizo.getSelectedIndex();
            Modelo_AusenciasJustificadas ausencias = new Modelo_AusenciasJustificadas();

            ausencias.setFechaInicio(fechaInicio.getDate());
            ausencias.setFechaFin(fechaFin.getDate());
            ausencias.setFechaSolicitud(fecha);
            ausencias.setTipo(jTextFieldTipo.getText());
            ausencias.setidEmpleadoSolicita(aE[Empleado] + 1);
            ausencias.setidEmpleadoAutoriza(aE[Autorizo] + 1);
            ausencias.setEvidencia(txfEvidencia.getText());
            ausencias.setEstatus(jComboBoxEstatus.getItemAt(seleccionEstatus));
            ausencias.setMotivo(jTextFieldMotivo.getText());
            p.insertarDatos(ausencias);
            // Manda a llamar el metodo: limpiar()
            limpiar();
            // Manda a llamar el metodo: consultaDatos()
            jTable.setModel(p.consultaDatos(inicio, fin));
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa fechas validas");
        }

    }//GEN-LAST:event_jLabelAgregarMouseClicked

    private void jLabelModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelModificarMouseClicked
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy/MM/dd");
        String fi = dFormat.format(fechaInicio.getDate());
        String ff = dFormat.format(fechaFin.getDate());
        if(fi.compareTo(ff) < 0){
            if (fi.compareTo(ff) < 0 && !(cbEmpleado.getSelectedIndex() == -1)) {
            int seleccionEstatus = jComboBoxEstatus.getSelectedIndex();
            int Empleado = cbEmpleado.getSelectedIndex();
            int Autorizo = cbAutorizo.getSelectedIndex();
            Modelo_AusenciasJustificadas ausencias = new Modelo_AusenciasJustificadas();
            ausencias.setFechaInicio(fechaInicio.getDate());
            ausencias.setFechaFin(fechaFin.getDate());
            ausencias.setFechaSolicitud(fecha);
            ausencias.setTipo(jTextFieldTipo.getText());
            ausencias.setidEmpleadoSolicita(aE[Empleado] + 1);
            ausencias.setidEmpleadoAutoriza(aE[Autorizo] + 1);
            ausencias.setEvidencia(txfEvidencia.getText());
            ausencias.setEstatus(jComboBoxEstatus.getItemAt(seleccionEstatus));
            ausencias.setMotivo(jTextFieldMotivo.getText());
            p.actualizar(ausencias);
            // Manda a llamar el metodo: consultaDatos() 
            jTable.setModel(p.consultaDatos(inicio, fin));
            // Manda a llamar el metodo: limpiar()
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa catidades validas");
        }
        }
    }//GEN-LAST:event_jLabelModificarMouseClicked

    private void jButtonLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLimpiarMouseClicked
        limpiar();
    }//GEN-LAST:event_jButtonLimpiarMouseClicked

    private void jTextFieldTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTipoActionPerformed

    private void jTextFieldMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMotivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMotivoActionPerformed

    private void btnAtras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras2ActionPerformed
        if (inicio == 0) {
            btnAtras.setEnabled(false);
        } else {
            btnSiguiente.setEnabled(true);
            inicio = inicio - 5;
            jTable.setModel(p.consultaDatos(inicio, fin));
        }
    }//GEN-LAST:event_btnAtras2ActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if (inicio == limit * 5) {
            btnSiguiente.setEnabled(false);
        } else {
            btnAtras.setEnabled(true);
            inicio = inicio + 5;
            jTable.setModel(p.consultaDatos(inicio, fin));
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseClicked
        // TODO add your handling code here:
        MenuTablas m = new MenuTablas(con, us);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegresarMouseClicked

    private void jButtonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarMouseClicked
        // Manda a llamar al metodo eliminar
        int filaSeleccionada = jTable.getSelectedRow();
        String id = "" + jTable.getValueAt(filaSeleccionada, 0);
        p.eliminar(id);
        // Manda a llamar el metodo: consultaDatos()        
        jTable.setModel(p.consultaDatos(inicio,fin));
        // Manda a llamar el metodo: limpiar()
        limpiar();
    }//GEN-LAST:event_jButtonEliminarMouseClicked

    private void BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseClicked
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int result = fileChooser.showOpenDialog(this);
        if (result != JFileChooser.CANCEL_OPTION) {
            File fileName = fileChooser.getSelectedFile();
            if ((fileName == null) || (fileName.getName().equals(""))) {
                txfEvidencia.setText("...");
            } else {
                txfEvidencia.setText(fileName.getAbsolutePath());
            }
        }
    }//GEN-LAST:event_BuscarMouseClicked

    public void limpiar() {
        fechaInicio.setDate(null);
        fechaFin.setDate(null);
        jTextFieldTipo.setText("");
        jTextFieldMotivo.setText("");
        jComboBoxEstatus.setSelectedItem(null);
        cbAutorizo.setSelectedItem(null);
        cbEmpleado.setSelectedItem(null);
        txfEvidencia.setText("");
    }
    
    public int getLimit(int n, int lim) {
        limit = (int) Math.ceil(n / lim);
        System.out.println(n + " " + limit);
        return limit;
    }


    public void consultaIndividual(String valor) {
        String[] titulos = {"idAusencia", "fechaSolicitud", "fechaInicio", "fechaFin", "tipo", "idEmpleadoSolicita", "idEmpleadoAutoriza", "evidencia", "estatus", "motivo"};
        String[] registros = new String[10];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM AusenciasJustificadas WHERE nombre LIKE '%" + valor + "%' AND estatus = 'A'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("idAusencia");
                registros[1] = rs.getString("fechaSolicitud");
                registros[2] = rs.getString("fechaInicio");
                registros[3] = rs.getString("fechaFin");
                registros[4] = rs.getString("tipo");
                registros[5] = rs.getString("idEmpleadoSolicita");
                registros[6] = rs.getString("idEmpleadoAutoriza");
                registros[7] = rs.getString("evidencia");
                registros[8] = rs.getString("estatus");
                registros[9] = rs.getString("motivo");
                model.addRow(registros);
            }
            jTable.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Buscar;
    private javax.swing.JLabel Regresar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnAtras1;
    private javax.swing.JButton btnAtras2;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox cbAutorizo;
    private javax.swing.JComboBox cbEmpleado;
    private javax.swing.JComboBox cbEmpleado2;
    private com.toedter.calendar.JDateChooser fechaFin;
    private com.toedter.calendar.JDateChooser fechaInicio;
    private javax.swing.JLabel jButtonAgregar;
    private javax.swing.JLabel jButtonEliminar;
    private javax.swing.JLabel jButtonLimpiar;
    private javax.swing.JLabel jButtonModificar;
    private javax.swing.JComboBox<String> jComboBoxEstatus;
    private javax.swing.JLabel jLabelAgregar;
    private javax.swing.JLabel jLabelAutorizo;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelEmpleado;
    private javax.swing.JLabel jLabelEstatus;
    private javax.swing.JLabel jLabelEvidencia;
    private javax.swing.JLabel jLabelFin;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JLabel jLabelModificar;
    private javax.swing.JLabel jLabelMotivo;
    private javax.swing.JLabel jLabelSombra;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldMotivo;
    private javax.swing.JTextField jTextFieldTipo;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JTextField txfEvidencia;
    private javax.swing.JLabel txtEliminar;
    private javax.swing.JLabel txtEliminar1;
    private javax.swing.JLabel txtEliminar2;
    // End of variables declaration//GEN-END:variables
}
