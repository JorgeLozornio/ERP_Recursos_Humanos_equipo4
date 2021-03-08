package TablasDAO;

import erp_recursos_humanos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CiudadesDAO {
    Connection con;
    
    public CiudadesDAO(Connection c){
        con = c;
    }
        
    public void insertarDatos(String nombre, int idE, String estatus) {
        try {
            String SQL = "INSERT INTO RHCiudades (nombre, idEstado, estatus) VALUES(?, ?, ?)";

            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, nombre);

            pst.setInt(2, idE + 1);

            pst.setString(3, estatus);

            pst.execute();

            JOptionPane.showMessageDialog(null, "Registro exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar: " + e.getMessage());
        }
    }
    
        public DefaultTableModel consultaDatos() {
        String[] titulos = {"idCiudad", "nombre", "idEstado", "estatus"};
        String[] registros = new String[5];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM RHCiudades";
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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
        return model;

    }
    
        public void actualizar(String nombre, int idE, String estatus, String id) {
        try {
            String SQL = "UPDATE RHCiudades SET nombre = ?, idEstado = ?, estatus = ? WHERE idCiudad = ?";

            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, nombre);

            pst.setInt(2, idE + 1);

            pst.setString(3, estatus);
            
            pst.setString(4, id);

            pst.execute();

            JOptionPane.showMessageDialog(null, "Actualización exitosa");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
    }
        
        public void eliminar(String id) {

        try {
            String SQL = "DELETE FROM RHCiudades WHERE idCiudad =" + id;

            Statement st = con.createStatement();
            
            st.executeUpdate(SQL);

                JOptionPane.showMessageDialog(null, "El registro a sido eliminado exitosamente");
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
    }
}
