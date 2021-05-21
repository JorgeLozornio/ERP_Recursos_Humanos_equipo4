package Tablas_Interfacez;

import Reloj.Reloj;
import java.sql.Connection;
import java.sql.SQLException;
import Herramientas.Sesion;
import Interfaz.Login;
import Paginacion.Paginacion;
import Reloj.Reloj;
import TablasDAO.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelo.*;

public class Nominas extends javax.swing.JFrame {
       NominaDAO t;
    int aE[];
   int aP[];
   int aF[];
   Modelo_NominasDeducciones nD[];
    int seleccionEmpleado;
    Connection con;
    String us;
      
          Modelo_NominasPercepciones per2;
    public Nominas(Connection c, String u) throws SQLException {
        con = c;
        us = u;
        NominaDAO tu = new NominaDAO(con);
        t = tu;
        initComponents();
        Reloj h = new Reloj(lblReloj, u);
        h.start();
        this.setLocationRelativeTo(null);
        int idC=0;
        idC=tu.obtenerIdNomina();
        txfIdNomina.setText(""+idC+1);
        txfNomPer.setText(""+idC+1);
        txfNomDed.setText(""+idC+1);
        llenarComboEmpleado();
        llenarComboPeriodo();
        llenarComboFormaPago();
        llenarComboPercepciones();
    }
    public void llenarComboPercepciones() {
        t.llenarComboPercepcion(cbPercepcion, 1);
        int num = cbPercepcion.getItemCount();
        aP = new int[num];
        t.llenarArregloPercepcion(aP, 1, num);
        
    }

 public void llenarComboPeriodo() {
        t.llenarComboPeriodo(cbPeriodo, 1);
        int num = cbPeriodo.getItemCount();
        aP = new int[num];
        t.llenarArregloPeriodo(aP, 1, num);
    }
  public void llenarComboEmpleado() {
        t.llenarComboEmpleado(cbEmpleados, 1);
        int num = cbEmpleados.getItemCount();
        aE = new int[num];
        t.llenarArregloEmpleado(aE, 1, num);
    }
   public void llenarComboFormaPago() {
        t.llenarComboFormaPago(cbFormaDePago, 1);
        int num = cbFormaDePago.getItemCount();
        aF = new int[num];
        t.llenarArregloFormaPago(aF, 1, num);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txfIdNomina = new javax.swing.JTextField();
        jLabelNominas = new javax.swing.JLabel();
        jLabelFechaDeElaboracion = new javax.swing.JLabel();
        dcFechaElaboracion = new com.toedter.calendar.JDateChooser();
        jLabelFechaDePago = new javax.swing.JLabel();
        dcFechaPago = new com.toedter.calendar.JDateChooser();
        jLabelSubtotal = new javax.swing.JLabel();
        txfSubtotal = new javax.swing.JTextField();
        jLabelRetenciones = new javax.swing.JLabel();
        txfRetenciones = new javax.swing.JTextField();
        jLabelTotal = new javax.swing.JLabel();
        txfTotal = new javax.swing.JTextField();
        jLabelDiasTrabajados = new javax.swing.JLabel();
        txfDiasTrabajados = new javax.swing.JTextField();
        jLabelEmpleados = new javax.swing.JLabel();
        cbEmpleados = new javax.swing.JComboBox<String>();
        jLabelFormaDePago = new javax.swing.JLabel();
        cbFormaDePago = new javax.swing.JComboBox<String>();
        jLabelPeriodo = new javax.swing.JLabel();
        cbPeriodo = new javax.swing.JComboBox<String>();
        jLabelEstatus = new javax.swing.JLabel();
        cbEstatus = new javax.swing.JComboBox<String>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPercepciones = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelPercepciones = new javax.swing.JLabel();
        jLabelDeducciones = new javax.swing.JLabel();
        txtGuardar = new javax.swing.JLabel();
        jLabelGuardar = new javax.swing.JLabel();
        txtRegresar = new javax.swing.JLabel();
        jLabelRegresar = new javax.swing.JLabel();
        lblReloj = new javax.swing.JLabel();
        jLabelSombra = new javax.swing.JLabel();
        jLabelNomina = new javax.swing.JLabel();
        jLabelDeduccion = new javax.swing.JLabel();
        cbDeduccion = new javax.swing.JComboBox<String>();
        txtAceptar = new javax.swing.JLabel();
        jLabelAceptar = new javax.swing.JLabel();
        jLabelNomina1 = new javax.swing.JLabel();
        jLabelPercepción = new javax.swing.JLabel();
        cbPercepcion = new javax.swing.JComboBox<String>();
        txtAceptar1 = new javax.swing.JLabel();
        jLabelAceptar1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txtEliminarPercepcion = new javax.swing.JLabel();
        jLabelEliminarPercepcion = new javax.swing.JLabel();
        txtEliminarDeduccion = new javax.swing.JLabel();
        jLabelEliminarDeducion = new javax.swing.JLabel();
        txfNomPer = new javax.swing.JTextField();
        txfNomDed = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nominas");
        setMinimumSize(new java.awt.Dimension(920, 545));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Id de la nomina");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        txfIdNomina.setEnabled(false);
        getContentPane().add(txfIdNomina, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 120, -1));

