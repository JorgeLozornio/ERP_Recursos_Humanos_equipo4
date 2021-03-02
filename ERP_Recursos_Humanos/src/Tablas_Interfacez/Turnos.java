/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas_Interfacez;

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

    
    Conexion c = new Conexion();
    Connection con = c.conexion();
    
    public Turnos() throws SQLException {
        initComponents();
        mostrarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbTurnos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbHora1 = new javax.swing.JComboBox<>();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbTurnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, 80));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Turnos");
        jLabel2.setMaximumSize(new java.awt.Dimension(33, 30));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 239, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hora Inicio:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        cbHora1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0:00", "1:00", "2:00", "3:00", "4:00", "5:00", "6:00", "7:00", "8:00", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00" }));
        getContentPane().add(cbHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 70, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hora Fin: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        cbHora2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0 00", "1:00", "2:00", "3:00", "4:00", "5:00", "6:00", "7:00", "8:00", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00" }));
        getContentPane().add(cbHora2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 70, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dias:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        chbLunes.setBackground(new java.awt.Color(0, 0, 0));
        chbLunes.setForeground(new java.awt.Color(255, 255, 255));
        chbLunes.setText("Lunes");
        getContentPane().add(chbLunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        chbMartes.setBackground(new java.awt.Color(0, 0, 0));
        chbMartes.setForeground(new java.awt.Color(255, 255, 255));
        chbMartes.setText("Martes");
        getContentPane().add(chbMartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        chbMiercoles.setBackground(new java.awt.Color(0, 0, 0));
        chbMiercoles.setForeground(new java.awt.Color(255, 255, 255));
        chbMiercoles.setText("Miercoles");
        getContentPane().add(chbMiercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        chbJueves.setBackground(new java.awt.Color(0, 0, 0));
        chbJueves.setForeground(new java.awt.Color(255, 255, 255));
        chbJueves.setText("Jueves");
        getContentPane().add(chbJueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        chbViernes.setBackground(new java.awt.Color(0, 0, 0));
        chbViernes.setForeground(new java.awt.Color(255, 255, 255));
        chbViernes.setText("Viernes");
        getContentPane().add(chbViernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        chbSabado.setBackground(new java.awt.Color(0, 0, 0));
        chbSabado.setForeground(new java.awt.Color(255, 255, 255));
        chbSabado.setText("Sabado");
        getContentPane().add(chbSabado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        chbDomingo.setBackground(new java.awt.Color(0, 0, 0));
        chbDomingo.setForeground(new java.awt.Color(255, 255, 255));
        chbDomingo.setText("Domingo");
        getContentPane().add(chbDomingo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jButton2.setText("Eliminar");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, -1));

        jButton3.setText("Editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        jButton4.setText("Buscar");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 110, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 78, -1, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 290, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/blueOffice.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        MenuTablas m = new MenuTablas();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       insertar();
       limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

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
        
    }//GEN-LAST:event_tbTurnosMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        actualizar();
        limpiar();
        try {
            mostrarDatos();
        } catch (SQLException ex) {
            Logger.getLogger(Turnos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Turnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Turnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Turnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Turnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Turnos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Turnos.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }
    
    public void insertar(){
        try{
            
            String sql = "insert into RHTurnos (nombre, horaInicio, horaFin, dias) values (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            String ca="";
            
            pst.setString(1, txtNombre.getText());
            pst.setString(2, cbHora1.getSelectedIndex()+":00");
            pst.setString(3, cbHora2.getSelectedIndex()+":00");
            
            if(chbLunes.isSelected()){
                ca = "L ";
            }
            if(chbMartes.isSelected()){
                ca = ca + "M ";
            }
            if(chbMiercoles.isSelected()){
                ca = ca + "W ";
            }
            if(chbJueves.isSelected()){
                ca = ca + "J ";
            }
            if(chbViernes.isSelected()){
                ca = ca + "V ";
            }
            if(chbSabado.isSelected()){
                ca = ca + "S ";
            }
            if(chbDomingo.isSelected()){
                ca = ca + "D ";
            }
            System.out.println(ca);
            pst.setString(4, ca);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro exitoso");
            mostrarDatos();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al registrar: "+e.getMessage());
        }
    }
    
    public void mostrarDatos() throws SQLException{
        
        String [] titulos = {"idTurno","nombre", "horaInicio", "horaFin", "dias"};
        String [] registros = new String [6];
        
        DefaultTableModel modelo = new DefaultTableModel (null,titulos);
        String sql = "select * from RHTurnos";
        
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while( rs.next()){
                registros[0] = rs.getString("idTurno");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("horaInicio");
                registros[3] = rs.getString("horaFin");
                registros[4] = rs.getString("dias");
                
                modelo.addRow(registros);
                
            }
            
            tbTurnos.setModel(modelo);
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
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
        
    }
    
    public void actualizar(){
        
        try{
            String sql = "update RHTurnos set nombre = ?, horaInicio = ?, horaFin = ?, dias = ? where idTurno = ?";
            int fila = tbTurnos.getSelectedRow();
            String m = (String)tbTurnos.getValueAt(fila, 0);
        
            PreparedStatement pst = con.prepareStatement(sql);
            String ca="";
        
            pst.setString(1, txtNombre.getText());
            pst.setString(2, cbHora1.getSelectedIndex()+":00");
            pst.setString(3, cbHora2.getSelectedIndex()+":00");
            
            if(chbLunes.isSelected()){
                ca = "L ";
            }
            if(chbMartes.isSelected()){
                ca = ca + "M ";
            }
            if(chbMiercoles.isSelected()){
                ca = ca + "W ";
            }
            if(chbJueves.isSelected()){
                ca = ca + "J ";
            }
            if(chbViernes.isSelected()){
                ca = ca + "V ";
            }
            if(chbSabado.isSelected()){
                ca = ca + "S ";
            }
            if(chbDomingo.isSelected()){
                ca = ca + "D ";
            }
            System.out.println(ca);
            pst.setString(4, ca);
            pst.setString(5, m);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro modificado");
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }      
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbHora1;
    private javax.swing.JComboBox<String> cbHora2;
    private javax.swing.JCheckBox chbDomingo;
    private javax.swing.JCheckBox chbJueves;
    private javax.swing.JCheckBox chbLunes;
    private javax.swing.JCheckBox chbMartes;
    private javax.swing.JCheckBox chbMiercoles;
    private javax.swing.JCheckBox chbSabado;
    private javax.swing.JCheckBox chbViernes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbTurnos;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
