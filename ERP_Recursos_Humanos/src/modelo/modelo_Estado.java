/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import TablasDAO.EstadosDAO;
import java.sql.Connection;

/**
 *
 * @author napoleon
 */
public class modelo_Estado {
    
    Integer idEstado;
    String nombre;
    String siglas;
    String estatus;

    public modelo_Estado(Integer idCiudad, Connection conexion) {
        EstadosDAO dao = new EstadosDAO(conexion);
        modelo_Estado registros = dao.consultaidEstado(idEstado);
    }

    public modelo_Estado() {

    }

    public int getidEstado() {
        return idEstado;
    }

    public void setidEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}

