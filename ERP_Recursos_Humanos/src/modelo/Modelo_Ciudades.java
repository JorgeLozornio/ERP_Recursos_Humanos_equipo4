package modelo;

import java.sql.Connection;
import TablasDAO.CiudadesDAO;

public class Modelo_Ciudades {

    Integer idCiudad;
    String nombre;
    Integer idEstado;
    String estatus;

    public Modelo_Ciudades(Integer idCiudad, Connection conexion) {
        CiudadesDAO dao = new CiudadesDAO(conexion);
        Modelo_Ciudades registros = dao.consultaidCiudad(idCiudad);
    }

    public Modelo_Ciudades() {

    }

    public int getidCiudad() {
        return idCiudad;
    }

    public void setidCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getidEstado() {
        return idEstado;
    }

    public void setidEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}
