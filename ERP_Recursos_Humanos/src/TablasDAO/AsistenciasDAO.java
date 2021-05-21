
package TablasDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lozy
 */
public class AsistenciasDAO {
 
    Connection con;
    int i;
    int f;
    
    public AsistenciasDAO(Connection c){
        con = c;
    }
    
    public void insertar(String fecha, String h1, String h2, String dia, String empleado, String estatus){
        try{
            
            String sql = "insert into Asistencias (fecha, horaEntrada, horaSalida, dia, idEmpleado, estatus) values (?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            String idE = getIdEmpleado(empleado);
            
            pst.setString(1, fecha);
            pst.setString(2, h1);
            pst.setString(3, h2);            
            pst.setString(4, dia);
            pst.setString(5, idE);
            pst.setString(6, estatus);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro exitoso");
            mostrarDatos(i, f);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al registrar: "+e.getMessage());
        }
    }
    
    public DefaultTableModel mostrarDatos(int inicio, int fin){
        String [] titulos = {"idAsistencia","fecha", "horaEntrada", "horaSalida", "dia", "empleado","estatus"};
        String [] registros = new String [8];
        
        DefaultTableModel modelo = new DefaultTableModel (null,titulos);
        String sql = "select * from Asistencias where estatus = 'A' limit "+inicio+", "+fin;
        
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while( rs.next()){
                registros[0] = rs.getString("idAsistencia");
                registros[1] = rs.getString("fecha");
                registros[2] = rs.getString("horaEntrada");
                registros[3] = rs.getString("horaSalida");
                registros[4] = rs.getString("dia");
                registros[5] = rs.getString("idEmpleado");
                registros[6] = rs.getString("estatus");
                
                modelo.addRow(registros);
                
            }
            
            return modelo;
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return modelo;
    }
    
    public void actualizar(String fecha, String h1, String h2, String dia, String empleado, String estatus, String id){
        
        try{
            String sql = "update Asistencias set fecha = ?, horaEntrada = ?, horaSalida = ?, dia = ?, idEmpleado = ?, estatus = ? where idAsistencia = ?";
            
            PreparedStatement pst = con.prepareStatement(sql);
        
            pst.setString(1, fecha);
            pst.setString(2, h1);
            pst.setString(3, h2);
           
            pst.setString(4, dia);
            pst.setString(5, empleado);
            pst.setString(6, estatus);
            pst.setString(7, id);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro modificado");
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }      
        
    }
    
    public void eliminar(String id){        
        
        try{
            String sql = "update Asistencias set estatus = 'I' where idAsistencia = "+id;
            Statement st = con.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "Registro eliminado");
        
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public void combo(JComboBox cbo, int columna, String tabla){
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
            cbo.removeAllItems();
            String SQL = "SELECT nombre FROM "+tabla+" where estatus = 'A'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            //Recorremos el ResultSet, nos devuelve verdadero cuando tiene un registro
            while (rs.next()) {
                //Al método getString le pasamos como argumento el nombre de la columna o número de la columna de la tabla que queremos que nos devuelva.
                cbo.addItem(rs.getString(columna));
            }
            //Limpiamos la memoria
            rs.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String getIdEmpleado(String nombre){
        String sql = "select idEmpleado from Empleados where nombre = '"+nombre+"'";
        System.out.println(sql);
        String r = "";
        try{
            System.out.println("Hola");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            rs.next();
            r = rs.getString("idEmpleado");
            
            return r;
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se obtuvo el id de la tabla Empleados");
        }
        return r;
    }
    
}
