/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import TablasDAO.percepcionesDAO;
import java.sql.Connection;

/**
 *
 * @author napoleon
 */
public class modelo_percepcion {

    private Integer idpercep;
    private String nombre;
    private String descripcion;
    private int diasPagar;
    private String estatus;

    public modelo_percepcion(Integer idpercep, Connection conexion) {
        percepcionesDAO dao = new percepcionesDAO(conexion);
        modelo_percepcion per = dao.consultaIdpercep(idpercep);
        this.idpercep = per.idpercep;
        this.nombre = per.nombre;
        this.descripcion = per.descripcion;
        this.diasPagar = per.diasPagar;
        this.estatus = per.estatus;

    }

    public modelo_percepcion() {

    }

    public int getIdPercep() {
        return idpercep;
    }

    public void setIdPercep(int idpercep) {
        this.idpercep = idpercep;
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

    public int getDiasPagar() {
        return diasPagar;
    }

    public void setDiasPagar(int diasPagar) {
        this.diasPagar = diasPagar;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}

