package TablasDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HistorialPuestosDAO {

    Connection con;

    public HistorialPuestosDAO(Connection c) {
        con = c;
    }

    public void insertarDatos(int idE, int idP, int idD, String fechaInicio, String fechaFin) {
        try {
            String SQL = "INSERT INTO HistorialPuestos (idEmpleado, idPuesto, idDepartamento, fechaInicio, fechaFin) VALUES(?, ?, ?, ?, ?)";

            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, idE + 1);

            pst.setInt(2, idP + 1);

            pst.setInt(3, idD + 1);

            pst.setString(4, fechaInicio);

            pst.setString(5, fechaFin);

            pst.execute();

            JOptionPane.showMessageDialog(null, "Registro exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar: " + e.getMessage());
        }
    }

    public DefaultTableModel consultaDatos() {
        String[] titulos = {"idEmpleado", "idPuesto", "idDepartamento", "fechaInicio", "fechaFin"};
        String[] registros = new String[6];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM HistorialPuestos";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("idEmpleado");
                registros[1] = rs.getString("idPuesto");
                registros[2] = rs.getString("idDepartamento");
                registros[3] = rs.getString("fechaInicio");
                registros[4] = rs.getString("fechaFin");
                model.addRow(registros);
            }
            return model;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
        return model;
    }

    public void actualizar(int idE, int idP, int idD, String fechaInicio, String fechaFin, String id) {
        try {
            String SQL = "UPDATE HistorialPuestos SET idEmpleado = ?, idPuesto = ?, idDepartamento = ?, fechaInicio = ?, fechaFin = ? WHERE idEmpleado = ?, idPuesto = ?, idDepartamento = ?";

            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, idE + 1);

            pst.setInt(2, idP + 1);

            pst.setInt(3, idD + 1);

            pst.setString(4, fechaInicio);

            pst.setString(5, fechaFin);

            pst.execute();

            JOptionPane.showMessageDialog(null, "Actualización exitosa");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
    }

    public void llenarComboE(JComboBox cbo, int columna) {
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
            cbo.removeAllItems();
            String SQL = "SELECT nombre FROM Empleados";
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

    public void llenarComboP(JComboBox cbo, int columna) {
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
            cbo.removeAllItems();
            String SQL = "SELECT nombre FROM Puestos";
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

    public void llenarComboD(JComboBox cbo, int columna) {
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
            cbo.removeAllItems();
            String SQL = "SELECT nombre FROM Departamentos";
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
}
