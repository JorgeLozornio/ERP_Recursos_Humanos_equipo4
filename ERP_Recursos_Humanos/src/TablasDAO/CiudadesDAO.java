package TablasDAO;

import erp_recursos_humanos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo_Ciudades;

public class CiudadesDAO {

    Connection con;

    public CiudadesDAO(Connection c) {
        con = c;
    }

    public void insertarDatos(String nombre, int idE, String estatus) {
        try {
            String SQL = "INSERT INTO Ciudades (nombre, idEstado, estatus) VALUES(?, ?, ?)";

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

    public DefaultTableModel consultaDatos(int inicio, int fin) {
        String[] titulos = {"idCiudad", "nombre", "idEstado", "estatus"};
        String[] registros = new String[5];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM Ciudades WHERE estatus = 'A' limit " + inicio + ", " + fin;
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
            String SQL = "UPDATE Ciudades SET nombre = ?, idEstado = ?, estatus = ? WHERE idCiudad = ?";

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
            String SQL = "UPDATE Ciudades SET estatus = 'I' WHERE idCiudad =" + id;

            Statement st = con.createStatement();

            st.executeUpdate(SQL);

            JOptionPane.showMessageDialog(null, "El registro a sido eliminado exitosamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
    }

    public void llenarCombo(JComboBox cbo, int columna) {
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
            cbo.removeAllItems();
            String SQL = "SELECT nombre FROM Estados";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            //Recorremos el ResultSet, nos devuelve verdadero cuando tiene un registro
            while (rs.next()) {
                //Al método getString le pasamos como argumento el nombre de la columna o número de la columna de la tabla que queremos que nos devuelva.
                cbo.addItem(rs.getString(columna));
            }
            //Para que no se seleccione ninguno en el combobox
            cbo.setSelectedIndex(-1);
            //Limpiamos la memoria
            rs.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Modelo_Ciudades consultaidCiudad(int idCiudad) {
        String sql = (" SELECT * "
                + " FROM Ciudades "
                + " WHERE idCiudad = " + idCiudad);
        Modelo_Ciudades registros = new Modelo_Ciudades();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                registros.setidCiudad(rs.getInt("idCiudad"));
                registros.setNombre(rs.getString("nombre"));
                registros.setidEstado(rs.getInt("idEstado"));
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
