/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import TablasDAO.NominasDAO;
import erp_recursos_humanos.Conexion;
import java.sql.Connection;
import java.util.Date;

/**
 *
 * @author Mino
 */

public class Modelo_Nominas {
    private int idNomina;
    private Date fechaElaboracion;
    private Date fechaPago;
    private float subtotal;
    private float retenciones;
    private float total;
    private int diasTrabajados;
    private String estatus;
    private int idEmpleado;
    private int idFormaPago;
    private int idPeriodo;
    
    public Modelo_Nominas(int idNomina, Connection conexion) {
        NominasDAO dao = new NominasDAO(conexion);
        Modelo_Nominas Nom = dao.consultaIdNom(idNomina);
        this.idNomina = Nom.idNomina;
        this.fechaElaboracion = Nom.fechaElaboracion;
        this.fechaPago = Nom.fechaPago;
        this.subtotal = Nom.subtotal;
        this.retenciones = Nom.retenciones;
        this.total = Nom.total;
         this.diasTrabajados = Nom.diasTrabajados;
        this.estatus = Nom.estatus;
        this.idEmpleado = Nom.idEmpleado;
        this.idFormaPago = Nom.idFormaPago;
         this.idPeriodo = Nom.idPeriodo;
    }

    public Modelo_Nominas() {

    }

    public int getIdNom() {
        return idNomina;
    }

    public void setIdNom(int idNomina) {
        this.idNomina = idNomina;
    }

    public Date getFechaElaboracion() {
        return fechaElaboracion;
    }

    public void setFechaElaboracion(Date fechaElaboracion) {
        this.fechaElaboracion = fechaElaboracion;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
public float getRetenciones() {
        return retenciones;
    }

    public void setRetenciones(float retenciones) {
        this.retenciones = retenciones;
    }
    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }
    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public int getIdFormaPago() {
        return idFormaPago;
    }

    public void setIdFormaPago(int idFormaPago) {
        this.idFormaPago = idFormaPago;
    }
    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }
}
