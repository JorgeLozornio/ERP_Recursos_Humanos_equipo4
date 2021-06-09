/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas_Interfacez;

import Reloj.Reloj;
import TablasDAO.DepartamentosDAO;
import erp_recursos_humanos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo_Departamentos;
/**
 *
 * @author Mino
 */
public class Departamentos extends javax.swing.JFrame {

    /**
     * Creates new form Departamentos
     */
   
     DepartamentosDAO dep ;
    Connection con;
    String us;
    
    public Departamentos(Connection c, String u) throws SQLException{
        con = c;
        us = u;
        DepartamentosDAO d = new DepartamentosDAO(con);
        dep=d;
        initComponents();
        Reloj h = new Reloj(lblReloj, u);
        h.start();
        tblDepartamentos.setModel(dep.mostrarTodo());
        this.setLocationRelativeTo(null);
    }

    public void limpiar(){
        txfNombre.setText("");
        cbEst.setSelectedItem(0);
       
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngEstatusInsertar = new javax.swing.ButtonGroup();
        btngEstatusActualizar = new javax.swing.ButtonGroup();
        jLabel9 = new javax.swing.JLabel();
        lblRegresar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDepartamentos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txfNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblInsertar = new javax.swing.JLabel();
        lblActualizar = new javax.swing.JLabel();
        lblEliminar = new javax.swing.JLabel();
        cbEst = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txfBuscar = new javax.swing.JTextField();
        lblReloj = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(lblRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 80, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Departamentos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 193, 30));

        tblDepartamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Estatus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDepartamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDepartamentosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDepartamentos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 450, 155));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));
        getContentPane().add(txfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 244, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Estatus:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

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
        getContentPane().add(lblInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 80, 30));

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
        getContentPane().add(lblActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 80, 30));

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
        getContentPane().add(lblEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 80, 30));

        cbEst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "I" }));
        getContentPane().add(cbEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 61, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Buscar:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        txfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txfBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 230, -1));

        lblReloj.setText("lorem");
        getContentPane().add(lblReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
        // TODO add your handling code here:
         MenuTablas m = new MenuTablas(con, us);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblRegresarMouseClicked

    private void lblEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseClicked
        // TODO add your handling code here:
        int fila = tblDepartamentos.getSelectedRow();
        String [] op = {"Si","No"};
        String id = ""+tblDepartamentos.getValueAt(fila, 0);
        int b = JOptionPane.showOptionDialog(null,"¿Deseas eliminar este registro?",
            "Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, op,op[0]);
        if(b == 0){
            dep.eliminar(id);
        }
        limpiar();
        tblDepartamentos.setModel(dep.mostrarTodo());
    }//GEN-LAST:event_lblEliminarMouseClicked

    private void lblActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseClicked
        // TODO add your handling code here:
        if (txfNombre.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null,"Error: Campo vacío");
        }else{
        int est=cbEst.getSelectedIndex();
          Integer idDep = Integer.parseInt(tblDepartamentos.getValueAt(tblDepartamentos.getSelectedRow(), 0).toString());   
         Modelo_Departamentos depa = new Modelo_Departamentos();
         depa.setIdDep(idDep);
                depa.setNombre(txfNombre.getText());
                depa.setEstatus(cbEst.getItemAt(est).toString());
            dep.actualizarDatos(depa);
        limpiar();
        tblDepartamentos.setModel(dep.mostrarTodo());
        }
    }//GEN-LAST:event_lblActualizarMouseClicked

    private void lblInsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInsertarMouseClicked
        // TODO add your handling code here:
        if (txfNombre.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null,"Error: Campo vacío");
        }else{
        int est=cbEst.getSelectedIndex();
         Modelo_Departamentos depa = new Modelo_Departamentos();
                depa.setNombre(txfNombre.getText());
                depa.setEstatus(cbEst.getItemAt(est).toString());
            dep.insertarDatos(depa);
        limpiar();
        tblDepartamentos.setModel(dep.mostrarTodo());
        }
    }//GEN-LAST:event_lblInsertarMouseClicked

    private void tblDepartamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDepartamentosMouseClicked
        // TODO add your handling code here:
        Integer idDep = Integer.parseInt(tblDepartamentos.getValueAt(tblDepartamentos.getSelectedRow(), 0).toString());
      DepartamentosDAO DAO = new DepartamentosDAO (this.con);
        Modelo_Departamentos depa = new Modelo_Departamentos();
        depa = DAO.consultaIdDep(idDep);
        limpiar();

        txfNombre.setText(depa.getNombre());

        cbEst.setSelectedItem(depa.getEstatus());

    }//GEN-LAST:event_tblDepartamentosMouseClicked

    private void txfBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarKeyReleased
        // TODO add your handling code here:
        Buscar(txfBuscar.getText());
    }//GEN-LAST:event_txfBuscarKeyReleased
int xx, xy;
 public void Buscar(String valor) {
        String[] titulos = {"Id", "Nombre", "Estatus"};
        String[] registros = new String[5];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String SQL = "select * from departamentos WHERE nombre LIKE '%"+valor+"%' AND estatus = 'A'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("idDepartamento");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("estatus");
                model.addRow(registros);
            }
            tblDepartamentos.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }

    }
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btngEstatusActualizar;
    private javax.swing.ButtonGroup btngEstatusInsertar;
    private javax.swing.JComboBox<String> cbEst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblActualizar;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblInsertar;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JTable tblDepartamentos;
    private javax.swing.JTextField txfBuscar;
    private javax.swing.JTextField txfNombre;
    // End of variables declaration//GEN-END:variables
}
