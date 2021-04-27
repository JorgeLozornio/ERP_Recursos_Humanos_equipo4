package TablasDAO;

import erp_recursos_humanos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DeduccionesDAO {

    Connection con;

    public DeduccionesDAO(Connection c) {
        con = c;
    }

    public void insertarDatos(String nombre, String descripcion, float porcentaje, String estatus) {
        try {
            String SQL = "INSERT INTO Deducciones (nombre, descripcion, porcentaje, estatus) VALUES(?, ?, ?, ?)";

            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, nombre);

            pst.setString(2, descripcion);

            pst.setFloat(3, porcentaje);
            
            pst.setString(4, estatus);

            pst.execute();

            JOptionPane.showMessageDialog(null, "Registro exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar: " + e.getMessage());
        }
    }

    public DefaultTableModel consultaDatos(int inicio, int fin) {
        String[] titulos = {"idDeduccion", "Nombre", "Descripcion", "Porcentaje", "Estatus"};
        String[] registros = new String[6];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM Deducciones WHERE estatus = 'A' limit "+inicio+", "+fin;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("idDeduccion");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("descripcion");
                registros[3] = rs.getString("porcentaje");
                registros[4] = rs.getString("Estatus");
                model.addRow(registros);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
        return model;

    }

    public void actualizar(String nombre, String descripcion, float porcentaje, String estatus, String id) {
        try {
            String SQL = "UPDATE Deducciones SET nombre = ?, descripcion = ?, porcentaje = ?, estatus = ? WHERE idDeduccion = ?";

            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, nombre);

            pst.setString(2, descripcion);

            pst.setFloat(3, porcentaje);
            
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
            String SQL = "UPDATE Deducciones SET estatus = 'I' WHERE idDeduccion =" + id;

            Statement st = con.createStatement();

            st.executeUpdate(SQL);

            JOptionPane.showMessageDialog(null, "El registro a sido eliminado exitosamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
    }

}
