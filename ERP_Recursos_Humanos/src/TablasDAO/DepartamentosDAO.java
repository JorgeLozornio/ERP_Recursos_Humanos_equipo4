
package TablasDAO;

import erp_recursos_humanos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

/////

public class DepartamentosDAO {
    
    Connection con;
    
    public DepartamentosDAO(Connection c){
        con = c;
    }
    
    public void insertar(String nombre, String estatus){
        try{
            
            String sql = "insert into departamentos (nombre, estatus) values (?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1, nombre);
            pst.setString(2, estatus);
          pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro exitoso");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al registrar: "+e.getMessage());
        }
    }
    
    public void actualizar(int id, String nombre, String estatus){
        
        try{
            String sql = "update departamentos set nombre = ?, estatus = ? where idDepartamento = ?";
            
            PreparedStatement pst = con.prepareStatement(sql);
        
            pst.setString(1, nombre);
            pst.setString(2, estatus);
            
            pst.setInt(3, id);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro modificado");
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }      
        
    }
    
    public DefaultTableModel mostrarTodo(){
        String [] titulos = {"IdDepartamento","nombre", "estatus"};
        String [] registros = new String [5];
        
        DefaultTableModel modelo = new DefaultTableModel (null,titulos);
        String sql = "select * from departamentos where estatus = 'A'";
        
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while( rs.next()){
                registros[0] = rs.getString("idDepartamento");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("estatus");
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
            String sql = "update departamentos set estatus = 'I' where idDepartamento = "+id;
            Statement st = con.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "Registro eliminado");
        
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public DefaultTableModel busqueda(String ca, String sel){
        String [] titulos = {"idDepartamento","nombre", "estatus"};
        String [] registros = new String [7];
        
        DefaultTableModel modelo = new DefaultTableModel (null,titulos);
        String sql = "select * from departamentos where "+sel+" like '"+ca+"%'";
    
        
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while( rs.next()){
                registros[0] = rs.getString("idDepartamento");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("estatus");
                
                modelo.addRow(registros);
                
            }
            
            return modelo;
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return modelo;
    }
    
}
