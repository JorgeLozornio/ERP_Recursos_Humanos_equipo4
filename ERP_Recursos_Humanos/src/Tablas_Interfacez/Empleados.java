
package Tablas_Interfacez;

import Paginacion.Paginacion;
import Reloj.Reloj;
import TablasDAO.EmpleadosDAO;
import java.sql.Connection;
import java.sql.SQLException;


public class Empleados extends javax.swing.JFrame {

    EmpleadosDAO t;
    Connection con;
    String us;
    int i=0;
    int inicio=0;
    int fin=5;
    int limit;
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
        //tbEmpleados.setModel(t.mostrarDatos(inicio, fin));
        Paginacion p = new Paginacion(con);
        //limit = getLimit(Integer.parseInt(p.count("Turnos")), fin);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblReloj = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
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
        jLabel15 = new javax.swing.JLabel();
        txtNss = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtVacaciones = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtPermiso = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtCP = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        cbEscolaridad = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JTextField();
        btnFoto = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        jLabel25 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        cbEstatus = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        cbDepartamento = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        cbPuesto = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        cbCiudad = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        cbSucursal = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        cbTurno = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Cruz.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel5.setText("Turno:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Barra.png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 150, -1));

        jLabel6.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel6.setText("Nombre:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        getContentPane().add(txtColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 160, -1));

        jLabel7.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel7.setText("Apellido paterno:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        getContentPane().add(txtPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 140, -1));

        jLabel8.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel8.setText("Apellido materno:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        rbM.setText("Masculino");
        getContentPane().add(rbM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        rbF.setText("Femenino");
        getContentPane().add(rbF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        jLabel9.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel9.setText("Sexo:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
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
        getContentPane().add(fechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 110, -1));

        jLabel13.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel13.setText("Fecha de contratación:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));
        getContentPane().add(txtCurp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 180, -1));

        jLabel14.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel14.setText("Salario diario:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 180, -1));

        jLabel15.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel15.setText("NSS:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));
        getContentPane().add(txtNss, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 180, -1));

        jLabel16.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel16.setText("Dias de vacaciones:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));
        getContentPane().add(txtVacaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 100, -1));

        jLabel17.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel17.setText("Dias de permio:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        jLabel18.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel18.setText("Fotografia:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));
        getContentPane().add(txtPermiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 120, -1));

        jLabel19.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel19.setText("Dirección:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 150, -1));

        jLabel20.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel20.setText("Colonia:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));
        getContentPane().add(txtCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 190, -1));

        jLabel21.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel21.setText("CP:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        cbEscolaridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primaria", "Secundaria", "Preparatoria", "Carrera universitaria", " " }));
        getContentPane().add(cbEscolaridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 140, -1));

        jLabel22.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel22.setText("Escolaridad:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));
        getContentPane().add(txtEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 140, -1));

        btnFoto.setText("Elegir archivo");
        getContentPane().add(btnFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 140, -1));

        jLabel23.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel23.setText("Especialidad:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 180, -1));

        jLabel24.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel24.setText("Email:");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));
        getContentPane().add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 140, -1));

        jLabel25.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel25.setText("Contraseña:");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", " " }));
        getContentPane().add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 180, -1));

        jLabel26.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel26.setText("Tipo:");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, -1));

        cbEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "I", " " }));
        getContentPane().add(cbEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 170, -1));

        jLabel27.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel27.setText("Estatus:");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        getContentPane().add(cbDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 130, -1));

        jLabel28.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel28.setText("Departamento:");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, -1, -1));

        getContentPane().add(cbPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 170, -1));

        jLabel29.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel29.setText("Puesto:");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, -1));

        getContentPane().add(cbCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 170, -1));

        jLabel30.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel30.setText("Ciudad:");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, -1));

        getContentPane().add(cbSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 160, -1));

        jLabel31.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel31.setText("Sucursal:");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, -1));

        getContentPane().add(cbTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 170, -1));

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
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 80, 80, 30));

        jLabel38.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Crear");
        jLabel38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 84, 80, 20));

        jLabel39.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Editar");
        jLabel39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 150, 80, 30));

        jLabel40.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Eliminar");
        jLabel40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, 80, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 1050, 140));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonAzul.png"))); // NOI18N
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 150, -1, -1));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRosa.png"))); // NOI18N
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 80, -1, -1));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRojo.png"))); // NOI18N
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, -1, -1));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonV.png"))); // NOI18N
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, -1, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/FondoBlanco.png"))); // NOI18N
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int xx, xy;
    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_jLabel1MouseDragged

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

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFoto;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JRadioButton rbF;
    private javax.swing.JRadioButton rbM;
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
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtVacaciones;
    // End of variables declaration//GEN-END:variables
}
