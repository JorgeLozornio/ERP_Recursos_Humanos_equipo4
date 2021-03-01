
package erp_recursos_humanos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    
    Connection con;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "ufcdipekfe2lrcg5";
    private static final String pass = "EVojeEXkDROcXtIx66xt";
    private static final String url = "jdbc:mysql://ufcdipekfe2lrcg5:EVojeEXkDROcXtIx66xt@bpon9bafeb9cpa9jaxao-mysql.services.clever-cloud.com:3306/bpon9bafeb9cpa9jaxao";
    
    public Conexion(){
        
        con = null;
        
        try{
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, user, pass);
            if(con != null){
                System.out.println("Conexion establecida");
            }
            
        } catch (ClassNotFoundException |  SQLException e){
            System.out.println("Error de conexion" + e);
        }
        
    }
            
}
