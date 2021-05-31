package TablasDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo_FormasPago;

public class FormasPagoDAO {

    Connection con;

    public FormasPagoDAO(Connection c) {
        con = c;
    }

    public void insertarDatos(String nombre, String estatus) {
        try {
            String SQL = "INSERT INTO FormasPago (nombre, estatus) VALUES(?, ?)";

            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, nombre);

            pst.setString(2, estatus);

            pst.execute();

            JOptionPane.showMessageDialog(null, "Registro exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar: " + e.getMessage());
        }
    }

    public DefaultTableModel consultaDatos(int inicio, int fin) {
        String[] titulos = {"idFormaPago", "Nombre", "Estatus"};
        String[] registros = new String[4];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM FormasPago WHERE estatus = 'A' limit " + inicio + ", " + fin;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("idFormaPago");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Estatus");
                model.addRow(registros);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
        return model;

    }

    public void actualizar(String nombre, String estatus, String id) {
        try {
            String SQL = "UPDATE FormasPago SET nombre = ?, estatus = ? WHERE idFormaPago = ?";

            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, nombre);

            pst.setString(2, estatus);

            pst.setString(3, id);

            pst.execute();

            JOptionPane.showMessageDialog(null, "Actualización exitosa");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
    }

    public void eliminar(String id) {

        try {
            String SQL = "UPDATE FormasPago SET estatus = 'I' WHERE idFormaPago =" + id;

            Statement st = con.createStatement();

            st.executeUpdate(SQL);

            JOptionPane.showMessageDialog(null, "El registro a sido eliminado exitosamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
    }

    public Modelo_FormasPago consultaidFormaPago(int idDeduccion) {
        String sql = (" SELECT * "
                + " FROM FormasPago "
                + " WHERE idFormaPago = " + idDeduccion);
        Modelo_FormasPago registros = new Modelo_FormasPago();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                registros.setidFormaPago(rs.getInt("idFormaPago"));
                registros.setNombre(rs.getString("nombre"));
                registros.setEstatus(rs.getString("estatus"));
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return registros;
    }

}
