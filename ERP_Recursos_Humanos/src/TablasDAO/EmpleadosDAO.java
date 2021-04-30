
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
            
            String sql = "insert into Empleados (nombre, apellidoPaterno, apellidoMaterno, sexo, fechaNacimiento,"
                    + "curp, estadoCivil, fechaContratacion, salarioDiario, nss, diasVacaciones, diasPermiso, fotografia,"
                    + "direccion, colonia, codigoPostal, escolaridad, especialidad, email, pass, tipo, estatus,"
                    + "idDepartamento, idPuesto, idCiudad, idSucursal, idTurno) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
                    + "?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            String idD = getIdDepartamento(departamento);
            String idP= getIdPuesto(puesto);
            String idC = getIdCiudad(ciudad);
            String idS = getIdSucursal(sucursal);
            String idT = getIdTurno(turno);
            
            pst.setString(1, nombre);
            pst.setString(2, paterno);
            pst.setString(3, materno);
            
            pst.setString(4, sexo);
            pst.setString(5, fchNacimiento);
            pst.setString(6, curp);
            pst.setString(7, civil);
            pst.setString(8, fchContratacion);
            pst.setString(9, salario);
            pst.setString(10, nss);
            pst.setString(11, vacaciones);
            pst.setString(12, permiso);
            pst.setString(13, fotografia);
            pst.setString(14, direccion);
            pst.setString(15, colonia);
            pst.setString(16, cp);
            pst.setString(17, escolaridad);
            pst.setString(18, especialidad);
            pst.setString(19, email);
            pst.setString(20, contra);
            pst.setString(21, tipo);
            pst.setString(22, estatus);
            pst.setString(23, idD);
            pst.setString(24, idP);
            pst.setString(25, idC);
            pst.setString(26, idS);
            pst.setString(27, idT);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro exitoso");
            //mostrarDatos(i, f);
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
    
    public String getIdDepartamento(String nombre){
        String sql = "select idDepartamento from Departamentos where nombre = '"+nombre+"'";
        System.out.println(sql);
        String r = "";
        try{
            System.out.println("Hola");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            rs.next();
            r = rs.getString("iddepartamento");
            
            return r;
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se obtuvo el id de la tabla Departamentos");
        }
        return r;
    }
    
    public String getIdPuesto(String nombre){
        String sql = "select idPuesto from Puestos where nombre = '"+nombre+"'";
        String r = null;
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            rs.next();
            r = rs.getString("idPuesto");
            
            
            return r;
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se obtuvo el id de la tabla Puestos");
        }
        return r;
    }
    
    public String getIdCiudad(String nombre){
        String sql = "select idCiudad from Ciudades where nombre = '"+nombre+"'";
        String r = null;
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            rs.next();
            r = rs.getString("idCiudad");
            System.out.println(r);
            
            
            return r;
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se obtuvo el id de la tabla Ciudades");
        }
        return r;
    }
    
    public String getIdSucursal(String nombre){
        String sql = "select idSucursal from Sucursales where nombre = '"+nombre+"'";
        String r = null;
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            rs.next();
            r = rs.getString("idSucursal");
            
            
            return r;
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se obtuvo el id de la tabla Sucursales");
        }
        return r;
    }
    
    public String getIdTurno(String nombre){
        String sql = "select idTurno from Turnos where nombre = '"+nombre+"'";
        String r = null;
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            rs.next();
            r = rs.getString("idTurno");
            
            
            return r;
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se obtuvo el id de la tabla Turnos");
        }
        return r;
    }
}
