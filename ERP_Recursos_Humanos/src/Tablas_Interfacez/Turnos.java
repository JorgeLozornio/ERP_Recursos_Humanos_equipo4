/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas_Interfacez;

import Herramientas.Sesion;
import Interfaz.Login;
import Paginacion.Paginacion;
import Reloj.Reloj;
import TablasDAO.TurnosDAO;
import erp_recursos_humanos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lozy
 */
public class Turnos extends javax.swing.JFrame {

    
    TurnosDAO t;
    Connection con;
    String us;
    int i=0;
    int inicio=0;
    int fin=5;
    int limit;
    //int limit = p.getLimit("Turnos", fin);
    
    public Turnos(Connection c, String u) throws SQLException {
        con = c;
        us = u;
        TurnosDAO tu = new TurnosDAO(con);
        t = tu;
        initComponents();
        Reloj h = new Reloj(cerrarSesion, u);
        h.start();
        this.setLocationRelativeTo(null);
        tbTurnos.setModel(t.mostrarDatos(inicio, fin));
        Paginacion p = new Paginacion(con);
        limit = getLimit(Integer.parseInt(p.count("Turnos")), fin);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTurnos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbHora1 = new javax.swing.JComboBox<>();
        cbEstatus = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbHora2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        chbLunes = new javax.swing.JCheckBox();
        chbMartes = new javax.swing.JCheckBox();
        chbMiercoles = new javax.swing.JCheckBox();
        chbJueves = new javax.swing.JCheckBox();
        chbViernes = new javax.swing.JCheckBox();
        chbSabado = new javax.swing.JCheckBox();
        chbDomingo = new javax.swing.JCheckBox();
        btnBuscar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        cerrarSesion = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        lblReloj = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblReloj2 = new javax.swing.JLabel();
        barra = new javax.swing.JLabel();
        btnEditar = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JLabel();
        btnCrear = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1080, 600));
        setMinimumSize(new java.awt.Dimension(1080, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1080, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(0, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(153, 153, 255));

        tbTurnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Hora Inicio", "Hora Fin", "Dias"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTurnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTurnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTurnos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 680, 320));

        jLabel2.setFont(new java.awt.Font("Humanst521 BT", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Turnos");
        jLabel2.setMaximumSize(new java.awt.Dimension(33, 30));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Humanst521 BT", 1, 18)); // NOI18N
        jLabel1.setText("Buscar:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 239, -1));

        jLabel3.setFont(new java.awt.Font("Humanst521 BT", 1, 18)); // NOI18N
        jLabel3.setText("Hora Inicio:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        cbHora1.setFont(new java.awt.Font("Humanst521 BT", 0, 11)); // NOI18N
        cbHora1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00:00:00", "01:00:00", "02:00:00", "03:00:00", "04:00:00", "05:00:00", "06:00:00", "07:00:00", "08:00:00", "09:00:00", "10:00:00", "11:00:00", "12:00:00", "13:00:00", "14:00:00", "15:00:00", "16:00:00", "17:00:00", "18:00:00", "19:00:00", "20:00:00", "21:00:00", "22:00:00", "23:00:00" }));
        getContentPane().add(cbHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 70, -1));

        cbEstatus.setFont(new java.awt.Font("Humanst521 BT", 0, 11)); // NOI18N
        cbEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "I" }));
        getContentPane().add(cbEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));

        jLabel13.setFont(new java.awt.Font("Humanst521 BT", 1, 18)); // NOI18N
        jLabel13.setText("Estatus:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        jLabel5.setFont(new java.awt.Font("Humanst521 BT", 1, 18)); // NOI18N
        jLabel5.setText("Hora Fin: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        cbHora2.setFont(new java.awt.Font("Humanst521 BT", 0, 11)); // NOI18N
        cbHora2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00:00:00", "01:00:00", "02:00:00", "03:00:00", "04:00:00", "05:00:00", "06:00:00", "07:00:00", "08:00:00", "09:00:00", "10:00:00", "11:00:00", "12:00:00", "13:00:00", "14:00:00", "15:00:00", "16:00:00", "17:00:00", "18:00:00", "19:00:00", "20:00:00", "21:00:00", "22:00:00", "23:00:00" }));
        getContentPane().add(cbHora2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 70, -1));

        jLabel7.setFont(new java.awt.Font("Humanst521 BT", 1, 18)); // NOI18N
        jLabel7.setText("Dias:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        chbLunes.setBackground(new java.awt.Color(255, 255, 255));
        chbLunes.setFont(new java.awt.Font("Humanst521 BT", 0, 14)); // NOI18N
        chbLunes.setText("Lunes");
        getContentPane().add(chbLunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        chbMartes.setBackground(new java.awt.Color(255, 255, 255));
        chbMartes.setFont(new java.awt.Font("Humanst521 BT", 0, 14)); // NOI18N
        chbMartes.setText("Martes");
        getContentPane().add(chbMartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        chbMiercoles.setBackground(new java.awt.Color(255, 255, 255));
        chbMiercoles.setFont(new java.awt.Font("Humanst521 BT", 0, 14)); // NOI18N
        chbMiercoles.setText("Miercoles");
        getContentPane().add(chbMiercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        chbJueves.setBackground(new java.awt.Color(255, 255, 255));
        chbJueves.setFont(new java.awt.Font("Humanst521 BT", 0, 14)); // NOI18N
        chbJueves.setText("Jueves");
        getContentPane().add(chbJueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        chbViernes.setBackground(new java.awt.Color(255, 255, 255));
        chbViernes.setFont(new java.awt.Font("Humanst521 BT", 0, 14)); // NOI18N
        chbViernes.setText("Viernes");
        getContentPane().add(chbViernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        chbSabado.setBackground(new java.awt.Color(255, 255, 255));
        chbSabado.setFont(new java.awt.Font("Humanst521 BT", 0, 14)); // NOI18N
        chbSabado.setText("Sabado");
        getContentPane().add(chbSabado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        chbDomingo.setBackground(new java.awt.Color(255, 255, 255));
        chbDomingo.setFont(new java.awt.Font("Humanst521 BT", 0, 14)); // NOI18N
        chbDomingo.setText("Domingo");
        getContentPane().add(chbDomingo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, 110, -1));

        jLabel9.setFont(new java.awt.Font("Humanst521 BT", 1, 18)); // NOI18N
        jLabel9.setText("Nombre: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyTyped(evt);
            }
        });
        getContentPane().add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 290, -1));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Humanst521 BT", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Regresar");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 80, 30));

        cerrarSesion.setFont(new java.awt.Font("Humanst521 BT", 1, 14)); // NOI18N
        cerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        cerrarSesion.setText("Cerrar Sesión");
        cerrarSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesionMouseClicked(evt);
            }
        });
        getContentPane().add(cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Humanst521 BT", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Eliminar");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 80, 30));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Humanst521 BT", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Editar");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 80, 30));

        btnAtras.setText("<");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, -1, -1));

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
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 440, -1, -1));

        lblReloj.setFont(new java.awt.Font("Humanst521 BT", 1, 14)); // NOI18N
        lblReloj.setForeground(new java.awt.Color(255, 255, 255));
        lblReloj.setText("lorem");
        getContentPane().add(lblReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Cruz.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, -1, -1));

        lblReloj2.setFont(new java.awt.Font("Humanst521 BT", 1, 14)); // NOI18N
        lblReloj2.setForeground(new java.awt.Color(255, 255, 255));
        lblReloj2.setText("lorem");
        getContentPane().add(lblReloj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        barra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Barra.png"))); // NOI18N
        barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraMouseDragged(evt);
            }
        });
        barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraMousePressed(evt);
            }
        });
        getContentPane().add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonAzul.png"))); // NOI18N
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, -1, -1));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRosa.png"))); // NOI18N
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Humanst521 BT", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Crear");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 80, 30));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRojo.png"))); // NOI18N
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, -1, -1));

        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonV.png"))); // NOI18N
        btnCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearMouseClicked(evt);
            }
        });
        getContentPane().add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Sombra2.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -10, 440, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/FondoBlanco.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void tbTurnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTurnosMouseClicked
        
        limpiar();
        int fila = tbTurnos.rowAtPoint(evt.getPoint());
        String ca;
        
        txtNombre.setText(tbTurnos.getValueAt(fila,1).toString());
        cbHora1.setSelectedItem(tbTurnos.getValueAt(fila,2));
        cbHora2.setSelectedItem(tbTurnos.getValueAt(fila,3));
        ca = tbTurnos.getValueAt(fila,4).toString();
        if(ca.contains("L")){
            chbLunes.setSelected(true);
        }
        if(ca.contains("M")){
            chbMartes.setSelected(true);
        }
        if(ca.contains("W")){
            chbMiercoles.setSelected(true);
        }
        if(ca.contains("J")){
            chbJueves.setSelected(true);
        }
        if(ca.contains("V")){
            chbViernes.setSelected(true);
        }
        if(ca.contains("S")){
            chbSabado.setSelected(true);
        }
        if(ca.contains("D")){
            chbDomingo.setSelected(true);
        }
        cbEstatus.setSelectedItem(tbTurnos.getValueAt(fila, 5));
        
    }//GEN-LAST:event_tbTurnosMouseClicked

    private void barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_barraMouseDragged
    int xx, xy;
    private void barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_barraMousePressed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.setVisible(false);
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btnCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseClicked
        if(verificar()){
            t.insertar(txtNombre.getText(), cbHora1.getSelectedIndex()+":00", cbHora2.getSelectedIndex()+":00", ch(), cbEstatus.getSelectedItem().toString());
            tbTurnos.setModel(t.mostrarDatos(inicio, fin));
            limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "Los campos han sido rellenados de forma incorrecta");
        }
        
    }//GEN-LAST:event_btnCrearMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        if(verificar()){   
            int fila = tbTurnos.getSelectedRow();
            String m = (String)tbTurnos.getValueAt(fila, 0);
            t.actualizar(txtNombre.getText(), cbHora1.getSelectedIndex()+":00", cbHora2.getSelectedIndex()+":00", ch(), cbEstatus.getSelectedItem().toString(), m);
            tbTurnos.setModel(t.mostrarDatos(inicio, fin));
            limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "Los campos han sido rellenados de forma incorrecta");
        }
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        if(verificar()){ 
            int fila = tbTurnos.getSelectedRow();
            String [] op = {"Si","No"};
            String id = ""+tbTurnos.getValueAt(fila, 0);
            int b = JOptionPane.showOptionDialog(null,"¿Deseas eliminar este registro?",
                    "Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, op,op[0]);
            if(b == 0){
                t.eliminar(id);
            }        
            limpiar();
            tbTurnos.setModel(t.mostrarDatos(inicio, fin));
        }else{
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun registro");
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        MenuTablas m = new MenuTablas(con, us);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        tbTurnos.setModel(t.busqueda(txtBusqueda.getText()));
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyTyped
        
    }//GEN-LAST:event_txtBusquedaKeyTyped

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        tbTurnos.setModel(t.busqueda(txtBusqueda.getText()));
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void btnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseClicked
       
    }//GEN-LAST:event_btnSiguienteMouseClicked

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
       if(inicio == limit*5){
           btnSiguiente.setEnabled(false);
       }else{
           btnAtras.setEnabled(true);
           inicio = inicio+5;
           tbTurnos.setModel(t.mostrarDatos(inicio, fin));
       }        
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        if(inicio == 0){
            btnAtras.setEnabled(false);
        }else{
            btnSiguiente.setEnabled(true);
            inicio = inicio - 5;
            tbTurnos.setModel(t.mostrarDatos(inicio, fin));
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void cerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionMouseClicked
        Sesion s = new Sesion(con);
        if(s.cerrarSesion()){
            Login l = new Login();
            l.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_cerrarSesionMouseClicked

    
    public void limpiar(){
        txtNombre.setText(null);
        cbHora1.setSelectedIndex(0);
        cbHora2.setSelectedIndex(0);
        chbLunes.setSelected(false);        
        chbMartes.setSelected(false);        
        chbMiercoles.setSelected(false);       
        chbJueves.setSelected(false);      
        chbViernes.setSelected(false);       
        chbSabado.setSelected(false);       
        chbDomingo.setSelected(false);
        cbEstatus.setSelectedIndex(0);
    }
    
    public String ch(){
        String ca="";
        
            
            if(chbLunes.isSelected()){
                ca = "L ";
                i++;
            }
            if(chbMartes.isSelected()){
                ca = ca + "M ";
                i++;
            }
            if(chbMiercoles.isSelected()){
                ca = ca + "W ";
                i++;
            }
            if(chbJueves.isSelected()){
                ca = ca + "J ";
                i++;
            }
            if(chbViernes.isSelected()){
                ca = ca + "V ";
                i++;
            }
            if(chbSabado.isSelected()){
                ca = ca + "S ";
                i++;
            }
            if(chbDomingo.isSelected()){
                ca = ca + "D ";
                i++;
            }
        return ca;
    }
    
    public boolean verificar(){
        cont();
        if(txtNombre.getText().equals("")|cbHora1.getSelectedIndex()==cbHora2.getSelectedIndex()|i<5|i>6){
            i=0;
            return false;
        }else{
            i=0;
            return true;
        }                
    }
    
    public void cont(){
        
            
            if(chbLunes.isSelected()){
                i++;
            }
            if(chbMartes.isSelected()){
                i++;
            }
            if(chbMiercoles.isSelected()){
                i++;
            }
            if(chbJueves.isSelected()){
                i++;
            }
            if(chbViernes.isSelected()){
                i++;
            }
            if(chbSabado.isSelected()){
                i++;
            }
            if(chbDomingo.isSelected()){
                i++;
            }
    }
    
    public int getLimit(int n, int lim){        
        limit = (int) Math.ceil(n/lim);
        System.out.println(n +" "+ limit);
        return limit;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel barra;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel btnCrear;
    private javax.swing.JLabel btnEditar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnRegresar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> cbEstatus;
    private javax.swing.JComboBox<String> cbHora1;
    private javax.swing.JComboBox<String> cbHora2;
    private javax.swing.JLabel cerrarSesion;
    private javax.swing.JCheckBox chbDomingo;
    private javax.swing.JCheckBox chbJueves;
    private javax.swing.JCheckBox chbLunes;
    private javax.swing.JCheckBox chbMartes;
    private javax.swing.JCheckBox chbMiercoles;
    private javax.swing.JCheckBox chbSabado;
    private javax.swing.JCheckBox chbViernes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JLabel lblReloj2;
    private javax.swing.JTable tbTurnos;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
