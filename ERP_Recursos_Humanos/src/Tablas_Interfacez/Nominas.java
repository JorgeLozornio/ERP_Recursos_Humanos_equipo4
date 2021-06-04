
package Tablas_Interfacez;

import Paginacion.Paginacion;
import Reloj.Reloj;
import TablasDAO.*;
import java.sql.Connection;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import javax.swing.JComboBox;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import modelo.*;

public class Nominas extends javax.swing.JFrame {
    int idNomina=0;
    Connection con;
    String us;
    NominasDAO d;
    int banderaPercepcion=0;
    int banderaDeduccion=0;
    int idEmpleado=0;
     int aE[];
   int aP[];
   int aPe[];
   int aD[];
   int aF[];
    int inicio = 0;
    int fin = 5;
    int limit;
    public Nominas(Connection c, String u) throws SQLException {
        con = c;
        us = u;
         NominasDAO du = new NominasDAO(con);
        d = du;
        initComponents();
        //Inicia el Reloj
        Reloj h = new Reloj(lblReloj, u);
        h.start();
        tbNominas.setModel(d.consultaDatos(inicio, fin));
        Paginacion p = new Paginacion(con);
        limit = getLimit(Integer.parseInt(p.count("Nominas")), fin);
        jDialogFormulario.setSize(1080, 570);
        jDialogNominasPercepciones.setSize(310, 410);
        jDialogNominasDeducciones.setSize(310, 370);
        llenarComboEmpleado();
        llenarComboPeriodo();
        llenarComboFormaPago();
        
    }
    public void llenarComboPercepciones() {
        d.llenarComboPercepcion(cbPercepcion, 1);
        int num = cbPercepcion.getItemCount();
        aPe = new int[num];
       aPe= d.llenarArregloPercepcion(aPe, 1, num);
        banderaPercepcion=2;
    }
    public void llenarComboDeducciones() {
        d.llenarComboDeduccion(cbDeduccion, 1);
        int num = cbDeduccion.getItemCount();
        aD = new int[num];
       aD= d.llenarArregloDeduccion(aD, 1, num);
        banderaDeduccion=2;
    }
    public void llenarComboPeriodo() {
        d.llenarComboPeriodo(cbPeriodo, 1);
        int num = cbPeriodo.getItemCount();
        aP = new int[num];
       aP=d.llenarArregloPeriodo(aP, 1, num);
        
    }
  public void llenarComboEmpleado() {
        d.llenarComboEmpleado(cbEmpleados, 1);
        int num = cbEmpleados.getItemCount();
        aE = new int[num];
       aE = d.llenarArregloEmpleado(aE, 1, num);
    }
   public void llenarComboFormaPago() {
        d.llenarComboFormaPago(cbFormaPago, 1);
        int num = cbFormaPago.getItemCount();
        aF = new int[num];
       aF= d.llenarArregloFormaPago(aF, 1, num);
    }
public int getLimit(int n, int lim) {
        limit = (int) Math.ceil(n / lim);
        System.out.println(n + " " + limit);
        return limit;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogFormulario = new javax.swing.JDialog();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelEstatus = new javax.swing.JLabel();
        cbEstatus = new javax.swing.JComboBox<String>();
        cbPeriodo = new javax.swing.JComboBox<String>();
        jLabelPeriodo = new javax.swing.JLabel();
        jLabelFormaDePago = new javax.swing.JLabel();
        cbFormaPago = new javax.swing.JComboBox<String>();
        cbEmpleados = new javax.swing.JComboBox<String>();
        jLabelEmpleados = new javax.swing.JLabel();
        jLabelFechaDePago = new javax.swing.JLabel();
        dcFechaPago = new com.toedter.calendar.JDateChooser();
        dcFechaElaboracion = new com.toedter.calendar.JDateChooser();
        jLabelFechaDeElaboracion = new javax.swing.JLabel();
        jLabelPercepciones = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPercepciones = new javax.swing.JTable();
        jLabelDeducciones = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbDeducciones = new javax.swing.JTable();
        jTxtModificar = new javax.swing.JLabel();
        jLabelBAzulP1 = new javax.swing.JLabel();
        jTxtNueva1 = new javax.swing.JLabel();
        jLabelGuardar = new javax.swing.JLabel();
        jTxtAgregarP = new javax.swing.JLabel();
        jLabelBAzulP = new javax.swing.JLabel();
        jTxtAgregarD = new javax.swing.JLabel();
        jLabelBAzulD = new javax.swing.JLabel();
        jTxtSalir = new javax.swing.JLabel();
        jLabelBSalir = new javax.swing.JLabel();
        lblReloj1 = new javax.swing.JLabel();
        jTxtEliminarP = new javax.swing.JLabel();
        jLabelEliminarPercepcion = new javax.swing.JLabel();
        jTxtEliminarD = new javax.swing.JLabel();
        jLabelEliminarDeduccion = new javax.swing.JLabel();
        jLabelSombra = new javax.swing.JLabel();
        btnAtras1 = new javax.swing.JButton();
        btnSiguiente1 = new javax.swing.JButton();
        btnAtras2 = new javax.swing.JButton();
        btnSiguiente2 = new javax.swing.JButton();
        jDialogNominasPercepciones = new javax.swing.JDialog();
        jLabelTituloPercepciones = new javax.swing.JLabel();
        jLabelNomina = new javax.swing.JLabel();
        jLabelEmpleado = new javax.swing.JLabel();
        jLabelSalario = new javax.swing.JLabel();
        jLabelPercepcion = new javax.swing.JLabel();
        jLabelDiasPagar = new javax.swing.JLabel();
        jLabelImporte = new javax.swing.JLabel();
        txfNominaP = new javax.swing.JTextField();
        txfEmpleadoP = new javax.swing.JTextField();
        txfSalarioP = new javax.swing.JTextField();
        cbPercepcion = new javax.swing.JComboBox<String>();
        txfDiasAPagar = new javax.swing.JTextField();
        txfImporteP = new javax.swing.JTextField();
        jTxtAceptarP = new javax.swing.JLabel();
        jLabelBAceptarP = new javax.swing.JLabel();
        jTxtCancelarP = new javax.swing.JLabel();
        jLabelCancelarP = new javax.swing.JLabel();
        jDialogNominasDeducciones = new javax.swing.JDialog();
        jLabelTituloDeducciones = new javax.swing.JLabel();
        jLabelNominaD = new javax.swing.JLabel();
        jLabelEmpleadoD = new javax.swing.JLabel();
        jLabelSalarioD = new javax.swing.JLabel();
        jLabelDeduccion = new javax.swing.JLabel();
        jLabelImporteD = new javax.swing.JLabel();
        txfNominaD = new javax.swing.JTextField();
        txfEmpleadoD = new javax.swing.JTextField();
        txfSalarioD = new javax.swing.JTextField();
        cbDeduccion = new javax.swing.JComboBox<String>();
        txfImporteD = new javax.swing.JTextField();
        jTxtAceptarD = new javax.swing.JLabel();
        jLabelBAceptarD = new javax.swing.JLabel();
        jTxtCancelarD = new javax.swing.JLabel();
        jLabelCancelarD = new javax.swing.JLabel();
        jLabelNominas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNominas = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jTxtNueva = new javax.swing.JLabel();
        jLabelBVerde = new javax.swing.JLabel();
        jLabelEditar = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();
        jLabelEliminar = new javax.swing.JLabel();
        jLabelBEliminar = new javax.swing.JLabel();
        jTxtRegresar = new javax.swing.JLabel();
        jLabelBRegresar = new javax.swing.JLabel();
        lblReloj = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();

        jDialogFormulario.setTitle("Formulario nominas");
        jDialogFormulario.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Formulario Nominas");
        jDialogFormulario.getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 45));

        jLabelEstatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEstatus.setText("Estatus");
        jDialogFormulario.getContentPane().add(jLabelEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 130, -1));

        cbEstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "E", "P" }));
        cbEstatus.setSelectedIndex(-1);
        jDialogFormulario.getContentPane().add(cbEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 120, -1));

        jDialogFormulario.getContentPane().add(cbPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 120, -1));

        jLabelPeriodo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPeriodo.setText("Periodo");
        jDialogFormulario.getContentPane().add(jLabelPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 130, -1));

        jLabelFormaDePago.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFormaDePago.setText("Forma de pago");
        jDialogFormulario.getContentPane().add(jLabelFormaDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 130, -1));

        jDialogFormulario.getContentPane().add(cbFormaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 120, -1));

        jDialogFormulario.getContentPane().add(cbEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 120, -1));

        jLabelEmpleados.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEmpleados.setText("Empleado");
        jDialogFormulario.getContentPane().add(jLabelEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 130, -1));

        jLabelFechaDePago.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFechaDePago.setText("Fecha de pago");
        jDialogFormulario.getContentPane().add(jLabelFechaDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        jDialogFormulario.getContentPane().add(dcFechaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 180, 20));
        jDialogFormulario.getContentPane().add(dcFechaElaboracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 180, 20));

        jLabelFechaDeElaboracion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFechaDeElaboracion.setText("Fecha de elaboración");
        jDialogFormulario.getContentPane().add(jLabelFechaDeElaboracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabelPercepciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPercepciones.setText("Percepciones");
        jDialogFormulario.getContentPane().add(jLabelPercepciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        tbPercepciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbPercepciones);

        jDialogFormulario.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, 140));

        jLabelDeducciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDeducciones.setText("Deducciones");
        jDialogFormulario.getContentPane().add(jLabelDeducciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, -1));

        tbDeducciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tbDeducciones);

        jDialogFormulario.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, 140));

        jTxtModificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtModificar.setForeground(new java.awt.Color(255, 255, 255));
        jTxtModificar.setText("Modificar");
        jTxtModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtModificarMouseClicked(evt);
            }
        });
        jDialogFormulario.getContentPane().add(jTxtModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 70, 30));

        jLabelBAzulP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonAzul.png"))); // NOI18N
        jLabelBAzulP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBAzulP1MouseClicked(evt);
            }
        });
        jDialogFormulario.getContentPane().add(jLabelBAzulP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));

        jTxtNueva1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtNueva1.setForeground(new java.awt.Color(255, 255, 255));
        jTxtNueva1.setText("Guardar");
        jTxtNueva1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtNueva1MouseClicked(evt);
            }
        });
        jDialogFormulario.getContentPane().add(jTxtNueva1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 60, 30));

        jLabelGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonV.png"))); // NOI18N
        jLabelGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelGuardarMouseClicked(evt);
            }
        });
        jDialogFormulario.getContentPane().add(jLabelGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 100, -1));

        jTxtAgregarP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtAgregarP.setForeground(new java.awt.Color(255, 255, 255));
        jTxtAgregarP.setText("Agregar");
        jTxtAgregarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtAgregarPMouseClicked(evt);
            }
        });
        jDialogFormulario.getContentPane().add(jTxtAgregarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 60, 30));

        jLabelBAzulP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonAzul.png"))); // NOI18N
        jLabelBAzulP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBAzulPMouseClicked(evt);
            }
        });
        jDialogFormulario.getContentPane().add(jLabelBAzulP, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        jTxtAgregarD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtAgregarD.setForeground(new java.awt.Color(255, 255, 255));
        jTxtAgregarD.setText("Agregar");
        jTxtAgregarD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtAgregarDMouseClicked(evt);
            }
        });
        jDialogFormulario.getContentPane().add(jTxtAgregarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 60, 30));

        jLabelBAzulD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonAzul.png"))); // NOI18N
        jDialogFormulario.getContentPane().add(jLabelBAzulD, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, -1, -1));

        jTxtSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtSalir.setForeground(new java.awt.Color(255, 255, 255));
        jTxtSalir.setText("Salir");
        jTxtSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtSalirMouseClicked(evt);
            }
        });
        jDialogFormulario.getContentPane().add(jTxtSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 490, 60, 30));

        jLabelBSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRosa.png"))); // NOI18N
        jDialogFormulario.getContentPane().add(jLabelBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 490, -1, -1));

        lblReloj1.setText("lorem");
        jDialogFormulario.getContentPane().add(lblReloj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        jTxtEliminarP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtEliminarP.setForeground(new java.awt.Color(255, 255, 255));
        jTxtEliminarP.setText("Eliminar");
        jTxtEliminarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtEliminarPMouseClicked(evt);
            }
        });
        jDialogFormulario.getContentPane().add(jTxtEliminarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 60, 30));

        jLabelEliminarPercepcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRojo.png"))); // NOI18N
        jDialogFormulario.getContentPane().add(jLabelEliminarPercepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, -1));

        jTxtEliminarD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtEliminarD.setForeground(new java.awt.Color(255, 255, 255));
        jTxtEliminarD.setText("Eliminar");
        jTxtEliminarD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtEliminarDMouseClicked(evt);
            }
        });
        jDialogFormulario.getContentPane().add(jTxtEliminarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 60, 30));

        jLabelEliminarDeduccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRojo.png"))); // NOI18N
        jDialogFormulario.getContentPane().add(jLabelEliminarDeduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, -1, -1));

        jLabelSombra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/SombraLogin.png"))); // NOI18N
        jDialogFormulario.getContentPane().add(jLabelSombra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -10, 510, 540));

        btnAtras1.setText("<");
        btnAtras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtras1ActionPerformed(evt);
            }
        });
        jDialogFormulario.getContentPane().add(btnAtras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 60, -1));

        btnSiguiente1.setText(">");
        btnSiguiente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguiente1ActionPerformed(evt);
            }
        });
        jDialogFormulario.getContentPane().add(btnSiguiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, 60, -1));

        btnAtras2.setText("<");
        btnAtras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtras2ActionPerformed(evt);
            }
        });
        jDialogFormulario.getContentPane().add(btnAtras2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, 60, -1));

        btnSiguiente2.setText(">");
        btnSiguiente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguiente2ActionPerformed(evt);
            }
        });
        jDialogFormulario.getContentPane().add(btnSiguiente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 470, 60, -1));

        jDialogNominasPercepciones.setTitle("Percepción");
        jDialogNominasPercepciones.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTituloPercepciones.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTituloPercepciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloPercepciones.setText("Percepciones");
        jDialogNominasPercepciones.getContentPane().add(jLabelTituloPercepciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 250, 45));

        jLabelNomina.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNomina.setText("Nomina");
        jDialogNominasPercepciones.getContentPane().add(jLabelNomina, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabelEmpleado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEmpleado.setText("Empleado");
        jDialogNominasPercepciones.getContentPane().add(jLabelEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 80, -1));

        jLabelSalario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelSalario.setText("Salario");
        jDialogNominasPercepciones.getContentPane().add(jLabelSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabelPercepcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPercepcion.setText("Percepción");
        jDialogNominasPercepciones.getContentPane().add(jLabelPercepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabelDiasPagar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDiasPagar.setText("Días a pagar");
        jDialogNominasPercepciones.getContentPane().add(jLabelDiasPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabelImporte.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelImporte.setText("Importe");
        jDialogNominasPercepciones.getContentPane().add(jLabelImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        txfNominaP.setEditable(false);
        jDialogNominasPercepciones.getContentPane().add(txfNominaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 120, 20));

        txfEmpleadoP.setEditable(false);
        jDialogNominasPercepciones.getContentPane().add(txfEmpleadoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 120, -1));

        txfSalarioP.setEditable(false);
        jDialogNominasPercepciones.getContentPane().add(txfSalarioP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 120, -1));

        cbPercepcion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbPercepcionItemStateChanged(evt);
            }
        });
        jDialogNominasPercepciones.getContentPane().add(cbPercepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 120, -1));

        txfDiasAPagar.setEditable(false);
        jDialogNominasPercepciones.getContentPane().add(txfDiasAPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 120, -1));

        txfImporteP.setEditable(false);
        jDialogNominasPercepciones.getContentPane().add(txfImporteP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 120, -1));

        jTxtAceptarP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtAceptarP.setForeground(new java.awt.Color(255, 255, 255));
        jTxtAceptarP.setText("Aceptar");
        jTxtAceptarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtAceptarPMouseClicked(evt);
            }
        });
        jDialogNominasPercepciones.getContentPane().add(jTxtAceptarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 70, 30));

        jLabelBAceptarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonV.png"))); // NOI18N
        jDialogNominasPercepciones.getContentPane().add(jLabelBAceptarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jTxtCancelarP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtCancelarP.setForeground(new java.awt.Color(255, 255, 255));
        jTxtCancelarP.setText("Cancelar");
        jTxtCancelarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtCancelarPMouseClicked(evt);
            }
        });
        jDialogNominasPercepciones.getContentPane().add(jTxtCancelarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 80, 30));

        jLabelCancelarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRojo.png"))); // NOI18N
        jDialogNominasPercepciones.getContentPane().add(jLabelCancelarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        jDialogNominasDeducciones.setTitle("Deducción");
        jDialogNominasDeducciones.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTituloDeducciones.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTituloDeducciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloDeducciones.setText("Deducciones");
        jDialogNominasDeducciones.getContentPane().add(jLabelTituloDeducciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 250, 45));

        jLabelNominaD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNominaD.setText("Nomina");
        jDialogNominasDeducciones.getContentPane().add(jLabelNominaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabelEmpleadoD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEmpleadoD.setText("Empleado");
        jDialogNominasDeducciones.getContentPane().add(jLabelEmpleadoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, -1));

        jLabelSalarioD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelSalarioD.setText("Salario");
        jDialogNominasDeducciones.getContentPane().add(jLabelSalarioD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabelDeduccion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDeduccion.setText("Deducción");
        jDialogNominasDeducciones.getContentPane().add(jLabelDeduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabelImporteD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelImporteD.setText("Importe");
        jDialogNominasDeducciones.getContentPane().add(jLabelImporteD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        txfNominaD.setEditable(false);
        jDialogNominasDeducciones.getContentPane().add(txfNominaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 120, 20));

        txfEmpleadoD.setEditable(false);
        jDialogNominasDeducciones.getContentPane().add(txfEmpleadoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 120, -1));

        txfSalarioD.setEditable(false);
        jDialogNominasDeducciones.getContentPane().add(txfSalarioD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 120, -1));

        cbDeduccion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDeduccionItemStateChanged(evt);
            }
        });
        jDialogNominasDeducciones.getContentPane().add(cbDeduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 120, -1));

        txfImporteD.setEditable(false);
        jDialogNominasDeducciones.getContentPane().add(txfImporteD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 120, -1));

        jTxtAceptarD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtAceptarD.setForeground(new java.awt.Color(255, 255, 255));
        jTxtAceptarD.setText("Aceptar");
        jTxtAceptarD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtAceptarDMouseClicked(evt);
            }
        });
        jDialogNominasDeducciones.getContentPane().add(jTxtAceptarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 70, 30));

        jLabelBAceptarD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonV.png"))); // NOI18N
        jDialogNominasDeducciones.getContentPane().add(jLabelBAceptarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jTxtCancelarD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtCancelarD.setForeground(new java.awt.Color(255, 255, 255));
        jTxtCancelarD.setText("Cancelar");
        jTxtCancelarD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtCancelarDMouseClicked(evt);
            }
        });
        jDialogNominasDeducciones.getContentPane().add(jTxtCancelarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 70, 30));

        jLabelCancelarD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRojo.png"))); // NOI18N
        jDialogNominasDeducciones.getContentPane().add(jLabelCancelarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nominas");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNominas.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelNominas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNominas.setText("Nominas");
        getContentPane().add(jLabelNominas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 205, 45));

        tbNominas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "idNomina", "Fecha elaboracion", "Fecha pago", "Subtotal", "Retenciones", "Total", "Dias trabajados", "Estatus", "Empleado", "Forma pago", "Periodo"
            }
        ));
        tbNominas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNominasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbNominas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 130));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 200, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 200, 10));

        jTxtNueva.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtNueva.setForeground(new java.awt.Color(255, 255, 255));
        jTxtNueva.setText("Nueva");
        jTxtNueva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtNuevaMouseClicked(evt);
            }
        });
        getContentPane().add(jTxtNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 70, 50, 30));

        jLabelBVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonV.png"))); // NOI18N
        getContentPane().add(jLabelBVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

        jLabelEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEditar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEditar.setText("Editar");
        getContentPane().add(jLabelEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, 30));

        lblEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonAzul.png"))); // NOI18N
        lblEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditarMouseClicked(evt);
            }
        });
        getContentPane().add(lblEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, -1));

        jLabelEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEliminar.setText("Eliminar");
        getContentPane().add(jLabelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 150, 60, 30));

        jLabelBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRojo.png"))); // NOI18N
        jLabelBEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBEliminarMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelBEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, -1, -1));

        jTxtRegresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jTxtRegresar.setText("Regresar");
        jTxtRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtRegresarMouseClicked(evt);
            }
        });
        getContentPane().add(jTxtRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, -1, 30));

        jLabelBRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRosa.png"))); // NOI18N
        getContentPane().add(jLabelBRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));

        lblReloj.setText("lorem");
        getContentPane().add(lblReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        btnAtras.setText("<");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 60, -1));

        btnSiguiente.setText(">");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 60, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNuevaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtNuevaMouseClicked
       dcFechaElaboracion.setDate(null);
        dcFechaPago.setDate(null);
        llenarComboEmpleado();
        llenarComboPeriodo();
        llenarComboFormaPago();
        cbEstatus.setSelectedItem(null);
        idNomina=d.obtenerIdNomina();
        cbEmpleados.setEnabled(true);
        DefaultTableModel tb = (DefaultTableModel) tbPercepciones.getModel();
        int a = tbPercepciones.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }
        DefaultTableModel tb2 = (DefaultTableModel) tbDeducciones.getModel();
        int a2 = tbDeducciones.getRowCount()-1;
        for (int i2 = a2; i2 >= 0; i2--) {          
        tb2.removeRow(tb2.getRowCount()-1);
        }
        jTxtModificar.setEnabled(false);
        jLabelBAzulP1.setEnabled(false);
         jTxtNueva1.setEnabled(true);
        jLabelGuardar.setEnabled(true);
        jDialogFormulario.setVisible(true);
    }//GEN-LAST:event_jTxtNuevaMouseClicked

    private void jTxtSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtSalirMouseClicked
         inicio=0;
            fin=5;
            tbNominas.setModel(d.consultaDatos(inicio, fin));
        Paginacion p = new Paginacion(con);
        limit = getLimit(Integer.parseInt(p.count("Nominas")), fin);
        jDialogFormulario.setVisible(false);
    }//GEN-LAST:event_jTxtSalirMouseClicked

    private void jTxtRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtRegresarMouseClicked
        MenuTablas m = new MenuTablas(con, us);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jTxtRegresarMouseClicked

    private void jTxtAgregarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtAgregarPMouseClicked
          if ("".equals(dcFechaElaboracion.getDate()) || dcFechaElaboracion.getDate()==null || "".equals(dcFechaPago.getDate()) || dcFechaPago.getDate()==null  || cbEmpleados.getSelectedIndex() == -1 || cbPeriodo.getSelectedIndex() == -1 || cbFormaPago.getSelectedIndex() == -1 || cbEstatus.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Error: Por favor llena todos los campos");
        } else {
               int  seleccionEmpleado = cbEmpleados.getSelectedIndex();
               idEmpleado=aE[seleccionEmpleado];
              txfNominaP.setText(""+idNomina);
             txfEmpleadoP.setText(""+cbEmpleados.getSelectedItem()); 
             txfSalarioP.setText(""+d.obtenersalarioDiario(idEmpleado));
             banderaPercepcion=0;
             llenarComboPercepciones();
             
        jDialogNominasPercepciones.setVisible(true);
          }
    }//GEN-LAST:event_jTxtAgregarPMouseClicked

    private void jTxtAgregarDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtAgregarDMouseClicked
        if ("".equals(dcFechaElaboracion.getDate()) || dcFechaElaboracion.getDate()==null || "".equals(dcFechaPago.getDate()) || dcFechaPago.getDate()==null  || cbEmpleados.getSelectedIndex() == -1 || cbPeriodo.getSelectedIndex() == -1 || cbFormaPago.getSelectedIndex() == -1 || cbEstatus.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Error: Por favor llena todos los campos");
        } else {
            if (d.obtenerPercepcion(idNomina)==0) {
                JOptionPane.showMessageDialog(null, "Error: No puedes agregar una deduccion porque no hay ninguna percepcion agregada");
            }else{
               int  seleccionEmpleado = cbEmpleados.getSelectedIndex();
               idEmpleado=aE[seleccionEmpleado];
              txfNominaD.setText(""+idNomina);
             txfEmpleadoD.setText(""+cbEmpleados.getSelectedItem()); 
             txfSalarioD.setText(""+d.obtenersalarioDiario(idEmpleado));
             banderaDeduccion=0;
             llenarComboDeducciones();
        jDialogNominasDeducciones.setVisible(true);
            }
        }
    }//GEN-LAST:event_jTxtAgregarDMouseClicked

    private void jTxtCancelarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtCancelarPMouseClicked
    banderaPercepcion=0;
        limpiarNominasP();
    banderaPercepcion=0;
        jDialogNominasPercepciones.setVisible(false);
    }//GEN-LAST:event_jTxtCancelarPMouseClicked

    private void jTxtCancelarDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtCancelarDMouseClicked
      banderaDeduccion=0;
        limpiarNominasD();
    banderaDeduccion=0;
        jDialogNominasDeducciones.setVisible(false);
    }//GEN-LAST:event_jTxtCancelarDMouseClicked

    private void tbNominasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNominasMouseClicked
        // TODO add your handling code here:
        Integer idDN = Integer.parseInt(tbNominas.getValueAt(tbNominas.getSelectedRow(), 0).toString());
      NominasDAO DAO = new NominasDAO (this.con);
        Modelo_Nominas Nom = new Modelo_Nominas();
        Nom = DAO.consultaIdNom(idDN);
        limpiarNominas();
        idNomina=idDN;
        
         dcFechaElaboracion.setDate(Nom.getFechaElaboracion());
           dcFechaPago.setDate(Nom.getFechaPago());
        cbEmpleados.setSelectedItem(DAO.obtenerNombreEmpleado(Nom.getIdEmpleado()));
        cbFormaPago.setSelectedItem(DAO.obtenerNombreFormaPago(Nom.getIdFormaPago()));
        cbPeriodo.setSelectedItem(DAO.obtenerNombrePeriodo(Nom.getIdPeriodo()));
        cbEstatus.setSelectedItem(Nom.getEstatus());
    }//GEN-LAST:event_tbNominasMouseClicked

    private void lblEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarMouseClicked
        // TODO add your handling code here:
           if ("".equals(dcFechaElaboracion.getDate()) || dcFechaElaboracion.getDate()==null || "".equals(dcFechaPago.getDate()) || dcFechaPago.getDate()==null  || cbEmpleados.getSelectedIndex() == -1 || cbPeriodo.getSelectedIndex() == -1 || cbFormaPago.getSelectedIndex() == -1 || cbEstatus.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Error: Slecciona primero una nomina");
        } else {
               cbEmpleados.setEnabled(false);
               inicio = 0;
               fin = 5;
             tbPercepciones.setModel(d.consultaDatosPercepciones(inicio, fin, idNomina));
        Paginacion p = new Paginacion(con);
        limit = getLimit(Integer.parseInt(p.count("NominasPercepciones")), fin); 
        inicio = 0;
               fin = 5;
             tbDeducciones.setModel(d.consultaDatosDeducciones(inicio, fin, idNomina));
        Paginacion p2 = new Paginacion(con);
        limit = getLimit(Integer.parseInt(p2.count("NominasDeducciones")), fin); 
         jTxtModificar.setEnabled(true);
        jLabelBAzulP1.setEnabled(true);
        jTxtNueva1.setEnabled(false);
        jLabelGuardar.setEnabled(false);
         jDialogFormulario.setVisible(true);
         
           }
    }//GEN-LAST:event_lblEditarMouseClicked

    private void jLabelBEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBEliminarMouseClicked
        // TODO add your handling code here:
       int fila = tbNominas.getSelectedRow();
        if (fila==-1) {
             JOptionPane.showMessageDialog(null, "Error: Selecciona una fila");
        }else{
        String [] op = {"Si","No"};
        String id = ""+tbNominas.getValueAt(fila, 0);
        int b = JOptionPane.showOptionDialog(null,"¿Deseas eliminar este registro?",
            "Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, op,op[0]);
        if(b == 0){
            d.eliminar(id);
            d.eliminarTodo(""+idNomina);
        }
            // Manda a llamar el metodo: consultaDatos()
           inicio=0;
            fin=5;
            tbNominas.setModel(d.consultaDatos(inicio, fin));
        Paginacion p = new Paginacion(con);
        limit = getLimit(Integer.parseInt(p.count("Nominas")), fin);
        }
    }//GEN-LAST:event_jLabelBEliminarMouseClicked

    private void jTxtNueva1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtNueva1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNueva1MouseClicked

    private void jLabelGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelGuardarMouseClicked
        // TODO add your handling code here:
          if ("".equals(dcFechaElaboracion.getDate()) || dcFechaElaboracion.getDate()==null || "".equals(dcFechaPago.getDate()) || dcFechaPago.getDate()==null  || cbEmpleados.getSelectedIndex() == -1 || cbPeriodo.getSelectedIndex() == -1 || cbFormaPago.getSelectedIndex() == -1 || cbEstatus.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Error: No dejes campos vacios");
        } else {
            int est=cbEstatus.getSelectedIndex();
            int  seleccionEmpleado = cbEmpleados.getSelectedIndex();
            int seleccionPeriodos = cbPeriodo.getSelectedIndex();
            int seleccionFormas = cbFormaPago.getSelectedIndex();
             Modelo_Nominas Nom = new Modelo_Nominas();
            
               
        Nom.setFechaElaboracion(dcFechaElaboracion.getDate());
           Nom.setFechaPago(dcFechaPago.getDate());
                Nom.setDiasTrabajados(d.obtenerdiasT(aE[seleccionEmpleado]));
                Nom.setEstatus(cbEstatus.getItemAt(est));
                Nom.setIdEmpleado(aE[seleccionEmpleado]);
                Nom.setIdPeriodo(aP[seleccionPeriodos]);
                Nom.setIdFormaPago(aF[seleccionFormas]);
           
                d.insertarDatos(Nom);
             limpiarNominas();
            tbNominas.setModel(d.consultaDatos(inicio, fin));
        Paginacion p = new Paginacion(con);
        limit = getLimit(Integer.parseInt(p.count("Nominas")), fin);
          }
    }//GEN-LAST:event_jLabelGuardarMouseClicked

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        if (inicio == 0) {
            btnAtras.setEnabled(false);
        } else {
            btnSiguiente.setEnabled(true);
            inicio = inicio - 5;
            tbNominas.setModel(d.consultaDatos(inicio, fin));
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
        if (inicio == limit * 5) {
            btnSiguiente.setEnabled(false);
        } else {
            btnAtras.setEnabled(true);
            inicio = inicio + 5;
            tbNominas.setModel(d.consultaDatos(inicio, fin));
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void jLabelBAzulPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBAzulPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelBAzulPMouseClicked

    private void cbPercepcionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbPercepcionItemStateChanged
        // TODO add your handling code here:
        
        if (banderaPercepcion==0) {
            banderaPercepcion=1;
        }else if(banderaPercepcion>1){
            int seleccionPercepcion = cbPercepcion.getSelectedIndex();
            int diasT=d.obtenerdiasT(idEmpleado);
           int salD=d.obtenersalarioDiario(idEmpleado);
            int diasP=d.obtenerdiasPagar(aPe[seleccionPercepcion]);
            float imp=0.0f;
                         
            if ("Salario".equals(cbPercepcion.getSelectedItem().toString())) {
                txfDiasAPagar.setText(""+diasT);
             
                imp=diasT*salD;
                txfImporteP.setText(""+imp);
            }else{
               txfDiasAPagar.setText(""+diasP);
             
                imp=salD*diasP;
                txfImporteP.setText(""+imp);
            }
        }
    }//GEN-LAST:event_cbPercepcionItemStateChanged

    private void jTxtAceptarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtAceptarPMouseClicked
        // TODO add your handling code here:
         if (cbPercepcion.getSelectedIndex() == -1 || txfNominaP.getText().isEmpty()|| txfEmpleadoP.getText().isEmpty() || txfSalarioP.getText().isEmpty() || txfDiasAPagar.getText().isEmpty() || txfImporteP.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: No dejes campos vacios");
        } else {
             int seleccionPercepcion = cbPercepcion.getSelectedIndex();
             Modelo_NominasPercepciones NomP = new Modelo_NominasPercepciones();
                NomP.setIdNomina(idNomina);
                NomP.setIdPercepcion(aPe[seleccionPercepcion]);
                NomP.setImporte(Float.parseFloat(txfImporteP.getText()));    
                banderaPercepcion=0;
                int com = d.comprobarExistenciaP(NomP.getIdNomina(), NomP.getIdPercepcion());
             if (com==0) {
                  d.insertarPercepcion(NomP);
                d.actualizarTotalPercepciones(idNomina);
            limpiarNominasP();
            tbPercepciones.setModel(d.consultaDatosPercepciones(inicio, fin, idNomina));
        Paginacion p = new Paginacion(con);
        limit = getLimit(Integer.parseInt(p.count("NominasPercepciones")), fin);
        limpiarNominasP();
        inicio=0;
            fin=5;
            tbNominas.setModel(d.consultaDatos(inicio, fin));
        Paginacion p2 = new Paginacion(con);
        limit = getLimit(Integer.parseInt(p2.count("Nominas")), fin);
        jDialogNominasPercepciones.setVisible(false);
             }else{
               JOptionPane.showMessageDialog(null, "Error: La percepcion para esta nomina ya existe, por favor ingresa una nueva");
          }
         }
    }//GEN-LAST:event_jTxtAceptarPMouseClicked

    private void jTxtModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtModificarMouseClicked
        // TODO add your handling code here:
         if ("".equals(dcFechaElaboracion.getDate()) || dcFechaElaboracion.getDate()==null || "".equals(dcFechaPago.getDate()) || dcFechaPago.getDate()==null  || cbEmpleados.getSelectedIndex() == -1 || cbPeriodo.getSelectedIndex() == -1 || cbFormaPago.getSelectedIndex() == -1 || cbEstatus.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Error: No dejes campos vacios");
        } else {
             
            int est=cbEstatus.getSelectedIndex();
            int  seleccionEmpleado = cbEmpleados.getSelectedIndex();
            int seleccionPeriodos = cbPeriodo.getSelectedIndex();
            int seleccionFormas = cbFormaPago.getSelectedIndex();
             Modelo_Nominas Nom = new Modelo_Nominas();
              
                
               Nom.setFechaElaboracion(dcFechaElaboracion.getDate());
               Nom.setFechaPago(dcFechaPago.getDate());
                Nom.setDiasTrabajados(d.obtenerdiasT(aE[seleccionEmpleado]));
                Nom.setEstatus(cbEstatus.getItemAt(est));
                Nom.setIdEmpleado(aE[seleccionEmpleado]);
                Nom.setIdPeriodo(aP[seleccionPeriodos]);
                Nom.setIdFormaPago(aF[seleccionFormas]);
                Nom.setIdNom(idNomina);
                d.actualizar(Nom);
             limpiarNominas();
            tbNominas.setModel(d.consultaDatos(inicio, fin));
        Paginacion p = new Paginacion(con);
        limit = getLimit(Integer.parseInt(p.count("Nominas")), fin);
        jDialogFormulario.setVisible(false);
          }
    }//GEN-LAST:event_jTxtModificarMouseClicked

    private void jLabelBAzulP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBAzulP1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelBAzulP1MouseClicked

    private void jTxtEliminarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtEliminarPMouseClicked
        // TODO add your handling code here:
         int fila = tbPercepciones.getSelectedRow();
         if (fila==-1) {
             JOptionPane.showMessageDialog(null, "Error: Selecciona una fila");
        }else{
        String [] op = {"Si","No"};
        String idPer = ""+tbPercepciones.getValueAt(fila, 0);
        
        int b = JOptionPane.showOptionDialog(null,"¿Deseas eliminar este registro?",
            "Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, op,op[0]);
        if(b == 0){
            
            d.eliminarPercepcion(idNomina, Integer.parseInt(idPer));
            d.actualizarTotalPercepciones(idNomina);
        }
            // Manda a llamar el metodo: consultaDatos()
        inicio=0;
        fin=5;
            tbPercepciones.setModel(d.consultaDatosPercepciones(inicio, fin,idNomina));
            inicio=0;
            fin=5;
            tbNominas.setModel(d.consultaDatos(inicio, fin));
        Paginacion p = new Paginacion(con);
        limit = getLimit(Integer.parseInt(p.count("Nominas")), fin);
         }
    }//GEN-LAST:event_jTxtEliminarPMouseClicked

    private void cbDeduccionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDeduccionItemStateChanged
        // TODO add your handling code here:
         if (banderaDeduccion==0) {
            banderaDeduccion=1;
        }else if(banderaDeduccion>1){
            int seleccionDeduccion = cbDeduccion.getSelectedIndex();
           int porc = d.obtenerPorcentaje(aD[seleccionDeduccion]);
            int sub = d.obtenerSubtotal(idNomina);             
            float importe = (sub*porc)/100;
            txfImporteD.setText(""+importe);
        }
    }//GEN-LAST:event_cbDeduccionItemStateChanged

    private void jTxtAceptarDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtAceptarDMouseClicked
        // TODO add your handling code here:
        if (cbDeduccion.getSelectedIndex() == -1 || txfNominaD.getText().isEmpty()|| txfEmpleadoD.getText().isEmpty() || txfSalarioD.getText().isEmpty() || txfImporteD.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: No dejes campos vacios");
        } else {
             int seleccionDeduccion = cbDeduccion.getSelectedIndex();
             Modelo_NominasDeducciones NomD = new Modelo_NominasDeducciones();
                NomD.setIdNomina(idNomina);
                NomD.setIdDeduccion(aD[seleccionDeduccion]);
                NomD.setImporte(Float.parseFloat(txfImporteD.getText()));    
                banderaDeduccion=0;
              int com = d.comprobarExistenciaD(NomD.getIdNomina(), NomD.getIdDeduccion());
             if (com==0) {
                d.insertarDeduccion(NomD);
                d.actualizarTotalDeducciones(idNomina);
            limpiarNominasP();
            tbDeducciones.setModel(d.consultaDatosDeducciones(inicio, fin, idNomina));
        Paginacion p = new Paginacion(con);
        limit = getLimit(Integer.parseInt(p.count("NominasDeducciones")), fin);
        limpiarNominasD();
        inicio=0;
            fin=5;
            tbNominas.setModel(d.consultaDatos(inicio, fin));
        Paginacion p2 = new Paginacion(con);
        limit = getLimit(Integer.parseInt(p2.count("Nominas")), fin);
        jDialogNominasDeducciones.setVisible(false);
             }else{
                 JOptionPane.showMessageDialog(null, "Error: La deduccion para esta nomina ya existe, por favor ingresa una nueva");
             }
        }
    }//GEN-LAST:event_jTxtAceptarDMouseClicked

    private void jTxtEliminarDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtEliminarDMouseClicked
        // TODO add your handling code here:
         int fila = tbDeducciones.getSelectedRow();
         if (fila==-1) {
             JOptionPane.showMessageDialog(null, "Error: Selecciona una fila");
        }else{
        String [] op = {"Si","No"};
        String idDed = ""+tbDeducciones.getValueAt(fila, 0);
        
        int b = JOptionPane.showOptionDialog(null,"¿Deseas eliminar este registro?",
            "Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, op,op[0]);
        if(b == 0){
            
            d.eliminarDeduccion(idNomina, Integer.parseInt(idDed));
            d.actualizarTotalDeducciones(idNomina);
        }
            // Manda a llamar el metodo: consultaDatos()
        inicio=0;
        fin=5;
            tbDeducciones.setModel(d.consultaDatosDeducciones(inicio, fin,idNomina));
            inicio=0;
            fin=5;
            tbNominas.setModel(d.consultaDatos(inicio, fin));
        Paginacion p = new Paginacion(con);
        limit = getLimit(Integer.parseInt(p.count("Nominas")), fin);
         }
    }//GEN-LAST:event_jTxtEliminarDMouseClicked

    private void btnAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras1ActionPerformed
        // TODO add your handling code here:
         if (inicio == 0) {
            btnAtras.setEnabled(false);
        } else {
            btnSiguiente.setEnabled(true);
            inicio = inicio - 5;
            tbPercepciones.setModel(d.consultaDatosPercepciones(inicio, fin,idNomina));
        }
    }//GEN-LAST:event_btnAtras1ActionPerformed

    private void btnSiguiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiente1ActionPerformed
        // TODO add your handling code here:
         if (inicio == limit * 5) {
            btnSiguiente.setEnabled(false);
        } else {
            btnAtras.setEnabled(true);
            inicio = inicio + 5;
            tbPercepciones.setModel(d.consultaDatosPercepciones(inicio, fin,idNomina));
         }
    }//GEN-LAST:event_btnSiguiente1ActionPerformed

    private void btnAtras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras2ActionPerformed
        // TODO add your handling code here:
         if (inicio == 0) {
            btnAtras.setEnabled(false);
        } else {
            btnSiguiente.setEnabled(true);
            inicio = inicio - 5;
            tbDeducciones.setModel(d.consultaDatosDeducciones(inicio, fin,idNomina));
        }
    }//GEN-LAST:event_btnAtras2ActionPerformed

    private void btnSiguiente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiente2ActionPerformed
        // TODO add your handling code here:
         if (inicio == limit * 5) {
            btnSiguiente.setEnabled(false);
        } else {
            btnAtras.setEnabled(true);
            inicio = inicio + 5;
            tbDeducciones.setModel(d.consultaDatosDeducciones(inicio, fin,idNomina));
         }
    }//GEN-LAST:event_btnSiguiente2ActionPerformed
