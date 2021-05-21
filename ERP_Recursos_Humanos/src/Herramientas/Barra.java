
package Herramientas;

import javax.swing.JLabel;

/**
 *
 * @author Lozy
 */
public class Barra {
    
    int xx, xy;
    JLabel barra;
    
    public Barra(JLabel b){
        barra = b;
    }
    
    public void barraPressed(java.awt.event.MouseEvent evt){
        xx = evt.getX();
        xy = evt.getY();
    }
    
    public void barraDraggedd(java.awt.event.MouseEvent evt){
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
    }
}
