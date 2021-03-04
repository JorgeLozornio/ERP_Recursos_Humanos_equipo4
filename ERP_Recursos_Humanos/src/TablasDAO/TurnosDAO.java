
package TablasDAO;

import erp_recursos_humanos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TurnosDAO {
    
    Conexion c = new Conexion();
    Connection con = c.conexion();
    
    public void insertar(String nombre, String h1, String h2, String dias){
        try{
            
            String sql = "insert into RHTurnos (nombre, horaInicio, horaFin, dias) values (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1, nombre);
            pst.setString(2, h1);
            pst.setString(3, h2);
            
            pst.setString(4, dias);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro exitoso");
            mostrarDatos();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al registrar: "+e.getMessage());
        }
    }
    
    public void actualizar(String nombre, String h1, String h2, String dias, String id){
        
        try{
            String sql = "update RHTurnos set nombre = ?, horaInicio = ?, horaFin = ?, dias = ? where idTurno = ?";
            
            PreparedStatement pst = con.prepareStatement(sql);
        
            pst.setString(1, nombre);
            pst.setString(2, h1);
            pst.setString(3, h2);
           
            pst.setString(4, dias);
            pst.setString(5, id);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro modificado");
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }      
        
    }
    
    public DefaultTableModel mostrarDatos(){
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
            
            return modelo;
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return modelo;
    }
    
    public void eliminar(String id){        
        
        try{
            String sql = "delete from RHTurnos where idTurno = "+id;
            Statement st = con.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "Registro eliminado");
        
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
}
