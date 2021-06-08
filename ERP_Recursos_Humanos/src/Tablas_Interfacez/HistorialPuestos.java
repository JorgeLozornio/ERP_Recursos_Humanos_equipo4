package Tablas_Interfacez;

import TablasDAO.HistorialPuestosDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class HistorialPuestos extends javax.swing.JFrame {

    HistorialPuestosDAO t;
    Connection con;
    String us;

    public HistorialPuestos(Connection c, String u) throws SQLException {
        con = c;
        us = u;
        HistorialPuestosDAO tu = new HistorialPuestosDAO(con);
        t = tu;
        initComponents();
        llenarComboEmpleados();
        llenarComboPuestos();
        llenarComboDepartamentos();
        jTableHP.setModel(t.consultaDatos());

    }

    public void llenarComboEmpleados() {
        t.llenarComboE(jComboBoxEmpleado, 1);
    }

    public void llenarComboPuestos() {
        t.llenarComboP(jComboBoxPuesto, 1);
    }

    public void llenarComboDepartamentos() {
        t.llenarComboD(jComboBoxDepartamento, 1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelEmpleado = new javax.swing.JLabel();
        jComboBoxEmpleado = new javax.swing.JComboBox<>();
        jLabelPuesto = new javax.swing.JLabel();
        jComboBoxPuesto = new javax.swing.JComboBox<>();
        jLabelDepartamento = new javax.swing.JLabel();
        jComboBoxDepartamento = new javax.swing.JComboBox<>();
        jLabelFechaInicio = new javax.swing.JLabel();
        fechaInicio = new com.toedter.calendar.JDateChooser();
        jLabelFechaFin = new javax.swing.JLabel();
        fechaFin = new com.toedter.calendar.JDateChooser();
        jTxtAgregar = new javax.swing.JLabel();
        jLabelAgregar = new javax.swing.JLabel();
        jTxtActualizar = new javax.swing.JLabel();
        jLabelActualizar = new javax.swing.JLabel();
        jTxtEliminar = new javax.swing.JLabel();
        jLabelEliminar = new javax.swing.JLabel();
        jTxtRegresar = new javax.swing.JLabel();
        jLabelRegresar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHP = new javax.swing.JTable();
        jLabelBuscar = new javax.swing.JLabel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jLabelSombra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Historial puestos");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 45));

        jLabelEmpleado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEmpleado.setText("Empleado");
        getContentPane().add(jLabelEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, -1));

        getContentPane().add(jComboBoxEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 160, -1));

        jLabelPuesto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPuesto.setText("Puesto");
        getContentPane().add(jLabelPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 80, -1));

        getContentPane().add(jComboBoxPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 160, -1));

        jLabelDepartamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDepartamento.setText("Departamento");
        getContentPane().add(jLabelDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, -1));

        getContentPane().add(jComboBoxDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 160, -1));

        jLabelFechaInicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFechaInicio.setText("Fecha de inicio");
        getContentPane().add(jLabelFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 140, 20));

        fechaInicio.setDateFormatString("yyyy/MM/dd");
        getContentPane().add(fechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 160, -1));

        jLabelFechaFin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFechaFin.setText("Fecha de fin");
        getContentPane().add(jLabelFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 130, -1));

        fechaFin.setDateFormatString("yyyy/MM/dd");
        getContentPane().add(fechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 160, -1));

        jTxtAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jTxtAgregar.setText("Agregar");
        jTxtAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtAgregarMouseClicked(evt);
            }
        });
        getContentPane().add(jTxtAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 80, 30));

        jLabelAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonV.png"))); // NOI18N
        getContentPane().add(jLabelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jTxtActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jTxtActualizar.setText("Actualizar");
        getContentPane().add(jTxtActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 300, 100, 50));

        jLabelActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonAzul.png"))); // NOI18N
        getContentPane().add(jLabelActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, 30));

        jTxtEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jTxtEliminar.setText("Eliminar");
        getContentPane().add(jTxtEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 70, 70));

        jLabelEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRojo.png"))); // NOI18N
        getContentPane().add(jLabelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        jTxtRegresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jTxtRegresar.setText("Regresar");
        jTxtRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtRegresarMouseClicked(evt);
            }
        });
        getContentPane().add(jTxtRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 100, 30));

        jLabelRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRosa.png"))); // NOI18N
        getContentPane().add(jLabelRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jTableHP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableHP);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, 110));

        jLabelBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelBuscar.setText("Buscar:");
        getContentPane().add(jLabelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, 30));
        getContentPane().add(jTextFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 390, 30));

        jLabelSombra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/SombraLogin.png"))); // NOI18N
        getContentPane().add(jLabelSombra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 0, 440, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtRegresarMouseClicked
        MenuTablas m = new MenuTablas(con, us);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jTxtRegresarMouseClicked

    private void jTxtAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtAgregarMouseClicked
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy/MM/dd");
        String fi = dFormat.format(fechaInicio.getDate());
        String ff = dFormat.format(fechaFin.getDate());
        t.insertarDatos(jComboBoxEmpleado.getSelectedIndex(), jComboBoxPuesto.getSelectedIndex(), jComboBoxDepartamento.getSelectedIndex(), fi, ff);
        // Manda a llamar el metodo: limpiar()
        //limpiar();
    }//GEN-LAST:event_jTxtAgregarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fechaFin;
    private com.toedter.calendar.JDateChooser fechaInicio;
    private javax.swing.JComboBox<String> jComboBoxDepartamento;
    private javax.swing.JComboBox<String> jComboBoxEmpleado;
    private javax.swing.JComboBox<String> jComboBoxPuesto;
    private javax.swing.JLabel jLabelActualizar;
    private javax.swing.JLabel jLabelAgregar;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelDepartamento;
    private javax.swing.JLabel jLabelEliminar;
    private javax.swing.JLabel jLabelEmpleado;
    private javax.swing.JLabel jLabelFechaFin;
    private javax.swing.JLabel jLabelFechaInicio;
    private javax.swing.JLabel jLabelPuesto;
    private javax.swing.JLabel jLabelRegresar;
    private javax.swing.JLabel jLabelSombra;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableHP;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JLabel jTxtActualizar;
    private javax.swing.JLabel jTxtAgregar;
    private javax.swing.JLabel jTxtEliminar;
    private javax.swing.JLabel jTxtRegresar;
    // End of variables declaration//GEN-END:variables
}
