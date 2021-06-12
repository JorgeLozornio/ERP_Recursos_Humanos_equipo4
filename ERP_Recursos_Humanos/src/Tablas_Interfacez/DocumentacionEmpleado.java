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
import modelo.Modelo_DocumentacionEmpleado;

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
    int xx;
    int xy;

    /**
     * Creates new form DocumentacionEmpleado
     */
    public DocumentacionEmpleado(Connection c, String u) throws SQLException {
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
        aE = new int[num];
        t.llenarArreglo(aE, 1, num);
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
        btnAtras = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jLabelCerrar = new javax.swing.JLabel();
        jLabelBarra = new javax.swing.JLabel();
        jLabelSombra = new javax.swing.JLabel();

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
        getContentPane().add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 80, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Documentacion Empleado");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 44, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nombre de documento:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 112, -1, 20));
        getContentPane().add(txfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 135, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Fecha de entrega:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Documento:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

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
        getContentPane().add(lblInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 80, 30));

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
        getContentPane().add(lblActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 80, 30));

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
        getContentPane().add(lblEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 80, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Estatus:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        cbEstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "I" }));
        getContentPane().add(cbEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 135, -1));

        lblReloj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblReloj.setForeground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(lblRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 80, 30));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 480, 280));

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

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Empleado:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

        getContentPane().add(cbEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 130, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cerrar Sesion");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        btnAtras.setText("<");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 60, -1));

        btnSiguiente.setText(">");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 60, -1));

        jLabelCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Cruz.png"))); // NOI18N
        jLabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 40, -1));

        jLabelBarra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Barra.png"))); // NOI18N
        jLabelBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabelBarraMouseDragged(evt);
            }
        });
        jLabelBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelBarraMousePressed(evt);
            }
        });
        getContentPane().add(jLabelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, -1));

        jLabelSombra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/SombraLogin.png"))); // NOI18N
        getContentPane().add(jLabelSombra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, 470, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblInsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInsertarMouseClicked
        // TODO add your handling code here:
       
        if (txfNombre.getText().isEmpty() || txfDocumento.getText().isEmpty() || "".equals(dcEntrega.getDate()) || dcEntrega.getDate()==null || cbEmpleado.getSelectedIndex() == -1 || cbEstatus.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Error: No dejes campos vacios");
        } else {
            int seleccionEstatus = cbEstatus.getSelectedIndex();
            int seleccionEmpleado = cbEmpleado.getSelectedIndex();
             Modelo_DocumentacionEmpleado DocEmp = new Modelo_DocumentacionEmpleado();
                DocEmp.setNombreDocumento(txfNombre.getText());
                DocEmp.setFechaEntrega(dcEntrega.getDate());
                DocEmp.setDocumento(txfDocumento.getText());
                DocEmp.setEstatus(cbEstatus.getItemAt(seleccionEstatus).toString());
                DocEmp.setIdEmpleado(aE[seleccionEmpleado] + 1);
            t.insertarDatos(DocEmp);
            limpiar();
            // Manda a llamar el metodo: consultaDatos()
            tbDoc.setModel(t.consultaDatos(inicio, fin));
        }
    }//GEN-LAST:event_lblInsertarMouseClicked

    private void lblActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseClicked
        // TODO add your handling code here:
      
            if (txfNombre.getText().isEmpty() || txfDocumento.getText().isEmpty() || "".equals(dcEntrega.getDate()) || dcEntrega.getDate()==null || cbEmpleado.getSelectedIndex() == -1 || cbEstatus.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Error: No dejes campos vacios");
        } else {
           int seleccionEstatus = cbEstatus.getSelectedIndex();
            int seleccionEmpleado = cbEmpleado.getSelectedIndex();
             Integer idDE = Integer.parseInt(tbDoc.getValueAt(tbDoc.getSelectedRow(), 0).toString());            
             Modelo_DocumentacionEmpleado DocEmp = new Modelo_DocumentacionEmpleado();
                DocEmp.setIdDocEmp(idDE);
                DocEmp.setNombreDocumento(txfNombre.getText());
                DocEmp.setFechaEntrega(dcEntrega.getDate());
                DocEmp.setDocumento(txfDocumento.getText());
                DocEmp.setEstatus(cbEstatus.getItemAt(seleccionEstatus).toString());
                DocEmp.setIdEmpleado(aE[seleccionEmpleado] + 1);
            t.actualizar(DocEmp);
            // Manda a llamar el metodo: consultaDatos()
            tbDoc.setModel(t.consultaDatos(inicio, fin));
            // Manda a llamar el metodo: limpiar()
            limpiar();
        }

    }//GEN-LAST:event_lblActualizarMouseClicked

    private void lblEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseClicked
        // TODO add your handling code here:
        if (txfNombre.getText().isEmpty() || txfDocumento.getText().isEmpty() || "".equals(dcEntrega.getDate()) || dcEntrega.getDate()==null || cbEstatus.getSelectedIndex() == -1) {
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
          Integer idDE = Integer.parseInt(tbDoc.getValueAt(tbDoc.getSelectedRow(), 0).toString());
      DocumentacionEmpleadoDAO DAO = new DocumentacionEmpleadoDAO (this.con);
        Modelo_DocumentacionEmpleado docEmp = new Modelo_DocumentacionEmpleado();
        docEmp = DAO.consultaIdDocEmp(idDE);
        limpiar();

        txfNombre.setText(docEmp.getNombreDocumento());
        dcEntrega.setDate(docEmp.getFechaEntrega());
        txfDocumento.setText(docEmp.getDocumento());
        cbEstatus.setSelectedItem(docEmp.getEstatus());
        cbEmpleado.setSelectedIndex(docEmp.getIdEmpleado()-1);
    }//GEN-LAST:event_tbDocMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        Sesion s = new Sesion(con);
        if (s.cerrarSesion()) {
            Login l = new Login();
            l.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
         if (inicio == 0) {
            btnAtras.setEnabled(false);
        } else {
            btnSiguiente.setEnabled(true);
            inicio = inicio - 5;
            tbDoc.setModel(t.consultaDatos(inicio, fin));
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
        if (inicio == limit * 5) {
            btnSiguiente.setEnabled(false);
        } else {
            btnAtras.setEnabled(true);
            inicio = inicio + 5;
            tbDoc.setModel(t.consultaDatos(inicio, fin));
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void jLabelBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jLabelBarraMouseDragged

    private void jLabelBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBarraMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jLabelBarraMousePressed

    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
        this.setVisible(false);
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jLabelCerrarMouseClicked
    

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
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnSiguiente;
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
    private javax.swing.JLabel jLabelBarra;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelSombra;
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
