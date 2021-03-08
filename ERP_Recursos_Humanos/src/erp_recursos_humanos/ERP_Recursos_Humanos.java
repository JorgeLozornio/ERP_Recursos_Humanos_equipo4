
package erp_recursos_humanos;

import Interfaz.Login;
import Tablas_Interfacez.Ciudades;
import Tablas_Interfacez.MenuTablas;
import Tablas_Interfacez.Turnos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class ERP_Recursos_Humanos {

    
    public static void main(String[] args) {
        
        Login l = new Login();
        l.setVisible(true);
        
        Conexion c = new Conexion();
        Connection con = c.conexion("root", "");
        
    }
    
}
