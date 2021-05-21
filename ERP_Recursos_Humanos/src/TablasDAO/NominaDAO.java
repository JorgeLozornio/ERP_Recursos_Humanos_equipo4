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
import modelo.Modelo_Nominas;
import modelo.Modelo_NominasPercepciones;
public class NominaDAO {
Modelo_NominasPercepciones per=new Modelo_NominasPercepciones();
    Connection con;
    public NominaDAO(Connection c) {
        con = c;
    }
public int obtenerIdNomina() {
    String sql = "select count(*) from Nominas";
        int idcont = 0;
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            idcont = rs.getInt("count(*)");
            
        } catch(Exception e){
        }
        return idcont;
    }
public float obtenerImportePercepciones(int idEmpleado, int idPer) {
    float importePer=0.0f;
    float salD=0.0f;
    float diasP=0.0f;
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
            String SQL = "SELECT salarioDiario FROM Empleados WHERE idEmpleado ="+ idEmpleado;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            //Recorremos el ResultSet, nos devuelve verdadero cuando tiene un registro
            while (rs.next()) {
                //Al método getString le pasamos como argumento el nombre de la columna o número de la columna de la tabla que queremos que nos devuelva.
               salD= rs.getFloat(1);
            }
   
            //Limpiamos la memoria
            rs.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
            String SQL = "SELECT diasPagar FROM Percepciones WHERE idPercepcion ="+ idPer;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            //Recorremos el ResultSet, nos devuelve verdadero cuando tiene un registro
            while (rs.next()) {
                //Al método getString le pasamos como argumento el nombre de la columna o número de la columna de la tabla que queremos que nos devuelva.
               diasP= rs.getFloat(1);
            }
   
            //Limpiamos la memoria
            rs.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        importePer=salD*diasP;
        return importePer;
    }
    public void insertarDatos(Modelo_Nominas Nom) {
        try {
            String SQL = "INSERT INTO Nominas (fechaElaboracion, fechaPago, subtotal, retenciones, total, diasTrabajados, estatus, idEmpleado, idFormaPago, idPeriodo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

         
  PreparedStatement pst = con.prepareStatement(SQL);
  Date fechaE = Nom.getFechaElaboracion();
  Date fechaP = Nom.getFechaPago();
java.sql.Date sqlDate = new java.sql.Date(fechaE.getTime());
java.sql.Date sqlDate2 = new java.sql.Date(fechaP.getTime());
float sub = 0.0f;
float ret = 0.0f;
float tot = 0.0f;

            pst.setDate(1, sqlDate);
            pst.setDate(2, sqlDate2);
           pst.setFloat(3, sub);
            pst.setFloat(4, ret);
            pst.setFloat(5, tot);
            pst.setInt(6, Nom.getDiasTrabajados());
            pst.setString(7, Nom.getEstatus());
           pst.setFloat(8, Nom.getIdEmpleado());
            pst.setFloat(9, Nom.getIdFormaPago());
            pst.setInt(10, Nom.getIdPeriodo());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Registro exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar: " + e.getMessage());
        }
    }

    public DefaultTableModel consultaDatosPercepcion(int idN) {
        String[] titulos = {"idNomina", "Nombre", "importe"};
        String[] registros = new String[10];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM nominasPercepciones WHERE idNomina ="+idN;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("idNomina");
                String id = rs.getString("idPercepcion");
                registros[1] = consultaNomPer(Integer.parseInt(id));
                registros[2] = rs.getString("importe");

                model.addRow(registros);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
        return model;

    }

    

    public void eliminar(String id) {

        try {
            String SQL = "DELETE * FROM Nominas WHERE idNomina =" + id;

            Statement st = con.createStatement();

            st.executeUpdate(SQL);

            JOptionPane.showMessageDialog(null, "El registro a sido eliminado exitosamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
    }
public void llenarComboEmpleado(JComboBox cbo, int columna) {
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
            cbo.removeAllItems();
            String SQL = "SELECT nombre FROM Empleados";
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
public void llenarComboPeriodo(JComboBox cbo, int columna) {
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
            cbo.removeAllItems();
            String SQL = "SELECT nombre FROM Periodos";
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
public void llenarComboFormaPago(JComboBox cbo, int columna) {
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
            cbo.removeAllItems();
            String SQL = "SELECT nombre FROM FormasPago";
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
public void llenarComboPercepcion(JComboBox cbo, int columna) {
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
            cbo.removeAllItems();
            String SQL = "SELECT nombre FROM Percepciones";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            //Recorremos el ResultSet, nos devuelve verdadero cuando tiene un registro
            while (rs.next()) {
                //Al mÃ©todo getString le pasamos como argumento el nombre de la columna o nÃºmero de la columna de la tabla que queremos que nos devuelva.
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
public void llenarComboDeduccion(JComboBox cbo, int columna) {
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
            cbo.removeAllItems();
            String SQL = "SELECT nombre FROM Deducciones";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            //Recorremos el ResultSet, nos devuelve verdadero cuando tiene un registro
            while (rs.next()) {
                //Al mÃ©todo getString le pasamos como argumento el nombre de la columna o nÃºmero de la columna de la tabla que queremos que nos devuelva.
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
public void llenarArregloPercepcion(int ar[], int columna, int num) {
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
            ar=null;
            int c=0;
            String SQL = "SELECT idPercepcion FROM Percepciones";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            ar = new int[num];
            //Recorremos el ResultSet, nos devuelve verdadero cuando tiene un registro
            while (rs.next()) {
                //Al mÃ©todo getString le pasamos como argumento el nombre de la columna o nÃºmero de la columna de la tabla que queremos que nos devuelva.
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
public void llenarArregloDeduccion(int ar[], int columna, int num) {
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
            ar=null;
            int c=0;
            String SQL = "SELECT idDeduccion FROM Deducciones";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            ar = new int[num];
            //Recorremos el ResultSet, nos devuelve verdadero cuando tiene un registro
            while (rs.next()) {
                //Al mÃ©todo getString le pasamos como argumento el nombre de la columna o nÃºmero de la columna de la tabla que queremos que nos devuelva.
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
public void llenarArregloPeriodo(int ar[], int columna, int num) {
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
            ar=null;
            int c=0;
            String SQL = "SELECT idPeriodo FROM Periodos";
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
public void llenarArregloEmpleado(int ar[], int columna, int num) {
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
public void llenarArregloFormaPago(int ar[], int columna, int num) {
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
            ar=null;
            int c=0;
            String SQL = "SELECT idFormaPago FROM FormasPago";
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
         public Modelo_Nominas consultaIdNom(int idNomina) {
        String sql = (" select * "
                + " from Nominas "
                + " where idNomina=" + idNomina);
        Modelo_Nominas idNom = new Modelo_Nominas();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                idNom.setIdNom(rs.getInt("idNomina"));
                idNom.setFechaElaboracion(rs.getDate("fechaElaboracion"));
                idNom.setFechaPago(rs.getDate("fechaPago"));
                idNom.setSubtotal(rs.getFloat("subtotal"));
                idNom.setRetenciones(rs.getFloat("retenciones"));
                idNom.setTotal(rs.getFloat("total"));
                 idNom.setDiasTrabajados(rs.getInt("diasTrabajados"));
                  idNom.setEstatus(rs.getString("estatus"));
                   idNom.setIdEmpleado(rs.getInt("idEmpleado"));
                    idNom.setIdFormaPago(rs.getInt("idFormaPago"));
                     idNom.setIdPeriodo(rs.getInt("idPeriodo"));
                     
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return idNom;
    }
     public String consultaNomPer(int idNominaPer) {
         String nom=""; 
        String sql = (" select * "
                + " from Percepciones "
                + " where idPercepcion=" + idNominaPer);
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                nom=rs.getString("nombre");
             
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return nom;
    }
     
     public void insertarDatosPercepciones(Modelo_NominasPercepciones nomP) {
        try {
            String SQL = "INSERT INTO NominasPercepciones (idNomina, idPercepcion, importe) VALUES(?, ?, ?)";

         
  PreparedStatement pst = con.prepareStatement(SQL);
float imp = 0.0f;

            pst.setInt(1, nomP.getIdNomina());
            pst.setInt(2, nomP.getIdPercepcion());
           pst.setFloat(3, nomP.getImporte());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar: " + e.getMessage());
        }
    }
     
     
     
     
        
}
