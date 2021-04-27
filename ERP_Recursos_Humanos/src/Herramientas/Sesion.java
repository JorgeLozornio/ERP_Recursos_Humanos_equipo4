
package Herramientas;

import java.sql.Connection;
import javax.swing.JOptionPane;

public class Sesion {
    
    Connection con;
    
    public Sesion(Connection c){
        con = c;
    }
    
    public boolean cerrarSesion(){
        String [] op = {"Si","No"};
        int b = JOptionPane.showOptionDialog(null,"¿Deseas cerrar sesión?",
                "Cerrar Sesión", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, op,op[0]);
        if(b == 0){
            return true;
        }else{
            return false;
        }
    }
    
}
