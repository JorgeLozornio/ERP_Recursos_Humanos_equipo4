
package Tablas_Interfacez;

import Herramientas.Sesion;
import Interfaz.Login;
import Paginacion.Paginacion;
import Reloj.Reloj;
import TablasDAO.EmpleadosDAO;
import com.toedter.calendar.JDateChooser;
import java.awt.ComponentOrientation;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Empleados extends javax.swing.JFrame {

    EmpleadosDAO t;
    Connection con;
    String us;
    int i=0;
    int inicio=0;
    int fin=5;
    int aE[];
    int limit;
    String d[];
    //int limit = p.getLimit("Turnos", fin);
    
    public Empleados(Connection c, String u) throws SQLException {
        con = c;
        us = u;
        EmpleadosDAO tu = new EmpleadosDAO(con);
        t = tu;
        initComponents();
        Reloj h = new Reloj(lblReloj, u);
        h.start();
        this.setLocationRelativeTo(null);
        tbEmpleados.setModel(t.mostrarDatos(inicio, fin));
        //tbEmpleados.setModel(t.mostrarDatos(inicio, fin));
        Paginacion p = new Paginacion(con);
        //limit = getLimit(Integer.parseInt(p.count("Turnos")), fin);
        llenarCombos();
        rbM.setSelected(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblReloj = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPaterno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rbM = new javax.swing.JRadioButton();
        rbF = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        fechaContratacion = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        txtMaterno = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbEstadoCiv = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        fechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        txtCurp = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEmpleados = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblSesion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblEliminar = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();
        lblInsertar = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        btnFoto = new javax.swing.JButton();
        txtNss = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtVacaciones = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtPermiso = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtCP = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cbEscolaridad = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        jLabel26 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        cbEstatus = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        cbDepartamento = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        cbPuesto = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        cbCiudad = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        cbSucursal = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbTurno = new javax.swing.JComboBox<>();
        txtRuta = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1080, 600));
        setMinimumSize(new java.awt.Dimension(1080, 600));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 14)); // NOI18N
        jLabel4.setText("Empleados");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        lblReloj.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 14)); // NOI18N
        lblReloj.setForeground(new java.awt.Color(255, 255, 255));
        lblReloj.setText("Lorem");
        getContentPane().add(lblReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        getContentPane().add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 150, -1));

        jLabel6.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel6.setText("Nombre:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel7.setText("Apellido paterno:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        getContentPane().add(txtPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 140, -1));

        jLabel8.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel8.setText("Apellido materno:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        rbM.setText("Masculino");
        rbM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbMMouseClicked(evt);
            }
        });
        getContentPane().add(rbM, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        rbF.setText("Femenino");
        rbF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbFMouseClicked(evt);
            }
        });
        getContentPane().add(rbF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        jLabel9.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel9.setText("Sexo:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        fechaContratacion.setDateFormatString("YYYY-MM-dd");
        getContentPane().add(fechaContratacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 110, -1));

        jLabel10.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel10.setText("Fecha de Nacimiento:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));
        getContentPane().add(txtMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 140, -1));

        jLabel11.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel11.setText("CURP:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        cbEstadoCiv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero/a", "Casado/a", "Viudo/a", "Unión libre", " " }));
        getContentPane().add(cbEstadoCiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 160, -1));

        jLabel12.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel12.setText("Estado civil:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        fechaNacimiento.setDateFormatString("YYYY-MM-dd");
        getContentPane().add(fechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 110, -1));

        jLabel13.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel13.setText("Fecha de contratación:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));
        getContentPane().add(txtCurp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 180, -1));

        jLabel14.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel14.setText("Salario diario:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 180, -1));

        tbEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "idEmpleado", "Nombre", "ApellidoPaterno", "ApellidoMaterno", "Sexo", "FchNacimiento", "CURP", "EstadoCivil", "fchContratacion", "SalarioDiario", "NSS", "DiasVacaciones", "DiasPermiso", "Fotografia", "Direccion", "Colonia", "CP", "Escolaridad", "Especialidad", "Email", "Contraseña", "Tipo", "Estatus", "Departamento", "Puesto", "Ciudad", "Sucursal", "Turno"
            }
        ));
        tbEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbEmpleados);
        if (tbEmpleados.getColumnModel().getColumnCount() > 0) {
            tbEmpleados.getColumnModel().getColumn(0).setHeaderValue("idEmpleado");
            tbEmpleados.getColumnModel().getColumn(1).setHeaderValue("Nombre");
            tbEmpleados.getColumnModel().getColumn(2).setHeaderValue("ApellidoPaterno");
            tbEmpleados.getColumnModel().getColumn(3).setHeaderValue("ApellidoMaterno");
            tbEmpleados.getColumnModel().getColumn(4).setHeaderValue("Sexo");
            tbEmpleados.getColumnModel().getColumn(5).setHeaderValue("FchNacimiento");
            tbEmpleados.getColumnModel().getColumn(6).setHeaderValue("CURP");
            tbEmpleados.getColumnModel().getColumn(7).setHeaderValue("EstadoCivil");
            tbEmpleados.getColumnModel().getColumn(8).setHeaderValue("fchContratacion");
            tbEmpleados.getColumnModel().getColumn(9).setHeaderValue("SalarioDiario");
            tbEmpleados.getColumnModel().getColumn(10).setHeaderValue("NSS");
            tbEmpleados.getColumnModel().getColumn(11).setHeaderValue("DiasVacaciones");
            tbEmpleados.getColumnModel().getColumn(12).setHeaderValue("DiasPermiso");
            tbEmpleados.getColumnModel().getColumn(13).setHeaderValue("Fotografia");
            tbEmpleados.getColumnModel().getColumn(14).setHeaderValue("Direccion");
            tbEmpleados.getColumnModel().getColumn(15).setHeaderValue("Colonia");
            tbEmpleados.getColumnModel().getColumn(16).setHeaderValue("CP");
            tbEmpleados.getColumnModel().getColumn(17).setHeaderValue("Escolaridad");
            tbEmpleados.getColumnModel().getColumn(18).setHeaderValue("Especialidad");
            tbEmpleados.getColumnModel().getColumn(19).setHeaderValue("Email");
            tbEmpleados.getColumnModel().getColumn(20).setHeaderValue("Contraseña");
            tbEmpleados.getColumnModel().getColumn(21).setHeaderValue("Tipo");
            tbEmpleados.getColumnModel().getColumn(22).setHeaderValue("Estatus");
            tbEmpleados.getColumnModel().getColumn(23).setHeaderValue("Departamento");
            tbEmpleados.getColumnModel().getColumn(24).setHeaderValue("Puesto");
            tbEmpleados.getColumnModel().getColumn(25).setHeaderValue("Ciudad");
            tbEmpleados.getColumnModel().getColumn(26).setHeaderValue("Sucursal");
            tbEmpleados.getColumnModel().getColumn(27).setHeaderValue("Turno");
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 1770, 140));

        jPanel2.setBackground(new java.awt.Color(0, 204, 153));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Cruz.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 10, -1, -1));

        lblSesion.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 14)); // NOI18N
        lblSesion.setForeground(new java.awt.Color(255, 255, 255));
        lblSesion.setText("Cerrar Sesión");
        lblSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lblSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSesionMouseClicked(evt);
            }
        });
        jPanel2.add(lblSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEliminar.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 14)); // NOI18N
        lblEliminar.setForeground(new java.awt.Color(255, 255, 255));
        lblEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEliminar.setText("Eliminar");
        lblEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminarMouseClicked(evt);
            }
        });
        jPanel1.add(lblEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 240, 80, 30));

        lblEditar.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 14)); // NOI18N
        lblEditar.setForeground(new java.awt.Color(255, 255, 255));
        lblEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditar.setText("Editar");
        lblEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblEditar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblEditarAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        lblEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditarMouseClicked(evt);
            }
        });
        jPanel1.add(lblEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 150, 80, 30));

        lblInsertar.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 14)); // NOI18N
        lblInsertar.setForeground(new java.awt.Color(255, 255, 255));
        lblInsertar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInsertar.setText("Crear");
        lblInsertar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInsertarMouseClicked(evt);
            }
        });
        jPanel1.add(lblInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 60, 80, 30));

        jLabel37.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Regresar");
        jLabel37.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1700, 10, 80, 30));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRosa.png"))); // NOI18N
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1700, 10, -1, -1));

        lblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 340, 230));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonV.png"))); // NOI18N
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 60, -1, -1));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonAzul.png"))); // NOI18N
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 150, -1, -1));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRojo.png"))); // NOI18N
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 240, -1, -1));

        btnFoto.setText("Elegir fotografia");
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
            }
        });
        jPanel1.add(btnFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 280, 340, -1));
        jPanel1.add(txtNss, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 180, -1));

        jLabel15.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel15.setText("NSS:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        jLabel16.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel16.setText("Dias de vacaciones:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));
        jPanel1.add(txtVacaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 100, -1));

        jLabel17.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel17.setText("Dias de permio:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));
        jPanel1.add(txtPermiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 120, -1));

        jLabel19.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel19.setText("Dirección:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 150, -1));

        jLabel20.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel20.setText("Colonia:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));
        jPanel1.add(txtColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 160, -1));

        jLabel21.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel21.setText("CP:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));
        jPanel1.add(txtCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 190, -1));

        jLabel22.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel22.setText("Escolaridad:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        cbEscolaridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primaria", "Secundaria", "Preparatoria", "Carrera universitaria", " " }));
        jPanel1.add(cbEscolaridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 140, -1));

        jLabel23.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel23.setText("Especialidad:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));
        jPanel1.add(txtEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 140, -1));

        jLabel24.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel24.setText("Email:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, -1, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 180, -1));

        jLabel25.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel25.setText("Contraseña:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, -1, -1));
        jPanel1.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, 140, -1));

        jLabel26.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel26.setText("Tipo:");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, -1, -1));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "E" }));
        jPanel1.add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 180, -1));

        jLabel27.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel27.setText("Estatus:");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, -1));

        cbEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "I", " " }));
        jPanel1.add(cbEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 170, -1));

        jLabel28.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel28.setText("Departamento:");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, -1, -1));

        jPanel1.add(cbDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, 130, -1));

        jLabel29.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel29.setText("Puesto:");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, -1, -1));

        jPanel1.add(cbPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 170, -1));

        jLabel30.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel30.setText("Ciudad:");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, -1, -1));

        jPanel1.add(cbCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 170, -1));

        jLabel31.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel31.setText("Sucursal:");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, -1, -1));

        jPanel1.add(cbSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 160, -1));

        jLabel5.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel5.setText("Turno:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, -1, -1));

        jPanel1.add(cbTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, 170, -1));
        jPanel1.add(txtRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 250, 340, -1));

        btnAtras.setText("<");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, -1, -1));

        btnSiguiente.setText(">");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1800, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int xx, xy;
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setVisible(false);
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
        MenuTablas m = new MenuTablas(con, us);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel37MouseClicked

    private void lblSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSesionMouseClicked
        Sesion s = new Sesion(con);
        if(s.cerrarSesion()){
            Login l = new Login();
            l.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_lblSesionMouseClicked

    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Buscar Fotografia");
        if(fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            File archivo = new File(fc.getSelectedFile().toString());            
            rsscalelabel.RSScaleLabel.setScaleLabel(lblFoto, fc.getSelectedFile().toString());
            //File fileName = fc.getSelectedFile();
            if ((archivo == null) || (archivo.getName().equals(""))) {
                txtRuta.setText("...");
            } else {
                txtRuta.setText(archivo.getAbsolutePath());
            }
        }
    }//GEN-LAST:event_btnFotoActionPerformed
   
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void rbMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbMMouseClicked
        rbF.setSelected(false);
    }//GEN-LAST:event_rbMMouseClicked

    private void rbFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbFMouseClicked
        rbM.setSelected(false);
    }//GEN-LAST:event_rbFMouseClicked

    private void lblInsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInsertarMouseClicked
        
        if(verificar()){
            t.insertar(txtNombre.getText(),txtPaterno.getText(), txtMaterno.getText(), rb(), ((JTextField)fechaNacimiento.getDateEditor().getUiComponent()).getText(),
                    txtCurp.getText(), cbEstadoCiv.getSelectedItem().toString(), ((JTextField)fechaContratacion.getDateEditor().getUiComponent()).getText(),
                    txtSalario.getText(), txtNss.getText(), txtVacaciones.getText(), txtPermiso.getText(), txtRuta.getText(),
                    txtDireccion.getText(), txtColonia.getText(), txtCP.getText(), cbEscolaridad.getSelectedItem().toString(),
                    txtEspecialidad.getText(), txtEmail.getText(), txtContra.getPassword().toString(), cbTipo.getSelectedItem().toString(),
                    cbEstatus.getSelectedItem().toString(), cbDepartamento.getSelectedItem().toString(),
                    cbPuesto.getSelectedItem().toString(), cbCiudad.getSelectedItem().toString(), cbSucursal.getSelectedItem().toString(),
                    cbTurno.getSelectedItem().toString());
            tbEmpleados.setModel(t.mostrarDatos(inicio, fin));
        }else{
            JOptionPane.showMessageDialog(null, "Los campos han sido rellenados de forma incorrecta");
        }
    }//GEN-LAST:event_lblInsertarMouseClicked

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        if(inicio == 0){
            btnAtras.setEnabled(false);
        }else{
            btnSiguiente.setEnabled(true);
            inicio = inicio - 5;
            tbEmpleados.setModel(t.mostrarDatos(inicio, fin));
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if(inicio == limit*5){
           btnSiguiente.setEnabled(false);
       }else{
           btnAtras.setEnabled(true);
           inicio = inicio+5;
           tbEmpleados.setModel(t.mostrarDatos(inicio, fin));
       }      
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void tbEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEmpleadosMouseClicked
        int fila = tbEmpleados.getSelectedRow();
        String r[];
        String m = (String)tbEmpleados.getValueAt(fila, 0);
        r = t.busquedaIndividual(m, lblFoto);
        txtNombre.setText(r[1]);
        txtPaterno.setText(r[2]);
        txtMaterno.setText(r[3]);
        if(r[4].equals("M")){
            rbM.setSelected(true);
            rbF.setSelected(false);
        }else{
            rbM.setSelected(false);
            rbF.setSelected(true);
        }
        
        
        txtCurp.setText(r[6]);
        cbEstadoCiv.setSelectedItem(r[7]);
        txtSalario.setText(r[9]);
        txtNss.setText(r[10]);
        txtVacaciones.setText(r[11]);
        txtPermiso.setText(r[12]);
        txtRuta.setText(r[13]);
        txtDireccion.setText(r[14]);
        txtColonia.setText(r[15]);
        txtCP.setText(r[16]);
        cbEscolaridad.setSelectedItem(r[17]);
        txtEspecialidad.setText(r[18]);
        txtEmail.setText(r[19]);
        txtContra.setText(r[20]);
        cbTipo.setSelectedItem(r[21]);
        cbEstatus.setSelectedItem(r[22]);
        
        for(int i = 0; i < cbDepartamento.getItemCount(); i++){
            System.out.println(cbDepartamento.getItemAt(i)+" "+r[23]);
            if(cbDepartamento.getItemAt(i).equals(r[23])){
                cbDepartamento.setSelectedIndex(i);
            }            
        }
        
        cbDepartamento.setSelectedItem(r[23]);
        cbPuesto.setSelectedItem(r[24]);
        cbCiudad.setSelectedItem(r[25]);
        cbSucursal.setSelectedItem(r[26]);
        cbTurno.setSelectedItem(r[27]);
        
        try{
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)tbEmpleados.getValueAt(fila,5));
            Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse((String)tbEmpleados.getValueAt(fila,8));            
            fechaNacimiento.setDate(date);
            fechaContratacion.setDate(date2);
        }catch(ParseException ex){
            
        }
    }//GEN-LAST:event_tbEmpleadosMouseClicked

    private void lblEditarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblEditarAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblEditarAncestorAdded

    private void lblEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarMouseClicked
        int fila = tbEmpleados.getSelectedRow();
        String m = (String)tbEmpleados.getValueAt(fila, 0);
        t.actualizar(txtNombre.getText(),txtPaterno.getText(), txtMaterno.getText(), rb(), ((JTextField)fechaNacimiento.getDateEditor().getUiComponent()).getText(),
                    txtCurp.getText(), cbEstadoCiv.getSelectedItem().toString(), ((JTextField)fechaContratacion.getDateEditor().getUiComponent()).getText(),
                    txtSalario.getText(), txtNss.getText(), txtVacaciones.getText(), txtPermiso.getText(), txtRuta.getText(),
                    txtDireccion.getText(), txtColonia.getText(), txtCP.getText(), cbEscolaridad.getSelectedItem().toString(),
                    txtEspecialidad.getText(), txtEmail.getText(), txtContra.getPassword().toString(), cbTipo.getSelectedItem().toString(),
                    cbEstatus.getSelectedItem().toString(), cbDepartamento.getSelectedItem().toString(),
                    cbPuesto.getSelectedItem().toString(), cbCiudad.getSelectedItem().toString(), cbSucursal.getSelectedItem().toString(),
                    cbTurno.getSelectedItem().toString(),m);
        tbEmpleados.setModel(t.mostrarDatos(inicio, fin));
    }//GEN-LAST:event_lblEditarMouseClicked

    private void lblEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseClicked
        
        if(verificar()){ 
            int fila = tbEmpleados.getSelectedRow();
            String [] op = {"Si","No"};
            String id = ""+tbEmpleados.getValueAt(fila, 0);
            int b = JOptionPane.showOptionDialog(null,"¿Deseas eliminar este registro?",
                    "Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, op,op[0]);
            if(b == 0){
                t.eliminar(id);
            }        
            limpiar();
            tbEmpleados.setModel(t.mostrarDatos(inicio, fin));
        }else{
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun registro");
        }
        
    }//GEN-LAST:event_lblEliminarMouseClicked

    public void llenarCombos() {
        t.combo(cbDepartamento, 1, "Departamentos");
        t.combo(cbPuesto, 1, "Puestos");
        t.combo(cbCiudad, 1, "Ciudades");
        t.combo(cbSucursal, 1, "Sucursales");
        t.combo(cbTurno, 1, "Turnos");
    }
    
    public boolean verificar(){
        System.out.println("vrb: "+vrb()+" Email:"+vEmail()+" NSS:"+vNSS()+" CURP: "+vCurp()+" CP_ "+vCP());
        if(txtNombre.equals("") | txtPaterno.equals("") | txtMaterno.equals("") | vrb() | fechaNacimiento.equals(null) | txtCurp.equals("") | fechaContratacion.equals(null) |
                txtSalario.equals("") | vEmail() | vNSS() | txtVacaciones.equals("") | Integer.parseInt(txtVacaciones.getText())<7 | Integer.parseInt(txtSalario.getText())<141.7
                | txtPermiso.equals("") | Integer.parseInt(txtPermiso.getText())<3 | vCurp() | txtDireccion.equals("") | txtColonia.equals("") | vCP() | txtEspecialidad.equals("")
                | txtContra.equals("") | txtRuta.equals("")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean vrb(){
        if(rbF.isSelected() || rbM.isSelected()){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean vEmail(){
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
 
        // El email a validar
        String email = txtEmail.getText();
 
        Matcher mather = pattern.matcher(email);
 
        if (mather.find() == true) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Email escrito en formato erroneo");
            return false;
        }
    }
    
    public boolean vNSS(){
        Pattern pattern = Pattern
                .compile("^[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]$");
 
        // El email a validar
        String nss = txtNss.getText();
 
        Matcher mather = pattern.matcher(nss);
 
        if (mather.find() == true) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "NSS escrito en formato erroneo");
            return false;
        }
    }
    
    public boolean vCurp(){
        Pattern pattern = Pattern
                .compile("^[A-Z][A-Z][A-Z][A-Z][0-9][0-9][0-9][0-9][0-9][0-9][A-Z][A-Z][A-Z][A-Z][A-Z][A-Z][0-9][0-9]$");
 
        // El email a validar
        String nss = txtCurp.getText();
 
        Matcher mather = pattern.matcher(nss);
 
        if (mather.find() == true) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "CURP escrita en formato erroneo");
            return false;
        }
    }
    
    public boolean vCP(){
        Pattern pattern = Pattern
                .compile("^[0-9][0-9][0-9][0-9][0-9]$");
 
        // El email a validar
        String nss = txtCP.getText();
 
        Matcher mather = pattern.matcher(nss);
 
        if (mather.find() == true) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "CP escrito en formato erroneo");
            return false;
        }
    }
    
    public void limpiar(){
        txtNombre.setText("");
        txtPaterno.setText("");
        txtMaterno.setText("");
        fechaNacimiento.setDate(null);
        txtCurp.setText("");
        fechaContratacion.setDate(null);
        txtSalario.setText("");
        txtNss.setText("");
        txtVacaciones.setText("");
        txtPermiso.setText("");
        txtRuta.setText("");
        txtDireccion.setText("");
        txtColonia.setText("");
        txtCP.setText("");
        txtEspecialidad.setText("");
        txtEmail.setText("");
        txtContra.setText("");        
    }
    
    public String rb(){
        if(rbM.isSelected()){
            System.out.println("M");
            return "M";
        }else{
            System.out.println("F");
            return "F";
        }
    }
    
    public int getLimit(int n, int lim){        
        limit = (int) Math.ceil(n/lim);
        System.out.println(n +" "+ limit);
        return limit;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnFoto;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> cbCiudad;
    private javax.swing.JComboBox<String> cbDepartamento;
    private javax.swing.JComboBox<String> cbEscolaridad;
    private javax.swing.JComboBox<String> cbEstadoCiv;
    private javax.swing.JComboBox<String> cbEstatus;
    private javax.swing.JComboBox<String> cbPuesto;
    private javax.swing.JComboBox<String> cbSucursal;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JComboBox<String> cbTurno;
    private com.toedter.calendar.JDateChooser fechaContratacion;
    private com.toedter.calendar.JDateChooser fechaNacimiento;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblInsertar;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JLabel lblSesion;
    private javax.swing.JRadioButton rbF;
    private javax.swing.JRadioButton rbM;
    private javax.swing.JTable tbEmpleados;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNss;
    private javax.swing.JTextField txtPaterno;
    private javax.swing.JTextField txtPermiso;
    private javax.swing.JTextField txtRuta;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtVacaciones;
    // End of variables declaration//GEN-END:variables
}
