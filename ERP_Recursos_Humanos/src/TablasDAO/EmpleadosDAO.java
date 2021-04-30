
package TablasDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class EmpleadosDAO {
    
    Connection con;
    int i;
    int f;
    
    public EmpleadosDAO(Connection c){
        con = c;
    }
    
    public void insertar(String nombre, String paterno, String materno, String sexo, String fchNacimiento,
            String curp, String civil, String fchContratacion, String salario, String nss, String vacaciones,
            String permiso, String fotografia, String direccion, String colonia, String cp, String escolaridad,
            String especialidad, String email, String contra, String tipo, String estatus, String departamento,
            String puesto, String ciudad, String sucursal, String turno){
        try{
            
            String sql = "insert into Turnos (nombre, horaInicio, horaFin, dias, estatus) values (?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1, nombre);
            pst.setString(2, h1);
            pst.setString(3, h2);
            
            pst.setString(4, dias);
            pst.setString(5, estatus);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro exitoso");
            mostrarDatos(i, f);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al registrar: "+e.getMessage());
        }
    }
    
    
    public void combo(JComboBox cbo, int columna, String tabla){
        try {
            //Siempre que queremos llenar algo tenemos que limpiarlo
            cbo.removeAllItems();
            String SQL = "SELECT nombre FROM "+tabla;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            //Recorremos el ResultSet, nos devuelve verdadero cuando tiene un registro
            while (rs.next()) {
                //Al método getString le pasamos como argumento el nombre de la columna o número de la columna de la tabla que queremos que nos devuelva.
                cbo.addItem(rs.getString(columna));
            }
            //Limpiamos la memoria
            rs.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
