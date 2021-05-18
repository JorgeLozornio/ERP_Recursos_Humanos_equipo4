
package TablasDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.modelo_percepcion;

/**
 *
 * @author napoleon
 */
public class percepcionesDAO {

    Connection con;

    public percepcionesDAO(Connection c) {
        con = c;
    }

    public void insertar(modelo_percepcion per) {
        try {
            String SQL = "INSERT INTO Percepciones (nombre, descripcion, diasPagar ,estatus) VALUES(?, ?, ?,?)";

            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, per.getNombre());
            pst.setString(2, per.getDescripcion());
            pst.setInt(3, per.getDiasPagar());
            pst.setString(4, per.getEstatus());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Registro exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar: " + e.getMessage());
        }
    }

    public DefaultTableModel mostrarDat(int inicio, int fin) {
        String[] titulos = {"idPercepcion", "nombre", "descripcion", "diasPagar", "estatus"};
        String[] registros = new String[6];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM Percepciones WHERE estatus = 'A' limit " + inicio + ", " + fin;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("idPercepcion");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("descripcion");
                registros[3] = rs.getString("diasPagar");
                registros[4] = rs.getString("estatus");
                model.addRow(registros);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
        return model;

    }

    public void actualizar(String nombre, String descripcion, int diasPagar, String estatus, String id) {
        try {
            String SQL = "UPDATE Percepciones SET nombre = ?, descripcion = ?, diasPagar = ?, estatus = ? WHERE idPercepcion = ?";

            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, nombre);
            pst.setString(2, descripcion);
            pst.setInt(3, diasPagar);
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
            String SQL = "UPDATE Percepciones SET estatus = 'I' WHERE idPercepcion =" + id;

            Statement st = con.createStatement();

            st.executeUpdate(SQL);

            JOptionPane.showMessageDialog(null, "El registro a sido eliminado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: ");
        }
    }

    public modelo_percepcion consultaIdpercep(int idpercep) {
        String sql = (" select * "
                + " from Percepciones "
                + " where idPercepcion=" + idpercep);
        modelo_percepcion per = new modelo_percepcion();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                per.setIdPercep(rs.getInt("idPercepcion"));
                per.setNombre(rs.getString("nombre"));
                per.setDescripcion(rs.getString("descripcion"));
                per.setDiasPagar(rs.getInt("diasPagar"));
                per.setEstatus(rs.getString("estatus"));

            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return per;
    }
}

   
