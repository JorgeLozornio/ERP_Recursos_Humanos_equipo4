
package TablasDAO;

/**
 *
 * @author andre
 */
import erp_recursos_humanos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PeriodosDAO {
    Connection con;
    
    public PeriodosDAO(Connection c){
        con = c;
    }
    
    public void insertarDatos(String nombre, String estatus, String fechaInicio, String fechaFin) {
        try {
            String SQL = "INSERT INTO Periodos (nombre, fechaInicio, fechaFin , estatus) VALUES(?, ?, ?, ?)";

            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, nombre);

            pst.setString(2, fechaInicio);
            
            pst.setString(3, fechaFin);

            pst.setString(4, estatus);

            pst.execute();

            JOptionPane.showMessageDialog(null, "Registro exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar: " + e.getMessage());
        }
    }
    
    public DefaultTableModel consultaDatos() {
        String[] titulos = {"idPeriodo", "nombre", "fechaInicio", "fechaFin", "estatus"};
        String[] registros = new String[6];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM Periodos WHERE estatus = 'A'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("idPeriodo");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("fechaInicio");
                registros[3] = rs.getString("fechaFin");
                registros[4] = rs.getString("estatus");
                model.addRow(registros);
            }
            return model;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
        return model;
    }
    
    
    public void actualizar(String nombre, String estatus, String fechaFin, String fechaInicio, String id) {
        try {
            String SQL = "UPDATE Periodos SET nombre = ?, fechaInicio = ?, fechaFin = ?, estatus = ? WHERE idPeriodo = ?";

            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, nombre);
            pst.setString(2, fechaInicio);
            pst.setString(3, fechaFin);
            pst.setString(4, estatus);
            pst.setString(5, id);

            pst.execute();

            JOptionPane.showMessageDialog(null, "Actualización exitosa");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
    }
    
    public void eliminar(String id) {

        try {
            String SQL = "UPDATE Periodos SET estatus = 'I' WHERE idPeriodo =" + id;

            Statement st = con.createStatement();
            
            st.executeUpdate(SQL);

                JOptionPane.showMessageDialog(null, "El registro a sido eliminado exitosamente");
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
    }
}
