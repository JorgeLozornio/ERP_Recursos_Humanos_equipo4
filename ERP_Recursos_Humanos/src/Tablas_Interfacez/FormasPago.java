package Tablas_Interfacez;

import Herramientas.Sesion;
import Interfaz.Login;
import Paginacion.Paginacion;
import Reloj.Reloj;
import javax.swing.JOptionPane;
import TablasDAO.FormasPagoDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo_FormasPago;
import java.sql.SQLException;

public class FormasPago extends javax.swing.JFrame {

    FormasPagoDAO t;
    Connection con;
    String us;
    int i = 0;
    int inicio = 0;
    int fin = 5;
    int limit;
    int xx;
    int xy;

    public FormasPago(Connection c, String u) throws SQLException {
        con = c;
        us = u;
        FormasPagoDAO tu = new FormasPagoDAO(con);
        t = tu;
        initComponents();
        Reloj h = new Reloj(lblReloj, u);
        h.start();
        this.setLocationRelativeTo(null);
        jTableFP.setModel(t.consultaDatos(inicio, fin));
        Paginacion p = new Paginacion(con);
        limit = getLimit(Integer.parseInt(p.count("FormasPago")), fin);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabeEstatus = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jComboBoxEstatus = new javax.swing.JComboBox<>();
        jTxtAgregar = new javax.swing.JLabel();
        jLabelBAgregar = new javax.swing.JLabel();
        jTxtActualizar = new javax.swing.JLabel();
        jLabelBActualizar = new javax.swing.JLabel();
        jTxtEliminar = new javax.swing.JLabel();
        jLabelBEliminar = new javax.swing.JLabel();
        jTxtRegresar = new javax.swing.JLabel();
        jLabelBRegresar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFP = new javax.swing.JTable();
        jLabelBuscar = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        lblReloj = new javax.swing.JLabel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jLabelCerrar = new javax.swing.JLabel();
        cerrarSesion = new javax.swing.JLabel();
        jLabelBarra = new javax.swing.JLabel();
        jLabelSombra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formas de pago");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Formas de pago");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 290, 45));

        jLabeEstatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabeEstatus.setText("Estatus");
        getContentPane().add(jLabeEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 110, 20));

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNombre.setText("Nombre");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 70, -1));
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 150, -1));

        jComboBoxEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "I" }));
        getContentPane().add(jComboBoxEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 150, -1));

        jTxtAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jTxtAgregar.setText("Agregar");
        jTxtAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtAgregarMouseClicked(evt);
            }
        });
        getContentPane().add(jTxtAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 60, 50));

        jLabelBAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonV.png"))); // NOI18N
        getContentPane().add(jLabelBAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jTxtActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jTxtActualizar.setText("Actualizar");
        jTxtActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtActualizarMouseClicked(evt);
            }
        });
        getContentPane().add(jTxtActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 230, 70, 50));

        jLabelBActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonAzul.png"))); // NOI18N
        getContentPane().add(jLabelBActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jTxtEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jTxtEliminar.setText("Eliminar");
        jTxtEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtEliminarMouseClicked(evt);
            }
        });
        getContentPane().add(jTxtEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 60, 50));

        jLabelBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRojo.png"))); // NOI18N
        getContentPane().add(jLabelBEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        jTxtRegresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jTxtRegresar.setText("Regresar");
        jTxtRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtRegresarMouseClicked(evt);
            }
        });
        getContentPane().add(jTxtRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, 30));

        jLabelBRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRosa.png"))); // NOI18N
        getContentPane().add(jLabelBRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jTableFP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableFP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFP);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, 130));

        jLabelBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelBuscar.setText("Buscar:");
        getContentPane().add(jLabelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        btnAtras.setText("<");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, -1, -1));

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
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, -1, -1));

        lblReloj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblReloj.setForeground(new java.awt.Color(255, 255, 255));
        lblReloj.setText("lorem");
        getContentPane().add(lblReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jTextFieldBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 380, 30));

        jLabelCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Cruz.png"))); // NOI18N
        jLabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 40, -1));

        cerrarSesion.setFont(new java.awt.Font("Humanst521 BT", 1, 14)); // NOI18N
        cerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        cerrarSesion.setText("Cerrar Sesión");
        cerrarSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesionMouseClicked(evt);
            }
        });
        getContentPane().add(cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 100, -1));

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
        getContentPane().add(jLabelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        jLabelSombra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/SombraLogin.png"))); // NOI18N
        getContentPane().add(jLabelSombra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 0, 470, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtAgregarMouseClicked
        if (jTextFieldNombre.getText().isEmpty() || jComboBoxEstatus.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Error: No dejes campos vacios");
        } else {
            int seleccionEstatus = jComboBoxEstatus.getSelectedIndex();
            t.insertarDatos(jTextFieldNombre.getText(), jComboBoxEstatus.getItemAt(seleccionEstatus));
            // Manda a llamar el metodo: limpiar()
            limpiar();
            // Manda a llamar el metodo: consultaDatos()
            jTableFP.setModel(t.consultaDatos(inicio, fin));
    }//GEN-LAST:event_jTxtAgregarMouseClicked
    }
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        if (inicio == 0) {
            btnAtras.setEnabled(false);
        } else {
            btnSiguiente.setEnabled(true);
            inicio = inicio - 5;
            jTableFP.setModel(t.consultaDatos(inicio, fin));
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseClicked

    }//GEN-LAST:event_btnSiguienteMouseClicked

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if (inicio == limit * 5) {
            btnSiguiente.setEnabled(false);
        } else {
            btnAtras.setEnabled(true);
            inicio = inicio + 5;
            jTableFP.setModel(t.consultaDatos(inicio, fin));
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void jTxtActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtActualizarMouseClicked
        // Manda llamar al metodo: actalizar();
        if (jTextFieldNombre.getText().isEmpty() || jComboBoxEstatus.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Error: Debes llenar todos los campos");
        } else {
            int seleccionEstatus = jComboBoxEstatus.getSelectedIndex();
            int fila = jTableFP.getSelectedRow();
            String m = (String) jTableFP.getValueAt(fila, 0);
            t.actualizar(jTextFieldNombre.getText(), jComboBoxEstatus.getItemAt(seleccionEstatus), m);
            // Manda a llamar el metodo: consultaDatos()
            jTableFP.setModel(t.consultaDatos(inicio, fin));
            // Manda a llamar el metodo: limpiar()
            limpiar();
        }
    }//GEN-LAST:event_jTxtActualizarMouseClicked

    private void jTxtEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtEliminarMouseClicked
        if (jTextFieldNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: Debes de seleccionar el valor a eliminar");
        } else {
            // Manda a llamar al metodo eliminar
            int filaSeleccionada = jTableFP.getSelectedRow();
            String id = "" + jTableFP.getValueAt(filaSeleccionada, 0);
            t.eliminar(id);
            // Manda a llamar el metodo: consultaDatos()
            jTableFP.setModel(t.consultaDatos(inicio, fin));
            // Manda a llamar el metodo: limpiar()
            limpiar();
        }
    }//GEN-LAST:event_jTxtEliminarMouseClicked

    private void jTextFieldBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarKeyReleased
        // Manda a llamar al metodo: consultaIndividual()
        consultaIndividual(jTextFieldBuscar.getText());
    }//GEN-LAST:event_jTextFieldBuscarKeyReleased

    private void jTxtRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtRegresarMouseClicked
        MenuTablas m = new MenuTablas(con, us);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jTxtRegresarMouseClicked

    private void jTableFPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFPMouseClicked
        // Manda llamar al metodo: limpiar()
        limpiar();

        Integer idFormaPago = Integer.parseInt(jTableFP.getValueAt(jTableFP.getSelectedRow(), 0).toString());
        FormasPagoDAO DAO = new FormasPagoDAO(this.con);
        Modelo_FormasPago De = new Modelo_FormasPago();
        De = DAO.consultaidFormaPago(idFormaPago);

        jTextFieldNombre.setText(De.getNombre());
        jComboBoxEstatus.setSelectedItem(De.getEstatus());
    }//GEN-LAST:event_jTableFPMouseClicked

    private void jLabelBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jLabelBarraMouseDragged

    private void jLabelBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBarraMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jLabelBarraMousePressed

    private void cerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionMouseClicked
        Sesion s = new Sesion(con);
        if (s.cerrarSesion()) {
            Login l = new Login();
            l.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_cerrarSesionMouseClicked

    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
        this.setVisible(false);
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jLabelCerrarMouseClicked

    public void consultaIndividual(String valor) {
        String[] titulos = {"idFormaPago", "nombre, estatus"};
        String[] registros = new String[4];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM FormasPago WHERE nombre LIKE '%" + valor + "%' AND estatus = 'A'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("idFormaPago");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("estatus");
                model.addRow(registros);
            }
            jTableFP.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }

    }

    public void limpiar() {
        jTextFieldNombre.setText("");
        jComboBoxEstatus.setSelectedItem(null);
    }

    public int getLimit(int n, int lim) {
        limit = (int) Math.ceil(n / lim);
        System.out.println(n + " " + limit);
        return limit;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel cerrarSesion;
    private javax.swing.JComboBox<String> jComboBoxEstatus;
    private javax.swing.JLabel jLabeEstatus;
    private javax.swing.JLabel jLabelBActualizar;
    private javax.swing.JLabel jLabelBAgregar;
    private javax.swing.JLabel jLabelBEliminar;
    private javax.swing.JLabel jLabelBRegresar;
    private javax.swing.JLabel jLabelBarra;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelSombra;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFP;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JLabel jTxtActualizar;
    private javax.swing.JLabel jTxtAgregar;
    private javax.swing.JLabel jTxtEliminar;
    private javax.swing.JLabel jTxtRegresar;
    private javax.swing.JLabel lblReloj;
    // End of variables declaration//GEN-END:variables
}
