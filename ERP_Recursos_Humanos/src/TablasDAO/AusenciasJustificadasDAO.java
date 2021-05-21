package TablasDAO;

/**
 *
 * @author andre
 */
import Paginacion.Paginacion;
import erp_recursos_humanos.Conexion;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo_AusenciasJustificadas;
        

public class AusenciasJustificadasDAO {

    Connection con;

    public AusenciasJustificadasDAO(Connection c) {
        con = c;
    }

    public void insertarDatos(Modelo_AusenciasJustificadas AusenciasJ) {
        try {
            String SQL = "INSERT INTO AusenciasJustificadas (fechaSolicitud, fechaInicio, fechaFin, tipo, idEmpleadoSolicita, idEmpleadoAutoriza, evidencia, estatus, motivo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement pst = con.prepareStatement(SQL);

            Date fechaSolicitud = AusenciasJ.getFechaSolicitud();
            java.sql.Date solicitud = new java.sql.Date(fechaSolicitud.getTime());

            Date fechaInicio = AusenciasJ.getFechaInicio();
            java.sql.Date inicio = new java.sql.Date(fechaInicio.getTime());

            Date fechaFin = AusenciasJ.getFechaFin();
            java.sql.Date fin = new java.sql.Date(fechaFin.getTime());

            File doc = new File(AusenciasJ.getEvidencia());
            FileInputStream fis = new FileInputStream(doc);
            pst.setDate(1, solicitud);
            pst.setDate(2, inicio);
            pst.setDate(3, fin);
            pst.setString(4, AusenciasJ.getTipo());
            pst.setInt(5, AusenciasJ.getidEmpleadoSolicita());
            pst.setInt(6, AusenciasJ.getidEmpleadoAutoriza());
            pst.setBinaryStream(7, fis, (int) doc.length());
            pst.setString(8, AusenciasJ.getEstatus());
            pst.setString(9, AusenciasJ.getMotivo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar: " + e.getMessage());
        }
    }

    public DefaultTableModel consultaDatos(int inicio, int fin) {
        String[] titulos = {"idAusencia", "fechaSolicitud", "fechaInicio", "fechaFin", "tipo", "idEmpleadoSolicita", "idEmpleadoAutoriza", "evidencia", "estatus", "motivo"};
        String[] registros = new String[10];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String SQL = "select * from AusenciasJustificadas where estatus = 'A' limit " + inicio + ", " + fin;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("idAusencia");
                registros[1] = rs.getString("fechaSolicitud");
                registros[2] = rs.getString("fechaInicio");
                registros[3] = rs.getString("fechaFin");
                registros[4] = rs.getString("tipo");
                registros[5] = rs.getString("idEmpleadoSolicita");
                registros[6] = rs.getString("idEmpleadoAutoriza");
                registros[7] = rs.getString("evidencia");
                registros[8] = rs.getString("estatus");
                registros[9] = rs.getString("motivo");
                model.addRow(registros);
            }
            return model;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
        return model;
    }

    public void actualizar(Modelo_AusenciasJustificadas AusenciasJ) {
        try {
            String SQL = "UPDATE AusenciasJustificadas SET fechaSolicitud=?, fechaInicio = ?, fechaFin = ?, tipo=?, idEmpleadoSolicita=?, idEmpleadoAutoriza=?, evidencia=?, estatus = ?, motivo=? WHERE idAusencia = "+AusenciasJ.getId();
            PreparedStatement pst = con.prepareStatement(SQL);
            
            Date fechaSolicitud = AusenciasJ.getFechaSolicitud();
            java.sql.Date solicitud = new java.sql.Date(fechaSolicitud.getTime());
            
            Date fechaInicio = AusenciasJ.getFechaInicio();
            java.sql.Date inicio = new java.sql.Date(fechaInicio.getTime());

            Date fechaFin = AusenciasJ.getFechaFin();
            java.sql.Date fin = new java.sql.Date(fechaFin.getTime());
            pst.setDate(1, solicitud);
            pst.setDate(2, inicio);
            pst.setDate(3, fin);
            pst.setString(4, AusenciasJ.getTipo());
            pst.setInt(5, AusenciasJ.getidEmpleadoSolicita());
            pst.setInt(6, AusenciasJ.getidEmpleadoAutoriza());
            pst.setString(7, AusenciasJ.getEvidencia());
            pst.setString(8, AusenciasJ.getEstatus());
            pst.setString(9, AusenciasJ.getMotivo());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Actualización exitosa");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
    }

    public void eliminar(String id) {

        try {
            String SQL = "UPDATE AusenciasJustificadas SET estatus = 'I' WHERE idAusencia =" + id;

            Statement st = con.createStatement();

            st.executeUpdate(SQL);

            JOptionPane.showMessageDialog(null, "El registro a sido eliminado exitosamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
    }

    public Modelo_AusenciasJustificadas consultaId(int idAusencia) {
        String sql = (" select * "
                + " from AusenciasJustificadas "
                + " where idAusencia=" + idAusencia);
        Modelo_AusenciasJustificadas Doc = new Modelo_AusenciasJustificadas();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Doc.setId(rs.getInt("idAusencia"));
                Doc.setFechaSolicitud(rs.getDate("fechaSolicitud"));
                Doc.setFechaInicio(rs.getDate("fechaInicio"));
                Doc.setFechaFin(rs.getDate("fechaFin"));
                Doc.setTipo(rs.getString("tipo"));
                Doc.setidEmpleadoSolicita(rs.getInt("idEmpleadoSolicita"));
                Doc.setidEmpleadoAutoriza(rs.getInt("idEmpleadoAutoriza"));
                Doc.setEvidencia(rs.getString("evidencia"));
                Doc.setEstatus(rs.getString("estatus"));
                Doc.setMotivo(rs.getString("motivo"));
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return Doc;
    }

    public void llenarCombo(JComboBox cbo, int columna) {
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
            cbo.removeAllItems();
            String SQL = "SELECT nombre FROM empleados";
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

    public void llenarArreglo(int ar[], int columna, int num) {
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
            ar = null;
            int c = 0;
            String SQL = "SELECT idEmpleado FROM empleados";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            ar = new int[num];
            //Recorremos el ResultSet, nos devuelve verdadero cuando tiene un registro
            while (rs.next()) {
                //Al método getString le pasamos como argumento el nombre de la columna o número de la columna de la tabla que queremos que nos devuelva.
                ar[c] = rs.getInt(columna);
                c++;
            }
            //Para que no se seleccione ninguno en el combobox

            //Limpiamos la memoria
            rs.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
