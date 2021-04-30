package TablasDAO;

import erp_recursos_humanos.Conexion;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import javax.swing.JComboBox;
import modelo.Modelo_DocumentacionEmpleado;
public class DocumentacionEmpleadoDAO {

    Connection con;

    public DocumentacionEmpleadoDAO(Connection c) {
        con = c;
    }

    public void insertarDatos(Modelo_DocumentacionEmpleado DocEmp) {
        try {
            String SQL = "INSERT INTO DocumentacionEmpleado (nombreDocumento, fechaEntrega, documento, estatus, idEmpleado) VALUES(?, ?, ?, ?, ?)";

         
  PreparedStatement pst = con.prepareStatement(SQL);
  Date fecha = DocEmp.getFechaEntrega();
java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());
File doc = new File(DocEmp.getDocumento());
FileInputStream   fis = new FileInputStream(doc);
            pst.setString(1, DocEmp.getNombreDocumento());
            pst.setDate(2, sqlDate);
           pst.setBinaryStream(3, fis, (int) doc.length());
            pst.setString(4, DocEmp.getEstatus());
            pst.setInt(5, DocEmp.getIdEmpleado());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Registro exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar: " + e.getMessage());
        }
    }

    public DefaultTableModel consultaDatos(int inicio, int fin) {
        String[] titulos = {"idDocumento", "Nombre Documento", "Fecha Entrega", "Documento", "Estatus", "idEmpleado"};
        String[] registros = new String[6];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM DocumentacionEmpleado WHERE estatus = 'A' limit "+inicio+", "+fin;
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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
        return model;

    }

    public void actualizar(Modelo_DocumentacionEmpleado DocEmp) {
        try {
            String SQL = "UPDATE DocumentacionEmpleado SET nombreDocumento = ?, fechaEntrega = ?, documento = ?, estatus = ?, idEmpleado= ? WHERE idDocumento = ?";
PreparedStatement pst = con.prepareStatement(SQL);
Date fecha = DocEmp.getFechaEntrega();
java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());
            pst.setString(1, DocEmp.getNombreDocumento());
            pst.setDate(2, sqlDate);
           pst.setString(3, DocEmp.getDocumento());
            pst.setString(4, DocEmp.getEstatus());
            pst.setInt(5, DocEmp.getIdEmpleado());
            pst.setInt(6, DocEmp.getIdDocEmp());
            pst.execute();

            pst.execute();

            JOptionPane.showMessageDialog(null, "Actualización exitosa");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
    }

    public void eliminar(String id) {

        try {
            String SQL = "UPDATE DocumentacionEmpleado SET estatus = 'I' WHERE idDocumento =" + id;

            Statement st = con.createStatement();

            st.executeUpdate(SQL);

            JOptionPane.showMessageDialog(null, "El registro a sido eliminado exitosamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
    }
public void llenarCombo(JComboBox cbo, int columna) {
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
            cbo.removeAllItems();
            String SQL = "SELECT nombre FROM empleados";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            //Recorremos el ResultSet, nos devuelve verdadero cuando tiene un registro
            while (rs.next()) {
                //Al método getString le pasamos como argumento el nombre de la columna o número de la columna de la tabla que queremos que nos devuelva.
                cbo.addItem(rs.getString(columna));
            }
            //Para que no se seleccione ninguno en el combobox
            cbo.setSelectedIndex(-1);
            //Limpiamos la memoria
            rs.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

public void llenarArreglo(int ar[], int columna, int num) {
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
            ar=null;
            int c=0;
            String SQL = "SELECT idEmpleado FROM empleados";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            ar = new int[num];
            //Recorremos el ResultSet, nos devuelve verdadero cuando tiene un registro
            while (rs.next()) {
                //Al método getString le pasamos como argumento el nombre de la columna o número de la columna de la tabla que queremos que nos devuelva.
               ar[c]=rs.getInt(columna);
               c++;
            }
            //Para que no se seleccione ninguno en el combobox
           
            //Limpiamos la memoria
            rs.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
}
         public Modelo_DocumentacionEmpleado consultaIdDocEmp(int idDocEmp) {
        String sql = (" select * "
                + " from DocumentacionEmpleado "
                + " where idDocumento=" + idDocEmp);
        Modelo_DocumentacionEmpleado DocEmp = new Modelo_DocumentacionEmpleado();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                DocEmp.setIdDocEmp(rs.getInt("idDocumento"));
                DocEmp.setNombreDocumento(rs.getString("nombreDocumento"));
                DocEmp.setFechaEntrega(rs.getDate("fechaEntrega"));
                DocEmp.setDocumento(rs.getString("documento"));
                DocEmp.setEstatus(rs.getString("estatus"));
                DocEmp.setIdEmpleado(rs.getInt("idEmpleado"));
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return DocEmp;
    }
    
}
