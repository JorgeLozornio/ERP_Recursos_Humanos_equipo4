
package Reloj;

import java.awt.Label;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JLabel;


public class Reloj  extends Thread{
    
    String hora, min, seg, ampm, ca, fch, usuario;
    Calendar calendario;
    JLabel label;
    
    public Reloj(JLabel lbl, String u){
        label = lbl;
        usuario = u;
    }
    
    @Override
    public void run() {
        
        while(true){
            calcula();
            label.setText(fch+"    "+hora+":"+min+":"+seg+" "+ampm+"     "+usuario);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                
            }
        }
    }

    private void calcula() {
        Calendar calendario = new GregorianCalendar();
        Date fecha = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String fechaTexto = formatter.format(fecha);
        fch = fechaTexto;
        calendario.setTime(fecha);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM?"AM":"PM";
        
        if(ampm.equals("PM")){
            int h = calendario.get(Calendar.HOUR_OF_DAY)-12;
            hora = h>9?""+h:"0"+h;            
        }else{
            hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        }
        min = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        seg = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
    
    
    
}
