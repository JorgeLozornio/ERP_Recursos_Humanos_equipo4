package modelo;

import java.sql.Connection;
import TablasDAO.FormasPagoDAO;

public class Modelo_FormasPago {

    private Integer idFormaPago;
    private String nombre;
    private String estatus;

    public Modelo_FormasPago(Integer idFormaPago, Connection conexion) {
        FormasPagoDAO dao = new FormasPagoDAO(conexion);
        Modelo_FormasPago registros = dao.consultaidFormaPago(idFormaPago);
    }

    public Modelo_FormasPago() {

    }

    public int getidFormaPago() {
        return idFormaPago;
    }

    public void setidFormaPago(int idFormaPago) {
        this.idFormaPago = idFormaPago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}
