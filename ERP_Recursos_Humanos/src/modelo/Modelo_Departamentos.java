/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import TablasDAO.DepartamentosDAO;
import erp_recursos_humanos.Conexion;
import java.sql.Connection;
import java.util.Date;

/**
 *
 * @author Mino
 */

public class Modelo_Departamentos {
    private int idDepartamento;
    private String nombre;
    private String estatus;

    
    public Modelo_Departamentos(int idNomina, Connection conexion) {
        DepartamentosDAO dao = new DepartamentosDAO(conexion);
        Modelo_Departamentos dep = dao.consultaIdDep(idNomina);
        this.idDepartamento = dep.idDepartamento;
        this.nombre = dep.nombre;
        this.estatus = dep.estatus;
       
    }

    public Modelo_Departamentos() {

    }

    public int getIdDep() {
        return idDepartamento;
    }

    public void setIdDep(int idDepartamento) {
        this.idDepartamento = idDepartamento;
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
