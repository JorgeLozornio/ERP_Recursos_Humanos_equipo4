
package TablasDAO;

import erp_recursos_humanos.Conexion;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import modelo.Modelo_Departamentos;
import modelo.Modelo_DocumentacionEmpleado;
/////

public class DepartamentosDAO {
    
    Connection con;
    
    public DepartamentosDAO(Connection c){
        con = c;
    }
     public Modelo_Departamentos consultaIdDep(int idDepartamento) {
        String sql = (" select * "
                + " from Departamentos "
                + " where idDepartamento=" + idDepartamento);
        Modelo_Departamentos idDep = new Modelo_Departamentos();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                idDep.setIdDep(rs.getInt("idDepartamento"));
                idDep.setNombre(rs.getString("nombre"));
                idDep.setEstatus(rs.getString("estatus"));
                
                     
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return idDep;
    }
   public void insertarDatos(Modelo_Departamentos depa) {
        try {
            String SQL = "INSERT INTO Departamentos (nombre, estatus) VALUES(?, ?)";

         
  PreparedStatement pst = con.prepareStatement(SQL);
  
            pst.setString(1, depa.getNombre());
            pst.setString(2, depa.getEstatus()); 
            pst.execute();

            JOptionPane.showMessageDialog(null, "Registro exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar: " + e.getMessage());
        }
    }
    
    public void actualizarDatos(Modelo_Departamentos depa) {
        try {
            String SQL = "UPDATE Departamentos SET nombre = ?, estatus = ? WHERE idDepartamento = ?";
PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, depa.getNombre());
            pst.setString(2, depa.getEstatus());
            pst.setInt(3, depa.getIdDep());
            pst.execute();

            pst.execute();

            JOptionPane.showMessageDialog(null, "Actualización exitosa");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
    }
    
    public DefaultTableModel mostrarTodo(){
        String [] titulos = {"Id","nombre", "estatus"};
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
    
     public DefaultTableModel Buscar(String valor ) {
        String[] titulos = {"Id", "Nombre", "Estatus"};
        String[] registros = new String[5];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String SQL = "select * from departamentos WHERE nombre LIKE '%"+valor+"%' AND estatus = 'A'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("idDepartamento");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("estatus");
                model.addRow(registros);
            }
            return model;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
return model;
    }
    
}
