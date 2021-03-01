
package erp_recursos_humanos;

import java.sql.ResultSet;
import java.sql.Statement;


public class ERP_Recursos_Humanos {

    
    public static void main(String[] args) {
        
        Conexion cn = new Conexion();
        Statement st;
        ResultSet rs;
        
        try{
            st = cn.con.createStatement();
            rs = st.executeQuery("show tables");
            while (rs.next()){
                System.out.println(rs.getRow());
            }
            cn.con.close();
        } catch (Exception e){            
        }
        
    }
    
}
