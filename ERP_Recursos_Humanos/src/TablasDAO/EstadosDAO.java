
package TablasDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author napoleon
 */
public class EstadosDAO {
    Connection con;

    public EstadosDAO(Connection c) {
        con=c;
        
    }
    public void insertar(String nombre, String siglas, String estatus){
        try{
            
            String sql = "insert into Estados (nombre, siglas, estatus) values (?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1, nombre);
            pst.setString(2, siglas);
            pst.setString(3, estatus);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al registrar: ");
        }
    }
    public void actualizar(String nombre, String siglas,String estatus, String id){
        
        try{
            String sql = "update Estados set nombre = ?, siglas = ?, estatus = ? where idEstado = ?";
            
            PreparedStatement pst = con.prepareStatement(sql);
        
            pst.setString(1, nombre);
            pst.setString(2, siglas);
            pst.setString(3, estatus);
            pst.setString(4, id);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro modificado");
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }      
    }
    
    public DefaultTableModel mostrarDat(int inicio,int fin){
        String [] titulos = {"idEstado","nombre", "siglas","estatus"};
        String [] registros = new String [5];
        
        DefaultTableModel modeloo = new DefaultTableModel (null,titulos);
        String sql = "select * from Estados where estatus = 'A'limit " +inicio+", "+fin;
        
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while( rs.next()){
                registros[0] = rs.getString("idEstado");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("siglas");
                registros[3] = rs.getString("estatus");
                
                modeloo.addRow(registros);
                
            }
            
            return modeloo;
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return modeloo;
    }
    
        public void eliminar(String id){        
        
        try{
            String sql = "update Estados set estatus = 'I' where idEstado = "+id;
            Statement st = con.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "Registro eliminado");
        
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
}