public void limpiarNominas() {
      dcFechaElaboracion.setDate(null);
        dcFechaPago.setDate(null);
        cbPeriodo.setSelectedItem(null);
         cbFormaPago.setSelectedItem(null);
        cbEmpleados.setSelectedItem(null);
        cbEstatus.setSelectedItem(null);
        
    }
public void limpiarNominasD() {
     txfNominaD.setText("");
     txfEmpleadoD.setText("");
     txfSalarioD.setText("");
     cbDeduccion.setSelectedItem(null);
     txfImporteD.setText("");
    }
public void limpiarNominasP() {
     txfNominaP.setText("");
     txfEmpleadoP.setText("");
     txfSalarioP.setText("");
     cbPercepcion.setSelectedItem(null);
     txfDiasAPagar.setText("");
     txfImporteP.setText("");
  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnAtras1;
    private javax.swing.JButton btnAtras2;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnSiguiente1;
    private javax.swing.JButton btnSiguiente2;
    private javax.swing.JComboBox<String> cbDeduccion;
    private javax.swing.JComboBox<String> cbEmpleados;
    private javax.swing.JComboBox<String> cbEstatus;
    private javax.swing.JComboBox<String> cbFormaPago;
    private javax.swing.JComboBox<String> cbPercepcion;
    private javax.swing.JComboBox<String> cbPeriodo;
    private com.toedter.calendar.JDateChooser dcFechaElaboracion;
    private com.toedter.calendar.JDateChooser dcFechaPago;
    private javax.swing.JDialog jDialogFormulario;
    private javax.swing.JDialog jDialogNominasDeducciones;
    private javax.swing.JDialog jDialogNominasPercepciones;
    private javax.swing.JLabel jLabelBAceptarD;
    private javax.swing.JLabel jLabelBAceptarP;
    private javax.swing.JLabel jLabelBAzulD;
    private javax.swing.JLabel jLabelBAzulP;
    private javax.swing.JLabel jLabelBAzulP1;
    private javax.swing.JLabel jLabelBEliminar;
    private javax.swing.JLabel jLabelBRegresar;
    private javax.swing.JLabel jLabelBSalir;
    private javax.swing.JLabel jLabelBVerde;
    private javax.swing.JLabel jLabelCancelarD;
    private javax.swing.JLabel jLabelCancelarP;
    private javax.swing.JLabel jLabelDeduccion;
    private javax.swing.JLabel jLabelDeducciones;
    private javax.swing.JLabel jLabelDiasPagar;
    private javax.swing.JLabel jLabelEditar;
    private javax.swing.JLabel jLabelEliminar;
    private javax.swing.JLabel jLabelEliminarDeduccion;
    private javax.swing.JLabel jLabelEliminarPercepcion;
    private javax.swing.JLabel jLabelEmpleado;
    private javax.swing.JLabel jLabelEmpleadoD;
    private javax.swing.JLabel jLabelEmpleados;
    private javax.swing.JLabel jLabelEstatus;
    private javax.swing.JLabel jLabelFechaDeElaboracion;
    private javax.swing.JLabel jLabelFechaDePago;
    private javax.swing.JLabel jLabelFormaDePago;
    private javax.swing.JLabel jLabelGuardar;
    private javax.swing.JLabel jLabelImporte;
    private javax.swing.JLabel jLabelImporteD;
    private javax.swing.JLabel jLabelNomina;
    private javax.swing.JLabel jLabelNominaD;
    private javax.swing.JLabel jLabelNominas;
    private javax.swing.JLabel jLabelPercepcion;
    private javax.swing.JLabel jLabelPercepciones;
    private javax.swing.JLabel jLabelPeriodo;
    private javax.swing.JLabel jLabelSalario;
    private javax.swing.JLabel jLabelSalarioD;
    private javax.swing.JLabel jLabelSombra;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTituloDeducciones;
    private javax.swing.JLabel jLabelTituloPercepciones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jTxtAceptarD;
    private javax.swing.JLabel jTxtAceptarP;
    private javax.swing.JLabel jTxtAgregarD;
    private javax.swing.JLabel jTxtAgregarP;
    private javax.swing.JLabel jTxtCancelarD;
    private javax.swing.JLabel jTxtCancelarP;
    private javax.swing.JLabel jTxtEliminarD;
    private javax.swing.JLabel jTxtEliminarP;
    private javax.swing.JLabel jTxtModificar;
    private javax.swing.JLabel jTxtNueva;
    private javax.swing.JLabel jTxtNueva1;
    private javax.swing.JLabel jTxtRegresar;
    private javax.swing.JLabel jTxtSalir;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JLabel lblReloj1;
    private javax.swing.JTable tbDeducciones;
    private javax.swing.JTable tbNominas;
    private javax.swing.JTable tbPercepciones;
    private javax.swing.JTextField txfDiasAPagar;
    private javax.swing.JTextField txfEmpleadoD;
    private javax.swing.JTextField txfEmpleadoP;
    private javax.swing.JTextField txfImporteD;
    private javax.swing.JTextField txfImporteP;
    private javax.swing.JTextField txfNominaD;
    private javax.swing.JTextField txfNominaP;
    private javax.swing.JTextField txfSalarioD;
    private javax.swing.JTextField txfSalarioP;
    // End of variables declaration//GEN-END:variables
}
