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

    public void insertarDatos(String idE, String idP, String idD, String fechaInicio, String fechaFin, String estatus) {
        try {
            String SQL = "INSERT INTO HistorialPuestos (idEmpleado, idPuesto, idDepartamento, fechaInicio, fechaFin, estatus) VALUES(?, ?, ?, ?, ?, ?)";

            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, idE);

            pst.setString(2, idP);

            pst.setString(3, idD);

            pst.setString(4, fechaInicio);

            pst.setString(5, fechaFin);
            
            pst.setString(6, estatus);

            pst.execute();

            JOptionPane.showMessageDialog(null, "Registro exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar: " + e.getMessage());
        }
    }

    public DefaultTableModel consultaDatos(int inicio, int fin) {
        String[] titulos = {"idEmpleado", "idPuesto", "idDepartamento", "fechaInicio", "fechaFin", "estatus"};
        String[] registros = new String[7];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String SQL = "select concat(e.nombre, ' ', e.apellidopaterno, ' ', e.apellidomaterno) as empleado, p.nombre as puesto, d.nombre as departamento, h.fechainicio, h.fechafin, h.estatus"
                    + " from historialpuestos as h join empleados as e on h.idEmpleado = e.idEmpleado\n" +
                    "join puestos as p on h.idpuesto = p.idpuesto\n" +
                    "join departamentos as d on h.iddepartamento = d.iddepartamento where h.estatus = 'A' limit "+inicio+", "+fin;
        
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("empleado");
                registros[1] = rs.getString("puesto");
                registros[2] = rs.getString("departamento");
                registros[3] = rs.getString("fechaInicio");
                registros[4] = rs.getString("fechaFin");
                registros[5] = rs.getString("estatus");
                model.addRow(registros);
            }
            return model;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
        return model;
    }

    public void actualizar(String fechaInicio, String fechaFin, String estatus, String id1, String id2, String id3) {
        try {
            String SQL = "UPDATE HistorialPuestos SET fechaInicio = ?, fechaFin = ? , estatus = ? WHERE idEmpleado = ? and idPuesto = ? and idDepartamento = ?";

            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, fechaInicio);

            pst.setString(2, fechaFin);
            
            pst.setString(3, estatus);
            
            pst.setString(4, id1);
            
            pst.setString(5, id2);
            
            pst.setString(6, id3);

            pst.execute();

            JOptionPane.showMessageDialog(null, "Actualización exitosa");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
    }
    
    public void eliminar(String id1, String id2, String id3){        
        
        try{
            String sql = "update HistorialPuestos set estatus = 'I' where idempleado = "+id1+" and idpuesto = "+id2+" and iddepartamento = "+id3;
            Statement st = con.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "Registro eliminado");
        
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }

    public String[] busquedaIndividual(String id1, String id2, String id3){
        String [] registros = new String [7];
        
        String sql = "select h.idempleado, h.idpuesto, h.iddepartamento, h.fechainicio, h.fechafin, h.estatus from historialpuestos "
                    + "as h join empleados as e on h.idEmpleado = e.idEmpleado\n" +
                    "join puestos as p on h.idpuesto = p.idpuesto\n" +
                    "join departamentos as d on h.iddepartamento = d.iddepartamento where h.idempleado = "+id1+" and h.idpuesto = "+id2+" and h.iddepartamento = "+id3;
        
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while( rs.next()){                
                
                registros[0] = rs.getString("idempleado");
                registros[1] = rs.getString("idpuesto");
                registros[2] = rs.getString("iddepartamento");
                registros[3] = rs.getString("fechaInicio");
                registros[4] = rs.getString("fechaFin");
                registros[5] = rs.getString("estatus");
                
            }
            
            return registros;
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return registros;
    }
    
    public DefaultTableModel busqueda(int inicio, int fin, String ca){
        String[] titulos = {"idEmpleado", "idPuesto", "idDepartamento", "fechaInicio", "fechaFin", "estatus"};
        String[] registros = new String[7];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String SQL = "select concat(e.nombre, ' ', e.apellidopaterno, ' ', e.apellidomaterno) as empleado, p.nombre as puesto, d.nombre as departamento, h.fechainicio, h.fechafin, h.estatus"
                    + " from historialpuestos as h join empleados as e on h.idEmpleado = e.idEmpleado\n" +
                    "join puestos as p on h.idpuesto = p.idpuesto\n" +
                    "join departamentos as d on h.iddepartamento = d.iddepartamento where p.nombre like '"+ca+"%' limit "+inicio+", "+fin;
        
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("empleado");
                registros[1] = rs.getString("puesto");
                registros[2] = rs.getString("departamento");
                registros[3] = rs.getString("fechaInicio");
                registros[4] = rs.getString("fechaFin");
                registros[5] = rs.getString("estatus");
                model.addRow(registros);
            }
            return model;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
        return model;
    }

    public void llenarComboE(JComboBox cbo, int columna) {
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
            cbo.removeAllItems();
            String SQL = "select concat(idEmpleado, '. ') as idEmpleado, concat(nombre, ' ', apellidoPaterno, ' ', apellidoMaterno) as nombre from empleados where estatus = 'A'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            //Recorremos el ResultSet, nos devuelve verdadero cuando tiene un registro
            while (rs.next()) {
                //Al método getString le pasamos como argumento el nombre de la columna o número de la columna de la tabla que queremos que nos devuelva.
                cbo.addItem(rs.getString(1)+" " + rs.getString(2));
            }
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
            String SQL = "select concat(idPuesto, '. ') as idPuesto, nombre from puestos where estatus = 'A'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            //Recorremos el ResultSet, nos devuelve verdadero cuando tiene un registro
            while (rs.next()) {
                //Al método getString le pasamos como argumento el nombre de la columna o número de la columna de la tabla que queremos que nos devuelva.
                cbo.addItem(rs.getString(1)+" " + rs.getString(2));
            }
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
            String SQL = "select concat(idDepartamento, '. ') as idDepartamento, nombre from departamentos where estatus = 'A'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            //Recorremos el ResultSet, nos devuelve verdadero cuando tiene un registro
            while (rs.next()) {
                //Al método getString le pasamos como argumento el nombre de la columna o número de la columna de la tabla que queremos que nos devuelva.
                cbo.addItem(rs.getString(1)+" " + rs.getString(2));
            }
            //Limpiamos la memoria
            rs.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
