package Tablas_Interfacez;

import Herramientas.Sesion;
import Interfaz.Login;
import Paginacion.Paginacion;
import Reloj.Reloj;
import TablasDAO.CiudadesDAO;
import erp_recursos_humanos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo_Ciudades;

public class Ciudades extends javax.swing.JFrame {

    CiudadesDAO t;
    Connection con;
    String us;
    int i = 0;
    int inicio = 0;
    int fin = 5;
    int limit;
    int xx;
    int xy;

    public Ciudades(Connection c, String u) throws SQLException {
        con = c;
        us = u;
        CiudadesDAO tu = new CiudadesDAO(con);
        t = tu;
        initComponents();
        Reloj h = new Reloj(lblReloj, u);
        h.start();
        this.setLocationRelativeTo(null);
        jTable.setModel(t.consultaDatos(inicio, fin));
        Paginacion p = new Paginacion(con);
        limit = getLimit(Integer.parseInt(p.count("Ciudades")), fin);
        llenarComboDepartamento();
    }

    public void llenarComboDepartamento() {
        t.llenarCombo(jComboBoxEstado, 1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCiudad = new javax.swing.JLabel();
        jLabelEstatus = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jLabelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jTextFieldCiudad = new javax.swing.JTextField();
        jComboBoxEstatus = new javax.swing.JComboBox<>();
        jTextFieldBuscar = new javax.swing.JTextField();
        jLabelBuscar = new javax.swing.JLabel();
        txtAgregar = new javax.swing.JLabel();
        jLabelAgregar = new javax.swing.JLabel();
        txtModficar = new javax.swing.JLabel();
        jLabelModificar = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JLabel();
        jLabelEliminar = new javax.swing.JLabel();
        lblRegresar = new javax.swing.JLabel();
        lblReloj = new javax.swing.JLabel();
        jLabelCerrar = new javax.swing.JLabel();
        cerrarSesion = new javax.swing.JLabel();
        jLabelBarra = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jLabelSombra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ciudades");
        setMinimumSize(new java.awt.Dimension(800, 450));
        setPreferredSize(new java.awt.Dimension(800, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCiudad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCiudad.setText("Ciudad");
        getContentPane().add(jLabelCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 136, 70, -1));

        jLabelEstatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEstatus.setText("Estatus");
        getContentPane().add(jLabelEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 253, 70, -1));

        jLabelEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEstado.setText("Estado");
        getContentPane().add(jLabelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 193, 80, -1));

        getContentPane().add(jComboBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 190, -1));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Ciudades");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 205, 45));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 388, 210));

        jTextFieldCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCiudadActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 190, -1));

        jComboBoxEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "I" }));
        getContentPane().add(jComboBoxEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 190, -1));

        jTextFieldBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 82, 326, 30));

        jLabelBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelBuscar.setText("Buscar:");
        getContentPane().add(jLabelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 83, -1, -1));

        txtAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAgregar.setForeground(new java.awt.Color(255, 255, 255));
        txtAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAgregar.setText("Agregar");
        getContentPane().add(txtAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 60, 30));

        jLabelAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonV.png"))); // NOI18N
        jLabelAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAgregarMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 312, 80, -1));

        txtModficar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtModficar.setForeground(new java.awt.Color(255, 255, 255));
        txtModficar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtModficar.setText("Actualizar");
        txtModficar.setAlignmentY(-1.0F);
        getContentPane().add(txtModficar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 110, 30));

        jLabelModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonAzul.png"))); // NOI18N
        jLabelModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelModificarMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 312, 80, -1));

        txtEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEliminar.setForeground(new java.awt.Color(255, 255, 255));
        txtEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEliminar.setText("Eliminar");
        txtEliminar.setAlignmentY(1.0F);
        getContentPane().add(txtEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 60, 30));

        jLabelEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoBotonRojo.png"))); // NOI18N
        jLabelEliminar.setAlignmentX(-0.1F);
        jLabelEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEliminarMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

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
        getContentPane().add(lblRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 80, 30));

        lblReloj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblReloj.setForeground(new java.awt.Color(255, 255, 255));
        lblReloj.setText("lorem");
        getContentPane().add(lblReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabelCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Cruz.png"))); // NOI18N
        jLabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 40, -1));

        cerrarSesion.setFont(new java.awt.Font("Humanst521 BT", 1, 14)); // NOI18N
        cerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        cerrarSesion.setText("Cerrar Sesión");
        cerrarSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesionMouseClicked(evt);
            }
        });
        getContentPane().add(cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 100, -1));

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
        getContentPane().add(jLabelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, -1));

        btnAtras.setText("<");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, -1, -1));

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
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, -1, -1));

        jLabelSombra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Sombra2.png"))); // NOI18N
        getContentPane().add(jLabelSombra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCiudadActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // Manda llamar al metodo: limpiar()
        limpiar();

        Integer idCiudad = Integer.parseInt(jTable.getValueAt(jTable.getSelectedRow(), 0).toString());
        CiudadesDAO DAO = new CiudadesDAO(this.con);
        Modelo_Ciudades Ciu = new Modelo_Ciudades();
        Ciu = DAO.consultaidCiudad(idCiudad);

        jTextFieldCiudad.setText(Ciu.getNombre());
        jComboBoxEstado.setSelectedIndex(Ciu.getidEstado() -1);
        jComboBoxEstatus.setSelectedItem(Ciu.getEstatus());
    }//GEN-LAST:event_jTableMouseClicked

    private void jTextFieldBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarKeyReleased
        // Manda a llamar al metodo: consultaIndividual()
        consultaIndividual(jTextFieldBuscar.getText());
    }//GEN-LAST:event_jTextFieldBuscarKeyReleased

    private void jLabelAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAgregarMouseClicked
        if (jTextFieldCiudad.getText().isEmpty() || jComboBoxEstado.getSelectedIndex() == -1 || jComboBoxEstatus.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Error: Debes de rellenar todos los campos");
        } else {
            int seleccionEstatus = jComboBoxEstatus.getSelectedIndex();
            t.insertarDatos(jTextFieldCiudad.getText(), jComboBoxEstado.getSelectedIndex(), jComboBoxEstatus.getItemAt(seleccionEstatus));
            // Manda a llamar el metodo: limpiar()
            limpiar();
            // Manda a llamar el metodo: consultaDatos()
            jTable.setModel(t.consultaDatos(inicio, fin));
        }
    }//GEN-LAST:event_jLabelAgregarMouseClicked

    private void jLabelModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelModificarMouseClicked
        // Manda llamar al metodo: actalizar();
        if (jTextFieldCiudad.getText().isEmpty() || jComboBoxEstado.getSelectedIndex() == -1 || jComboBoxEstatus.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Error: Debes de rellenar todos los campos");
        } else {
            int seleccionEstatus = jComboBoxEstatus.getSelectedIndex();
            int fila = jTable.getSelectedRow();
            String m = (String) jTable.getValueAt(fila, 0);
            t.actualizar(jTextFieldCiudad.getText(), jComboBoxEstado.getSelectedIndex(), jComboBoxEstatus.getItemAt(seleccionEstatus), m);
            // Manda a llamar el metodo: consultaDatos()
            jTable.setModel(t.consultaDatos(inicio, fin));
            // Manda a llamar el metodo: limpiar()
            limpiar();
        }
    }//GEN-LAST:event_jLabelModificarMouseClicked

    private void jLabelEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEliminarMouseClicked
        if (jTextFieldCiudad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: Debes de seleccionar el valor a eliminar");
        } else {
            // Manda a llamar al metodo eliminar
            int filaSeleccionada = jTable.getSelectedRow();
            String id = "" + jTable.getValueAt(filaSeleccionada, 0);
            t.eliminar(id);
            // Manda a llamar el metodo: consultaDatos()        
            jTable.setModel(t.consultaDatos(inicio, fin));
            // Manda a llamar el metodo: limpiar()
            limpiar();
        }
    }//GEN-LAST:event_jLabelEliminarMouseClicked

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
        // TODO add your handling code here:
        MenuTablas m = new MenuTablas(con, us);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblRegresarMouseClicked

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        if (inicio == 0) {
            btnAtras.setEnabled(false);
        } else {
            btnSiguiente.setEnabled(true);
            inicio = inicio - 5;
            jTable.setModel(t.consultaDatos(inicio, fin));
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
            jTable.setModel(t.consultaDatos(inicio, fin));
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void jLabelBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBarraMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jLabelBarraMousePressed

    private void jLabelBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_jLabelBarraMouseDragged

    private void cerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionMouseClicked
        Sesion s = new Sesion(con);
        if(s.cerrarSesion()){
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

    public void limpiar() {
        jTextFieldCiudad.setText("");
        jComboBoxEstado.setSelectedItem(null);
        jComboBoxEstatus.setSelectedItem(null);
    }

    public void consultaIndividual(String valor) {
        String[] titulos = {"idCiudad", "nombre", "idEstado", "estatus"};
        String[] registros = new String[5];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM Ciudades WHERE nombre LIKE '%" + valor + "%' AND estatus = 'A'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("idCiudad");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("idEstado");
                registros[3] = rs.getString("estatus");
                model.addRow(registros);
            }
            jTable.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }

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
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JComboBox<String> jComboBoxEstatus;
    private javax.swing.JLabel jLabelAgregar;
    private javax.swing.JLabel jLabelBarra;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelEliminar;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelEstatus;
    private javax.swing.JLabel jLabelModificar;
    private javax.swing.JLabel jLabelSombra;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JLabel txtAgregar;
    private javax.swing.JLabel txtEliminar;
    private javax.swing.JLabel txtModficar;
    // End of variables declaration//GEN-END:variables
}