        jLabelNominas.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelNominas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNominas.setText("Nominas");
        getContentPane().add(jLabelNominas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 205, 45));

        jLabelFechaDeElaboracion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFechaDeElaboracion.setText("Fecha de elaboración");
        getContentPane().add(jLabelFechaDeElaboracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        getContentPane().add(dcFechaElaboracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 180, 20));

        jLabelFechaDePago.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFechaDePago.setText("Fecha de pago");
        getContentPane().add(jLabelFechaDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        getContentPane().add(dcFechaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 180, 20));

        jLabelSubtotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelSubtotal.setText("Subtotal");
        getContentPane().add(jLabelSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        txfSubtotal.setEditable(false);
        getContentPane().add(txfSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 140, 20));

        jLabelRetenciones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelRetenciones.setText("Retenciones");
        getContentPane().add(jLabelRetenciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 100, -1));

        txfRetenciones.setEditable(false);
        getContentPane().add(txfRetenciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 140, 20));

        jLabelTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTotal.setText("Total");
        getContentPane().add(jLabelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 50, -1));

        txfTotal.setEditable(false);
        getContentPane().add(txfTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 140, 20));

        jLabelDiasTrabajados.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDiasTrabajados.setText("Días trabajados");
        getContentPane().add(jLabelDiasTrabajados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 130, -1));
        getContentPane().add(txfDiasTrabajados, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 130, 20));

        jLabelEmpleados.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEmpleados.setText("Empleado");
        getContentPane().add(jLabelEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 130, -1));

        getContentPane().add(cbEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 120, -1));

        jLabelFormaDePago.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFormaDePago.setText("Forma de pago");
        getContentPane().add(jLabelFormaDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 130, -1));

        getContentPane().add(cbFormaDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 120, -1));

        jLabelPeriodo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPeriodo.setText("Periodo");
        getContentPane().add(jLabelPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 130, -1));

        getContentPane().add(cbPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 120, -1));

        jLabelEstatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEstatus.setText("Estatus");
        getContentPane().add(jLabelEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 130, -1));

        cbEstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N", "L" }));
        getContentPane().add(cbEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 120, -1));

        tblPercepciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblPercepciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, -1, 140));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, -1, 140));

        jLabelPercepciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPercepciones.setText("Percepciones");
        getContentPane().add(jLabelPercepciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, -1));

        jLabelDeducciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDeducciones.setText("Deducciones");
        getContentPane().add(jLabelDeducciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, -1));

        txtGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtGuardar.setForeground(new java.awt.Color(255, 255, 255));
        txtGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtGuardar.setText("Guardar");
        txtGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGuardarMouseClicked(evt);
            }
        });
        getContentPane().add(txtGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 60, 30));

        jLabelGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonAzul.png"))); // NOI18N
        getContentPane().add(jLabelGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 80, -1));

        txtRegresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtRegresar.setForeground(new java.awt.Color(255, 255, 255));
        txtRegresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRegresar.setText("Regresar");
        txtRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRegresarMouseClicked(evt);
            }
        });
        getContentPane().add(txtRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 510, 80, 30));

        jLabelRegresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRosa.png"))); // NOI18N
        getContentPane().add(jLabelRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 510, -1, -1));

        lblReloj.setText("lorem");
        getContentPane().add(lblReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        jLabelSombra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/SombraLogin.png"))); // NOI18N
        getContentPane().add(jLabelSombra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, -90, 530, -1));

        jLabelNomina.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNomina.setText("Nomina");
        getContentPane().add(jLabelNomina, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 70, -1));

        jLabelDeduccion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDeduccion.setText("Deducción");
        getContentPane().add(jLabelDeduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 90, -1));

        getContentPane().add(cbDeduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 120, -1));

        txtAceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAceptar.setForeground(new java.awt.Color(255, 255, 255));
        txtAceptar.setText("Aceptar");
        getContentPane().add(txtAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 60, 30));

        jLabelAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonV.png"))); // NOI18N
        getContentPane().add(jLabelAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, -1, -1));

        jLabelNomina1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNomina1.setText("Nomina");
        getContentPane().add(jLabelNomina1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 70, -1));

        jLabelPercepción.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPercepción.setText("Percepción");
        getContentPane().add(jLabelPercepción, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 90, -1));

        getContentPane().add(cbPercepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 120, -1));

        txtAceptar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAceptar1.setForeground(new java.awt.Color(255, 255, 255));
        txtAceptar1.setText("Aceptar");
        getContentPane().add(txtAceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 80, 30));

        jLabelAceptar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonV.png"))); // NOI18N
        jLabelAceptar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAceptar1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabelAceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 780, 20));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 780, 20));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 780, 20));

        txtEliminarPercepcion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEliminarPercepcion.setForeground(new java.awt.Color(255, 255, 255));
        txtEliminarPercepcion.setText("Eliminar");
        getContentPane().add(txtEliminarPercepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 80, 30));

        jLabelEliminarPercepcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRojo.png"))); // NOI18N
        getContentPane().add(jLabelEliminarPercepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, -1, -1));

        txtEliminarDeduccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEliminarDeduccion.setForeground(new java.awt.Color(255, 255, 255));
        txtEliminarDeduccion.setText("Eliminar");
        getContentPane().add(txtEliminarDeduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 80, 30));

        jLabelEliminarDeducion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRojo.png"))); // NOI18N
        getContentPane().add(jLabelEliminarDeducion, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, -1, -1));

        txfNomPer.setEnabled(false);
        getContentPane().add(txfNomPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 120, -1));

        txfNomDed.setEnabled(false);
        getContentPane().add(txfNomDed, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGuardarMouseClicked
        // TODO add your handling code here:
        if ("".equals(dcFechaElaboracion.getDate()) || dcFechaElaboracion.getDate()==null || "".equals(dcFechaPago.getDate()) || dcFechaPago.getDate()==null  || cbEmpleados.getSelectedIndex() == -1 || cbPeriodo.getSelectedIndex() == -1 || cbFormaDePago.getSelectedIndex() == -1 || cbEstatus.getSelectedIndex() == -1 || txfSubtotal.getText().isEmpty() || txfRetenciones.getText().isEmpty() || txfTotal.getText().isEmpty() || txfDiasTrabajados.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: No dejes campos vacios");
        } else {
            int est=cbEstatus.getSelectedIndex();
              seleccionEmpleado = cbEmpleados.getSelectedIndex();
            int seleccionPeriodos = cbPeriodo.getSelectedIndex();
            int seleccionFormas = cbFormaDePago.getSelectedIndex();
             Modelo_Nominas Nom = new Modelo_Nominas();
                Nom.setFechaElaboracion(dcFechaElaboracion.getDate());
                Nom.setFechaPago(dcFechaPago.getDate());
                Nom.setEstatus(cbEstatus.getItemAt(est));
                Nom.setSubtotal(Float.parseFloat(txfDiasTrabajados.getText()));
                Nom.setRetenciones(Float.parseFloat(txfDiasTrabajados.getText()));
                Nom.setTotal(Float.parseFloat(txfDiasTrabajados.getText()));
                Nom.setDiasTrabajados(Integer.parseInt(txfDiasTrabajados.getText()));
                Nom.setIdEmpleado(aE[seleccionEmpleado] + 1);
                Nom.setIdPeriodo(aP[seleccionPeriodos] + 1);
                Nom.setIdFormaPago(aF[seleccionFormas] + 1);
            t.insertarDatos(Nom);
            limpiar();
        }
    }//GEN-LAST:event_txtGuardarMouseClicked

    private void txtRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRegresarMouseClicked
        MenuTablas m = new MenuTablas(con, us);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_txtRegresarMouseClicked

    private void jLabelAceptar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAceptar1MouseClicked
        // TODO add your handling code here:
        int idEmp=aE[seleccionEmpleado] + 1;
        int diasT=Integer.parseInt(txfDiasTrabajados.getText());
        int seleccionPercepcion = cbPercepcion.getSelectedIndex();
        float resImporte=t.obtenerImportePercepciones(idEmp,aP[seleccionPercepcion] + 1);
        
        Modelo_NominasPercepciones nomInsert = new Modelo_NominasPercepciones();
        nomInsert.setIdNomina(Integer.parseInt(txfNomPer.getText()));
        nomInsert.setIdPercepcion(aP[seleccionPercepcion] + 1);
        nomInsert.setImporte(resImporte);
        t.insertarDatosPercepciones(nomInsert);
        obtener();
        txfSubtotal.setText(String.valueOf(nomInsert.getImporte()));
    }//GEN-LAST:event_jLabelAceptar1MouseClicked
