
package erp_recursos_humanos;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    
    Connection con;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    
    
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://bpon9bafeb9cpa9jaxao-mysql.services.clever-cloud.com/bpon9bafeb9cpa9jaxao","ufcdipekfe2lrcg5","EVojeEXkDROcXtIx66xt");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
            
}
