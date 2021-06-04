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

public class Modelo_NominasDeducciones {
    private int idNomina;
    private int idDeduccion;
    private float importe;
    
    
    public Modelo_NominasDeducciones(int idNomina, Connection conexion) {
       
    }

    public Modelo_NominasDeducciones() {

    }

    public int getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(int idNomina) {
        this.idNomina = idNomina;
    }

    public int getIdDeduccion() {
        return idDeduccion;
    }

    public void setIdDeduccion(int idDeduccion) {
        this.idDeduccion = idDeduccion;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

  
}