public void limpiar() {
       dcFechaElaboracion.setDate(null);
        dcFechaPago.setDate(null);
        txfSubtotal.setText("");
        txfRetenciones.setText("");
        txfTotal.setText("");
        txfDiasTrabajados.setText("");
        cbPeriodo.setSelectedItem(null);
         cbFormaDePago.setSelectedItem(null);
        cbEmpleados.setSelectedItem(null);
        cbEstatus.setSelectedItem(null);
    }
public void obtener(){
   tblPercepciones.setModel(t.consultaDatosPercepcion(Integer.parseInt(txfIdNomina.getText())));
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbDeduccion;
    private javax.swing.JComboBox<String> cbEmpleados;
    private javax.swing.JComboBox<String> cbEstatus;
    private javax.swing.JComboBox<String> cbFormaDePago;
    private javax.swing.JComboBox<String> cbPercepcion;
    private javax.swing.JComboBox<String> cbPeriodo;
    private com.toedter.calendar.JDateChooser dcFechaElaboracion;
    private com.toedter.calendar.JDateChooser dcFechaPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAceptar;
    private javax.swing.JLabel jLabelAceptar1;
    private javax.swing.JLabel jLabelDeduccion;
    private javax.swing.JLabel jLabelDeducciones;
    private javax.swing.JLabel jLabelDiasTrabajados;
    private javax.swing.JLabel jLabelEliminarDeducion;
    private javax.swing.JLabel jLabelEliminarPercepcion;
    private javax.swing.JLabel jLabelEmpleados;
    private javax.swing.JLabel jLabelEstatus;
    private javax.swing.JLabel jLabelFechaDeElaboracion;
    private javax.swing.JLabel jLabelFechaDePago;
    private javax.swing.JLabel jLabelFormaDePago;
    private javax.swing.JLabel jLabelGuardar;
    private javax.swing.JLabel jLabelNomina;
    private javax.swing.JLabel jLabelNomina1;
    private javax.swing.JLabel jLabelNominas;
    private javax.swing.JLabel jLabelPercepciones;
    private javax.swing.JLabel jLabelPercepción;
    private javax.swing.JLabel jLabelPeriodo;
    private javax.swing.JLabel jLabelRegresar;
    private javax.swing.JLabel jLabelRetenciones;
    private javax.swing.JLabel jLabelSombra;
    private javax.swing.JLabel jLabelSubtotal;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JTable tblPercepciones;
    private javax.swing.JTextField txfDiasTrabajados;
    private javax.swing.JTextField txfIdNomina;
    private javax.swing.JTextField txfNomDed;
    private javax.swing.JTextField txfNomPer;
    private javax.swing.JTextField txfRetenciones;
    private javax.swing.JTextField txfSubtotal;
    private javax.swing.JTextField txfTotal;
    private javax.swing.JLabel txtAceptar;
    private javax.swing.JLabel txtAceptar1;
    private javax.swing.JLabel txtEliminarDeduccion;
    private javax.swing.JLabel txtEliminarPercepcion;
    private javax.swing.JLabel txtGuardar;
    private javax.swing.JLabel txtRegresar;
    // End of variables declaration//GEN-END:variables
}
