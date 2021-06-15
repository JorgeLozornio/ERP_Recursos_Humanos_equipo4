package erp_recursos_humanos;

import TablasDAO.*;
import modelo.*;
import java.awt.Image;
import java.sql.Connection;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Tabla_Pdf {
Connection con;

    public Tabla_Pdf(Connection c) {
        con = c;
    }
    DocumentacionEmpleadoDAO dao = null;

    public void visualizar_PdfVO(JTable tabla, int inicio, int fin) {
        tabla.setDefaultRenderer(Object.class, new imgTabla());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("IdDocumento");
        dt.addColumn("Nombre");
        dt.addColumn("Fecha Entrega");
        dt.addColumn("Documento");
dt.addColumn("Estatus");
        dt.addColumn("idEmpleado");
        ImageIcon icono = null;
        if (get_Image("/assets/32pdf.png") != null) {
            icono = new ImageIcon(get_Image("/assets/32pdf.png"));
        }

        dao = new DocumentacionEmpleadoDAO(con);
        Modelo_DocumentacionEmpleado vo = new Modelo_DocumentacionEmpleado();
        ArrayList<Modelo_DocumentacionEmpleado> list = dao.Listar_Pdf(inicio,fin);

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[6];
                vo = list.get(i);
                fila[0] = vo.getIdDocEmp();
                fila[1] = vo.getNombreDocumento();
                fila[2] = vo.getFechaEntrega();
                if (vo.getDocumento() != null) {
                    fila[3] = new JButton(icono);
                } else {
                    fila[3] = new JButton("Vacio");
                }
                fila[4] = vo.getEstatus();
                fila[5] = vo.getIdEmpleado();
                

                dt.addRow(fila);
            }
            tabla.setModel(dt);
            
        }
    }

     public void visualizar_Pdf_Individual(JTable tabla, String valor) {
        tabla.setDefaultRenderer(Object.class, new imgTabla());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("IdDocumento");
        dt.addColumn("Nombre");
        dt.addColumn("Fecha Entrega");
        dt.addColumn("Documento");
dt.addColumn("Estatus");
        dt.addColumn("idEmpleado");
        ImageIcon icono = null;
        if (get_Image("/assets/32pdf.png") != null) {
            icono = new ImageIcon(get_Image("/assets/32pdf.png"));
        }

        dao = new DocumentacionEmpleadoDAO(con);
        Modelo_DocumentacionEmpleado vo = new Modelo_DocumentacionEmpleado();
        ArrayList<Modelo_DocumentacionEmpleado> list = dao.Listar_Pdf_Individual(valor);

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[6];
                vo = list.get(i);
                fila[0] = vo.getIdDocEmp();
                fila[1] = vo.getNombreDocumento();
                fila[2] = vo.getFechaEntrega();
                if (vo.getDocumento() != null) {
                    fila[3] = new JButton(icono);
                } else {
                    fila[3] = new JButton("Vacio");
                }
                fila[4] = vo.getEstatus();
                fila[5] = vo.getIdEmpleado();
                

                dt.addRow(fila);
            }
            tabla.setModel(dt);
            
        }
    }
    public Image get_Image(String ruta) {
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(ruta));
            Image mainIcon = imageIcon.getImage();
            return mainIcon;
        } catch (Exception e) {
        }
        return null;
    }
}
