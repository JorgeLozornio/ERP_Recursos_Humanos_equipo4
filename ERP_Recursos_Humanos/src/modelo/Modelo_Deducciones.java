package modelo;

import java.sql.Connection;
import TablasDAO.DeduccionesDAO;

public class Modelo_Deducciones {

    private Integer idDeduccion;
    private String nombre;
    private String descripcion;
    private int porcentaje;
    private String estatus;

    public Modelo_Deducciones(Integer idDeduccion, Connection conexion) {
        DeduccionesDAO dao = new DeduccionesDAO(conexion);
        Modelo_Deducciones registros = dao.consultaidDeduccion(idDeduccion);
    }

    public Modelo_Deducciones() {
        
    }
    
    public int getidDeduccion() {
        return idDeduccion;
    }
    
    public void setidDeduccion(int idDeduccion) {
        this.idDeduccion = idDeduccion;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public int getPorcentaje() {
        return porcentaje;
    }
    
    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    public String getEstatus() {
        return estatus;
    }
    
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}
