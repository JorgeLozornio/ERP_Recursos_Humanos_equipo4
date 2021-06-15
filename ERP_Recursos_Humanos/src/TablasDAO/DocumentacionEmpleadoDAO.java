package TablasDAO;

import erp_recursos_humanos.Conexion;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
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
            pst.setString(1, DocEmp.getNombreDocumento());
            pst.setDate(2, sqlDate);
           pst.setBytes(3, DocEmp.getDocumento());
            pst.setString(4, DocEmp.getEstatus());
            pst.setInt(5, DocEmp.getIdEmpleado());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Registro exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar: " + e.getMessage());
        }
    }

    

    public void actualizar(Modelo_DocumentacionEmpleado DocEmp) {
        if (DocEmp.getDocumento()==null) {
             try {
            String SQL = "UPDATE DocumentacionEmpleado SET nombreDocumento = ?, fechaEntrega = ?, estatus = ?, idEmpleado= ? WHERE idDocumento = ?";
PreparedStatement pst = con.prepareStatement(SQL);
Date fecha = DocEmp.getFechaEntrega();
java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());
            pst.setString(1, DocEmp.getNombreDocumento());
            pst.setDate(2, sqlDate);
            pst.setString(3, DocEmp.getEstatus());
            pst.setInt(4, DocEmp.getIdEmpleado());
            pst.setInt(5, DocEmp.getIdDocEmp());
            pst.execute();

            pst.execute();

            JOptionPane.showMessageDialog(null, "Actualización exitosa");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
        } else{
             try {
            String SQL = "UPDATE DocumentacionEmpleado SET nombreDocumento = ?, fechaEntrega = ?, documento = ?, estatus = ?, idEmpleado= ? WHERE idDocumento = ?";
PreparedStatement pst = con.prepareStatement(SQL);
Date fecha = DocEmp.getFechaEntrega();
java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());
            pst.setString(1, DocEmp.getNombreDocumento());
            pst.setDate(2, sqlDate);
           pst.setBytes(3, DocEmp.getDocumento());
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
       
    }

    public void eliminar(String id) {

        try {
            String SQL = "DELETE FROM DocumentacionEmpleado WHERE idDocumento =" + id;

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
            String SQL = "SELECT concat(nombre, ' ', apellidopaterno, ' ', apellidomaterno) FROM empleados";
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
         
     public void ejecutar_archivoPDF(int id) {

        
        PreparedStatement ps = null;
        ResultSet rs = null;
        byte[] b = null;

        try {
            ps = con.prepareStatement("SELECT documento FROM documentacionEmpleado WHERE idDocumento = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                b = rs.getBytes(1);
            }
            InputStream bos = new ByteArrayInputStream(b);

            int tamanoInput = bos.available();
            byte[] datosPDF = new byte[tamanoInput];
            bos.read(datosPDF, 0, tamanoInput);

            OutputStream out = new FileOutputStream("Nomina.pdf");
            out.write(datosPDF);

            //abrir archivo
            out.close();
            bos.close();
            ps.close();
            rs.close();
           

        } catch (IOException | NumberFormatException | SQLException ex) {
            System.out.println("Error al abrir archivo PDF " + ex.getMessage());
        }
    }
     
      public ArrayList<Modelo_DocumentacionEmpleado> Listar_Pdf(int inicio, int fin) {
        ArrayList<Modelo_DocumentacionEmpleado> list = new ArrayList<Modelo_DocumentacionEmpleado>();
        String sql = "SELECT * FROM documentacionEmpleado limit " + inicio + ", " + fin;
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Modelo_DocumentacionEmpleado DocEmp = new Modelo_DocumentacionEmpleado();
               DocEmp.setIdDocEmp(rs.getInt("idDocumento"));
                DocEmp.setNombreDocumento(rs.getString("nombreDocumento"));
                DocEmp.setFechaEntrega(rs.getDate("fechaEntrega"));              
                DocEmp.setEstatus(rs.getString("estatus"));
                DocEmp.setIdEmpleado(rs.getInt("idEmpleado"));
                DocEmp.setDocumento(rs.getBytes("documento"));
                list.add(DocEmp);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                
            } catch (Exception ex) {
            }
        }
        return list;
    }
    
       public ArrayList<Modelo_DocumentacionEmpleado> Listar_Pdf_Individual(String valor) {
        ArrayList<Modelo_DocumentacionEmpleado> list = new ArrayList<Modelo_DocumentacionEmpleado>();
       String sql = "SELECT * FROM DocumentacionEmpleado WHERE nombreDocumento LIKE '%" + valor + "%'";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Modelo_DocumentacionEmpleado DocEmp = new Modelo_DocumentacionEmpleado();
               DocEmp.setIdDocEmp(rs.getInt("idDocumento"));
                DocEmp.setNombreDocumento(rs.getString("nombreDocumento"));
                DocEmp.setFechaEntrega(rs.getDate("fechaEntrega"));              
                DocEmp.setEstatus(rs.getString("estatus"));
                DocEmp.setIdEmpleado(rs.getInt("idEmpleado"));
                DocEmp.setDocumento(rs.getBytes("documento"));
                list.add(DocEmp);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                
            } catch (Exception ex) {
            }
        }
        return list;
    }
}
