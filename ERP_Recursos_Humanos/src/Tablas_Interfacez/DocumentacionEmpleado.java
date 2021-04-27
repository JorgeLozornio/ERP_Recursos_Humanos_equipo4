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
/**
 *
 * @author Mino
 */
public class DocumentacionEmpleado extends javax.swing.JFrame {
 DocumentacionEmpleadoDAO t;
    Connection con;
    String us;
    int aE[];
    int i = 0;
    int inicio = 0;
    int fin = 5;
    int limit;
    /**
     * Creates new form DocumentacionEmpleado
     */
    public DocumentacionEmpleado(Connection c, String u)throws SQLException {
       con = c;
        us = u;
        DocumentacionEmpleadoDAO tu = new DocumentacionEmpleadoDAO(con);
        t = tu;
        initComponents();
        Reloj h = new Reloj(lblReloj, u);
        h.start();
        this.setLocationRelativeTo(null);
        tbDoc.setModel(t.consultaDatos(inicio, fin));
        Paginacion p = new Paginacion(con);
        limit = getLimit(Integer.parseInt(p.count("DocumentacionEmpleado")), fin);
        llenarComboEmpleado();
    }
public void llenarComboEmpleado() {
        t.llenarCombo(cbEmpleado, 1);
        int num = cbEmpleado.getItemCount();
        aE=new int[num];
        t.llenarArreglo(aE,1,num);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBuscar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txfNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txfDocumento = new javax.swing.JTextField();
        lblInsertar = new javax.swing.JLabel();
        lblActualizar = new javax.swing.JLabel();
        lblEliminar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbEstatus = new javax.swing.JComboBox();
        lblReloj = new javax.swing.JLabel();
        lblRegresar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDoc = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txfBuscar = new javax.swing.JTextField();
        dcEntrega = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        cbEmpleado = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBuscar.setBackground(new java.awt.Color(255, 255, 255));
        lblBuscar.setFont(new java.awt.Font("Humanst521 BT", 1, 14)); // NOI18N
        lblBuscar.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonAzul.png"))); // NOI18N
        lblBuscar.setText("Buscar...");
        lblBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMouseClicked(evt);
            }
        });
        getContentPane().add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 80, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Documentacion Empleado");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 44, -1, -1));

        jLabel2.setText("Nombre de documento:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 117, -1, -1));
        getContentPane().add(txfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 135, -1));

        jLabel3.setText("Fecha de entrega:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel4.setText("Documento:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 214, -1, -1));

        txfDocumento.setEditable(false);
        getContentPane().add(txfDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 135, -1));

        lblInsertar.setBackground(new java.awt.Color(255, 255, 255));
        lblInsertar.setFont(new java.awt.Font("Humanst521 BT", 1, 14)); // NOI18N
        lblInsertar.setForeground(new java.awt.Color(255, 255, 255));
        lblInsertar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonV.png"))); // NOI18N
        lblInsertar.setText("Insertar");
        lblInsertar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblInsertar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInsertarMouseClicked(evt);
            }
        });
        getContentPane().add(lblInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 80, 30));

        lblActualizar.setBackground(new java.awt.Color(255, 255, 255));
        lblActualizar.setFont(new java.awt.Font("Humanst521 BT", 1, 14)); // NOI18N
        lblActualizar.setForeground(new java.awt.Color(255, 255, 255));
        lblActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonAzul.png"))); // NOI18N
        lblActualizar.setText("Actualizar");
        lblActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblActualizarMouseClicked(evt);
            }
        });
        getContentPane().add(lblActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 80, 30));

        lblEliminar.setBackground(new java.awt.Color(255, 255, 255));
        lblEliminar.setFont(new java.awt.Font("Humanst521 BT", 1, 14)); // NOI18N
        lblEliminar.setForeground(new java.awt.Color(255, 255, 255));
        lblEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRojo.png"))); // NOI18N
        lblEliminar.setText("Eliminar");
        lblEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminarMouseClicked(evt);
            }
        });
        getContentPane().add(lblEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 80, 30));

        jLabel5.setText("Estatus:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 265, -1, -1));

        cbEstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "I" }));
        getContentPane().add(cbEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 135, -1));

        lblReloj.setText("lorem");
        getContentPane().add(lblReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

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
        getContentPane().add(lblRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, 80, 30));

        tbDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdDocumento", "Fecha de Entrega", "Documento", "Estatus", "IdEmpleado"
            }
        ));
        tbDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDoc);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 400, 280));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Buscar:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));

        txfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txfBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 230, -1));
        getContentPane().add(dcEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 130, -1));

        jLabel7.setText("Empleado:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        getContentPane().add(cbEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 130, -1));

        jLabel8.setText("Cerrar Sesion");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblInsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInsertarMouseClicked
        // TODO add your handling code here:
        
       if (txfNombre.getText().isEmpty() || txfDocumento.getText().isEmpty() || dcEntrega.getDate().toString().isEmpty() || cbEmpleado.getSelectedIndex()==-1) {
            JOptionPane.showMessageDialog(null, "Error: No dejes campos vacios");
        } else {
            int seleccionEstatus = cbEstatus.getSelectedIndex();
            int seleccionEmpleado = cbEmpleado.getSelectedIndex();
            t.insertarDatos(txfNombre.getText(), dcEntrega.getDate(), txfDocumento.getText(), cbEstatus.getItemAt(seleccionEstatus).toString(),aE[seleccionEmpleado]+1);
            limpiar();
            // Manda a llamar el metodo: consultaDatos()
            tbDoc.setModel(t.consultaDatos(inicio, fin));
        }
    }//GEN-LAST:event_lblInsertarMouseClicked

    private void lblActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseClicked
        // TODO add your handling code here:
        if (txfNombre.getText().isEmpty() || txfDocumento.getText().isEmpty() || dcEntrega.getDate().toString().isEmpty() || cbEmpleado.getSelectedIndex()==-1) {
            JOptionPane.showMessageDialog(null, "Error: No dejes campos vacios");
        } else {
             int seleccionEstatus = cbEstatus.getSelectedIndex();
            int seleccionEmpleado = cbEmpleado.getSelectedIndex();
            int fila = tbDoc.getSelectedRow();
            String m = (String) tbDoc.getValueAt(fila, 0);
            t.actualizar(txfNombre.getText(), dcEntrega.getDate(), txfDocumento.getText(), cbEstatus.getItemAt(seleccionEstatus).toString(),aE[seleccionEmpleado]+1,m);
            // Manda a llamar el metodo: consultaDatos()
            tbDoc.setModel(t.consultaDatos(inicio, fin));
            // Manda a llamar el metodo: limpiar()
            limpiar();
        }

    }//GEN-LAST:event_lblActualizarMouseClicked

    private void lblEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseClicked
        // TODO add your handling code here:
        if (txfNombre.getText().isEmpty() || txfDocumento.getText().isEmpty() || dcEntrega.getDate().toString().isEmpty() || cbEmpleado.getSelectedIndex()==-1) {
            JOptionPane.showMessageDialog(null, "Error: No dejes campos vacios");
        } else {
            int filaSeleccionada = tbDoc.getSelectedRow();
            String id = "" + tbDoc.getValueAt(filaSeleccionada, 0);
            t.eliminar(id);
            // Manda a llamar el metodo: consultaDatos()
            tbDoc.setModel(t.consultaDatos(inicio, fin));
            // Manda a llamar el metodo: limpiar()
            limpiar();
        }
    }//GEN-LAST:event_lblEliminarMouseClicked

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
        // TODO add your handling code here:
       JFileChooser fileChooser = new JFileChooser();
    fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
    int result = fileChooser.showOpenDialog(this);
    if (result != JFileChooser.CANCEL_OPTION) {
        File fileName = fileChooser.getSelectedFile();
        if ((fileName == null) || (fileName.getName().equals(""))) {
            txfDocumento.setText("...");
        } else {
            txfDocumento.setText(fileName.getAbsolutePath());
        }
    }
    }//GEN-LAST:event_lblBuscarMouseClicked

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
        // TODO add your handling code here:
        MenuTablas m = new MenuTablas(con, us);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblRegresarMouseClicked

    private void txfBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarKeyReleased
        // TODO add your handling code here:
       consultaIndividual(txfBuscar.getText());
    }//GEN-LAST:event_txfBuscarKeyReleased

    private void tbDocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDocMouseClicked
        // TODO add your handling code here:
        limpiar();
SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
Date fechaDate = null;
        int fila = tbDoc.rowAtPoint(evt.getPoint());
        String fecha = tbDoc.getValueAt(fila, 2).toString();
        try{
         fechaDate=formato.parse(fecha);
    } catch (ParseException ex){
        JOptionPane.showMessageDialog(null, "Error formato de fecha incorrecto: " + ex.getMessage());
    }
       
        txfNombre.setText(tbDoc.getValueAt(fila, 1).toString());
        dcEntrega.setDate(fechaDate);
        txfDocumento.setText(tbDoc.getValueAt(fila, 3).toString());
        cbEstatus.setSelectedItem(tbDoc.getValueAt(fila, 4));
        cbEmpleado.setSelectedIndex(Integer.parseInt(tbDoc.getValueAt(fila, 5).toString())-1);
    }//GEN-LAST:event_tbDocMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        Sesion s = new Sesion(con);
        if(s.cerrarSesion()){
            Login l = new Login();
            l.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jLabel8MouseClicked
 public void limpiar() {
        txfNombre.setText("");
        dcEntrega.setDate(null);
        txfDocumento.setText("");
        cbEstatus.setSelectedItem(null);
        cbEmpleado.setSelectedItem(null);
    }
  public void consultaIndividual(String valor) {
        String[] titulos = {"idDocumento", "Nombre Documento", "Fecha Entrega", "Documento", "Estatus", "idEmpleado"};
        String[] registros = new String[6];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM DocumentacionEmpleado WHERE nombreDocumento LIKE '%" + valor + "%' AND estatus = 'A'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("idDocumento");
                registros[1] = rs.getString("nombreDocumento");
                registros[2] = rs.getString("fechaEntrega");
                registros[3] = rs.getString("documento");
                registros[4] = rs.getString("estatus");
                 registros[5] = rs.getString("idEmpleado");
                model.addRow(registros);
            }
            tbDoc.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }

    }
    public int getLimit(int n, int lim) {
        limit = (int) Math.ceil(n / lim);
        System.out.println(n + " " + limit);
        return limit;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DocumentacionEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DocumentacionEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DocumentacionEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DocumentacionEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbEmpleado;
    private javax.swing.JComboBox cbEstatus;
    private com.toedter.calendar.JDateChooser dcEntrega;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblActualizar;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblInsertar;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JTable tbDoc;
    private javax.swing.JTextField txfBuscar;
    private javax.swing.JTextField txfDocumento;
    private javax.swing.JTextField txfNombre;
    // End of variables declaration//GEN-END:variables
}
