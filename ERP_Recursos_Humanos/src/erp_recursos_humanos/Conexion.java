
package erp_recursos_humanos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    
    Connection con;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/ERP";
    
    public Connection conexion(String user, String pass){
        
        con = null;
        
        try{
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, user, pass);
            if(con != null){
                JOptionPane.showMessageDialog(null, "Conexión establecida");
            }
            
        } catch (ClassNotFoundException |  SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexion: "+e.getMessage());
        }
        return con;
        
    }
            
}
