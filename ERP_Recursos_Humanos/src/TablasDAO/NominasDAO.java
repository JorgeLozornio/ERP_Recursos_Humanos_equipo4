package TablasDAO;

import erp_recursos_humanos.Conexion;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import javax.swing.JComboBox;
import modelo.Modelo_Nominas;
import modelo.Modelo_NominasDeducciones;
import modelo.Modelo_NominasPercepciones;
public class NominasDAO {
Modelo_NominasPercepciones per=new Modelo_NominasPercepciones();
    Connection con;
    SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");
    public NominasDAO(Connection c) {
        con = c;
    }
    public int obtenerdiasT(int idEmp){
         int nom=0;
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
           
           
            String SQL = "select count(*) from Asistencias WHERE idEmpleado= "+idEmp;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            //Recorremos el ResultSet, nos devuelve verdadero cuando tiene un registro
            while (rs.next()) {
                //Al mÃ©todo getString le pasamos como argumento el nombre de la columna o nÃºmero de la columna de la tabla que queremos que nos devuelva.
               nom=rs.getInt(1);
               
            }
            //Para que no se seleccione ninguno en el combobox
           
            //Limpiamos la memoria
            rs.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nom;
    }
    public String obtenerNombreEmpleado(int idEmp){
         String nom="";
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
           
           
            String SQL = "SELECT nombre FROM Empleados WHERE idEmpleado="+idEmp;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            //Recorremos el ResultSet, nos devuelve verdadero cuando tiene un registro
            while (rs.next()) {
                //Al mÃ©todo getString le pasamos como argumento el nombre de la columna o nÃºmero de la columna de la tabla que queremos que nos devuelva.
               nom=rs.getString(1);
               
            }
            //Para que no se seleccione ninguno en el combobox
           
            //Limpiamos la memoria
            rs.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nom;
    }
    public String obtenerNombrePeriodo(int idPer){
         String nom="";
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
           
           
            String SQL = "SELECT nombre FROM Periodos WHERE idPeriodo="+idPer;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            //Recorremos el ResultSet, nos devuelve verdadero cuando tiene un registro
            while (rs.next()) {
                //Al mÃ©todo getString le pasamos como argumento el nombre de la columna o nÃºmero de la columna de la tabla que queremos que nos devuelva.
               nom=rs.getString(1);
               
            }
            //Para que no se seleccione ninguno en el combobox
           
            //Limpiamos la memoria
            rs.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nom;
    }
    public String obtenerNombreFormaPago(int idFor){
         String nom="";
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
           
           
            String SQL = "SELECT nombre FROM FormasPago WHERE idFormaPago="+idFor;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            //Recorremos el ResultSet, nos devuelve verdadero cuando tiene un registro
            while (rs.next()) {
                //Al mÃ©todo getString le pasamos como argumento el nombre de la columna o nÃºmero de la columna de la tabla que queremos que nos devuelva.
               nom=rs.getString(1);
               
            }
            //Para que no se seleccione ninguno en el combobox
           
            //Limpiamos la memoria
            rs.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nom;
    }
public int obtenerIdNomina() {
    String sql = "SELECT TOP 1 * FROM Nominas ORDER BY idNomina DESC";
        int idcont = 0;
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            idcont = rs.getInt(1);
            
        } catch(Exception e){
        }
        return idcont;
    }
public int obtenersalarioDiario(int idEmp) {
    String SQL = "SELECT salarioDiario FROM Empleados WHERE idEmpleado ="+ idEmp;
        int idcont = 0;
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            rs.next();
            idcont = rs.getInt(1);
            
        } catch(Exception e){
        }
        return idcont;
    }
public int obtenerdiasPagar(int idPer) {
    String SQL = "SELECT diasPagar FROM percepciones WHERE idPercepcion ="+ idPer;
        int idcont = 0;
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            rs.next();
            idcont = rs.getInt(1);
            
        } catch(Exception e){
        }
        return idcont;
    }
public int obtenerPorcentaje(int idDed) {
    String SQL = "SELECT porcentaje FROM deducciones WHERE idDeduccion ="+ idDed;
        int idcont = 0;
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            rs.next();
            idcont = rs.getInt(1);
            
        } catch(Exception e){
        }
        return idcont;
    }
