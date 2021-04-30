/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import TablasDAO.DocumentacionEmpleadoDAO;
import erp_recursos_humanos.Conexion;
import java.sql.Connection;
import java.util.Date;

/**
 *
 * @author Mino
 */

public class Modelo_DocumentacionEmpleado {
    private Integer idDocEmp;
    private String nombreDocumento;
    private Date fechaEntrega;
    private String documento;
    private String estatus;
    private int idEmpleado;
    public Modelo_DocumentacionEmpleado(Integer idEstado, Connection conexion) {
        DocumentacionEmpleadoDAO dao = new DocumentacionEmpleadoDAO(conexion);
        Modelo_DocumentacionEmpleado DocEmp = dao.consultaIdDocEmp(idDocEmp);
        this.idDocEmp = DocEmp.idDocEmp;
        this.nombreDocumento = DocEmp.nombreDocumento;
        this.fechaEntrega = DocEmp.fechaEntrega;
        this.documento = DocEmp.documento;
        this.estatus = DocEmp.estatus;
        this.idEmpleado = DocEmp.idEmpleado;
    }

    public Modelo_DocumentacionEmpleado() {

    }

    public int getIdDocEmp() {
        return idDocEmp;
    }

    public void setIdDocEmp(int idDocEmp) {
        this.idDocEmp = idDocEmp;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
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
}
