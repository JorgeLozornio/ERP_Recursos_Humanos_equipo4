package Tablas_Interfacez;

import Herramientas.Sesion;
import Interfaz.Login;
import Paginacion.Paginacion;
import Reloj.Reloj;
import TablasDAO.HistorialPuestosDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class HistorialPuestos extends javax.swing.JFrame {

    HistorialPuestosDAO t;
    Connection con;
    String us;
    int inicio=0;
    int fin=5;
    int limit;

    public HistorialPuestos(Connection c, String u) throws SQLException {
        con = c;
        us = u;
        HistorialPuestosDAO tu = new HistorialPuestosDAO(con);
        t = tu;
        initComponents();
        this.setLocationRelativeTo(null);
        llenarComboEmpleados();
        llenarComboPuestos();
        llenarComboDepartamentos();
        Reloj h = new Reloj(lblReloj, u);
        h.start();
        tbHistorial.setModel(t.consultaDatos(inicio, fin));
        Paginacion p = new Paginacion(con);
        limit = getLimit(Integer.parseInt(p.count("HistorialPuestos")), fin);

    }

    public void llenarComboEmpleados() {
        t.llenarComboE(cbEmpleado, 1);
    }

    public void llenarComboPuestos() {
        t.llenarComboP(cbPuesto, 1);
    }

    public void llenarComboDepartamentos() {
        t.llenarComboD(cbDepartamento, 1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblReloj = new javax.swing.JLabel();
        lblBarra = new javax.swing.JLabel();
        cbEstatus = new javax.swing.JComboBox<>();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelEmpleado = new javax.swing.JLabel();
        cbEmpleado = new javax.swing.JComboBox<>();
        jLabelFechaFin2 = new javax.swing.JLabel();
        jLabelPuesto = new javax.swing.JLabel();
        cbPuesto = new javax.swing.JComboBox<>();
        jLabelDepartamento = new javax.swing.JLabel();
        cbDepartamento = new javax.swing.JComboBox<>();
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
        tbHistorial = new javax.swing.JTable();
        jLabelBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabelSombra = new javax.swing.JLabel();
        jLabelFechaFin1 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1080, 600));
        setMinimumSize(new java.awt.Dimension(1080, 600));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Cruz.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cerrar Sesión");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, -1, -1));

        lblReloj.setBackground(new java.awt.Color(255, 255, 255));
        lblReloj.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 14)); // NOI18N
        lblReloj.setForeground(new java.awt.Color(255, 255, 255));
        lblReloj.setText("Lorem");
        getContentPane().add(lblReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblBarra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Barra.png"))); // NOI18N
        lblBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblBarraMouseDragged(evt);
            }
        });
        lblBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBarraMousePressed(evt);
            }
        });
        getContentPane().add(lblBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        cbEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "I" }));
        getContentPane().add(cbEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 160, -1));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Historial puestos");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 320, 45));

        jLabelEmpleado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEmpleado.setText("Empleado");
        getContentPane().add(jLabelEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 80, -1));

        getContentPane().add(cbEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 160, -1));

        jLabelFechaFin2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFechaFin2.setText("Fecha de fin");
        getContentPane().add(jLabelFechaFin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 130, -1));

        jLabelPuesto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPuesto.setText("Puesto");
        getContentPane().add(jLabelPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 80, -1));

        cbPuesto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbPuestoItemStateChanged(evt);
            }
        });
        cbPuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbPuestoMouseClicked(evt);
            }
        });
        cbPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPuestoActionPerformed(evt);
            }
        });
        getContentPane().add(cbPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 160, -1));

        jLabelDepartamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDepartamento.setText("Departamento");
        getContentPane().add(jLabelDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 120, -1));

        getContentPane().add(cbDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 160, -1));

        jLabelFechaInicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFechaInicio.setText("Fecha de inicio");
        getContentPane().add(jLabelFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 140, 20));

        fechaInicio.setDateFormatString("yyyy/MM/dd");
        getContentPane().add(fechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 160, -1));

        jLabelFechaFin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFechaFin.setText("Fecha de fin");
        getContentPane().add(jLabelFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 130, -1));

        fechaFin.setDateFormatString("yyyy/MM/dd");
        getContentPane().add(fechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 160, -1));

        jTxtAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jTxtAgregar.setText("Agregar");
        jTxtAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtAgregarMouseClicked(evt);
            }
        });
        getContentPane().add(jTxtAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 80, 30));

        jLabelAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonV.png"))); // NOI18N
        getContentPane().add(jLabelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        jTxtActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jTxtActualizar.setText("Actualizar");
        jTxtActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtActualizarMouseClicked(evt);
            }
        });
        getContentPane().add(jTxtActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 80, 50));

        jLabelActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonAzul.png"))); // NOI18N
        getContentPane().add(jLabelActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, -1, 30));

        jTxtEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jTxtEliminar.setText("Eliminar");
        jTxtEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtEliminarMouseClicked(evt);
            }
        });
        getContentPane().add(jTxtEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 70, 70));

        jLabelEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRojo.png"))); // NOI18N
        getContentPane().add(jLabelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, -1, -1));

        jTxtRegresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jTxtRegresar.setText("Regresar");
        jTxtRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtRegresarMouseClicked(evt);
            }
        });
        getContentPane().add(jTxtRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 100, 30));

        jLabelRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRosa.png"))); // NOI18N
        getContentPane().add(jLabelRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        tbHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHistorialMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbHistorial);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 720, 110));

        jLabelBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelBuscar.setText("Buscar:");
        getContentPane().add(jLabelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, 30));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 660, 30));

        jLabelSombra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/SombraLogin.png"))); // NOI18N
        getContentPane().add(jLabelSombra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 0, 430, 600));

        jLabelFechaFin1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFechaFin1.setText("Fecha de fin");
        getContentPane().add(jLabelFechaFin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 130, -1));

        btnAtras.setText("<");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 60, 50));

        btnSiguiente.setText(">");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 60, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtRegresarMouseClicked
        MenuTablas m = new MenuTablas(con, us);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jTxtRegresarMouseClicked

    private void jTxtAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtAgregarMouseClicked
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy/MM/dd");
        String ca[] = cbEmpleado.getSelectedItem().toString().split("\\.");
        String cb[] = cbPuesto.getSelectedItem().toString().split("\\.");
        String cc[] = cbDepartamento.getSelectedItem().toString().split("\\.");
        String fi = dFormat.format(fechaInicio.getDate());
        String ff = dFormat.format(fechaFin.getDate());
        if (cbEmpleado.getSelectedIndex() == -1 || cbPuesto.getSelectedIndex() == -1 || cbDepartamento.getSelectedIndex() == -1 || fechaInicio.getDate() == null || fechaFin.getDate() == null || verificar() == false) {
            JOptionPane.showMessageDialog(null, "Error: Debes de rellenar todos los campos");
        } else {
            t.insertarDatos(ca[0], ca[0], cc[0], fi, ff, cbEstatus.getSelectedItem().toString());
            // Manda a llamar el metodo: limpiar()
            limpiar();
            //Ejecute el metodo: consultaDatos, para cuando se agrega un campo
            tbHistorial.setModel(t.consultaDatos(inicio, fin));
        }
    }//GEN-LAST:event_jTxtAgregarMouseClicked

    private void jTxtActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtActualizarMouseClicked
        int fila = tbHistorial.getSelectedRow();
        String ca[] = cbEmpleado.getSelectedItem().toString().split("\\.");
        String cb[] = cbPuesto.getSelectedItem().toString().split("\\.");
        String cc[] = cbDepartamento.getSelectedItem().toString().split("\\.");
        String id1 = (String) tbHistorial.getValueAt(fila, 0);
        String id2 = (String) tbHistorial.getValueAt(fila, 1);
        String id3 = (String) tbHistorial.getValueAt(fila, 2);
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy/MM/dd");
        String fi = dFormat.format(fechaInicio.getDate());
        String ff = dFormat.format(fechaFin.getDate());
        if(fechaInicio.getDate() == null || fechaFin.getDate() == null || verificar() == false){
           JOptionPane.showMessageDialog(null, "Error: Debes de rellenar todos los campos"); 
        } else {
        t.actualizar(fi, ff, cbEstatus.getSelectedItem().toString(), ca[0], cb[0], cc[0]);
        // Manda a llamar el metodo: limpiar()
        limpiar();
        //Ejecute el metodo: consultaDatos, para cuando se agrega un campo
        tbHistorial.setModel(t.consultaDatos(inicio, fin));
        }
    }//GEN-LAST:event_jTxtActualizarMouseClicked

    private void tbHistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHistorialMouseClicked
        
        
        int fila = tbHistorial.getSelectedRow();
        String r[];
        String id1 = (String)tbHistorial.getValueAt(fila, 0);
        String id2 = (String)tbHistorial.getValueAt(fila, 1);
        String id3 = (String)tbHistorial.getValueAt(fila, 2);
        
        for(int i = 0; i < cbEmpleado.getItemCount(); i++){
            System.out.println(cbEmpleado.getItemAt(i)+" "+id1);
            String ca[] = cbEmpleado.getItemAt(i).toString().split("\\.");
            StringBuilder sb = new StringBuilder(ca[1]);
            ca[1] = sb.delete(0, 2).toString();
            System.out.println(ca[0] + " " + ca[1] + " = "+id1);

            if(ca[1].equals(id1)){
                System.out.println(ca[0]);
                id1 = ca[0];
            }            
        }
        
        for(int i = 0; i < cbPuesto.getItemCount(); i++){
            System.out.println(cbPuesto.getItemAt(i)+" "+id2);
            String ca[] = cbPuesto.getItemAt(i).toString().split("\\.");
            StringBuilder sb = new StringBuilder(ca[1]);
            ca[1] = sb.delete(0, 2).toString();
            System.out.println(ca[0] + " " + ca[1] + " = "+id2);

            if(ca[1].equals(id2)){
                System.out.println(ca[0]);
                id2 = ca[0];
            }            
        }
        
        for(int i = 0; i < cbDepartamento.getItemCount(); i++){
            System.out.println(cbDepartamento.getItemAt(i)+" "+id3);
            String ca[] = cbDepartamento.getItemAt(i).toString().split("\\.");
            StringBuilder sb = new StringBuilder(ca[1]);
            ca[1] = sb.delete(0, 2).toString();
            System.out.println(ca[0] + " " + ca[1] + " = "+id3);

            if(ca[1].equals(id3)){
                System.out.println(ca[0]);
                id3 = ca[0];
            }            
        }
        
        r = t.busquedaIndividual(id1, id2, id3);
        
        for(int i = 0; i < cbEmpleado.getItemCount(); i++){
            System.out.println(cbEmpleado.getItemAt(i)+" "+r[0]);
            String ca[] = cbEmpleado.getItemAt(i).toString().split("\\.");

            if(ca[0].equals(r[0])){
                cbEmpleado.setSelectedIndex(i);
            }            
        }
        
        for(int i = 0; i < cbPuesto.getItemCount(); i++){
            System.out.println(cbPuesto.getItemAt(i)+" "+r[1]);
            String ca[] = cbPuesto.getItemAt(i).toString().split("\\.");

            if(ca[0].equals(r[1])){
                cbPuesto.setSelectedIndex(i);
            }            
        }
        
        for(int i = 0; i < cbDepartamento.getItemCount(); i++){
            System.out.println(cbDepartamento.getItemAt(i)+" "+r[2]);
            String ca[] = cbDepartamento.getItemAt(i).toString().split("\\.");

            if(ca[0].equals(r[2])){
                cbDepartamento.setSelectedIndex(i);
            }            
        }
        
        for(int i = 0; i < cbEstatus.getItemCount(); i++){
            System.out.println(cbEstatus.getItemAt(i)+" "+r[5]);
            if(cbEstatus.getItemAt(i).equals(r[5])){
                cbEstatus.setSelectedIndex(i);
            }            
        }
        
        
        try{
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)tbHistorial.getValueAt(fila,3));          
            fechaInicio.setDate(date);
        }catch(ParseException ex){
            
        }
        
        try{
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)tbHistorial.getValueAt(fila,4));          
            fechaFin.setDate(date);
        }catch(ParseException ex){
            
        }
        
        
        
    }//GEN-LAST:event_tbHistorialMouseClicked

    private void jTxtEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtEliminarMouseClicked
        
        String [] op = {"Si","No"};
        String ca[] = cbEmpleado.getSelectedItem().toString().split("\\.");
        String cb[] = cbPuesto.getSelectedItem().toString().split("\\.");
        String cc[] = cbDepartamento.getSelectedItem().toString().split("\\.");
        if(verificar()){ 
            
            int b = JOptionPane.showOptionDialog(null,"¿Deseas eliminar este registro?",
                    "Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, op,op[0]);
            if(b == 0){
                t.eliminar(ca[0], cb[0], cc[0]);
            }        
            limpiar();
            tbHistorial.setModel(t.consultaDatos(inicio, fin));
        }else{
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun registro");
        }
        
        
    }//GEN-LAST:event_jTxtEliminarMouseClicked

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
       if(inicio == 0){
            btnAtras.setEnabled(false);
        }else{
            btnSiguiente.setEnabled(true);
            inicio = inicio - 5;
            tbHistorial.setModel(t.consultaDatos(inicio, fin));
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if(inicio == limit*5){
           btnSiguiente.setEnabled(false);
       }else{
           btnAtras.setEnabled(true);
           inicio = inicio+5;
           tbHistorial.setModel(t.consultaDatos(inicio, fin));
       }   
    }//GEN-LAST:event_btnSiguienteActionPerformed
    int xx, xy;
    private void lblBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarraMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_lblBarraMousePressed

    private void lblBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_lblBarraMouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Sesion s = new Sesion(con);
        if(s.cerrarSesion()){
            Login l = new Login();
            l.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setVisible(false);
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        tbHistorial.setModel(t.busqueda(inicio, fin, txtBuscar.getText()));
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void cbPuestoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbPuestoItemStateChanged
        
        
    }//GEN-LAST:event_cbPuestoItemStateChanged

    private void cbPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPuestoActionPerformed
        
    }//GEN-LAST:event_cbPuestoActionPerformed

    private void cbPuestoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbPuestoMouseClicked
        
    }//GEN-LAST:event_cbPuestoMouseClicked

    public boolean verificar(){
        if (fechaInicio.getDate().after(fechaFin.getDate())){
            System.out.println("Fecha inicio es mayor");
            return false;
        }else{
            System.out.println("Fecha inicio es menor");
            return true;
        }
    }
    
    public void limpiar() {
        cbEmpleado.setSelectedItem(0);
        cbPuesto.setSelectedItem(0);
        cbDepartamento.setSelectedItem(0);
        fechaInicio.setDate(null);
        fechaFin.setDate(null);
    }
    
    public int getLimit(int n, int lim){        
        limit = (int) Math.ceil(n/lim);
        System.out.println(n +" "+ limit);
        return limit;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> cbDepartamento;
    private javax.swing.JComboBox<String> cbEmpleado;
    private javax.swing.JComboBox<String> cbEstatus;
    private javax.swing.JComboBox<String> cbPuesto;
    private com.toedter.calendar.JDateChooser fechaFin;
    private com.toedter.calendar.JDateChooser fechaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelActualizar;
    private javax.swing.JLabel jLabelAgregar;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelDepartamento;
    private javax.swing.JLabel jLabelEliminar;
    private javax.swing.JLabel jLabelEmpleado;
    private javax.swing.JLabel jLabelFechaFin;
    private javax.swing.JLabel jLabelFechaFin1;
    private javax.swing.JLabel jLabelFechaFin2;
    private javax.swing.JLabel jLabelFechaInicio;
    private javax.swing.JLabel jLabelPuesto;
    private javax.swing.JLabel jLabelRegresar;
    private javax.swing.JLabel jLabelSombra;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTxtActualizar;
    private javax.swing.JLabel jTxtAgregar;
    private javax.swing.JLabel jTxtEliminar;
    private javax.swing.JLabel jTxtRegresar;
    private javax.swing.JLabel lblBarra;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JTable tbHistorial;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