public int obtenerSubtotal(int idNom) {
    String SQL = "SELECT subtotal FROM Nominas WHERE idNomina ="+ idNom;
        int idcont = 0;
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            rs.next();
            idcont = rs.getInt(1);
            
        } catch(Exception e){
        }
        return idcont;
    }
    public void insertarDatos(Modelo_Nominas Nom) {
        try {
            String SQL = "INSERT INTO Nominas (fechaElaboracion, fechaPago, subtotal, retenciones, total, diasTrabajados, estatus, idEmpleado, idFormaPago, idPeriodo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

         
  PreparedStatement pst = con.prepareStatement(SQL);
Date fecha = Nom.getFechaElaboracion();
java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());
  Date fecha2 = Nom.getFechaPago();
java.sql.Date sqlDate2 = new java.sql.Date(fecha2.getTime());
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
            String SQL = "DELETE FROM Nominas WHERE idNomina =" + id;

            Statement st = con.createStatement();

            st.executeUpdate(SQL);

            JOptionPane.showMessageDialog(null, "El registro a sido eliminado exitosamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
    }
     public void eliminarTodo(String idNom) {

        try {
            String SQL = "DELETE FROM NominasPercepciones WHERE idNomina =" + idNom;

            Statement st = con.createStatement();

            st.executeUpdate(SQL);

            JOptionPane.showMessageDialog(null, "El registro a sido eliminado exitosamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
         try {
            String SQL = "DELETE FROM NominasDeducciones WHERE idNomina =" + idNom;

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
public int [] llenarArregloPercepcion(int ar[], int columna, int num) {
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
        return ar;
}
public int[] llenarArregloDeduccion(int ar[], int columna, int num) {
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
        return ar;
}
public int [] llenarArregloPeriodo(int ar[], int columna, int num) {
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
        return ar;
}
public int[] llenarArregloEmpleado(int ar[], int columna, int num) {
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
        return ar;
}
public int[] llenarArregloFormaPago(int ar[], int columna, int num) {
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
        return ar;
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
     
      public DefaultTableModel consultaDatos(int inicio, int fin) {
        String[] titulos = {"idNomina", "Fecha Elaboracion", "Fecha Pago", "Subtotal", "Retenciones", "Total", "Dias trabajados", "Estatus", "Empleado", "Forma pago", "Periodo"};
        String[] registros = new String[11];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM Nominas limit "+inicio+", "+fin;
        int idE=0, idF=0, idP=0;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("idNomina");
                registros[1] = rs.getString("fechaElaboracion");
                registros[2] = rs.getString("fechaPago");
                registros[3] = rs.getString("subtotal");
                registros[4] = rs.getString("retenciones");
                 registros[5] = rs.getString("total");
                 registros[6] = rs.getString("diasTrabajados");
                 registros[7] = rs.getString("estatus");
                 idE = rs.getInt("idEmpleado");
                 idF = rs.getInt("idFormaPago");
                 idP = rs.getInt("idPeriodo");
                String SQL2 = "SELECT * FROM Empleados WHERE IdEmpleado= " +idE;
        try {
             Statement st2 = con.createStatement();
            ResultSet rs2 = st2.executeQuery(SQL2);

            while (rs2.next()) {
                
                 registros[8]= rs2.getString("nombre");
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
        String SQL3 = "SELECT * FROM FormasPago WHERE idFormaPago= "+idF;
        try {
              Statement st3 = con.createStatement();
            ResultSet rs3 = st3.executeQuery(SQL3);

            while (rs3.next()) {
                
                 registros[9]= rs3.getString("nombre");
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
        String SQL4 = "SELECT * FROM Periodos WHERE idPeriodo= "+idP;
        try {
             Statement st4 = con.createStatement();
            ResultSet rs4 = st4.executeQuery(SQL4);

            while (rs4.next()) {
                
                 registros[10]= rs4.getString("nombre");
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
        model.addRow(registros);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
         
        return model;

    }
       public DefaultTableModel consultaDatosPercepciones(int inicio, int fin, int idN) {
        String[] titulos = {"idPercepcion", "Nombre", "Dias", "Salario", "Importe"};
        String[] registros = new String[5];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM NominasPercepciones WHERE idNomina="+idN+" limit "+inicio+", "+fin;
        int idNom=0, idP=0, diasT=0;
        float imp = 0.0f;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("idPercepcion");
                idP =rs.getInt("idPercepcion");
                idNom =rs.getInt("idNomina");
                 registros[4] = rs.getString("importe");
                imp= rs.getFloat("importe");
                String SQL2 = "SELECT nombre FROM Percepciones WHERE idPercepcion= " +idP;
        try {
             Statement st2 = con.createStatement();
            ResultSet rs2 = st2.executeQuery(SQL2);

            while (rs2.next()) {
                
                 registros[1]= rs2.getString("nombre");
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
                if ("Salario".matches(registros[1])) {
                    String SQL3 = "SELECT diasTrabajados FROM Nominas WHERE idNomina= "+idNom;
        try {
              Statement st3 = con.createStatement();
            ResultSet rs3 = st3.executeQuery(SQL3);

            while (rs3.next()) {
                
                 diasT= rs3.getInt("diasTrabajados");
                registros[2]=rs3.getString("diasTrabajados");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
                }else{
                    String SQL4 = "SELECT diasPagar FROM Percepciones WHERE idPercepcion= "+idP;
        try {
             Statement st4 = con.createStatement();
            ResultSet rs4 = st4.executeQuery(SQL4);

            while (rs4.next()) {
                
                 diasT= rs4.getInt("diasPagar");
                registros[2]=rs4.getString("diasPagar");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
                }
                if (diasT==0) {
                    imp=0;
                }else{
                    imp=imp/diasT;
                }
                
            registros[3]=""+imp;
            
        
        model.addRow(registros);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
         
        return model;

    }
       public DefaultTableModel consultaDatosDeducciones(int inicio, int fin, int idN) {
        String[] titulos = {"idDeduccion", "Nombre", "Porcentaje", "Importe"};
        String[] registros = new String[4];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM NominasDeducciones WHERE idNomina="+idN+" limit "+inicio+", "+fin;
        int idNom=0, idD=0, diasT=0;
        float imp = 0.0f;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("idDeduccion");
                idD =rs.getInt("idDeduccion");
                idNom =rs.getInt("idNomina");
                 registros[3] = rs.getString("importe");
                imp= rs.getFloat("importe");
                String SQL2 = "SELECT * FROM Deducciones WHERE idDeduccion= " +idD;
        try {
             Statement st2 = con.createStatement();
            ResultSet rs2 = st2.executeQuery(SQL2);

            while (rs2.next()) {
                
                 registros[1]= rs2.getString("nombre");
                 registros[2]=rs2.getString("porcentaje");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
           
        model.addRow(registros);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
         
        return model;

    }
     public void insertarPercepcion(Modelo_NominasPercepciones NomP) {
        try {
            String SQL = "INSERT INTO NominasPercepciones (idNomina, idPercepcion, importe) VALUES(?, ?, ?)";

         
  PreparedStatement pst = con.prepareStatement(SQL);
            pst.setInt(1, NomP.getIdNomina());
            pst.setInt(2, NomP.getIdPercepcion());
           pst.setFloat(3, NomP.getImporte());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Registro exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar: " + e.getMessage());
        }
    }
     public void insertarDeduccion(Modelo_NominasDeducciones NomD) {
        try {
            String SQL = "INSERT INTO NominasDeducciones (idNomina, idDeduccion, importe) VALUES(?, ?, ?)";

         
  PreparedStatement pst = con.prepareStatement(SQL);
            pst.setInt(1, NomD.getIdNomina());
            pst.setInt(2, NomD.getIdDeduccion());
           pst.setFloat(3, NomD.getImporte());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Registro exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar: " + e.getMessage());
        }
    }
    public void actualizar(Modelo_Nominas Nom) {
        try {
            
            String SQL = "UPDATE Nominas SET fechaElaboracion = ?, fechaPago = ?, estatus = ?, idFormaPago = ?, idPeriodo= ? WHERE idNomina = ?";
PreparedStatement pst = con.prepareStatement(SQL);
            Date fecha = Nom.getFechaElaboracion();
java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());
  Date fecha2 = Nom.getFechaPago();
java.sql.Date sqlDate2 = new java.sql.Date(fecha2.getTime());
             pst.setDate(1, sqlDate);
            pst.setDate(2, sqlDate2);
           pst.setString(3, Nom.getEstatus());
            pst.setInt(4, Nom.getIdFormaPago());
            pst.setInt(5, Nom.getIdPeriodo());
            pst.setInt(6, Nom.getIdNom());
          
            pst.execute();

            JOptionPane.showMessageDialog(null, "Actualización exitosa");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
    }    
     public void eliminarPercepcion(int idNom, int idPer) {

        try {
            String SQL = "DELETE FROM NominasPercepciones"
                    + " WHERE idNomina ="+idNom
                    + " AND idPercepcion="+idPer;

             Statement st = con.createStatement();

            st.executeUpdate(SQL);

            JOptionPane.showMessageDialog(null, "El registro a sido eliminado exitosamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
    }
      public void eliminarDeduccion(int idNom, int idDed) {

        try {
            String SQL = "DELETE FROM NominasDeducciones"
                    + " WHERE idNomina ="+idNom
                    + " AND idDeduccion="+idDed;

             Statement st = con.createStatement();

            st.executeUpdate(SQL);

            JOptionPane.showMessageDialog(null, "El registro a sido eliminado exitosamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
    }
      public void actualizarTotalPercepciones(int idNom) {
           float sub=0.0f;
          String SQL = "SELECT importe FROM NominasPercepciones WHERE idNomina = "+idNom;
           try {
             Statement st2 = con.createStatement();
            ResultSet rs2 = st2.executeQuery(SQL);

            while (rs2.next()) {
                
                 sub=sub+(rs2.getFloat("importe"));
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
            float ret=0.0f;
          String SQL2 = "SELECT importe FROM NominasDeducciones WHERE idNomina = "+idNom;
           try {
             Statement st3 = con.createStatement();
            ResultSet rs3 = st3.executeQuery(SQL2);

            while (rs3.next()) {
                
                 ret=ret+(rs3.getFloat("importe"));
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
           float total=sub-ret;
           String SQL3 = "UPDATE Nominas SET subtotal = ?, retenciones= ?, total= ? WHERE idNomina = ?";
        try {

PreparedStatement pst = con.prepareStatement(SQL3);

             pst.setFloat(1, sub);
            pst.setFloat(2, ret);
           pst.setFloat(3, total);
            pst.setInt(4, idNom);
          
            pst.execute();

            JOptionPane.showMessageDialog(null, "Actualización exitosa");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
    }   
      public void actualizarTotalDeducciones(int idNom) {
           float ret=0.0f;
          String SQL = "SELECT importe FROM NominasDeducciones WHERE idNomina = "+idNom;
           try {
             Statement st2 = con.createStatement();
            ResultSet rs2 = st2.executeQuery(SQL);

            while (rs2.next()) {
                
                 ret=ret+(rs2.getFloat("importe"));
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
            float sub=0.0f;
          String SQL2 = "SELECT importe FROM NominasPercepciones WHERE idNomina = "+idNom;
           try {
             Statement st3 = con.createStatement();
            ResultSet rs3 = st3.executeQuery(SQL2);

            while (rs3.next()) {
                
                 sub=sub+(rs3.getFloat("importe"));
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
           float total=sub-ret;
           String SQL3 = "UPDATE Nominas SET subtotal = ?, retenciones= ?, total= ? WHERE idNomina = ?";
        try {

PreparedStatement pst = con.prepareStatement(SQL3);

             pst.setFloat(1, sub);
            pst.setFloat(2, ret);
           pst.setFloat(3, total);
            pst.setInt(4, idNom);
          
            pst.execute();

            JOptionPane.showMessageDialog(null, "Actualización exitosa");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
    }   
       public int comprobarExistenciaP(int idNom, int idPercepcion){
         int nom=0;
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
           
           
            String SQL = "SELECT * FROM NominasPercepciones WHERE idNomina="+idNom+" AND idPercepcion="+idPercepcion;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            //Recorremos el ResultSet, nos devuelve verdadero cuando tiene un registro
            while (rs.next()) {
                //Al mÃ©todo getString le pasamos como argumento el nombre de la columna o nÃºmero de la columna de la tabla que queremos que nos devuelva.
               nom=rs.getInt(1);
               
            }
            //Para que no se seleccione ninguno en el combobox
           
            //Limpiamos la memoria
            rs.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nom;
    }
       public int comprobarExistenciaD(int idNom, int idDeduccion){
         int nom=0;
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
           
           
            String SQL = "SELECT * FROM NominasDeducciones WHERE idNomina="+idNom+" AND idDeduccion="+idDeduccion;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            //Recorremos el ResultSet, nos devuelve verdadero cuando tiene un registro
            while (rs.next()) {
                //Al mÃ©todo getString le pasamos como argumento el nombre de la columna o nÃºmero de la columna de la tabla que queremos que nos devuelva.
               nom=rs.getInt(1);
               
            }
            //Para que no se seleccione ninguno en el combobox
           
            //Limpiamos la memoria
            rs.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nom;
    }
       public int obtenerPercepcion(int idNom){
         int nom=0;
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
           
           
            String SQL = "select count(*) from NominasPercepciones WHERE idNomina= "+idNom;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            //Recorremos el ResultSet, nos devuelve verdadero cuando tiene un registro
            while (rs.next()) {
                //Al mÃ©todo getString le pasamos como argumento el nombre de la columna o nÃºmero de la columna de la tabla que queremos que nos devuelva.
               nom=rs.getInt(1);
               
            }
            //Para que no se seleccione ninguno en el combobox
           
            //Limpiamos la memoria
            rs.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nom;
    }
}
