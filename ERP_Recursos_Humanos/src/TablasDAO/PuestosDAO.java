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


public class PuestosDAO {
    Connection con;
    
    public PuestosDAO(Connection c){
        con = c;
    }
    
    public void insertarDatos(String nombre, String estatus, float salarioMinimo, float salarioMaximo) {
        try {
            String SQL = "INSERT INTO Puestos (nombre, salarioMinimo, salarioMaximo, estatus) VALUES(?, ?, ?, ?)";

            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, nombre);

            pst.setFloat(2, salarioMinimo);
            
            pst.setFloat(3, salarioMaximo);

            pst.setString(4, estatus);

            pst.execute();

            JOptionPane.showMessageDialog(null, "Registro exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar: " + e.getMessage());
        }
    }
    
    public DefaultTableModel consultaDatos() {
        String[] titulos = {"idPuesto", "nombre", "salarioMinimo", "salarioMaximo", "estatus"};
        String[] registros = new String[6];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM Puestos WHERE estatus = 'A'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("idPuesto");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("salarioMinimo");
                registros[3] = rs.getString("salarioMaximo");
                registros[4] = rs.getString("estatus");
                model.addRow(registros);
            }
            return model;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
        return model;
    }
    
    
    public void actualizar(String nombre, float salarioMinimo, float salarioMaximo, String estatus, String id) {
        try {
            String SQL = "UPDATE Puestos SET nombre = ?, salarioMinimo = ?, salarioMaximo = ?, estatus = ? WHERE idPuesto = ?";

            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, nombre);

            pst.setFloat(2, salarioMinimo);

            pst.setFloat(3, salarioMaximo);
            
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
            String SQL = "UPDATE Puestos SET estatus = 'I' WHERE idPuesto =" + id;

            Statement st = con.createStatement();
            
            st.executeUpdate(SQL);

                JOptionPane.showMessageDialog(null, "El registro a sido eliminado exitosamente");
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
    }
    
}
